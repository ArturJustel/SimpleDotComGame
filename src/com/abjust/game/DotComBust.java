package src.com.abjust.game;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import src.com.abjust.game.helper.GameHelper;

public class DotComBust {

        ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
        GameHelper helper = new GameHelper();
        int numberOfGuesses = 0;

        public static void main(String[] args) throws InterruptedException {
            DotComBust game = new DotComBust();
            game.setUpGame();
            game.startPlaying();
        }
        
        private void setUpGame()
        {
            for(int i=0;i<3;i++)
            {
                DotCom dotCom = new DotCom();
                dotCom.setName(".com");
                dotCom.setLocation(helper.placeDotCom(3));
                dotComsList.add(dotCom);
            }
            System.out.println("Your goal is to sink three Dot Coms with the smallest amount of guesses possible.");
        }

        private void startPlaying() throws InterruptedException
        {
            while(!dotComsList.isEmpty())
            {
                String userGuess = helper.getUserInput("Enter a number:");
                checkUserGuess(userGuess);
            }
            finishGame();
        }

        private void checkUserGuess(String aUserInput)
        {
            numberOfGuesses++;
            String result = "Miss";
            for(DotCom dotCom:dotComsList)
            {
                result=dotCom.checkYourself(aUserInput);
                if(result.equals("Hit"))
                {
                    break;
                }else if(result.equals("Kill"))
                {
                    dotComsList.remove(dotCom);
                    break;
                }
            }
            System.out.println(result);
        }

        public void finishGame() throws InterruptedException
        {
            System.out.println("Game Over");
            TimeUnit.SECONDS.sleep(20);
            if(numberOfGuesses<=20)
            {
                System.out.println("Congratulations, you have managed to beat the game!");
                System.out.println("Your total number of guesses is "+numberOfGuesses);
            }else
            {
                System.out.println("Your total number of guesses is "+numberOfGuesses);
                System.out.println("Unfortunalty, this is a sad result!");
                System.out.println("if I were you, I would try again!");
            }
        }
}
