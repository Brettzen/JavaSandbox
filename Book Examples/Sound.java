class Sound {
	public static void main(String args[]){
		double dist, echo;

		dist = 7.2 * 1100;
		echo = dist * 2;

		System.out.println("The lightning is " + dist + " feet away! RUNNNN!!!!");
		System.out.println("Wait... was that an echo?");
		System.out.println("It's actually " + echo + " feet away! Phew!");
	}
}