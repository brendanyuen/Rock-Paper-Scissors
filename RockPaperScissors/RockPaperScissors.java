import java.util.Scanner;

class RockPaperScissors{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int ROCK = 1;
        final int PAPER = 2;
        final int SCISSORS = 3;

        int humanChoice =0;

        int computerChoice=0;
        String ans  = "y"; 
        int wins=0;
        int ties=0;
        int losses=0;
        
        
        System.out.println("RPS 1.0");
        System.out.println("****************************************");
        System.out.println("Good luck, human ..."); 
        while (ans.equals("y")) {
            System.out.println("What do you throw? [1] Rock, [2] Paper, [3] Scissors? ");
            humanChoice=sc.nextInt();
            computerChoice = (int) (Math.random()*3)+1;
            if (humanChoice == PAPER && computerChoice == ROCK) {
                System.out.println("You threw paper! I thew rock!");
                System.out.println("Whaaa?? ... You beat me? RAGE!");
                wins+=1;
            }
            if (humanChoice == PAPER && computerChoice == SCISSORS){ 
                System.out.println("You threw paper! I thew scissors!");
                System.out.println("I win! You are not a challenge for me");
                losses+=1;
            }
            if (humanChoice == PAPER && computerChoice == PAPER){
                System.out.println("You threw paper! I thew paper!");
                System.out.println("A draw ... pretty good, human! I demand a rematch ...");
                ties+=1;
            }
            if (humanChoice == ROCK && computerChoice == SCISSORS){
                System.out.println("You threw rock! I thew scissors!"); 
                System.out.println("Whaaa?? ... You beat me? RAGE!");
                wins+=1;
            }
            if (humanChoice == ROCK && computerChoice == PAPER){
                System.out.println("You threw rock! I thew paper!");
                System.out.println("I win! You are not a challenge for me");
                losses+=1;
            }
            if (humanChoice == ROCK && computerChoice == ROCK){
                System.out.println("You threw rock! I thew rock!");
               System.out.println("A draw ... pretty good, human! I demand a rematch ...");
               ties+=1;
            }
            if (humanChoice == SCISSORS && computerChoice == ROCK){
                System.out.println("You threw scissors! I thew rock!");
                System.out.println("I win! You are not a challenge for me");
                losses+=1;
            }
            if (humanChoice == SCISSORS && computerChoice == SCISSORS){
                System.out.println("You threw scissors! I thew scissors!");
                System.out.println("A draw ... pretty good, human! I demand a rematch ...");
                ties+=1;
            }
            if (humanChoice == SCISSORS && computerChoice == PAPER){
                System.out.println("You threw scissors! I thew paper!");
                System.out.println("Whaaa?? ... You beat me? RAGE!");
                wins+=1;
            }
            else if(humanChoice>3||humanChoice<1){
              System.out.println("Invalid response. To err is human.");
            }

            System.out.println("Again? [y,n] ");
            ans=sc.next();
        }
        if(ans.equals("n")){
            System.out.println("Good Game! Thanks for playing.");
            System.out.println("****************************************");
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " +losses);
            System.out.println("Ties: " + ties);
        }

    }

}