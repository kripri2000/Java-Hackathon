import java.util.Scanner;
public class CheckLeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		if(year % 400 == 0)
			System.out.println("Leap Year");
		else if(year % 4 == 0)
		{
				if(year%100 == 0)
					System.out.println("Not Leap Year");
				else
					System.out.println("Leap Year");
		}
		
		else
			System.out.println("Not Leap Year");

	}

}
