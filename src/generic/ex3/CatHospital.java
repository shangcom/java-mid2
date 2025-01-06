package generic.ex3;

import generic.animal.Cat;

public class CatHospital {

    private Cat animal;

    public Cat get() {
        return animal;
    }

    public void set(Cat animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 이름: " + animal.getSize());
        animal.sound();
    }

    /**
     * 현재 필드의 고양이와 타겟의 size를 비교해 큰 쪽을 반환
     * @param target 비교할 고양이
     * @return 사이즈 큰 고양이 인스턴스를 반환
     */
    public Cat getBigger(Cat target) {
        return animal.getSize() > target.getSize() ? animal : target; // 삼항연산자 사용
    }
}
