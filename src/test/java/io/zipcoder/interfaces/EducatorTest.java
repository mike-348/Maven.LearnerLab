package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void testImplementation() {
       Assert.assertTrue(Educator.DOLIO instanceof Teacher);

    }

    @Test
    public void testInheritance() {
        Instructor kris = Educator.KRIS.instructor;
        Assert.assertTrue(kris instanceof Person);
    }

    @Test
    public void testTeach() {
        Student myah = new Student(001, "myah");
        Educator.KAREN.teach(myah, 2);

        Assert.assertEquals(2, (double) myah.getTotalStudyTime());
    }

    @Test
    public void testLecture() {
        Student mike = new Student(001, "mike");
        Student kyle = new Student(002, "kyle");
        Student myah = new Student(003, "myah");
        Student ryan = new Student(004, "ryan");
        Student dejen = new Student(005, "dejen");
        Learner[] learners = {mike, kyle, myah, ryan, dejen};

        Educator.DOLIO.lecture(learners, 25);

        Assert.assertEquals(5, (double) mike.getTotalStudyTime(), 001);
        Assert.assertEquals(5, (double) kyle.getTotalStudyTime(), 001);
        Assert.assertEquals(5, (double) myah.getTotalStudyTime(), 001);
        Assert.assertEquals(5, (double) ryan.getTotalStudyTime(), 001);
        Assert.assertEquals(5, (double) dejen.getTotalStudyTime(), 001);
    }
}
