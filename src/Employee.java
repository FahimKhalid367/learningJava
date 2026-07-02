import java.math.BigDecimal;

public class Employee {

    //create employee model
    String name;
    int age;
    String jobTitle;
    BigDecimal salary;

    //method to introduce employee
    void introduce(){
        System.out.println(
                "Hello, my name is " + name + ".\n" +
                "I work as a " + jobTitle + ".\n" +
                "I make " + salary
        );
    }


    void birthday(){
        System.out.println(
                "Happy " + (age + 1) + "th Birthday!"
        );
    }

    void payRise(BigDecimal increase){

        salary = salary.add(increase);

        System.out.println(
                "You've gotten a pay rise of £" + increase +
                        ", your new salary is £" + salary
        );
    }

}
