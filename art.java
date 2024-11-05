/*
 * Represents a sample to a data set about majors of graduating college students
 */
public class art {

  private int age;          // The age of a graduating college student
  private String major;     // The major a graduating college student had

  /*
   * Sets age and major to the specified values
   */
  public art(int age, String major) {
    this.age = age;
    this.major = major;
  }

  /*
   * Returns the age of the student
   */
  public int getAge() {
    return age;
  }

  /*
   * Returns the major the student graduating with
   */
  public String getMajor() {
    return major;
  }

  /*
   * Returns a String containing the age and major of the student
   */
  public String toString() {
    return age + " years old: " + major;
  }
  
}