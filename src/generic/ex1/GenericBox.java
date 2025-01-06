package generic.ex1;

/*
Generic(일반적인, 범용적인) : 특정 타입에 속한 것이 아니라 범용적으로 사용할 수 있음.
Generic Type : 타입 매개변수를 사용해서 정의한 클래스나 인터페이스.
               현재 클래스 GenericBox<T>는 타입 매개변수를 사용하여 선언하였으므로 제네릭 타입이다.
               매개변수로 래퍼 클래스 사용 가능, 기본형 사용 불가.
< > : 다이아몬드 기호
<T> 안의 T : 제네릭 타입 매개변수.
밖의 T : 구체화된 제네릭 타입.
사용하는 곳에서 타입 인자를 전달받아 타입이 결정된다.
GenericBox<String> 에서 String : 타입 인자
 */
public class GenericBox<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
