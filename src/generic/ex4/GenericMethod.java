package generic.ex4;

/*
제네릭 메서드 : 메서드가 호출될 때, 주어진 타입 인자로 메서드의 제너릭 타입을 구체화한다.
              제네릭 클래스와 마찬가지로, 컴파일하면 필요한 부분에 명시적 캐스팅을 자동으로 추가한다.
              T는 모두 Object로 대체된다.
              런타임에는 타입 소거로 인해 타입 정보가 제거되므로, 동적으로 타입을 변경하거나 수정할 수 없다.

<T> : 제너릭 타입 매개변수 (Generic Type Parameter). 타입 매개변수를 정의 ex)T, K, V 등 문자로 정한다.
T : 구체화된 제네릭 타입 (Concrete Generic Type). 호출 시점에 결정되는 구체적인 타입(String, Integer, Animal 등)을 나타냄.
 */
public class GenericMethod {

    /*
    일반 메서드 : 매개변수와 반환값의 타입이 고정되어 있음.
                여기서는 Object로 고정됨.
                Object라서 모든 차입 처리 가능하지만, 반환값을 사용하는 곳에서는 원하는 타입으로 다운캐스팅을 해야함.
     */
    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    /*
    제네릭 메서드:
    - 인스턴스 메서드와 static 메서드 모두에서 사용 가능.
    - 메서드 내부에서 사용할 타입 매개변수를 선언하여, 호출 시 타입을 지정.

    static 메서드와 제네릭 클래스의 관계:
    - 제네릭 클래스의 타입 매개변수(T)는 인스턴스를 생성할 때 결정됨.
    - static 메서드는 클래스 차원에서 동작하므로, 특정 객체(인스턴스)에 종속된 제네릭 타입(T)을 사용할 수 없음.
    - 따라서, 제네릭 클래스의 static 메서드에서 T를 사용하려면 메서드 자체에 제네릭 타입 매개변수를 선언해야 함.
    - 즉, 제네릭 메서드를 static으로 선언하여 사용해야한다.

    static 제네릭 메서드:
    - 메서드 호출 시 타입 매개변수를 명시하므로, 인스턴스 생성 여부와 관계없이 사용할 수 있음.
    */
    public static <T> T genericMethod(T t) {
        System.out.println("generic print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }
}
