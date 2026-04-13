package com.student.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testTotalCalculation() {
        Student s = new Student("TestUser", 25, 15, 45); // Total 85
        assertEquals(85.0, s.getTotal(), 0.01);
    }

    @Test
    public void testGradeS() {
        Student s = new Student("TopPerformer", 30, 20, 45); // Total 95
        assertEquals("S", s.getGrade());
    }

    @Test
    public void testGPACalculation() {
        Student s = new Student("AverageUser", 20, 10, 40); // Total 70
        assertEquals(7.0, s.getGPA(), 0.1);
    }
}
