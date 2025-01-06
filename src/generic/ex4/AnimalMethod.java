package generic.ex4;

import generic.animal.Animal;

public class AnimalMethod {

    // 반환값 없을 경우, <T>만 써주면 된다.
    public static <T extends Animal> void checkup(T t) {
        System.out.println("동물 이름: " + t.getName());
        System.out.println("동물 크기: " + t.getSize());
        t.sound();
    }

    // 반환 타입이 T인 경우, <T> 뒤에 반환타입 T를 써준다.
    public static <T extends Animal> T getBigger(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2; // 삼항연산자 사용
    }

}
