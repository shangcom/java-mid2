package generic.test.ex3;

public class Shuttle <T extends BioUnit>{

    private T unit;

    public void in(T targetUnit) {
        this.unit = targetUnit;
    }

//    public T out() {
//        return unit;
//    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", Hp: " + unit.getHp());
    }

}

