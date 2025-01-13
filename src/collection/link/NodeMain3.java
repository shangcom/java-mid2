package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {

        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        // 모든 노드 탐색하기
        printAll(first);

        // 마지막 노드 조회
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        // 특정 인덱스의 노드 조회
        int index = 2;
        Node foundNode = getNode(first, index);
        System.out.println("foundNode = " + foundNode);

        // 데이터 추가하기
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
    }

    /*
    모든 노드 출력하는 메서드.
    x 자체가 null이라는 말은, 직전 반복문에서 마지막 노드의 item을 출력했다는 말이다.
    따라서 더이상 반복문을 실행할 필요가 없다.
     */
    private static void printAll(Node node) {
        Node x = node;
        while (x != null) { // 현재 노드의 다음 노드가 존재하는 동안 반복.
            System.out.println(x.item);
            x = x.next;
        }
    }

    /*
    마지막 노드 반환하는 메서드
    현재 노드 x가 마지막 노드라면, x.next는 null이다.
    따라서 x.next가 null이 아닌 경우, 즉 마지막 노드가 아닌 경우에는 계속 다음 노드로 넘어가야 한다.
    반복문이 종료되면 x는 반드시 마지막 노드를 가리키게 된다.
    next가 null이 됐을 때 반복문을 정지하고 x를 반환하면 된다.
     */
    public static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    /*
     특정 인덱스의 노드 반환하는 메서드
     */
    public static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    /*
    LinkedList에 자료를 추가하는 메서드
    현재의 맨 마지막 노드의 next 필드를 새로운 노드로 초기화하고, 이 새로운 노드의 item 필드를 원하는 자료로 초기화한다.
     */
    public static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }
}
