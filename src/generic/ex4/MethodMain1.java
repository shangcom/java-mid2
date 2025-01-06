package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {

        Integer i = 10;

        /*
        Object를 매개변수, 반환타입으로 사용하는 메서드.
        반환값을 사용하려면 명시적 캐스팅 필요.
         */
        Object object = GenericMethod.objMethod(i);
        Integer result = (Integer) GenericMethod.objMethod(i); // 명시적 캐스팅


        /*
        타입 인자(Type Argument) 명시적 전달
        제네릭 메서드를 호출할 때 타입 인자를 명시하면 호출된 메서드에 전달된다.
        즉, 메서드 호출 시점에 제네릭 메서드의 타입이 확정된다.

        타입 추론
        컴파일러는 메서드 반환 값을 받는 변수의 타입이나, 전달되는 인자의 타입을 보고 제너릭 메서드에 어떤 타입 인자가 전달되는지 추론할 수 있다.
        이런 경우 <T> 생략 가능하며, 자동으로 추가된다.

        내부적으로, 컴파일되면 genericMethod()는 Object 반환하고, 컴파일러는 (Integer) 자동 추가.
         */
        System.out.println("명시적 타입 인자 전달");
//        Integer result1 = GenericMethod.<Integer>genericMethod(i);
        Integer result1 = GenericMethod.genericMethod(i); // <Integer> 생략 가능. i의 타입으로 추론한다.

//        Double doubleValue = GenericMethod.<Double>genericMethod(10.5);
        Double doubleValue = GenericMethod.genericMethod(10.5); // <Double> 생략

//        String stringValue = GenericMethod.<String>genericMethod("바보");
        String stringValue = GenericMethod.genericMethod("바보"); // <String> 생략

    }
}
