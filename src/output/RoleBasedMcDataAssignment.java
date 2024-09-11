package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class RoleBasedMcDataAssignment {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected McDataInstanceRefs mcDataInstanceRefs;
    
    
    
    protected Identifier role;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
        return this.s;
    }

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
        return this.t;
    }

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="MC-DATA-INSTANCE-REFS")
    public McDataInstanceRefs getMcDataInstanceRefs() {
        return this.mcDataInstanceRefs;
    }

    public void setMcDataInstanceRefs(McDataInstanceRefs value) {
        this.mcDataInstanceRefs = value;
    }
    
    
    
    @XmlElement(name="ROLE")
    public Identifier getRole() {
        return this.role;
    }

    public void setRole(Identifier value) {
        this.role = value;
    }
    
    


    
    public static class McDataInstanceRefs {
        

        

        
    }
    
}