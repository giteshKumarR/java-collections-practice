package Head_First_Design_Patterns.Chapter_1_Strategy_Pattern;

import Head_First_Design_Patterns.Chapter_1_Strategy_Pattern.flyImpls.FlyWithRocket;
import Head_First_Design_Patterns.Chapter_1_Strategy_Pattern.flyImpls.FlyWithWings;
import Head_First_Design_Patterns.Chapter_1_Strategy_Pattern.quackImpls.MuteQuack;
import Head_First_Design_Patterns.Chapter_1_Strategy_Pattern.quackImpls.Quack;

public class DuckTest {
    public static void main(String[] args) {
        // Mallard Duck
        Duck mallard = new Duck("Mallard Duck");
        System.out.println("Duck name : " + mallard.getDuckName());
        mallard.setFlyBehaviour(new FlyWithWings());
        mallard.setQuackBehaviour(new Quack());
        
        mallard.performQuack();
        mallard.performFly();

        // Model Duck
        Duck model = new Duck("Model Duck");
        System.out.println("Duck Name = " + model.getDuckName());
        model.setQuackBehaviour(new MuteQuack());
        model.setFlyBehaviour(new FlyWithRocket());

        model.performQuack();
        model.performFly();
    }
}
