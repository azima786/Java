
import java.util.Scanner;

public class markspercentage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
System.out.println("Enter Marks 1: ");
float marks1 = scanner.nextInt();
		
System.out.println("Enter Marks 2: ");
float marks2 = scanner.nextInt();

System.out.println("Enter Marks 3: ");
float marks3 = scanner.nextInt();

float totalMarks = marks1 + marks2 + marks3;
System.out.println(totalMarks);
float percentage = totalMarks / 300;
System.out.println(percentage);
float total = percentage * 100;
System.out.println(total);


System.out.println("Hello "+ name + " your average marks for all subjects are : "+ total);
scanner.close();
		
	}
}
