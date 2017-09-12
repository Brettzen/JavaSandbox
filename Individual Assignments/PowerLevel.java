import java.util.Scanner;

class PowerLevel {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int powerLevel,
			height, 
			weight, 
			bp, 
			lp, 
			mp, 
			dl, 
			bc;
		double art,
			   spd,
			   pow;
		System.out.println("\n\nLet's find out your power level!");
		System.out.print("Enter your height (in): ");
		height = input.nextInt();
		System.out.print("Enter your weight in (lb): ");
		weight = input.nextInt();
		System.out.print("Enter your Bench Press 1-Rep Max (lb): ");
		bp = input.nextInt();
		System.out.print("Enter your Leg Press 1-Rep Max (lb): ");
		lp = input.nextInt();
		System.out.print("Enter your Military Press 1-Rep Max (lb): ");
		mp = input.nextInt();
		System.out.print("Enter your Deadlift 1-Rep Max (lb): ");
		dl = input.nextInt();
		System.out.print("Enter your Bicep Curl 1-Rep Max (lb): ");
		bc = input.nextInt();
		System.out.print("Enter your Average Reaction Time (Human Average is 0.25 seconds): ");
		art = input.nextFloat();
		System.out.print("Enter your Maximum Running Speed (mph): ");
		spd = input.nextFloat();
		System.out.print("Enter your Force of Punch in Pounds (Human Average is about 250): ");
		pow = input.nextFloat();

		System.out.println("Thanks! Please wait while I perform the calculations to determine your power level...");

		for(int i=0; i < 6; i++) {
			try{
				Thread.sleep(500);
			} catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
			System.out.print("...");
		}

		powerLevel = (int) (height + weight + bp + lp + mp + dl + bc + spd + pow + (art / 0.25)) / 100;

		System.out.println(" Your Power Level is: " + powerLevel);

		if(powerLevel <= 0) {
			System.out.println("Either you didn't follow instructions or you're currently dead. Hopefully you just didn't follow instructions.");
		} else if(powerLevel < 5) {
			System.out.println("You've got the power level of a pre-adolescent. Great job!");
		} else if(powerLevel < 11) {
			System.out.println("You've got the power level of a standard human being. Way to go!");
		} else if(powerLevel < 30) {
			System.out.println("You've got the power level of an expertly skilled fighter. Wowza!");
		} else if(powerLevel < 56) {
			System.out.println("You've got the power level of a chimpanzee. That is some serious power!");
		} else if(powerLevel < 110) {
			System.out.println("You've got the power level of a gorilla. Are you the missing link?");
		} else if(powerLevel < 142) {
			System.out.println("You've got the power level of a tiger. Clearly someone has been eating their Wheaties!");
		} else if(powerLevel < 500) {
			System.out.println("You've got the power level of a saiya-jin! No doubt about that.");
		} else if(powerLevel >= 500) {
			System.out.println("You're either a super saiya-jin or a massive cheater. If you're the former... please train me!!!!");
		}
	}
}