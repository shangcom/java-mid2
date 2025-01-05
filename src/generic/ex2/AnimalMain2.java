package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {

        Animal animal = new Animal("동물", 0);
        Animal dog = new Dog("멍멍이", 100);
        Animal cat = new Cat("야옹이", 50);

        Box<Animal> animalBox = new Box<>();

        // 객체 실제 타입 메서드 호출된다.
        animalBox.set(animal);
        Animal animal1 = animalBox.get();
        System.out.println("animal1 = " + animal1);

        animalBox.set(dog);
        Animal animal2 = animalBox.get();
        System.out.println("animal1 = " + animal2);

        animalBox.set(cat);
        Animal animal3 = animalBox.get();
        System.out.println("animal1 = " + animal3);
    }
}
