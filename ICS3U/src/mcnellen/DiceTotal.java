package mcnellen;

/* DiceTotal.java
 * This program simulates rolling two dice a certain number of times 
 * and displays how many times each possible outcome occurred.
 * @author Quinlan McNellen
 * 2016/05/04
 * v0.3
 */

public class DiceTotal {

	static class Array {
		private static int[] numberOfRolls = new int[11];
		private static int totalRolls;
		//private static int rollsToCompute;
	}
	
	class T1 implements Runnable {
		@Override
		public void run() {
			int dice;
			for (int i=0; i<5000; i++) {
				dice = ((int)(Math.random() * 6) + 1) + ((int)(Math.random() * 6) + 1);
				Array.numberOfRolls[(dice - 2)]++;
				Array.totalRolls++;
			}
		}
	}
	class T2 implements Runnable {
		@Override
		public void run() {
			int dice;
			for (int i=0; i<5000; i++) {
				dice = ((int)(Math.random() * 6) + 1) + ((int)(Math.random() * 6) + 1);
				Array.numberOfRolls[(dice - 2)]++;
				Array.totalRolls++;
			}
		}
	}
	
	private void diceTotal() throws InterruptedException {
		T1 worker0 = new T1();
		T2 worker1 = new T2();
		
		new Thread(worker0).start();
		new Thread(worker1).start();
	}
	public static void main(String[] args) throws InterruptedException {
		try {
			DiceTotal diceTotal = new DiceTotal();
			diceTotal.diceTotal();
			while(Array.totalRolls < (10000)) {
				Thread.sleep(0, 1);
			}
			System.out.println("Number" + "\t" + "Total");
			for (int i=0; i<=10; i++) {
				System.out.println((i+2) + "\t" + Array.numberOfRolls[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}