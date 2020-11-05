package hashmap;

/**
 * school offers medals to the students of tenth based on the following criteria 
 * If(Marks>=90) : Gold 
 * If(Marks between 80 and 90) : Silver 
 * If(Marks between 70 and 80) : Bronze 

 */
import java.util.*;

public class StudentDetail {
	public static void main(String[] args) {
		/**
		 * put student registration number and marks call the getStudent() function and
		 * print the medal details according to the marks
		 */
		Map<Integer, Integer> student = new HashMap<>();
		student.put(101, 84);
		student.put(102, 99);
		student.put(103, 71);
		Map<Integer, String> medalDetails = getStudents(student);
		System.out.println(medalDetails);
	}

	private static Map<Integer, String> getStudents(Map<Integer, Integer> student) {
		Map<Integer, String> medalDetails = new HashMap<>();
		/**
		 * check the marks if the marks is more than 90 then display gold medal if the
		 * marks is greater than 80 and less than 90 then display silver medal if the
		 * marks is greater than 70 and less than 80 then display Bronze
		 */
		for (Map.Entry<Integer, Integer> entry : student.entrySet()) {
			if (entry.getValue() > 90) {
				medalDetails.put(entry.getKey(), "Gold");
			} else if (entry.getValue() > 80 && entry.getValue() < 90) {
				medalDetails.put(entry.getKey(), "Silver");
			} else if (entry.getValue() > 70 && entry.getValue() < 80) {
				medalDetails.put(entry.getKey(), "Bronze");
			}

		}
		return medalDetails;
	}

}
