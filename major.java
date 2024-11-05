import java.util.Scanner;

/*
 * Manages sample data about the majors of graduating college students
 */
public class major {

  private art[] arts;    // The 1D array of major objects

  /*
   * Reads the data from agesFile and majors to initialize majors
   */
  public major(String agesFile, String majorsFile) {
    arts = createArts(agesFile, majorsFile);
  }

  /*
   * Returns a 1D array of major objects using the data from agesFile and majorsFile
   */
  public art[] createArts(String agesFile, String majorsFile) {
    int[] agesData = FileReader.toIntArray(agesFile);
    String[] majorData = FileReader.toStringArray(majorsFile);
    
    art[] tempArts = new art[majorData.length];

    for (int index = 0; index < tempArts.length; index++) {
      tempArts[index] = new art(agesData[index], majorData[index]);
    }

    return tempArts;
  }

  /*
   * Counts the number of times a major appears in the data
   */
  public int countMajor(String majorType) {

    int count = 0;

    for (art answer : arts) {
      if (answer.getMajor().equals(majorType)) {
        count++;
      }
    }
    
    return count;
  }

  /*
   * Find and return the youngest age of college graduates based on a chosen major.
   */
  public int findMinAge() {

    int minAge = arts[0].getAge();
      for (art answer : arts) {
        if (answer.getAge() < minAge) {
          minAge = answer.getAge();
        }
      }
    return minAge;
  }

  /*
   * Find and return the largest age of college graduates based on a chosen major.
   */
  public int findMaxAge() {
    int maxAge = arts[0].getAge();
    for (art answer : arts) {
      if (answer.getAge() > maxAge) {
        maxAge = answer.getAge();
      }
    }
    return maxAge;
  }

  /*
   * Prompts user with options of what to research
   */
  public int promptUserWithOption() {
    Scanner input = new Scanner(System.in);
    System.out.println("Age and Major of College Graduates: What would you like to know?");
    System.out.println("1) Number of college graduates with chosen major(s)"); 
    System.out.println("2) Age of youngest college graduate with chosen major(s)");
    System.out.println("3) Age of oldest college graduate with chosen major(s)");
    int option = input.nextInt();
    input.nextLine();
    input.close();
    return option;
  }

  /*
   * Returns a String containing each sample of data 
   */
  public String toString() {
    String result = "";

    for (art answer : arts) {
      result += answer + "\n";
    }

    return result;
  }
  
}