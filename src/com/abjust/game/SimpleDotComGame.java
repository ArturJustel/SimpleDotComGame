package src.com.abjust.game;
import java.util.ArrayList;
import java.util.Random;

import src.com.abjust.game.helper.GameHelper;

class SimpleDotComGame {
    public static void main(String[] args) {
        int guesses = 0;
        String result = "";
        Boolean end = false;
        SimpleDotCom dot = new SimpleDotCom();
        GameHelper helper = new GameHelper();
        dot.setLocationCells(generateLocationData());
        do{
            result = dot.checkYourself(helper.getUserInput("Enter a number:"));
            guesses++;
        if("Kill".equals(result))
        {
            end=true;
        }
        }while(!end);
        System.out.println("You managed to win with "+guesses+" guesses");
    }

private static ArrayList<String> generateLocationData()
{
    ArrayList<String> locations = new ArrayList<String>();
    int random = new Random().nextInt(4);
    for (int i=0;i<3;i++)
    {
        locations.add(String.valueOf(random+i));
    }
return locations;
}
}
