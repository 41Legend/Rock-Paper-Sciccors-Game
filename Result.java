package rpc.gamegithub;

import java.io.IOException;


class Result {
    
    static void showScores(Player player1,Player player2) throws IOException
    {
        //Lets display players scores after each game.
        System.out.println(player1.name+"'s Score : "+player1.win);
        System.out.println(player2.name+"'s Score : "+player2.win);
    }
    static void setRules(Player player1,Player player2)
    {
        // check if we couldnt get any input or gameover is true then return nothing.
        if(player1.sign == null || player2.sign == null || Arena.isGameOver ) return;
        else if(player1.sign == player2.sign)
            Player.draw++;
        //These 3 lines are the possibilities of player1's winning situations.
        else if(player1.sign == HandSign.PAPER && player2.sign == HandSign.ROCK)
            player1.win++;
        else if(player1.sign == HandSign.ROCK && player2.sign == HandSign.SCICCORS)
            player1.win++;
        else if(player1.sign== HandSign.SCICCORS && player2.sign == HandSign.PAPER)
            player1.win++;
        //Otherwise player2 will win.
        else
            player2.win++;
        //Also we increase total (total played).
        Player.total++;
    }
    
}
