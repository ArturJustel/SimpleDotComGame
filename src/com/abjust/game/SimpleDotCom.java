package src.com.abjust.game;
public class SimpleDotCom
{
    static int[] locationCells = new int[3];
    static int numOfHits = 0;

    public void setLocationCells(int[] locations)
    {
        locationCells=locations;
    }

    public String checkYourself(String aUserInput)
    {
        int guessValue = Integer.parseInt(aUserInput);
        String result="Miss";
        for(int locationValue:locationCells)
        {
            if(locationValue==guessValue)
            {
                result="Hit";
                numOfHits++;
                break;
            }
        }
                if(numOfHits==locationCells.length)
                {
                    result= "Kill";
                }

                System.out.println(result);
                return result;
            }
}