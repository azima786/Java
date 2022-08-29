import java.util.Scanner;

public class chapter4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//	System.out.println("Enter subject 3 marks");
		//	int marks1 = scan.nextInt();
		//	int marks2 = scan.nextInt();
		//	int marks3 = scan.nextInt();

		//	float average = (marks1 + marks2 + marks3) / 3.0f;

		//	if (average >= 40 && marks1 >= 33 && marks2 >= 33 & marks3 >= 33) {
		//	System.out.println("You've been promoted");
		//} else {
		//	System.out.println("Sorry, you failed!");
		//}

		//	float tax = 0f;
		//	float income = 3.3f;
		//	if (income < 2.5) {
		//		tax = 0;
		//	}

		//	if(income>2.5f && income<=5f){
		//tax= tax+0.05f *(income-2.5f);
		//	}
		//System.out.println(tax);

		int day = 2;
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wed");
				break;
			case 4:
				System.out.println("Thur");
				break;
			case 5:
				System.out.println("Fri");
				break;
			case 6:
				System.out.println("Sat");
				break;
			case 7:
				System.out.println("Sun");
				break;

		}
		scan.close();
	}
}
