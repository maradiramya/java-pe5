package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpdateElementTest
{
    UpdateElement updateElement;
    @Before
    public void setup()
    {
        //arrange
        System.out.println("Inside Before");
        updateElement=new UpdateElement();

    }
   @After
    public void tearDown()
   {
       System.out.println("Inside After");
       updateElement=null;
   }
   //this testcase checks for given Strings should update with new string
   @Test
    public void givenStringShouldRetunTheUpdatedElement()
   {
       //act
       String actualResult=updateElement.updateElementInArray("Apple,Grape,Mango,Berry");
       String expectedResult="[kiwi, Grape, Mango, Berry]";
       //assert
       assertEquals(expectedResult,actualResult);
   }
   //this testcase checks for emptying a string
   @Test
    public void givenStringShouldRetunEmptyString()
   {
       //act
       String actualResult=updateElement.removeElementsInArray("Apple,Grape,Mango,Berry");
       String expectedResult="[]";
       //assert
       assertEquals(expectedResult,actualResult);
   }
   //this testcase checks for if the given input is null
   @Test
    public void givenStiringAndNullShouldReturnErrorMessage()
   {
       //act
       String actualResult=updateElement.updateElementInArray(null);
       assertNotNull(actualResult);
       //assert
       assertEquals("null values are not allowed",actualResult);
   }
}