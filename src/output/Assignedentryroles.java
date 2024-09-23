package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Assignedentryroles {

    
    
    protected ArrayList<RoleBasedBswModuleEntryAssignment> roleBasedBswModuleEntryAssignments;
    
    

    
    
    @XmlElement(name="ROLE-BASED-BSW-MODULE-ENTRY-ASSIGNMENT")
    public ArrayList<RoleBasedBswModuleEntryAssignment> getRoleBasedBswModuleEntryAssignments() {
        return this.roleBasedBswModuleEntryAssignments;
    }

    public void setRoleBasedBswModuleEntryAssignments(ArrayList<RoleBasedBswModuleEntryAssignment> value) {
        this.roleBasedBswModuleEntryAssignments = value;
    }
    
    
}