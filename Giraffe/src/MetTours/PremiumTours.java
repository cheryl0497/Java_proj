package MetTours;

public class PremiumTours implements IToursPolicy {
	public double getDaysRent(int days,int noPersons)
	{
		if(days>6) {
			return (1200*days*noPersons )-(100*days*noPersons);
		}
		else if(noPersons >=4) {
			return (1200*days*noPersons )-(100*days*noPersons);
	}
	 return 1200*days*noPersons;
	}
}