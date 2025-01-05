package generic.ex1;

/*
장점 : 타입 안정성 O

문제점 : 코드 재사용 X.
        Box라는 공통된 기능을 가진 클래스를 모든 타입에 대해 일일히 만들어줘야 한다.
 */
public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); // 오토박싱
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
