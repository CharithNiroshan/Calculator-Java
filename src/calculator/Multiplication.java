package calculator;

public class Multiplication extends Calculator{

    //Overrides the calculation method in Calculator class
    @Override
    public void calculation() {
        System.out.println("\nMultiplication of the two numbers is = "+DFormat.format(values[1]*values[0])+"\n");
    }
}
