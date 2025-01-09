package collection.array;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3(2);
        System.out.println(list);

        // capa = 2
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);

        // 2배, capa = 4
        list.add("c");
        System.out.println(list);
        list.add("d");
        System.out.println(list);
        // 2배, capa = 8
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);
    }
}
