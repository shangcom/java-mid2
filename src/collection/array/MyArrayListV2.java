package collection.array;

import java.util.Arrays;

/*
동적으로 capa 늘어나도록 개선.
 */
public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;

    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    /*
    size가 length와 같은 상태에서 데이터를 추가하면 예외 발생.
    따라서 grow() 메서드로 기존 배열의 2배 크기인 새로운 배열 생성하고
    해당 배열에 기존 배열을 복사.
    데이터가 size만큼 들어있으므로, 새로운 데이터는 인덱스 위치상 size이다.
    size에 데이터 추가하고 size 1 늘린다.
     */
    public void add(Object e) {
        if (size >= elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    private void grow() {
        elementData = Arrays.copyOf(elementData, elementData.length * 2);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
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
}
