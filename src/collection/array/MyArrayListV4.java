package collection.array;

import java.util.Arrays;

/*
Generic 도입
타입 안정성 O.

ArrayList의 장점 : 순서대로 마지막에 데이터를 추가하거나 삭제할 때는 성능 좋음.
ArrayList의 단점 : 앞이나 중간에 데이터를 추가하거나 삭제할 때는 성능 좋지 않음.

=> LinkedList로 해결.
 */
public class MyArrayListV4<E> { // E : element.

    private static final int DEFAULT_CAPACITY = 5;

    /*
     생성자에 E를 사용할 수 없으므로 Object를 사용한다.
     배열에 넣는 요소의 타입을 E로 제한해 타입 안정성 달성할 수 있다.
     들어간게 E 타입뿐이니, 꺼내 사용하는 입장에서는 E 타입을 반환받기 때문이다.
     타입 소거랑 무관하게 이미 배열은 E를 바탕으로 생성되었으므로 상관 없다.

     중요! 항상 같은 타입이 들어가도록 통제해야한다!
     */
    private Object[] elementData;

    private int size = 0;

    /*
     타입 소거로 인해 생성자에는 타입 매개변수 사용 못한다.
     컴파일되면 Object로 바뀜.
     */
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
