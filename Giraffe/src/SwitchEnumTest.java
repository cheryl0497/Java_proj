
enum RoomType{
	ECONOMY, BUSINESS, EXECUTIVE, DELUXE;
}

class SwitchEnumTest{

	private static double payment(int stay, RoomType room){
		float rate;
		switch(room){
			case ECONOMY:
				rate = 785.95f;
				break;
			case BUSINESS:
				rate = 950.95f;
				break;
			case EXECUTIVE:
				rate = 1070.95f;
				break;
			default:
				rate = 1265.95f;
		}
		return 1.06 * rate * stay;
	}

	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		System.out.printf("Payment for ECONOMY type room  : %.2f%n", payment(n, RoomType.ECONOMY));
		System.out.printf("Payment for BUSINESS type room : %.2f%n", payment(n, RoomType.BUSINESS));
		System.out.printf("Payment for EXECUTIVE type room: %.2f%n", payment(n, RoomType.EXECUTIVE));
		System.out.printf("Payment for DELUXE type room   : %.2f%n", payment(n, RoomType.DELUXE));
	}
}


