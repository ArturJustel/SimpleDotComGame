package src.com.abjust.game;

import java.util.ArrayList;

public class DotCom {

private String NAME;
private ArrayList<String> LOCATION = new ArrayList<String>();

    public void setName(String aName)
    {
        NAME=aName;
    }

    public void setLocation(ArrayList<String> aLocation)
    {
        LOCATION = aLocation;
    }

    public String checkYourself(String aUserInput)
    {
        String result="Miss";
        int index = LOCATION.indexOf(aUserInput);
        if(index>=0)
        {
            LOCATION.remove(index);
            if(LOCATION.isEmpty())
            {
                result="Kill";
            }else
            {
                result="Hit";
            }
        }
        return result;
    }
}
