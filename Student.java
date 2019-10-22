import java.util.*;

public class Student {

   private int enrollmentId;
   private String firstname;
   private String lastname;
   private int grade;
   private String advisor;
   
   // Example Comparator that can be used to sort a Collection in a 
   // non-default way. You should still implement a natural ordering.
   public static class CompareLastName implements Comparator<Student> {
      public int compare(Student s1, Student s2){
         return s1.lastname.compareTo(s2.lastname);
      }  
   }
   
   // Getters you may need for displaying the data
   public int getEnrollmentId(){
      return enrollmentId;
   }
   
   public String getFirstName(){
      return firstname;
   }
   
   public String getLastName(){
      return lastname;
   }
   
   public int getGrade(){
      return grade;
   }
   
   public String getAdvisor(){
      return advisor;
   }
   


}