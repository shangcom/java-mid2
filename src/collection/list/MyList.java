package collection.list;

public interface MyList<E> {

    int size();

    void add(E e);

    void add(int index, E e);

    E get(int index);

    E set(int index, E element); // 기존 요소 반환하고 새 요소로 교체
    E remove(int index); // 기존 요소 반환하고 삭제

    int indexOf(E o);
}
