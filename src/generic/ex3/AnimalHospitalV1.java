package generic.ex3;

import generic.animal.Animal;

/*
같은 역할을 하는 Dog/CatHotpital 클래스들을 통합하기 위해 AnimalHospital 클래스 작성.
Dog, Cat 클래스의 공통 부모인 Animal을 필드로.
checkup(), getBigger() 내부에서 호출하는 메서드는 모두 Animal 클래스에 있음. 문제 없이 호출할 수 있음.
Dog, Cat에 오버라이드된 메서드가 있다면 인스턴스의 타입에 따라 적용된다.
 */
public class AnimalHospitalV1 {

    private Animal animal;

    public void set(Animal animal) {
        this.animal = animal;
    }

    //

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 이름: " + animal.getSize());
        animal.sound();
    }

    public Animal getBigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target; // 삼항연산자 사용
    }

}
