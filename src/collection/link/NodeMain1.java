package collection.link;

public class NodeMain1 {
    public static void main(String[] args) {

        /*
         노드 생성하고 연결하기: A -> B -> C

         first 첫 번째 노드로, LinkedList의 시작점, 진입점이다. 다른 노드와 연결되지 않은 상태로 만들어진다.
         다음 노드는 first가 가진 next 참조를 통해 연결된다.
         LinkedList에서는 첫번째 노드가 바깥으로 드러난 유일한 접근 경로이다.
         따라서 first를 잃어버리면 그 안의 다른 노드들에 접근할 수 없다.
         각 노드는 자신의 next 필드를 통해 다음 노드를 가리키며, 마지막 노드는 next = null로 설정돼 더 이상 노드가 없음을 나타낸다.
         */
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색하기");
        System.out.println("first.item = " + first.item);
        System.out.println("first.next.item = " + first.next.item);
        System.out.println("first.next.next.item = " + first.next.next.item);

        // 반복문으로
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }


    }
}
