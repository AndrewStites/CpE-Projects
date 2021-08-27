public class PickACard {

	public static void main(String[]args) {

	//Calculations for random
	int cardType = (int)(Math.random() * 13.0);
	int cardSuit = (int)(Math.random() * 4.0);

	//Swith Statements to determine the card
	String textMate = "";
	String textBud = "";

	switch (cardType) {
		case 0:textMate = " the Ace "; break;
		case 1:textMate = " a Two "; break;
		case 2:textMate = " a Three "; break;
		case 3:textMate = " a Four "; break;
		case 4:textMate = " a Five "; break;
		case 5:textMate = " a Six "; break;
		case 6:textMate = " a Seven "; break;
		case 7:textMate = " a Eight "; break;
		case 8:textMate = " a Nine "; break;
		case 9:textMate = " a Ten "; break;
		case 10:textMate = " the Jack "; break;
		case 11:textMate = " the Queen "; break;
		case 12:textMate = " the King "; break;

		}

	switch (cardSuit) {
		case 0:textBud = "of Spades"; break;
		case 1:textBud = "of Clubes"; break;
		case 2:textBud = "of Diamonds"; break;
		case 3:textBud = "of Hearts"; break;

		}
	//Display results
	System.out.println("The card you chose was" + textMate + textBud);
	}

}