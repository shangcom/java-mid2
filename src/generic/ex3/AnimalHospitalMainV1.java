package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/*
코드 재사용 O : AnimalHospitalMainV1 하나로 Animal의 자식인 개와 고양이 모두 처리.

문제점 : 타입안정성 X
기능은 통합하였으나, 개병원과 고양이병원이 구분이 사라짐.
개병원에는 개만, 고양이병원에는 고양이만 들어가도록 제한하지 못함.
 */
public class AnimalHospitalMainV1 {
    public static void main(String[] args) {

        // 개병원, 고양이병원 각각 생성.
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

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
         개 병원에 고양이, 고양이 병원에 개 전달 가능
         -> 타입 안정성 X
         */
        dogHospital.set(cat);
        catHospital.set(dog);

        /*
         문제 2.
         getBigger()은 Animal 타입 반환 -> Dog으로 다운캐스팅 해야함.
         */
        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);

    }
}
