import java.util.*;

public class Students {

   public static void main(String[] args) {

	  // Format the output in a table-like structure. Note the pattern here.
	  // String.format takes in five header names and pads them out to a defined
	  // number of spaces. You can reuse this format to correctly space the data to 
	  // match the header.
      String format = "%-20s %-20s %-20s %-10s %-20s";
      String header = String.format(format,"EnrollmentID","First Name","Last Name","Grade","Advisor");
      
      
      // This will use the CompareLastName Comparator to sort by last name.
      // This is for example only. The natural ordering for Student should be
      // alphabetical by last name, and Collections.sort(students) should handle
      // that.
      Collections.sort(students, new Student.CompareLastName());

   }
   
}