import java.util.Scanner;

	
public class QBrating {


		public static void main(String[] args) {
			
	//creates scanner object
			Scanner input = new Scanner(System.in);
			
	//reads stats
			System.out.print("Enter completions: ");
			double comp=input.nextDouble();
			System.out.print("Enter number of passing attempts: ");
			double att=input.nextDouble();
			System.out.print("Enter passing yards: ");
			double yds=input.nextDouble();
			System.out.print("Enter touchdown passes: ");
			double td=input.nextDouble();
			System.out.print("Enter interceptions: ");
			double ints=input.nextDouble();
			
			double rating;
			
			//compute qb rating
			double a=(comp/att-.3)*5;
			double b=(yds/att-3)*.25;
			double c=(td/att)*20;
			double d=(2.375)-(ints/att)*25;
			
			if (a+b+c+d>2.375) {
				rating = 2.375;
			}
			else if ((a+b+c+d)*(100/6)<0) {
				rating = 0;
			}
			else {
				rating = (a+b+c+d)*(100/6);
			}
			
			
	// display result
			System.out.println("QB rating is: "+rating);
			}
	}

