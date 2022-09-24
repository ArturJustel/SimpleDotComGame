package src.com.abjust.game;

import java.util.ArrayList;

public class SimpleDotCom
{
    private ArrayList<String> locationCells;
    static int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locations)
    {
        locationCells=locations;
    }

    public String checkYourself(String aUserInput)
    {
        String result="Miss";
        int index = locationCells.indexOf(aUserInput);
        if(index>=0)
        {
            locationCells.remove(index);
            if(locationCells.isEmpty())
            {
                result="Kill";
            }else
            {
                result="Hit";
            }
        }
        System.out.println(result);
        return result;
    }
}