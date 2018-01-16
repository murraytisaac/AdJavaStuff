import java.util.Scanner;

public class Radius {

	public static void main(String[] args) {
		Scanner oScan = new Scanner(System.in);

		System.out.print("Enter a radius(m): ");
		double r = oScan.nextDouble();
		System.out.println();

		double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

		System.out.printf("The voulme of a sphere witha radius of %.2f m is %.2f m^3", r, volume);

	}

}
