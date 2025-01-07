package generic.test.ex3;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        shuttle.showInfo();
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        shuttle.showInfo();
    }

    /*
    정답에서는 Shuttle의 Out 메서드 활용했음
     */
//    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
//        T unit = t1.out();
//        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
//    }
//
//    public static void printV2(Shuttle<? extends BioUnit> t1) {
//        BioUnit unit = t1.out();
//        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
//    }
}
