package rpc.gamegithub;
import java.util.Scanner;
enum HandSign{
    ROCK,
    PAPER,
    SCICCORS  
}

class Player {
    String name;
    static int draw,total;
    int win;
    HandSign sign;
    Player(String name)
    {
        this.name = name;
    }
    // We will get input from user.
    public void Move()
    {
        boolean inputValid = true;
        // we will get char input from user.
        char input_char;
        Scanner input = new Scanner(System.in);
        do{
        // this line gets input from user and if there is any upper makesit lower
        // and also if its more than one character takes 0. index as user's input.
        System.out.println("Hi "+this.name+" Please Enter \nQ:Quit\nR:Rock\nP:Paper\nS:Sciccors\n");
        input_char = input.nextLine().toLowerCase().charAt(0);
              
        switch(input_char){
            case 'q':
                Arena.isGameOver = true;
                break;
            case 'r':
                this.sign = HandSign.ROCK;
                break;
            case 'p':
                this.sign= HandSign.PAPER;
                break;
            case 's':
                this.sign = HandSign.SCICCORS;
                break;
            default:
                System.out.println(this.name+" Please Enter a Valid Character!\n");
                inputValid = false;
                break;
        }
}
while(!inputValid);
        
    }  
}
