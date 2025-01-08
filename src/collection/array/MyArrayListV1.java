package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;

    private int size = 0; // element에서 실제 채워진 인덱스의 수

    /*
    elementData를 길이 5짜리 배열로 초기화하는 기본 생성자
     */
    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    /*
    elementData의 용량, 크기를 지정할 수 있는 생성자
    size랑 다르다.
     */
    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    /*
     size 반환
     */
    public int size() {
        return size;
    }

    /*
    elementData에 데이터 추가.
    size는 0부터 하나씩 증가.
    처음 데이터 추가하면 0번 인덱스에 추가하고 size는 1이된다.
    배열 크기(길이)와 다르다.
    배열 크기는 기본이 5, capacity 설정하는 생성자 사용했으면 설정값이다.
     */
    public void add(Object e) {
        elementData[size] = e;
        size++;
    }

    /*
    특정 인덱스의 데이터 반환.
     */
    public Object get(int index) {
        return elementData[index];
    }

    /*
    특정 인덱스의 데이터 변경.
    기존 데이터 반환.
     */
    public Object set(int index, Object element) {
        Object oldValue = get(index); // 반환하면 메서드 끝나버리니까 임시로 저장해둠.
        elementData[index] = element;
        return oldValue;
    }

    /*
    검색
    리스트를 순차 탐색하여 일치하는 데이터 있으면 해당 인덱스를, 없으면 -1 반환
     */
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    /*
    배열의 크기가 size보다 size 이후부터는 배열이 비어있다.
    elementData의 실제 데이터를 출력하기 위해 Arrays.copyOf()로 size만큼 elementData를 복사한 배열을 만들고,
    Arrays.toString()으로 그 배열을 출력한다.
     */
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = "
                + size + ", capacity = " + elementData.length;
    }
}
