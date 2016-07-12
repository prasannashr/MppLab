package Thread;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final PrimeThread[] p = new PrimeThread[5];
		int min = 1;
		for (int i = 0; i < 5; i++) {
			p[i] = new PrimeThread(i);
			p[i].min = min;
			p[i].max = min + 20;
			min = p[i].max;
			p[i].start();
		}
		try {
			for (int i = 0; i < 5; i++)
				p[i].join();
		} catch (InterruptedException e) {
		}
		for (int i = 0; i < 5; i++)
            System.out.println("Thread " + i + "  Prime count: " + p[i].count);

	}

}
