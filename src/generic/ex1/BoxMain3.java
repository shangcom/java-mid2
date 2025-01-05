package generic.ex1;

/*
generic<T> 적용 :  코드 재사용성 O
                  타입 안정성 O - 들어가는 것과 나오는 것이 같음.

제네릭의 동작 철학:
제네릭은 컴파일러가 타입 안정성을 보장하기 위한 도구.
컴파일러는 컴파일 타임에 타입을 체크하여, 잘못된 타입 사용을 방지.
컴파이러는 런타임에서 올바른 타입 처리를 위해 자동으로 필요한 곳에 다운캐스팅 코드 삽입.
컴파일 후에는 제네릭 타입 정보가 제거되며, 모든 제네릭 타입은 Object로 변환(타입 소거).

JVM은 컴파일러가 미리 타입 안정성을 확인하고 다운캐스팅 코드를 추가해줬으므로, 이를 그대로 실행하기만 하면 된다.

제너릭은 동적으로 사용할 수 없음. 제네릭은 런타임 타입 변환을 지원하지 않음.
제너릭은 컴파일 타임에 타입 안정성을 보장. 타입 소거 때문에 런타임에는 타입 정보 유지하지 못함.
"런타임에 타입 정보를 유지하고 동적으로 처리하려면 Class<T>, Object 타입, 또는 리플렉션 같은 도구를 사용해야 한다
*/
public class BoxMain3 {

    public static void main(String[] args) {

        /*
         생성 시 다이아몬드 기호 < > 안의 타입 매개변수 T의 타입을 지정한다.
         Object를 사용할 때와 달리, GenericBox의 필드가 Integer 타입으로 결정되었기 때문에 Integer만 허용한다.
         */
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
//      integerBox.set("문자열은 안됨"); // 타입 불일치, 컴파일 오류.
        Integer integer = integerBox.get(); // Integer를 반환하므로 캐스팅할 필요 없음.
        System.out.println("integer = " + integer);

        // String도 마찬가지.
        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("문자열만 가능");
//      stringBox.set(10);
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 모든 타입 가능.
        GenericBox<Boolean> booleanBox = new GenericBox<Boolean>();
        booleanBox.set(true);
        Boolean b = booleanBox.get();
        System.out.println("b = " + b);

        // 타입 추론 : 생성자 쪽의 다이아몬드 기호에는 타입 매개변수 적지 않아도 컴파일러가 자동 적용한다.
        GenericBox<Double> doubleBox = new GenericBox<>();
        GenericBox<Float> floatBox = new GenericBox<>();

    }
}
