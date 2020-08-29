package calculator;

public class Substraction extends Calculator{

    //Overrides the calculation method in Calculator class
    @Override
    public void calculation() {
        System.out.println("\nSubstraction of the two numbers is = "+DFormat.format(values[1]-values[0])+"\n");
    }
}
