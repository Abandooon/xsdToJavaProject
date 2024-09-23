package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Operationirefs {

    
    
    protected ArrayList<OperationInSystemInstanceRef> operationIrefs;
    
    

    
    
    @XmlElement(name="OPERATION-IREF")
    public ArrayList<OperationInSystemInstanceRef> getOperationIrefs() {
        return this.operationIrefs;
    }

    public void setOperationIrefs(ArrayList<OperationInSystemInstanceRef> value) {
        this.operationIrefs = value;
    }
    
    
}