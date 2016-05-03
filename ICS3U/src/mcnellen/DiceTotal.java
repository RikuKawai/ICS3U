package mcnellen;

class DiceWorker0 extends Thread {
	DiceWorker0() {
		super("Core 0 Worker");
		System.out.println("Worker 0 created" + this);
		start();
	}
	public void run() {
		int dieA;
		for (int i=0; i<=10000; i++) {
			dieA = (int)(Math.random() * 6) + 1;
		}
		System.out.println("Worker 0 is done");
	}
}
class DiceWorker1 extends Thread {
	DiceWorker1() {
		super("Core 1 Worker");
		System.out.println("Worker 1 created" + this);
		start();
	}
	public void run() {
		int dieB;
		for (int i=0; i<=10000; i++) {
			dieB = (int)(Math.random() * 6) + 1;
		}
		System.out.println("Worker 1 is done");
	}
}
class DiceTotal {
	public static void main(String[] args) {

		DiceWorker0 die0 = new DiceWorker0();
		DiceWorker1 die1 = new DiceWorker1();
		
		try {
			while(die0.isAlive() && die1.isAlive()) {
				System.out.println("Main thread will be alive until workers are done");
				Thread.sleep(100);
			}
		} catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread is done");
		//int[] numberOfRolls = new int[11];
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}
