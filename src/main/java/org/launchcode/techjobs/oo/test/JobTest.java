package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.PositionType;
import org.launchcode.techjobs.oo.CoreCompetency;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job ( "Product tester", new Employer ("ACME"), new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertTrue(testJob instanceof Job);

        assertTrue(testJob.getName().equals("Product tester"));
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getEmployer().getValue().equals("ACME"));
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getLocation().getValue().equals("Desert"));
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getPositionType().getValue().equals("Quality Control"));
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob.getCoreCompetency().getValue().equals("Persistence"));


}
@Test
    public void testJobsForEquality () {

    Job Job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job Job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

    assertFalse(Job1.equals(Job2));
}
    @Test
    public void testToStringNewLines() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));;
        int lastIndex = (testJob.toString().length() - 1);
        assertTrue(testJob.toString().charAt(0) == '\n');
        assertTrue(testJob.toString().charAt(lastIndex) == '\n');
    }
    @Test
    public void testToStringPrintLabels() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
}
@Test
public void emptyString () {
    Job testJob = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String output = String.format("\nID: %d\n" +
            "Name: Data is not available\n" +
            "Employer: %s\n" +
            "Location: %s\n" +
            "Position type: %s\n" +
            "Core Competency: %s\n", testJob.getId(), testJob.getEmployer(), testJob.getLocation(), testJob.getPositionType(), testJob.getCoreCompetency());
    assertEquals(testJob.toString(),output);
}
}


