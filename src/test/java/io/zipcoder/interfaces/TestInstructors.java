package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testInstructors() {
        Instructor kris = new Instructor(001, "kris");

        Assert.assertTrue(Instructors.getInstance().personList.contains(kris));
    }
}
