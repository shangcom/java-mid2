package collection.link;

public class MyLinkedListV1 {

    private Node first;
    private int size;

    /**
     * 노드 삽입. O(n)
     * 첫 노드일 경우와 아닐 경우로 나눔.
     * @param o node의 아이템. 입력할 자료.
     */
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
     * 마지막 노드 반환
     * @return 마지막 노드
     */
    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }


    /**
     * 기존 노드에 새로운 item으로 덮어씌움. O(n)
     * @param index   새로운 item을 넢어씌울 기존 노드의 인덱스
     * @param element 새로운 item
     * @return 기존 item
     */
    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    /**
     * 특정 인덱스의 노드값 반환. O(n)
     * @param index 인덱스 번호
     * @return 해당 노드의 item값
     */
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

    /**
     * 데이터가 몇 번 인덱스에 있는지 탐색
     * @param o 찾을 데이터
     * @return 해당 인덱스
     */
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
