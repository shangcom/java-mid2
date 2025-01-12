package collection.link;

public class Node {

    /*
    itme, next 모두 원래대로라면 private. 예시라서 열어둔 것.
     */
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    /*
    IDE 자동 생성 toString()
     */
//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        Node x = this;
        while (x != null) {
            stringBuilder.append(x.item);
            if (x.next != null) {
                stringBuilder.append("->");
            }
            x = x.next;
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
