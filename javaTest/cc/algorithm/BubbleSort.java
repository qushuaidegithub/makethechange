package algorithm;
public class BubbleSort {
	// TODO 冒泡排序
	public static void main(String[] args) {
		int[] a = { 5, 3, 2, 7, 4, 9, 15, 70, 11, 12 };
		// 外部循环
		// 循环数组所有内容
		for (int tmp = 0, i = 0; i < a.length; i++) {
			// 内部循环
			// 将外部循环当前位置之后的每一个数字都与该位置数字做比较
			for (int j = i + 1; j < a.length; j++) {
				// 如果外部循环的数字比较大，则进行一次交换，继续做下一次比较
				if (a[j] > a[i]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
