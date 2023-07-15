package rentaRide;
import java.util.Scanner;
public class CarInformation {
	//
		char[] driver = { 'A', 'B', 'C','D', 'E' };
		String[] carmodel = { "Sedan", "HatchBack", "5Seater", "Sedan", "HatchBack" };
		double[] rating = { 4, 4.3, 4.8, 4.1, 4.7 };
		int[] distance = { 500, 1, 200, 700, 430 };
		public void CarInformations() {
		System.out.println("List of Drivers with Details: ");
		System.out.println("Driver" + "Car Model" + "Rating" + "DistanceFromCustomer");
		for (int i = 0; i < 5; i++) {
			System.out.println(" "+driver[i] +" "+ carmodel[i]+" " + rating[i]+" " + distance[i]);

		}

	}

}

public class RideDetails extends CarInformation {
	public static void main(String[] args) {

		final int charge = 8;
		double total_charge;
		char cardriver;
		int mindis = 999999;
		String carname;
		Scanner sc = new Scanner(System.in);
		System.out.print("Customer Ride Distance: ");
		double distance = sc.nextDouble();
		System.out.println("car requested");
		carname = sc.next();
		RideDetails r = new RideDetails();
		//CarInformation i = new CarInformation();
		r.CarInformations();
		for (int j = 0; j < 5; j++) {
			
			if (r.carmodel[j].equals(carname)&& r.rating[j] >= 4) {
				

				if (mindis > r.distance[j]) {
					mindis = r.distance[j];
					cardriver = r.driver[j];
				    System.out.println("Driver " + cardriver+ "will get you to the destination");


				}
			}

		}
		
		total_charge = distance * 8;
	    //System.out.println("Driver " + cardriver+ "will get you to the destination");
		System.out.println("Your charge will be " + total_charge);

	}

}
