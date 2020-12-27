package MetTours;

public class TourTest {
	
		static class TourCalculator
		{
			public static double getTotalRent(int days,int noPersons,IToursPolicy itour)
			{
				return itour.getDaysRent(days,noPersons)*days*noPersons;
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			IToursPolicy tours = new EconomyTous();
			System.out.println("The total rent for Economy Tours is " +TourCalculator.getTotalRent(7, 8, tours));
			IToursPolicy tours1 = new PremiumTours();
			System.out.println("The total rent for Premium Tours is " +TourCalculator.getTotalRent(10, 15, tours1));
			IToursPolicy tours2 = new BusinessTours();
			System.out.println("The total rent for Business Tours is " +TourCalculator.getTotalRent(5, 4, tours2));
		}
		}
		

