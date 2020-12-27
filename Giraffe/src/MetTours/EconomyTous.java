package MetTours;

public class EconomyTous implements IToursPolicy {
	public double getDaysRent(int days,int noPersons)
	{
		return 500*days*noPersons;
	}
}
