package calculator;

import java.io.*;
import java.util.*;
import static java.lang.System.exit;

public class Calculator extends Operation{

    //Creating a Calculator object and getting input from file
    public Calculator() {
        try {
            FileReader filereader = new FileReader("/home/charith2/Input.txt");
            scanner = new Scanner(filereader);

            int i=0;
            while (scanner.hasNext()) {
                this.values[i] = scanner.nextDouble();
            //Double.parseDouble(scanner.nextLine());
                i++;
            }
            filereader.close();
        } catch (FileNotFoundException e) {
            System.out.println("\nFile Not Found");
            exit(0);
        } catch (Exception e) {
            System.out.println(e);
            exit(0);
        }
    }

    //Creating Structure of the calculator and menu
    public void menu()
    {
        scanner=new Scanner(System.in);
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------- Calculator ------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println();
        System.out.println("Please Select the Operation You Want to Perform");
        System.out.println();
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        setOperator(scanner.next());
        switch (operator)
        {
            case "1":Calculator add=new Addition();
                add.calculation();
                break;
            case "2":Calculator sub=new Substraction();
                sub.calculation();
                break;
            case "3":Calculator multi=new Multiplication();
                multi.calculation();
                break;
            case "4":Calculator div=new Division();
                div.calculation();
                break;
            default:System.out.println("Invalid Input");
                break;
        }
        char choice;
        do
        {
            System.out.println("Do You Want to Continue( Y/N )?");
            choice=scanner.next().charAt(0);
            if(choice =='N' || choice =='n')
            {
                exit(0);
            }
            menu();
        }while(choice =='Y' || choice =='y');
    }

    //Function to do the calculation and print the answer
    public void calculation()
    {

    }
}
