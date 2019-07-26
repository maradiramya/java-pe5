package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MultipleOccurence
{
public String multipleOccurence(String inputSting)
{
    //checks condition for null
    if(inputSting==null)
    {
        return "null values are not allowed";
    }
    //splitting string to string array
    String[] arrayList=inputSting.split(",");
    //cration arraylist
    ArrayList<String> list=new ArrayList<>();
    for (String newList:arrayList) {
        list.add(newList);
    }
    //creation of map
    Map<String,Boolean> mapString=new HashMap<>();
    for (String map:list)
    {
        //check condtion map contains key
        if(mapString.containsKey(map))
        {
            mapString.put(map,true);
        }
        else
            mapString.put(map,false);
    }
    return mapString.toString();
}
}
