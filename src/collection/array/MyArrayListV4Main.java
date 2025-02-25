package collection.array;

import java.util.ArrayList;

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

        // String s0 = (String)stringList.get(0); 로 컴파일됨.
        String s0 = stringList.get(0);
        System.out.println("s0 = " + s0);

        ArrayList<String> strings = new ArrayList<String>();
        strings.add(2,"a");
        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        // Integer i0 = (Integer)integerList.get(0); 로 컴파일됨.
        Integer i0 = integerList.get(0);
        System.out.println("i0 = " + i0);
    }

}