package generic.ex5;

/*
컴파일 이후에 .class 파일에는 제네릭 타입의 정보가 존재하지 않는다.
.class로 자바를 실행하는 런타임에는 타입 정보가 모두 제거되어 있다.
따라서 컴파일러와 IDE는 제네릭 클래스에는 런타임에 타입을 활용하는 코드를 작성할 수 없도록 막는다.
 */
public class ErasureBox<T> {

    /*
    .class 파일에서는 T가 Object로 바뀌고, 모든 클래스는 Object의 자손이므로 항상 true를 반환하는 메서드가 된다.
     */
    public boolean instanceCheck(Object param) {
//        return param instanceof T;
        return true;
    }

    /*
    항상 Object 인스턴스를 반환하는 의미 없는 코드가 된다.
     */
    public T create() {
//        return new T();
        return null;
    }

}
