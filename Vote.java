import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age = in.nextInt();
		
		if(age>=18)
		{
			System.out.println("The candidate is eligible to vote ");
		}
		else
		{
			System.out.println("The candidate is not eligible to vote ");
		}
		

	}

}
