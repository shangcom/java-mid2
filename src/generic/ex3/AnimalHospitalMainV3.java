package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/*
코드 재사용 O
타입 안정성 O
 */
public class AnimalHospitalMainV3 {
    public static void main(String[] args) {

        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
//        AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>();
//        AnimalHospitalV3<Object> objectHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        dogHospital.set(dog);
//        dogHospital.set(cat);

        catHospital.set(cat);
//        catHospital.set(dog);

        dogHospital.checkup();
        catHospital.checkup();

        /*
        아래 코드를 컴파일한 결과:
                Dog biggerDog = (Dog)dogHospital.getBigger(new Dog("멍멍이2", 50));

        컴파일러가 캐스팅 코드 추가.
        컴파일 후 getBigger는 Object를 반환하지만, 호출자는 Dog 타입으로 반환받기를 기대함.
        이 불일치를 해결하기 위해 컴파일러가 (Dog) 캐스팅 코드를 자동으로 추가  .
        */
        Dog biggerDog = dogHospital.getBigger(new Dog("멍멍이2", 50));


//        dogHospital.getBigger(new Cat("야옹이3", 400));

        Cat biggerCat = catHospital.getBigger(new Cat("야옹이2", 200));

    }
}
