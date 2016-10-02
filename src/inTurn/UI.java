package inTurn;
import java.util.ArrayList;
import java.util.Scanner;
public class UI {
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<JobOffer> jobs = new ArrayList<JobOffer>();
		System.out.println("Welcom to InTurn! The best app to compare job offers \nLets Get Started: " );
		int off = 0;
		
	while(off == 0)
	{	
		String options = "\n1)Add a job offer\n2)Calculate\n3)Print offers";
		System.out.println(options);
		int input = scan.nextInt();
		
		if(input == 1)
		{
			System.out.println("\nCompany Name: ");
			String name = scan.next();
			System.out.println("\nHourly Pay: ");
			double pay = scan.nextDouble();
			System.out.println("\nLength of Internship(In Weeks): ");
			int length = scan.nextInt();
			System.out.println("\nRent Cost(Per Month): ");
			double rentCost = scan.nextDouble();
			System.out.println("\nStipend: ");
			double stipend = scan.nextDouble();
			System.out.println("\nGrocery Cost: ");
			double groceryCost = scan.nextDouble();
			System.out.println("\nLease Length(In months): ");
			int lease = scan.nextInt();
			JobOffer newJob = new JobOffer(name, pay, length, rentCost, stipend, groceryCost, lease);
			jobs.add(newJob);
			
			
		}
		else if(input == 2)
		{
			try
				{
					JobOffer best = jobs.get(0);
					for(int i=1; i<jobs.size(); i++)
					{
						if(jobs.get(i).getValue()>best.getValue())
						{
							best = jobs.get(i);
						}
					}
					
					System.out.println("\nBest Choice: " + best.getName() + "\nProfit: " + best.getValue());
				}
			catch(IndexOutOfBoundsException i)
			{
				System.out.println("\nHmm... It appear you haven't added any job offers");
			}
		}
	}	
		
	}
	
//	private static void createProfile(Scanner scan)
//	{
//		
//	}

}
