package rpc.gamegithub;


class Arena {

    Player player1,player2;
    static boolean isGameOver;
    Arena(Player player1,Player player2)
    {
        this.player1 = player1;
        this.player2 = player2;
    }
    // We will check if isGameOver = true or not if it is then players won't make any move again.
    void startGame()
    {
        while(!isGameOver)
        {
            player1.Move();
            player2.Move();
            Result.setRules(player1,player2);
            Result.showScores(player1,player2);
        }
    }
}
