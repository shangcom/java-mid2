package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/*
코드 재사용X: 개 병원과 고양이 병원은 중복이 많이 보인다.
타입 안전성O: 타입 안전성이 명확하게 지켜진다.
 */
public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("고양이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        /*
        문제1.
        코드 재사용 불가 : 개 병원에 고양이 전달하면 컴파일 오류 발생.
        타입 안정성 0.
         */
//        dogHospital.set(cat);

        /*
        개 타입 반환.
         */
        Dog biggerDog = dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);

    }
}
