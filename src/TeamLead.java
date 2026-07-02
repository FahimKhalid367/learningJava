public class TeamLead {

    String name;
    int age;
    String job;
    String city;

    void introduce(){
        System.out.println(
                "Hello, my name is " + name + ", I am " + age + " years old"
        );

    }

    void bark(){
        System.out.println(name + " says Woof");
    }

}
