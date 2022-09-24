package src.com.abjust.game.helper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    
    public String getUserInput(String aUserInput)
    {
        String inputLine=null;
        System.out.println(aUserInput+" ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine=is.readLine();
            if(inputLine.length()==0)
            {
                return null;
            }
        }catch(IOException e)
        {
            System.out.println("Exceptiion: "+e);
        }
        return inputLine;
    }
}
