package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Includedlibraryrefs {

    
    
    protected ArrayList<IncludedLibraryRef> includedLibraryRefs;
    
    

    
    
    @XmlElement(name="INCLUDED-LIBRARY-REF")
    public ArrayList<IncludedLibraryRef> getIncludedLibraryRefs() {
        return this.includedLibraryRefs;
    }

    public void setIncludedLibraryRefs(ArrayList<IncludedLibraryRef> value) {
        this.includedLibraryRefs = value;
    }
    
    
}