package src.com.abjust.tests;
import java.util.ArrayList;

import src.com.abjust.game.SimpleDotCom;

public class SimpleDotComTestDrive {
    public static void main(String[] args)
    {
        String testResult = "failed";
        ArrayList<String> locations = new ArrayList<>();
        locations.add("2");
        locations.add("3");
        locations.add("4");
        String userGuess = "2";
        SimpleDotCom dot = new SimpleDotCom();

        dot.setLocationCells(locations);

        String result = dot.checkYourself(userGuess);
        if(result.equals("Hit"))
        {
            testResult="Passed";
        }
        System.out.println(testResult);
    }
}
