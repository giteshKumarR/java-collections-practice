package Head_First_Design_Patterns.Chapter_1_Strategy_Pattern.flyImpls;

import Head_First_Design_Patterns.Chapter_1_Strategy_Pattern.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying..");
    }
}
