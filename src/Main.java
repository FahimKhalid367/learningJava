import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

//        //This is a check to see how git push and commits work
//
//        //lets do a quick largest number check using an array
//
//        //create array
//        int arr[] = {1,2,3,4,5,6,7,8,9};
//
//        //have a reference point for the largest at the moment
//        int largest = arr[1];
//
//        //for loop to check the largest
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] > largest) {
//                largest = arr[i];
//            }
//        }
//
//
//        //output
//        System.out.println("Largest number in sequence is " + largest);
//
//        //one more casting check
//        double age = 25.5;
//
//        int number = (int) age;
//
//        System.out.println(number);
//
//        //cast int to String
//        int score = 46;
//
//        String sScore = String.valueOf(score);
//
//        System.out.println(sScore);
//
//        //Another
//        float check = 24.5f;
//
//        int checkInt = (int) check;
//        System.out.println(checkInt);

        //call tax calculator to main.java
//        taxCalculator taxCalculatorObj = new taxCalculator();
//
//        taxCalculatorObj.calculation();
//
//
//        //Switch exercises
//        int day = 2;
//
//        switch(day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            default:
//                System.out.println("Invalid entry");
//        }
//
//        //ternary operator check
//        int age = 20;
//
//        String result = age > 17 ? "Adult" : "Kid";
//
//        System.out.println(result);
//
//        String name = "Fahim";
//        System.out.println(name.toUpperCase() + name.length());
//
//        //scanner for user input
//        Scanner inputName = new Scanner(System.in);
//        System.out.println("Enter first name");
//
//        String firstName = inputName.nextLine();
//
//
//        //sb to append strings
//        StringBuilder sb = new StringBuilder();
//
//
//
//        System.out.println("Enter second name please");
//        String surname = inputName.nextLine();
//        sb.append(firstName).append(" ").append(surname);
//
//
//
//        System.out.println(sb);
//
//        userProfileSb profile = new userProfileSb();
//        profile.userInfo();
//
//        //text block exercise
//        String text = """
//                My name is Fahim Khalid,
//                I am experimenting with text blocks for the first time!
//                    Let me play around
//                        with the
//                            formatting
//                """;
//
//        System.out.println(text);
//
//        //BigDecimal
//        bigDecimal bankAcc = new bigDecimal();
//        bankAcc.addMoney();
//
//        methodChaining mce = new methodChaining();
//        mce.MC();



        TeamLead fahim = new TeamLead();

        fahim.name = "Fahim";
        fahim.age = 25;

        fahim.introduce();

        TeamLead freddie = new TeamLead();
        freddie.name = "Freddie";
        freddie.age = 24;
        freddie.introduce();




    }
}