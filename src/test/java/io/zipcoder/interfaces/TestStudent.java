package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student bob = new Student(2, "bob");

        Assert.assertTrue(bob instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student joe = new Student(3, "joe");

        Assert.assertTrue(joe instanceof Person);
    }

    @Test
    public void testLearn() {
        Student millie = new Student(4, "millie");
        millie.learn(3.0);
        double studyTime = millie.getTotalStudyTime();

        Assert.assertEquals(3.0, studyTime, 0.01);
    }
}
