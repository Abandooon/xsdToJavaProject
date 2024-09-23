package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Assignedports {

    
    
    protected ArrayList<RoleBasedPortAssignment> roleBasedPortAssignments;
    
    

    
    
    @XmlElement(name="ROLE-BASED-PORT-ASSIGNMENT")
    public ArrayList<RoleBasedPortAssignment> getRoleBasedPortAssignments() {
        return this.roleBasedPortAssignments;
    }

    public void setRoleBasedPortAssignments(ArrayList<RoleBasedPortAssignment> value) {
        this.roleBasedPortAssignments = value;
    }
    
    
}