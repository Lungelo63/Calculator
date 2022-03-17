//importing all needed modules
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

//creating class
class calculator{
//creating main class
    public static void main(String[] args){

        //initiating scanner to take in input
        Scanner input = new Scanner(System.in);

        //creating variables woth the value of 0
        int input1 = 0;
        int input2 = 0;
        int results = 0;

        //creating an empty char
        char operator;

        //asking the user to enter the operator then the
        //first number lastly the last number
        System.out.println("Enter an operator : +, -, x, / ");
        operator = input.next().charAt(0);

        System.out.println("Enter first number: ");
        input1 = input.nextInt();

        System.out.println("Enter second number: ");
        input2 = input.nextInt();

        //with the operator given from the user, whichever one
        //matches with the following functions, it will execute
        //then break
        switch (operator){

            case '+':
            results = input1 + input2;
            System.out.println(input1 + " + " + input2 + " = " + results);
            break;

            case '-':
            results = input1 - input2;
            System.out.println(input1 + " - " + input2 + " = " + results);
            break;

            case 'x':
            results = input1 * input2;
            System.out.println(input1 + " * " + input2 + " = " + results);
            break;

            case '/':
            results = input1 / input2;
            System.out.println(input1 + " / " + input2 + " = " + results);
            break;

            default:
            System.out.println("The number or operator entered is invalid");



        }
            //printing data from user to a text file with an exception (catch function)
            //with an error message
        try{

            FileWriter file = new FileWriter("calculatorFile.txt");
            file.write(input1 + " " + operator + " " + input2 + " = " + results);
            file.close();
        }
        catch (IOException e) {
            System.out.println("The was an error while writing on text file");
            e.printStackTrace();
        }


    }




}