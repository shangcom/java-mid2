package collection.array;

/*
 * 일반적으로 하나의 자료 구조에는 하나의 데이터 타입을 보관하고 관리한다.
 * 여기서는 Object 타입을 사용하므로 타입을 강제할 수 없다.
 * 타입 안정성 X
 *
 * 해결책 : Generic 도입.
 */
public class MyArrayListV3Main_Bad {
    public static void main(String[] args) {

        // 숫자만 받아야하는 리스트
        MyArrayListV3 numberList = new MyArrayListV3();

        /*
        MyArrayList는 Object 타입을 받음.
        문자도 넣을 수 있음.
         */
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자"); // 의도와 달리 문자 넣음
        System.out.println(numberList);

        /*
         get()은 Object 반환 -> 다운캐스팅 필요
         당연히 Integer가 들어있을 것이라 예상했던 사용자가 (Integer)으로 명시적 캐스팅을 함.
         하지만 2번 인덱스에 String 타입인 "문자"가 들어있으므로 런타임에 ClassCastException 발생.
         */
//      Integer num1 = numberList.get(0);
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);
//      Integer num3 = (Integer) numberList.get(2); // ClassCastException. String 들어있음.


    }


}