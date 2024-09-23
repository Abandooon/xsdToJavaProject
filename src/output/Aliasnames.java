package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Aliasnames {

    
    
    protected ArrayList<AliasNameAssignment> aliasNameAssignments;
    
    

    
    
    @XmlElement(name="ALIAS-NAME-ASSIGNMENT")
    public ArrayList<AliasNameAssignment> getAliasNameAssignments() {
        return this.aliasNameAssignments;
    }

    public void setAliasNameAssignments(ArrayList<AliasNameAssignment> value) {
        this.aliasNameAssignments = value;
    }
    
    
}