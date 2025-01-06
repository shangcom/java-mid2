package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);


        // 제네릭 메서드는 컴파일 결과 Object 타입이 반환되고 (Dog) 캐스팅이 자동 적용됨.
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);

        /*
         메서드의 매개변수로 와일드카드를 사용한다는 것은,
         이미 생성된, 타입이 정해진 인스턴스를 타입을 불문하고 매개변수로 가져다 사용한다는 의미이다.
         dogBox는 생성할 때 Dog로 타입이 정해졌고, 와일드카드는 타입에 상관 없이 Box를 받을 수 있다는 말일 뿐이다.
         이미 타입이 정해진 인스턴스를 사용하므로, 캐스팅은 필요 없다.
         */
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
    }
}
