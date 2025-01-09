package collection.array;

/*
제네릭 도입
타입 안정성 O
 */
public class MyArrayListV4Main {
    public static void main(String[] args) {

        MyArrayListV4<String> stringList = new MyArrayListV4<>();

        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
//        stringList.add(4);

        String s0 = stringList.get(0);
        System.out.println("s0 = " + s0);

        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        Integer i0 = integerList.get(0);
        System.out.println("i0 = " + i0);
    }


}