package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    //제네릭 메서드
    //Box<Dog> dogBox를 전달한다. 타입 추론에 의해 타입 T가 Dog가 된다.
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    /*
    일반 메서드
    매개변수로 와일드카드를 사용
    와일드카드 ?는 모든 타입을 받을 수 있다.

    전달 받을 Box<?>가 어떤 타입의 Box인지 알 수 없으므로, box.get()에서 반환되는 값의 타입을 알 수 없음.
    와일드카드도 제네릭 타입이기 때문에, 런타임에는 타입 정보가 제거되고 Object로 처리됨.
     */
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
