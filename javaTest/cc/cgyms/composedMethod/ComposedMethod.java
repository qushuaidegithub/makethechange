package book.cgyms.composedMethod;

public class ComposedMethod {
	Object[] elements;
	boolean readOnly;
	int size;

	// 组合方法
	// 把方法的逻辑转换成几个同一细节层面上的、能够说明意图的步骤
	// 组合方法前：
	public void add(Object element) {
		if (!readOnly) {
			int newSize = size + 1;
			if (newSize > elements.length) {
				Object[] newElements = new Object[elements.length + 10];
				for (int i = 0; i < size; i++) {
					newElements[i] = elements[i];
					elements = newElements;
				}
				elements[size++] = element;
			}
		}
	}

	// 组合方法后：
	public void add2(Object element) {
		if (readOnly) {
			return;
		}
		if (atCapacity()) {
			grow();
		}
		addElement(element);
	}

	private boolean atCapacity() {
		int newSize = size + 1;
		if (newSize > elements.length) {
			return true;
		} else {
			return false;
		}
	}

	private void grow() {
		Object[] newElements = new Object[elements.length + 10];
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
			elements = newElements;
		}
	}

	private void addElement(Object element) {
		elements[size++] = element;
	}

}
