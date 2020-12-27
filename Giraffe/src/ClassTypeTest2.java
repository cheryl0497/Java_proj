class Interval{

	private int min;
	private int sec;

	public Interval(int m, int s){
		min = m + s / 60;
		sec = s % 60;
	}

	public int minutes(){
		return min;
	}

	public int seconds(){
		return sec;
	}

	public int time(){
		return 60 * min + sec;
	}

	public void print(){
		System.out.printf("%d:%02d%n", min, sec);
	}
}

class ClassTypeTest2{

	private static float speed(float distance, Interval duration){
		return 3.6f * distance / duration.time();
	}

	public static void main(String[] args){
		Interval jack = new Interval(2, 5);
		System.out.print("Jack's Interval = ");
		jack.print();
		System.out.printf("Jack's speed = %.1f%n", speed(500, jack));
		Interval john = new Interval(2, 80);
		System.out.print("John's Interval = ");
		john.print();
		System.out.printf("John's speed = %.1f%n", speed(500, john));
	}
}


