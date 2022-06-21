import java.util.Scanner;

public class SimpleAndCompoundInterest {

	

		public static void main(String[] args) {
		
			double principal=0;
			double rate,time,simpleInterest,compoundInterest;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the Principal = ");
			principal=scanner.nextDouble();
			
			System.out.println("Enter the Rate= ");
			rate=scanner.nextDouble();
			
			System.out.println("Enter the Time = ");
			time=scanner.nextDouble();
			
			simpleInterest=(principal * time * rate)/100;
			
			compoundInterest=principal * (Math.pow((1 +rate/100), (time)))-principal;
			
			System.out.println("Enter the Principal = "+ principal);
			
			System.out.println("Enter the Rate= "+rate);
			
			System.out.println("Enter the Time = " + time );
			
			System.out.println("Simple Interest: "+simpleInterest);
			
			System.out.println("Compound Interest: "+compoundInterest);
			
			

		}

	}

