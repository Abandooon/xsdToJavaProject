package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Assigneddatatypes {

    
    
    protected ArrayList<RoleBasedDataTypeAssignment> roleBasedDataTypeAssignments;
    
    

    
    
    @XmlElement(name="ROLE-BASED-DATA-TYPE-ASSIGNMENT")
    public ArrayList<RoleBasedDataTypeAssignment> getRoleBasedDataTypeAssignments() {
        return this.roleBasedDataTypeAssignments;
    }

    public void setRoleBasedDataTypeAssignments(ArrayList<RoleBasedDataTypeAssignment> value) {
        this.roleBasedDataTypeAssignments = value;
    }
    
    
}