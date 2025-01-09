package collection.array;

import java.util.Arrays;

/*
Generic 도입
타입 안정성 O.
 */
public class MyArrayListV4<E> { // E : element.

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;

    private int size = 0;

    // 생성자에는 타입 매개변수 사용 못한다.
    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY]; // new E[] 안됨.
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E e) {
        if (size >= elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    public void add(int index, E e) {
        if (size >= elementData.length) {
            grow();
        }
        shiftFromIndexToRight(index);
        elementData[index] = e;
        size++;
    }

    private void shiftFromIndexToRight(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    public E remove(int index) {
        E oldValue = get(index);
        shiftToLeft(index);

        size--;
        elementData[size] = null;

        return oldValue;
    }

    private void shiftToLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    /*
    여기에서만 E로 캐스팅 필요.
     */
    @SuppressWarnings("unchecked") // 아래 경고 없애준다.
    public E get(int index) {
        return (E) elementData[index]; // Unchecked cast: 'java.lang.Object' to 'E' 경고
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = "
                + size + ", capacity = " + elementData.length;
    }

    private void grow() {
        elementData = Arrays.copyOf(elementData, elementData.length * 2);
    }
}
