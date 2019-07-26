package com.stackroute.pe5;

import java.util.ArrayList;

public class UpdateElement {
    public String updateElementInArray(String inputString)
    {
        //checking condition for null
        if(inputString==null)
        {
            return"null values are not allowed";
        }
        //converting string to StringArray and splitting
        String[] arrayList = inputString.split(",");
        //creation of Arraylist
        ArrayList<String> list = new ArrayList<>();
        //adding given input to Arraylist
        for (String newList : arrayList)
        {
            list.add(newList);
            //set the newvalue to old value
            list.set(0, "kiwi");
            //System.out.println(list);
        }

        return list.toString();
    }
    public String removeElementsInArray(String inputString)
    {
        //emptying a array
           ArrayList<String> list=new ArrayList<>();
           for (String emptyString:list)
           {
               list.clear();
           }
           return list.toString();
    }

}
