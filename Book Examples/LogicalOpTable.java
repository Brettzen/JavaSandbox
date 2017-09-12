class LogicalOpTable {
	public static void main(String args[]) {
		boolean p, q;

		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		p = q = true;
		runLoop(p, q);

		q = false;
		runLoop(p, q);
		
		p = false; q = true;
		runLoop(p, q);

		q = false;
		runLoop(p, q);

		
	}

	public static void runLoop(boolean t, boolean f) {
			System.out.print(t + "\t" + f + "\t");
			System.out.print((t&f) + "\t" + (t|f) + "\t");
			System.out.println((t^f) + "\t" + (!t));
		}
}