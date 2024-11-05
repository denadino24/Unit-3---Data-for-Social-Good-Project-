import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    // instantiates major object
    major arts = new major("ages.txt", "majors.txt");

    int option = arts.promptUserWithOption();
    
    // Receives user input about what information they want to research
    System.out.println("Choose a specific major or group of given majors that you would like to research: \n1) Science and Engineering \n2) Science and Engineering Related Fields \n3) Education \n4) Arts, Humanities, and Others \n5) Business");
    String answer2 = input.nextLine();

    // Receives user input about what major they want to research
    String answer2A = "";
    if (answer2.equals("1")) {
      answer2A = "Science and Engineering";
    }
    if (answer2.equals("2")) {
      answer2A = "Science and Engineering Related Fields";
    }
    if (answer2.equals("3")){
      answer2A = "Education";
    }
    if (answer2.equals("4")) {
      answer2A = "Arts, Humanities, and Others";
    }
    if (answer2.equals("5")) {
      answer2A = "Business";
    }

    System.out.println("You have chosen " + answer2A + " as your selected major(s) \n \"Enter\" to continue");
    input.nextLine();
    
    int answer1A = 0;
    if (option==1) {
      int count1 = arts.countMajor(answer2A);
      System.out.println("\nThe number of graduating students with majors of " + answer2A + " is " + count1 + ".");
    }
    if (option==2) {
      int count2 = arts.findMinAge();
      System.out.println("\nThe age of the youngest college graduate with the majors of " + answer2A + " is " + count2 + ".");
    }
    if (option==3) {
      int count3 = arts.findMaxAge();
      System.out.println("\nThe age of the oldest college graduate with the majors of " + answer2A + " is " + count3 + ".");
    }

    System.out.println("Thank you! Goodbye!");


    
  }
}