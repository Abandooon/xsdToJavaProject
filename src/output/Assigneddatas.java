package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Assigneddatas {

    
    
    protected ArrayList<RoleBasedDataAssignment> roleBasedDataAssignments;
    
    

    
    
    @XmlElement(name="ROLE-BASED-DATA-ASSIGNMENT")
    public ArrayList<RoleBasedDataAssignment> getRoleBasedDataAssignments() {
        return this.roleBasedDataAssignments;
    }

    public void setRoleBasedDataAssignments(ArrayList<RoleBasedDataAssignment> value) {
        this.roleBasedDataAssignments = value;
    }
    
    
}