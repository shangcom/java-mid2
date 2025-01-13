package collection.link;

public class MyLinkedListV2 {

    private Node first;
    private int size;


    public void add(Object o) {
        Node newNode = new Node(o);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    /**
     * 지정한 인덱스에 노드 삽입.
     * 첫번째 노드일 경우 O(1)와 그 외 경우 O(n) 나누어 작성.
     * @param index 노드를 삽입할 인덱스
     * @param object 추가할 아이템
     */
    public void add(int index, Object object) {
        Node newNode = new Node(object);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    /*
     명시적 null 처리 하는 이유?
     다른 곳에서 이미 삭제 대상 노드를 참조하고 있으면, 이 메서드를 통해 리스트에서 참조가 끊는다 해도
     다른 곳에서 참조가 유지됨으로 GC 대상에서 제외된다.
     따라서 아예 값을 null로 만들어줘야 연관된 모든 참조가 사라진다.
     */
    public Object remove(int index) {
        Node removedNode = getNode(index);
        Object removedItem = removedNode.item;
        if (index == 0) {
            first = removedNode.next; // first = first.next;와 같음.
        } else {
            Node prev = getNode(index - 1);
            prev.next =  removedNode.next;
        }
        removedNode.item = null;
        removedNode.next = null;
        size--;
        return removedItem;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public Object get(int index) {
        Node x = getNode(index);
        return x.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
