package collection.array;

import java.util.Arrays;

/*
배열의 앞, 중간, 끝에 데이터 추가 / 삭제 기능 구현.

문제점 : 1. 타입 안정성 X
        2. get() 메서드는 Object로 반환 -> 반환 객체 사용하는 쪽에서 다운 캐스팅 해야함.


 */
public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;

    private int size = 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        if (size >= elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    /*
    자리 만들어주는 shitfFromIndexToRight(int index) 추가
     */
    public void add(int index, Object e) {
        if (size >= elementData.length) {
            grow();
        }
        shiftFromIndexToRight(index);
        elementData[index] = e;
        size++;
    }

    /**
     * 새로운 데이터를 넣을 인덱스를 기준으로, 해당 인덱스를 포함하여 끝까지 배열의 요소를 한칸씩 오른쪽으로 옮긴다.
     * 그러면 지정한 인덱스에 자리가 생긴다.
     *
     * @param index 자리 만들어야하는 인덱스.
     */
    private void shiftFromIndexToRight(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    /**
     * 삭제 메서드
     * shift()를 하면 실제 데이터 수가 1 줄어든다.
     * size를 1 줄여준다.
     * shiftToLeft()의 결과 마지막 두개 인덱스는 같은 데이터를 가지고 있다.
     * 마지막에 인덱스는 null로 덮어씌운다.
     * @param index 삭제할 테이터 위치
     * @return 삭제하기 전, 기존 데이터를 반환한다.
     */
    public Object remove(int index) {
        Object oldValue = get(index);
        shiftToLeft(index);

        size--;
        elementData[size] = null;

        return oldValue;
    }

    /**
     * 인덱스의 데이터를 한칸 뒤의 데이터로 덮어 씌우는 것을 반복.
     * 끝에는 마지막 값이 두개가 존재하게 된다.
     * @param index 삭제할 자리.
     */
    private void shiftToLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    /*
    Object로 반환 -> 반환 객체 사용하는 쪽에서 다운 캐스팅 해야함.
     */
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

    private void grow() {
        elementData = Arrays.copyOf(elementData, elementData.length * 2);
    }
}
