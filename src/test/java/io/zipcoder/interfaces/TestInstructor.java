package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor a = new Instructor(001, "ms. andrews");

        Assert.assertTrue(a instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor a = new Instructor(001, "ms. andrews");

        Assert.assertTrue(a instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor a = new Instructor(001, "ms. andrews");
        Student m = new Student(002, "mike");

        a.teach(m, 2);
        double mikeStudyTime = m.getTotalStudyTime();

        Assert.assertEquals(2, mikeStudyTime, .01);
    }

    @Test
    public void testLecture() {
        Instructor kr = new Instructor(001, "kris");
        Student m = new Student(002, "mike");
        Student t = new Student(003, "tenae");
        Student k = new Student(004, "kyle");

        Learner[] studiousZipCoders = {m, t, k};

        kr.lecture(studiousZipCoders, 9);

        double kyleStudyTime = k.getTotalStudyTime();

        Assert.assertEquals(3, kyleStudyTime, 0.01);
    }

    @Test
    public void testLecture1() {
        Instructor kr = new Instructor(001, "kris");
        Student m = new Student(002, "mike");
        Student t = new Student(003, "tenae");
        Student k = new Student(004, "kyle");

        Learner[] studiousZipCoders = {m, t, k};

        kr.lecture(studiousZipCoders, 9);

        double mikeStudyTime = m.getTotalStudyTime();

        Assert.assertEquals(3, mikeStudyTime, 0.01);
    }

    @Test
    public void testLecture2() {
        Instructor kr = new Instructor(001, "kris");
        Student m = new Student(002, "mike");
        Student t = new Student(003, "tenae");
        Student k = new Student(004, "kyle");

        Learner[] studiousZipCoders = {m, t, k};

        kr.lecture(studiousZipCoders, 9);

        double tenaeStudyTime = t.getTotalStudyTime();

        Assert.assertEquals(3, tenaeStudyTime, 0.01);
    }
}
