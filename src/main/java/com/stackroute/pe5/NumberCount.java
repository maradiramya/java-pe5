package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumberCount
{
    public String countNumberOfOccurences(String inputString)
    {
        //checking condition for null
        if(inputString==null)
        {
            return "null values not allowed";
        }
        //converting string to string array and splitting
        String[] arrayList=inputString.split("[\\W]+");
        //creation of arraylist
        ArrayList<String> list=new ArrayList<>();
        //adding given input to array list
        for (String newList:arrayList)
        {
            list.add(newList);
        }
        //cration of map
        Map<String,Integer> mapString=new HashMap<>();
        //storing list value to map
        for (String newMap:list)
        {
       //checking condition for map contains key
            if(mapString.containsKey(newMap))
            {
                //add the the key to map and increment the value of map
                mapString.put(newMap,mapString.get(newMap)+1);
            }
            else
            {
                //add the key to map and add value as 1
                mapString.put(newMap,1);
            }
        }

        return mapString.toString();

    }
}
