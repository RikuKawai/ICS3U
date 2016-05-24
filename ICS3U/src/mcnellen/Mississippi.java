package mcnellen;

public class Mississippi {

	public static void main(String[] args) {
		/* Mississippi.java
		 * This program vertically spells out MISSISSIPPI with block letters
		 * If you see garbled text, make sure your Eclipse Workspace is set to UTF-8 encoding and not Cp1252.
		 * @author Quinlan McNellen
		 * 2016/05/17
		 */
		
		printM();
		printI();
		printS();
		printS();
		printI();
		printS();
		printS();
		printI();
		printP();
		printP();
		printI();
	}
	
	public static void printM(){ //print the letter M
		System.out.println("███╗   ███╗");
		System.out.println("████╗ ████║");
		System.out.println("██╔████╔██║");
		System.out.println("██║╚██╔╝██║");
		System.out.println("██║ ╚═╝ ██║");
		System.out.println("╚═╝     ╚═╝");
		System.out.println("           ");
	}
	public static void printI(){ //print the letter I
		System.out.println("██╗");
		System.out.println("██║");
		System.out.println("██║");
		System.out.println("██║");
		System.out.println("██║");
		System.out.println("╚═╝");
		System.out.println("   ");
	}
	public static void printS(){ //print the letter S
		System.out.println("███████╗");
		System.out.println("██╔════╝");
		System.out.println("███████╗");
		System.out.println("╚════██║");
		System.out.println("███████║");
		System.out.println("╚══════╝");
		System.out.println("        ");
	}
	public static void printP(){ //print the letter P
		System.out.println("██████╗ ");
		System.out.println("██╔══██╗");
		System.out.println("██████╔╝");
		System.out.println("██╔═══╝ ");
		System.out.println("██║     ");
		System.out.println("╚═╝     ");
		System.out.println("        ");
	}
}
