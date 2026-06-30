//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        //This is a check to see how git push and commits work

        //lets do a quick largest number check using an array

        //create array
        int arr[] = {1,2,3,4,5,6,7,8,9};

        //have a reference point for the largest at the moment
        int largest = arr[1];

        //for loop to check the largest
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }


        //output
        System.out.println("Largest number in sequence is " + largest);

        //one more casting check
        double age = 25.5;

        int number = (int) age;

        System.out.println(number);

        //cast int to String
        int score = 46;

        String sScore = String.valueOf(score);

        System.out.println(sScore);

        //Another
        float check = 24.5f;

        int checkInt = (int) check;
        System.out.println(checkInt);

        //call tax calculator to main.java
        taxCalculator taxCalculatorObj = new taxCalculator();

        taxCalculatorObj.calculation();

    }
}