package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
        String stringEmployer = employer.toString();


    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {

        if ((name == null) && (getEmployer() == null) && (getLocation() == null) && (getPositionType() == null) && (getCoreCompetency() == null)) {
            return "" + " \r\n" + "OOPS! This job does not seem to exist." + " \r\n";
        }
//        {
//            name = "Data Not Available";
//        } else {
//            name = name;
//        }
//        if (getEmployer() == null)
//        {
//            employer = new Employer("Data Not Available");
//
//        } else {
//            employer = employer;
//        }
//        if (getLocation() == null)
//        {
//            location = new Location("Data Not Available");
//        } else {
//            location = location;
//        }
//        if (getPositionType() == null)
//        {
//            positionType = new PositionType("Data Not Available");
//        } else {
//            positionType = positionType;
//        }
//        if (getCoreCompetency() == null)
//        {
//            coreCompetency = new CoreCompetency("Data Not Available");
//        } else {
//            coreCompetency = coreCompetency;
//        }

        if ((name == null) || (name == "")) {
            name = "Data Not Available";
        } else {
            name = name;
        }
        if (getEmployer().getValue() == null) {
            employer = new Employer("Data Not Available");

        } else {
            employer = employer;
        }
        if (getLocation().getValue() == null) {
            location = new Location("Data Not Available");
        } else {
            location = location;
        }
        if (getPositionType().getValue() == null) {
            positionType = new PositionType("Data Not Available");
        } else {
            positionType = positionType;
        }
        if (getCoreCompetency().getValue() == null) {
            coreCompetency = new CoreCompetency("Data Not Available");
        } else {
            coreCompetency = coreCompetency;
        }
        return "" + " \r\n" +
                "ID: " + id + " \r\n" +
                "Name: " + name + " \r\n" +
                "Employer: " + employer + " \r\n" +
                "Location: " + location + " \r\n" +
                "Position Type: " + positionType + " \r\n" +
                "Core Competency: " + coreCompetency + " \r\n" +
                "";
    }


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
