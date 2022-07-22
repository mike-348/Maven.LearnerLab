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

    @Test
    public void testStudents1() {
        Student lilKim = new Student(002, "lil kim");

        Assert.assertEquals(Students.getInstance().personList.get(0), lilKim);
        Assert.assertTrue(lilKim instanceof Person);
        Assert.assertTrue(lilKim instanceof Learner);
        Assert.assertTrue(lilKim instanceof Student);
    }
}
