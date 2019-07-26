package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurenceTest
{
MultipleOccurence multipleOccurence;
@Before
    public void setup()
 {
     //arrange
     System.out.println("Inside Before");
     multipleOccurence=new MultipleOccurence();
 }
 @After
    public void tearDown()
 {
     System.out.println("Inside After");
     multipleOccurence=null;
 }
 @Test
 //this testcase checks for given input should return true for multiple occurence
    public void givenStringShouldReturnTrueForOccurences()
 {
     String actualResult=multipleOccurence.multipleOccurence("a,b,c,d,a,c,c");
     String expectedResult="{a=true, b=false, c=true, d=false}";
     assertEquals(expectedResult,actualResult);
 }
 @Test
 //this testcase checks for if the given input is null
    public void givenStringAndNullShouldReturnErrorMessage()
 {
     String actualResult=multipleOccurence.multipleOccurence(null);
     assertNotNull(actualResult);
     assertEquals("null values are not allowed",actualResult);
 }
}