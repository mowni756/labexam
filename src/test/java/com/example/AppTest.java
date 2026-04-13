package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    
    @Test
    public void testTotalCalculation() {
        // CAT: 25, Assignment: 15, FAT: 45 = 85
        Student s = new Student("TestUser", 25, 15, 45); 
        assertEquals(85.0, s.getTotal(), 0.01);
    }

    @Test
    public void testGradeS() {
        // Perfect score = Grade S
        Student s = new Student("TopPerformer", 30, 20, 50); 
        assertEquals("S", s.getGrade());
    }

    @Test
    public void testGPACalculation() {
        // Total 70 / 10 = 7.0 GPA
        Student s = new Student("AverageUser", 20, 10, 40); 
        assertEquals(7.0, s.getGPA(), 0.1);
    }
}
