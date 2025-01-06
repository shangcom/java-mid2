package generic.ex3;

/*
T의 타입을 메서드를 정의하는 시점에는 알 수 없다.
따라서 Animal에 정의된 메서드를 호출할 수 없다. 오직 Object의 기능만 사용 가능.
 */

public class AnimalHospitalV2<T> {

    private T animal; // 변수 명이 animal일뿐, Animal 클래스에 대한 정보는 없다.

    public void set(T animal) {
        this.animal = animal;
    }

    /*
     Animal 클래스 메서드 호출 불가.
     */
    public void checkup() {
//        System.out.println("동물 이름: " + animal.getName());
//        System.out.println("동물 이름: " + animal.getSize());
//        animal.sound();
    }

//    public T getBigger(T target) {
//        return animal.getSize() > target.getSize() ? animal : target; // 삼항연산자 사용
//    }

}
