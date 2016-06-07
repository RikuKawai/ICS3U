package mcnellen;

public class HappyAndYouKnowIt {
	
	/**
	 * HappyAndYouKnowIt.java
	 * Stores the actions for a verse of "happy and you know it" in an array and prints a verse for every stored action
	 * @author Quinlan McNellen
	 * @param args
	 * 2016/06/07
	 */
	public static void main(String[] args) {
		String[] actions = {"clap your hands","stomp your feet", "blow your nose", "brush your hair", "scratch your knees",
							"5p35k in 1337", "eat a leek", "have a treat", "meet and greet", "wash the street"};
		for (int i=0;i<actions.length;i++) {
			printVerse(actions[i]);
		}
	}
	public static void printVerse(String action) {
		String prefix = "If you're happy and you know it ";
		System.out.println(prefix + action + ".");
		System.out.println(prefix + action + ".");
		System.out.println(prefix + "and you really want to show it.");
		System.out.println(prefix + action + "."); System.out.println();
	}
}