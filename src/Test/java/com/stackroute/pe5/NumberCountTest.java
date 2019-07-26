package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberCountTest {
    NumberCount numberCount;

    @Before
    public void setup() {
        //arrange
        System.out.println("Inside Before");
        numberCount = new NumberCount();
    }

    @After
    public void tearDown()
    {
        System.out.println("Inside After");
        numberCount=null;
    }
    @Test
    //this testcase checks for given string should returns a number of ocuurences
    public void givenStringShouldReturnNumberOfOccurences()
    {
        //act
        String actualResult=numberCount.countNumberOfOccurences("one one -one two,,three,one @three*one?two");
        String expectedResult="{one=5, two=2, three=2}";
        //assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    //this testcase checks for if  the given input is null
    public void givenStringAndNullShouldReturnErrorMessage()
    {
        //act
        String actualResult=numberCount.countNumberOfOccurences(null);
        assertNotNull(actualResult);
        //assert
        assertEquals("null values not allowed",actualResult);
    }

}