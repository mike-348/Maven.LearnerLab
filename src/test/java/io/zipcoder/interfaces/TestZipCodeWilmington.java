package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        Instructor kris = new Instructor(001, "kris");
        Student mike = new Student(002, "mike");
        Student kyle = new Student(003, "kyle");

        ZipCodeWilmington.getInstance().hostLecture(001, 100);

        Assert.assertEquals(50, (double) mike.getTotalStudyTime(), 001);
    }
}
