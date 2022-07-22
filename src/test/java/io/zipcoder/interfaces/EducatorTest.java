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
        Educator.KRIS.lecture();
    }
}
