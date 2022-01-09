package org.smart4j.framework.proxy;

/**
 * Created by lenovo on 2017/5/29.
 * 代理接口
 */
public interface Proxy {
    /**
     * 执行链式代理
     * @param proxyChain
     * @return
     * @throws Throwable
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
