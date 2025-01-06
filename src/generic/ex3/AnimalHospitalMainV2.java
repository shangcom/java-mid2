package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/*
동물 병원에 Integer, Object 같은 동물과 전혀 관계 없는 타입을 타입 인자로 전달 할 수 있다

 */
public class AnimalHospitalMainV2 {
    public static void main(String[] args) {

        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}
