package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testStudents() {
        Student lilJon = new Student(001, "lil jon");
//        Students.getInstance().add(lilJon);

        Assert.assertTrue(Students.getInstance().personList.contains(lilJon));
    }
}
