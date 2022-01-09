package com.test.testd;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    static int count = 20;

    static int n = 1000001;

    static int getId() {
        return n++;
    }

    static Message[] msgArray = new Message[count];

    static BlockingQueue<Message> recMessages = new ArrayBlockingQueue<Message>(count);

    static {
        for (int i = 0; i < count; i++) {
            msgArray[i] = new Message(Test.getId(), "MSG" + n);
        }
    }

    static AtomicInteger idx = new AtomicInteger(0);

    public static void main(String[] args) {
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                Test t = new Test();
                t.listening();
            }
        });
        b.start();

        for (int i = 0; i < count; i++) {
            Thread a = new Thread(new Runnable() {
                @Override
                public void run() {
                    Test t = new Test();
                    t.handleWebReq();
                }
            });
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a.start();
        }
    }

    // 处理浏览器发来的请求
    void handleWebReq() {
        // 创建一消息
        Message msg = msgArray[idx.getAndIncrement()];
        // 创建 GuardedObject 实例
        GuardedObject<Message> go =
                GuardedObject.create(msg.id);
        // 发送消息
        send(msg);
        // 等待 MQ 消息
        Message r = go.get(
                t -> t != null);
    }

    void onMessage(Message msg) {
        // 唤醒等待的线程
        GuardedObject.fireEvent(
                msg.id, msg);
    }

    void send(Message msg) {
        try {
            Thread.sleep((int) (Math.random() * 1000));
            recMessages.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void listening() {
        while (true) {
            try {
                onMessage(recMessages.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}