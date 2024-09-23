package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Mcdataassignments {

    
    
    protected ArrayList<RoleBasedMcDataAssignment> roleBasedMcDataAssignments;
    
    

    
    
    @XmlElement(name="ROLE-BASED-MC-DATA-ASSIGNMENT")
    public ArrayList<RoleBasedMcDataAssignment> getRoleBasedMcDataAssignments() {
        return this.roleBasedMcDataAssignments;
    }

    public void setRoleBasedMcDataAssignments(ArrayList<RoleBasedMcDataAssignment> value) {
        this.roleBasedMcDataAssignments = value;
    }
    
    
}