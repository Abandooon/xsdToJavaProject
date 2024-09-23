package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Signalpathconstraints {

    
    
    protected ArrayList<CommonSignalPath> commonSignalPaths;
    
    
    
    protected ArrayList<ForbiddenSignalPath> forbiddenSignalPaths;
    
    
    
    protected ArrayList<PermissibleSignalPath> permissibleSignalPaths;
    
    
    
    protected ArrayList<SeparateSignalPath> separateSignalPaths;
    
    

    
    
    @XmlElement(name="COMMON-SIGNAL-PATH")
    public ArrayList<CommonSignalPath> getCommonSignalPaths() {
        return this.commonSignalPaths;
    }

    public void setCommonSignalPaths(ArrayList<CommonSignalPath> value) {
        this.commonSignalPaths = value;
    }
    
    
    
    @XmlElement(name="FORBIDDEN-SIGNAL-PATH")
    public ArrayList<ForbiddenSignalPath> getForbiddenSignalPaths() {
        return this.forbiddenSignalPaths;
    }

    public void setForbiddenSignalPaths(ArrayList<ForbiddenSignalPath> value) {
        this.forbiddenSignalPaths = value;
    }
    
    
    
    @XmlElement(name="PERMISSIBLE-SIGNAL-PATH")
    public ArrayList<PermissibleSignalPath> getPermissibleSignalPaths() {
        return this.permissibleSignalPaths;
    }

    public void setPermissibleSignalPaths(ArrayList<PermissibleSignalPath> value) {
        this.permissibleSignalPaths = value;
    }
    
    
    
    @XmlElement(name="SEPARATE-SIGNAL-PATH")
    public ArrayList<SeparateSignalPath> getSeparateSignalPaths() {
        return this.separateSignalPaths;
    }

    public void setSeparateSignalPaths(ArrayList<SeparateSignalPath> value) {
        this.separateSignalPaths = value;
    }
    
    
}