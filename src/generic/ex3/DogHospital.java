package generic.ex3;

import generic.animal.Dog;

public class DogHospital {

    private Dog animal;

    public Dog get() {
        return animal;
    }

    public void set(Dog animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 이름: " + animal.getSize());
        animal.sound();
    }

    /**
     * 현재 필드의 개와 타겟의 size를 비교해 큰 쪽을 반환
     * @param target 비교할 개
     * @return 사이즈 큰 개 인스턴스를 반환
     */
    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target; // 삼항연산자 사용
    }
}
