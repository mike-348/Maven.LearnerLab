package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {


    @Test
    public void testAdd() {
        Person john = new Person(001, "ducky");
        People crowd = new People();

        crowd.personList.add(john);

        Assert.assertEquals(crowd.personList.get(0), john);
    }
}
