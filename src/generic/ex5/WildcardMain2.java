
package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

/*
제한된 와일드카드 - 하한

<? super Type> : Type과 그 조상들만 받을 수 있다.
 */
public class WildcardMain2 {
    public static void main(String[] args) {

        /*
         상속관계 순으로 객체 생성했음.
         모두 타입 추정으로 인스턴스 내부 제네릭 매개변수의 타입이 정해졌다.
         */
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // 하한 와일드카드 메서드에 전달
        writeBox(objBox); // Animal의 상위 타입.
        writeBox(animalBox); // Animal 타입.
//        writeBox(dogBox); // Animal의 자식 타입. 받을 수 없다.
//        writeBox(catBox);
    }

    // Animal이 하한인 와일드카드를 사용하는 메서드
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
