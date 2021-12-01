import java.util.ArrayList;
import java.util.Random;

public class RockScissorPaper {

	public RockScissorPaper() {
		// TODO Auto-generated constructor stub
	}

	public static String rps(String a, String b) {
	
		String outcome = null;
	
		if( (a.equals("rock") && b.equals("scissors")) 
			|| (a.equals("scissors") && b.equals("paper")) 
			|| (a.equals("paper") && b.equals("rock"))
			) { outcome = "Player1 wins!";	}
	
	if( (b.equals("rock") && a.equals("scissors")) 
			|| (b.equals("scissors") && a.equals("paper")) 
			|| (b.equals("paper") && a.equals("rock"))
			) { outcome = "Player2 wins!";	}
	
	if( a.equals(b) ) { outcome = "It's a tie!"; }
		
			return outcome;
		}
	
	
	public static void main(String[] args) {
		


		
		ArrayList<String> moves = new ArrayList<String>();
		moves.add("rock");
		moves.add("scissors");
		moves.add("paper");
		
		Random rand = new Random();

		
		String player1 = moves.get(rand.nextInt(3));
		String player2 = moves.get(rand.nextInt(3));
		System.out.println("player1 is " + player1 + " and player2 is " + player2);
		
		System.out.println(rps(player1, player2));
	}


}
