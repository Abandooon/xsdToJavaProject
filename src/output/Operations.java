package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Operations {

    
    
    protected ArrayList<SwcToSwcOperationArguments> swcToSwcOperationArgumentss;
    
    

    
    
    @XmlElement(name="SWC-TO-SWC-OPERATION-ARGUMENTS")
    public ArrayList<SwcToSwcOperationArguments> getSwcToSwcOperationArgumentss() {
        return this.swcToSwcOperationArgumentss;
    }

    public void setSwcToSwcOperationArgumentss(ArrayList<SwcToSwcOperationArguments> value) {
        this.swcToSwcOperationArgumentss = value;
    }
    
    
}