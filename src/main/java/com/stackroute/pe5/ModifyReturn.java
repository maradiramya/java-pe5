package com.stackroute.pe5;

import java.util.Map;

public class ModifyReturn
{

    public String modifyReturnKey(Map<String,String> mapString)
    {
        //checking condition for null
        if(mapString==null){
            return "null values are not allowed";
        }
        //getting value from map
        String newString=mapString.get("value1");
        //replacing the value fields
        mapString.replace("value2",newString);
        mapString.replace("value1"," ");
        return mapString.toString();


    }
}
