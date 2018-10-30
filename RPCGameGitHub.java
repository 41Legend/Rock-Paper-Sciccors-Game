package rpc.gamegithub;


public class RPCGameGitHub {

    
    public static void main(String[] args) {
       
        // Creating players and Sendind names to Player class.
        Player player1 = new Player("Walter");
        Player player2 = new Player("Jesse");
        // Sending player1 and player2 objects to Arena class where we will start game
        Arena arena = new Arena(player1,player2);
        arena.startGame();
    }

}
