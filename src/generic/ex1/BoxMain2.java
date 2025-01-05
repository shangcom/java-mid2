package generic.ex1;

/*
해결된 점 : Object를 필드로 가지는 ObjectBox로 모든 타입의 필드를 받을 수 있다.
          기존 코드 재사용 가능.
          다형성을 활용했음.

문제점 : 반환 타입이 맞지 않음 - Object 타입을 반환하기 때문에 원하는 타입을 정확하게 받을 수 없다.
                            수동으로 다운캐스팅을 시도해야 한다.
        타입 안정성 X - 다운 캐스팅을 시도할 때, 필드에 예상했던 타입이 아닌 잘못된 타입의 인수가 들어있었을 경우 예외가 발생한다.
 */
public class BoxMain2 {
    public static void main(String[] args) {

        /*
         공통부모 Object를 필드로 가지고 있는 ObjectBox로 Integer, String 등 모든 타입 처리 가능.
         다형성 활용.
         */
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);

        /*
        반환 타입이 맞지 않는 문제 발생!
        ObjectBox의 get()은 Object 타입을 반환한다.
        자식 타입(Integer)은 부모 타입(Object)을 바로 받을 수 (오토캐스팅) 없으므로, 수동으로 다운 캐스팅 해야한다.
        */
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // String으로 받기
        System.out.println("str = " + str);

        /*
        잘못된 타입의 인수 전달 문제 발생!
        잘못된 타입의 인수 전달했을 때 예외 발생 (String은 Integer로 변환 불가).
        integerBox에는 당연히 Integer가 들어있을 것이라고 예상하고 Integer로 캐스팅했더니 예외가 발생함.
         */
        integerBox.set("문자열1");
        Integer result = (Integer) integerBox.get(); // 캐스팅 예외 발생
        System.out.println("result = " + result);
    }
}
