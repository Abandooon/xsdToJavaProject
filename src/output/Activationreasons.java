package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Activationreasons {

    
    
    protected ArrayList<ExecutableEntityActivationReason> executableEntityActivationReasons;
    
    

    
    
    @XmlElement(name="EXECUTABLE-ENTITY-ACTIVATION-REASON")
    public ArrayList<ExecutableEntityActivationReason> getExecutableEntityActivationReasons() {
        return this.executableEntityActivationReasons;
    }

    public void setExecutableEntityActivationReasons(ArrayList<ExecutableEntityActivationReason> value) {
        this.executableEntityActivationReasons = value;
    }
    
    
}