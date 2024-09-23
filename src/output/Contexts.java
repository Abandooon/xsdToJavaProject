package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Contexts {

    
    
    protected ArrayList<DocumentationContext> documentationContexts;
    
    

    
    
    @XmlElement(name="DOCUMENTATION-CONTEXT")
    public ArrayList<DocumentationContext> getDocumentationContexts() {
        return this.documentationContexts;
    }

    public void setDocumentationContexts(ArrayList<DocumentationContext> value) {
        this.documentationContexts = value;
    }
    
    
}