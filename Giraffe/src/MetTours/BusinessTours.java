package MetTours;

public class BusinessTours implements IToursPolicy {
	public double getDaysRent(int days,int noPersons)
	{
		if(days>4) {
			return (1500*days*noPersons )-(200*days*noPersons);
		}
		else if(noPersons >=4) {
			return (1200*days*noPersons )-(100*days*noPersons);
	}
	 return 1500*days*noPersons;
	}
}