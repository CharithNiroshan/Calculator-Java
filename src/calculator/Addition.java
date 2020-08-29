package calculator;

public class Addition extends Calculator{

    //Overrides the calculation method in Calculator class
    @Override
    public void calculation() {
        System.out.println("\nAddition of the two numbers is = "+DFormat.format(values[1]+values[0])+"\n");
    }
}
