

class Worker {

	public static int doWork(int count) {
		long t = System.currentTimeMillis();
		if(count <= 0)
			count = (int)(1 + t % 10);
		while(System.currentTimeMillis() < t + 100 * count);
		return count;
	}

	public static int doWork() {
		return doWork(0);
	}
}

class ThreadCoordTest {

	private static volatile int data;
	private static Object coordinator = new Object();

	private static void consume() {
		int value;
		System.out.printf("Consumer<%x> ready...%n", Thread.currentThread().hashCode());
		synchronized(coordinator) {
			try{
				coordinator.wait();
			}catch(InterruptedException e){}
			value = data;
		}
		System.out.printf("Processed value = %d from consumer<%x>%n", value * value, Thread.currentThread().hashCode());
	}

	private static void produce() {
		System.out.printf("Producer<%x> ready...%n", Thread.currentThread().hashCode());
		int value = Worker.doWork();
		synchronized(coordinator){
			data = value;
			coordinator.notify();
			//coordinator.notifyAll();
		}
	}

	public static void main(String[] args) throws Exception{
		var consumer1 = new Thread(ThreadCoordTest::consume);
		consumer1.start();
		//var consumer2 = new Thread(ThreadCoordTest::consume);
		//consumer2.start();
		var producer = new Thread(ThreadCoordTest::produce);
		producer.start();
	}
}
