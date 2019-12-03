package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    @Test
    public void differentJobsHaveDifferentIds() {
        Job test_Job = new Job();
        Job other_Test_Job = new Job();
        assertFalse(test_Job.getId() == other_Test_Job.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_Job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue((test_Job.getEmployer() instanceof Employer) == true);
        assertTrue((test_Job.getLocation() instanceof Location) == true);
        assertTrue((test_Job.getPositionType() instanceof PositionType) == true);
        assertTrue((test_Job.getCoreCompetency() instanceof CoreCompetency) == true);

    }

    @Test
    public void testJobsForEquality() {
        Job test_Job = new Job("Kevin", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Student"), new CoreCompetency("Studying"));
        Job test_JobAgain = new Job("Kevin", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Student"), new CoreCompetency("Studying"));
        assertFalse(test_Job.equals(test_JobAgain));
    }

    @Test
    public void testToString() {
        Job test_Job = new Job("Kevin", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Student"), new CoreCompetency("Studying"));
        assertEquals(test_Job.toString(), ("" + " \r\n" +
                "ID: " + test_Job.getId() + " \r\n" +
                "Name: " + test_Job.getName() + " \r\n" +
                "Employer: " + test_Job.getEmployer() + " \r\n" +
                "Location: " + test_Job.getLocation() + " \r\n" +
                "Position Type: " + test_Job.getPositionType() + " \r\n" +
                "Core Competency: " + test_Job.getCoreCompetency() + " \r\n" +
                ""));
    }
    @Test
    public void testForBlankLines(){
        Job test_Job = new Job("Kevin", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Student"), new CoreCompetency("Studying"));
        Job blank_Job = new Job();
        assertFalse(test_Job.toString().stripLeading().equals(test_Job));
        assertFalse(test_Job.toString().stripTrailing().equals(test_Job));
        assertFalse(blank_Job.toString().stripLeading().equals(blank_Job));
        assertFalse(blank_Job.toString().stripTrailing().equals(blank_Job));
    }

    @Test
    public void testOops() {
        Job test_Job = new Job();
        assertEquals(test_Job.toString(), "" + " \r\n" + "OOPS! This job does not seem to exist." + " \r\n");
    }
    @Test
    public void testDataNotAvailable(){
        Job test_Job = new Job("Assistant", new Employer(), new Location("St. Louis"), new PositionType(), new CoreCompetency("JavaScript"));
        assertEquals(test_Job.toString(), ("" + " \r\n" +
                "ID: " + test_Job.getId() + " \r\n" +
                "Name: " + "Assistant" + " \r\n" +
                "Employer: " + "Data Not Available" + " \r\n" +
                "Location: " + "St. Louis" +" \r\n" +
                "Position Type: " + "Data Not Available" +" \r\n" +
                "Core Competency: " + "JavaScript" + " \r\n" +
                ""));
        Job test_Name = new Job("", new Employer("LaunchCode"), new Location(), new PositionType("Student"), new CoreCompetency());
        assertEquals(test_Name.toString(), ("" + " \r\n" +
                "ID: " + test_Name.getId() + " \r\n" +
                "Name: " + "Data Not Available" + " \r\n" +
                "Employer: " + "LaunchCode" + " \r\n" +
                "Location: " + "Data Not Available" +" \r\n" +
                "Position Type: " + "Student" +" \r\n" +
                "Core Competency: " + "Data Not Available" + " \r\n" +
                ""));
    }

//    public void testDataNotAvailable2() {
//        Job test_Job = new Job();
//        assertEquals(test_Job.getCoreCompetency(), "Data Not Available");
//    }
}