package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("야옹이", 50);

        ComplexBox<Dog> dogBox = new ComplexBox<>();
        dogBox.set(dog);

        Cat returnedCat = dogBox.printAndReturn(cat);
        System.out.println("returnedCat = " + returnedCat);

        Cat returnedCat2 = dogBox.printAndReturn2(cat);
        System.out.println("returnedCat2 = " + returnedCat2);

    }
}
