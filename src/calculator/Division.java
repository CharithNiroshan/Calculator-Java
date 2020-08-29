package calculator;

public class Division extends Calculator{

    //Overrides the calculation method in Calculator class
    @Override
    public void calculation() {
        System.out.println("\nDivision of the two numbers is = "+DFormat.format(values[1]/values[0])+"\n");
    }
}
