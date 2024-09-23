package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Userdefinedclustervariants {

    
    
    protected ArrayList<UserDefinedClusterConditional> userDefinedClusterConditionals;
    
    

    
    
    @XmlElement(name="USER-DEFINED-CLUSTER-CONDITIONAL")
    public ArrayList<UserDefinedClusterConditional> getUserDefinedClusterConditionals() {
        return this.userDefinedClusterConditionals;
    }

    public void setUserDefinedClusterConditionals(ArrayList<UserDefinedClusterConditional> value) {
        this.userDefinedClusterConditionals = value;
    }
    
    
}