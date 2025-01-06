package generic.ex3;

/*
<T extends Animal> : 타입 인자로 Animal과 그 자식들만 올 수 있다고 명시함.
이제 Animal에 대한 정보가 생겼음.
 */

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> { // T가 Animal의 자식임을 명시.

    private T animal; // animal은 Animal 클래스와 그 자식들을 받는다.

    public void set(T animal) {
        this.animal = animal;
    }

    /*
     T가 Animal의 자식임을 알고 있으므로, animal은 Animal 클래스 메서드 호출 가능.
     */
    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target; // 삼항연산자 사용
    }

}
