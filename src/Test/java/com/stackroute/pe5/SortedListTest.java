package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SortedListTest
{
    SortedList sortedList;
    @Before
    public  void setup(){
        //arrange
        System.out.println("Inside Before");
        sortedList=new SortedList();
    }
    @After
    public void tearDown()
    {
        System.out.println("Inside After");
        sortedList=null;
    }
    @Test
    //this testcase checks for given input should return sortedlist
    public void givenStringShouldReturnSortedList()
    {
        String[] strings={"Harry","Olive","Alice","Bluto", "Eugene"};
        //act
        List actualResult=sortedList.sortedList(strings);
        List list=new ArrayList();
        list.add("Alice");
        list.add("Bluto");
        list.add("Eugene");
        list.add("Harry");
        list.add("Olive");
        //assert
        assertEquals(list,actualResult);
    }
    //this testcase checks for given input should not return sortedlist
    @Test
    public void givenStringShouldNotReturnSortedList()
    {
        String[] strings={"Harry","Olive","Alice","Bluto", "Eugene"};
        //act
        List actualResult=sortedList.sortedList(strings);
        List expectedResult=new ArrayList();
        expectedResult.add("Harry");
        expectedResult.add("Olive");
        expectedResult.add("Alice");
        expectedResult.add("Bluto");
        expectedResult.add("Eugene");
        //assert
        assertNotEquals(expectedResult,actualResult);
    }

}