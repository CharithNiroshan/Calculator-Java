package calculator;

import java.util.Scanner;
import java.text.*;

public abstract class Operation{

    //Initializing variables making them accessible only in child classes
    protected Double [] values=new Double[2];
    protected String operator;
    protected Scanner scanner;
    protected DecimalFormat DFormat = new DecimalFormat("#.###");

    //Getters and Setters
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Double[] getValues() {
        return values;
    }

    public void setValues(Double[] values) {
        this.values = values;
    }
}
