package inTurn;

public class JobOffer {
	private String name;
	private double pay;
	private int weeks; // length of job
	private double stipend; 
	private double rent = 0; //per month
	private double deposit = 0;
	int lease = 0;//months
	private double food; //cost of food per month
	
	public JobOffer(String company,double salary,int time, double stip, double foodCost)
	{
		name = company;
		pay = salary;
		weeks = time;
		stipend = stip;
		food = foodCost;
	}
	
	public JobOffer(String company, double salary, int time, double stip, double rentCost, double depositCost, int leaseLength)
	{
		name = company;
		pay = salary;
		weeks = time;
		stipend = stip;
		rent = rentCost;
		deposit = depositCost;
		lease = leaseLength;
	}
	
	public double getValue()
	{
		return ((pay * weeks * 40) + stipend) - ((rent*lease)+ deposit + (food*(weeks/4)));
	}
	
	public String getName()
	{
		return name;
	}
	

}
