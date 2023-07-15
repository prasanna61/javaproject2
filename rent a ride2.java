//package rentaRide;
import java.util.Scanner;
public class Cardetails {
		char[] drivers = { 'A', 'B', 'C','D', 'E' };
		String[] models = { "Sedan", "HatchBack", "5Seater", "Sedan", "HatchBack" };
		double[] rating = { 4, 4.3, 4.8, 4.1, 4.7 };
		int[] dist = { 500, 1, 200, 700, 430 };
		public void CarInfo() {
		System.out.println("Drivers Details: ");
		System.out.println("Driver" + "Car Model" + "Rating" + "DistanceFromCustomer");
		for (int i = 0; i < 5; i++) {
			System.out.println(" "+drivers[i] +" "+ models[i]+" " + rating[i]+" " + dist[i]);

		}

	}

}

class RideInfo extends Cardetails {
	public static void main(String[] args) {

		final int charge = 8;
		double total_charge;
		char cardriver;
		int min_dis = 999999;
		String carname;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ride Distance: ");
		double distance = sc.nextDouble();
		System.out.println("car requested");
		carname = sc.next();
		RideInfo r = new RideInfo();
		r.CarInfo();
		for (int j = 0; j < 5; j++) {
			
			if (r.models[j].equals(carname)&& r.rating[j] >= 4) {
				

				if (min_dis > r.dist[j]) {
					min_dis = r.dist[j];
					cardriver = r.drivers[j];
				    System.out.println("Driver " + cardriver+ "will get you to the destination");


				}
			}

		}
		
		total_charge = min_dist * 8;
	    //System.out.println("Driver " + cardriver+ "will get you to the destination");
		System.out.println("Your charge will be " + total_charge);

	}

}
