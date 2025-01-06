package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 100);

        // 자동 타입 추론.
//        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.checkup(dog);
//        AnimalMethod.<Cat>checkup(cat);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰멍멍이", 200);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);
    }
}
