package mcnellen;

public class Circumference {

    public static void main(String[] args) {
        int radius;
        int circumference;
        System.out.println("Radius: ");
        radius = System.in.read();
        circumference = (3.14 * radius * 2);
        System.out.print("Circumference: ");
        System.out.println(circumference);       
    }
}