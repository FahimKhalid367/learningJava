import java.util.Scanner;

public class taxCalculator {

    public void calculation(){


        //use scanner to get user income via command line
        Scanner taxObj = new Scanner(System.in);

        System.out.println("Enter your yearly income");

        int income = taxObj.nextInt();


        //tax logic
        if(income < 12570){
            System.out.println("You do not pay any tax on your income");
        } else if (income > 12570 && income < 45000){
            System.out.println("You need to pay £" + (income - 12570) * 0.20 + " annually");
        } else if (income > 45000 && income < 100000){
            System.out.println("Tax payable: " + (income - 12570) * 0.40);

        } else if (income >= 100000) {
            System.out.println("Tax payable: " + income * 0.40);
        }

    }

}
