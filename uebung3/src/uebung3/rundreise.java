package uebung3;

public class rundreise {

	// preparation for the table
	public static int anzahl = 10;
	public static int[][] tabelle = new int[anzahl][anzahl];
	public static int distance;

	// A method for the table with the kilometer data of the cities.
	public static void table(int distance, int anzahl, int[][] tabelle) {

		// for-loop, which fills the table randomly
		for (int i = 0, k = 0; i < tabelle.length; i++) {
			for (k = 0; k < tabelle.length; k++) {

				// the condition, that the diagonal line (City1 to City1 should be 0km)
				if (i == k) {
					tabelle[i][k] = 0;
					// the condition, that the table with 10 cities is filled randomly
				} else if (i < k) {
					distance = (int) (Math.random() * 10);
					while (distance == 0) {
						distance = (int) (Math.random() * 10);
					}
					tabelle[i][k] = distance;
					// the condition that the cities which are back-to-front should have the same
					// kilometer difference
				} else if (i > k) {

					tabelle[i][k] = tabelle[k][i];
				}
				System.out.print("|__" + tabelle[i][k] + "__|");
			}
			System.out.println("\n");
		}
	}

	/*
	 * Create a method, which will "organize" the random tour. At first the variable
	 * is filled by bubble sort with random numbers.
	 */
	public static void randomTour(int[] route, int[][] tabelle) {

		for (int i = 0; i < route.length; i++) {
			int rand = (int) (Math.random() * route.length);
			int tmp = route[i];
			route[i] = route[rand];
			route[rand] = tmp;
		}

		/*
		 * The tour has a random start and end. With the first output I can see the
		 * start with 0km and the second part show the next point and how far it was
		 * from the last point
		 */
		for (int i = 0; i < route.length; i++) {
			if (i == 0) {
				System.out.println("Die Route startet mit der Stadt: " + route[i] + "\n"
						+ "Somit beträgt die Kilometeranzahl: 0 km\n");
			} else {
				System.out.println("Weiter geht es in die Stadt: " + route[i] + "\n"
						+ "Die Kilometeranzahl beträgt von der letzten Station aus: " + tabelle[route[i]][route[i - 1]]
						+ " km\n");
			}
		}
		// show the total sum of the main route
		int travelSum = 0;
		for (int i = 0; i < 9; i++) {

			if (i == 9) {
				travelSum += tabelle[route[i]][route[0]];
			} else {
				travelSum += tabelle[route[i]][route[i + 1]];
			}
		}
		System.out.println("==> Gesamtkilometer: " + travelSum + "\n");
	}

	// Create a method, which calculates the total sum of the whole tour.
	public static int distanceCounter(int anzahl, int[] route, int[][] tabelle) {
		int totalSum = 0;
		for (int i = 0; i < anzahl - 1; i++) {
			if (i == 9) {
				totalSum += tabelle[route[i]][route[0]];
			} else {
				totalSum += tabelle[route[i]][route[i + 1]];
			}
		}
		// The method is with a return value, so it should provide a compatible return
		// value - totalSum.
		return totalSum;
	}

	// A method which create a duplicate of the main-Tour.
	public static void createDuplicate(int[] route, int[] duplikat) {
		for (int i = 0; i < route.length; i++) {

			duplikat[i] = route[i];
		}
	}

	// A method with bubble-sort for changing the numbers in the main method for the
	// best tour.
	public static void randomChange(int[] duplicate) {

		int c;
		int d;
		
		//two variable are filled with random numbers
		int intermediator = (int) (Math.random() * 10);
		d = (int) (Math.random() * 10);

		while (intermediator == d) {
			d = (int) (Math.random() * 10);
		}

		// bubble-sort
		c = duplicate[intermediator];
		duplicate[intermediator] = duplicate[d];
		duplicate[d] = c;
	}

	public static void main(String[] args) {

		// is need later to show the number try of changing to find the best route
		int changeover = 0;

		// Method table is used to show the table
		table(distance, anzahl, tabelle);

		// route is filled with the numbers
		int[] route = new int[anzahl];
		int[] duplikat = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < anzahl; i++) {
			route[i] = i;
		}

		// Method randomTour is used to show the tour with the differences and the total
		// sum.
		randomTour(route, tabelle);

		// The for loop is used to find the best route by swapping several times.
		for (int i = 0; i < 100; i++) {

			// method is used to duplicate now
			createDuplicate(route, duplikat);

			// incrementing
			changeover++;

			// method is now needed to change the tour stops
			randomChange(duplikat);

			//the condition to check if the tour which is changed better of the total sum than the before one	 
			if (distanceCounter(anzahl, duplikat, tabelle) < distanceCounter(anzahl, route, tabelle)) {
				
				//than is our "duplicate" know our "main-route"
				for (int k = 0; k < route.length; k++) {
					route[k] = duplikat[k];
				}
				System.out.println(
						"\n" + changeover + ".Versuch des Tausches! \nGesamtkilometer: " + distanceCounter(anzahl, route, tabelle));
				
				//The route with the individual stops is shown.
				for (int k = 0; k < route.length; k++) {
					System.out.print("|" + route[k] + " ");
				}
				System.out.println();
			}
		}
	}
}
