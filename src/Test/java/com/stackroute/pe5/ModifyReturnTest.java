package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyReturnTest
{
    ModifyReturn modifyReturn;
    @Before
    public void setup()
    {
        //arrange
        System.out.println("Inside Before");
        modifyReturn=new ModifyReturn();
    }
    @After
    public void tearDown()
    {
        System.out.println("Inside After");
        modifyReturn=null;
    }
    @Test
    //this testcase checks given input should return modified string as output
    public void givenStringShoudReturnModifiedString()
    {

        //act
        String expectedResult="{value2=abcd, value1= }";
        Map<String,String> mapString=new HashMap<>();
        mapString.put("value1","abcd");
        mapString.put("value2","xyz");
        String actualResult=modifyReturn.modifyReturnKey(mapString);
        //assert
        assertEquals(expectedResult,actualResult);
    }
    @Test
    //this testcase checks for given input should not return the modified string as output
    public void givenStringShouldNotReturnModifiedString()
    {
        //act
        String expectedResult="{value2=xyz, value1= }";
        Map<String,String> mapString=new HashMap<>();
        mapString.put("value1","abcd");
        mapString.put("value2","xyz");
        String actualResult=modifyReturn.modifyReturnKey(mapString);
        //assert
        assertNotEquals(expectedResult,actualResult);
    }
    @Test
    //this testcase checks if the given input is null
    public void givenStringAndNullShouldReturnErrorMessage()
    {
        //act
        String actualResult=modifyReturn.modifyReturnKey(null);
        assertNotNull(actualResult);
        //assert
        assertEquals("null values are not allowed",actualResult);
    }

}