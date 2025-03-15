package Head_First_Design_Patterns.Chapter_1_Strategy_Pattern.quackImpls;

import Head_First_Design_Patterns.Chapter_1_Strategy_Pattern.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
