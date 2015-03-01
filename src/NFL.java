import java.util.Scanner;
public class NFL {
	public static void main(String[] args){
		double PasserRating;
		Scanner A = new Scanner(System.in);
		System.out.print("What is the total number of attempted passes? ");
		double ATT = A.nextDouble();
		
		Scanner B = new Scanner(System.in);
		System.out.print("What is the total number of completed passes? ");
		double COMP = B.nextDouble();
		
		Scanner C = new Scanner(System.in);
		System.out.print("What are the total number of passing yards? ");
		double YDS = C.nextDouble();
		
		Scanner D = new Scanner(System.in);
		System.out.print("What are the total number of touchdown passes? ");
		double TD = D.nextDouble();
		
		Scanner E = new Scanner(System.in);
		System.out.print("What are the total number of interceptions? ");
		double INT = E.nextDouble();
		
		double RatingA = ((COMP/ATT)-(.3)) * 5;
		double RatingB = ((YDS/ATT)-3)*.25;
		double RatingC = (((TD/ATT))*20);
		double RatingD = (2.375 - ((INT/ATT)*25));
		
		if (RatingA > 2.375){
			RatingA = 2.375;
		}
		if (RatingB > 2.375){
			RatingB = 2.375;
		}
		
		if (RatingC > 2.375){
			RatingC = 2.375;
		}
		if (RatingD > 2.375){
			RatingD = 2.375;
		}

		PasserRating = ((RatingA + RatingB + RatingC + RatingD)/6)*100;
		
		/*  System.out.println(RatingA);
			System.out.println(RatingB);
			System.out.println(RatingC);
			System.out.println(RatingD);
		*/
		System.out.println("Your QB rating is: " + PasserRating);
		
		
	}
	
		
	
	
}
