package Head_First_Design_Patterns.Chapter_1_Strategy_Pattern;

public class Duck {
    private String duckName;
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck() {}
    public Duck(String duckName) {
        this.duckName = duckName;
    }
    public String getDuckName() {
        return duckName;
    }
    public void setDuckName(String duckName) {
        this.duckName = duckName;
    }

    // Operations the duck perform
    public void swim() {
        System.out.println("Duck is swimming..");
    }

    public void display() {
        System.out.println("I am a Duck");
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "duckName='" + duckName + '\'' +
                '}';
    }
}
