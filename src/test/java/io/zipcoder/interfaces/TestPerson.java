package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        Person adam = new Person(2, "adam");
        long id = adam.getID();

        Assert.assertEquals("adam", adam.getName());
    }

    @Test
    public void testConstructor1() {
        Person adam = new Person(2, "adam");

        Assert.assertEquals(2, adam.getID());
    }

    @Test
    public void testSetName() {
        Person millie = new Person(2, "adam");
        millie.setName("millie");

        Assert.assertEquals("millie", millie.getName());
    }

}
