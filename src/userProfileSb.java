import java.util.Scanner;

public class userProfileSb {



    public void userInfo(){

        //create scanner object
        Scanner userInput = new Scanner(System.in);

        //input from user
        //Name
        System.out.println("Enter your name");
        String name = userInput.nextLine();

        //Language of choice
        System.out.println("What is your language of choice?");
        String lang = userInput.nextLine();

        //experience
        System.out.println("Experience in years");
        String experience = userInput.nextLine();

        StringBuilder userProfile = new StringBuilder();



        userProfile.append("Name : ")
                .append(name.toUpperCase())
                .append("\n")
                .append("Language : ")
                .append(lang)
                .append("\n")
                .append("Experience : ")
                .append(experience);

        //Top banner
        System.out.println("=========================");
        System.out.println("Developer profile");
        System.out.println("=========================");

        System.out.println(userProfile);

    }





}
