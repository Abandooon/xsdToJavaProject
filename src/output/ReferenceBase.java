package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ReferenceBase {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected Boolean isDefault;
    
    
    
    protected Boolean isGlobal;
    
    
    
    protected Boolean baseIsThisPackage;
    
    
    
    protected GlobalInPackageRefs globalInPackageRefs;
    
    
    
    protected GlobalElements globalElements;
    
    
    
    protected PackageRef packageRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public Identifier getShortLabel() {
        return this.shortLabel;
    }

    public void setShortLabel(Identifier value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="IS-DEFAULT")
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }
    
    
    
    @XmlElement(name="IS-GLOBAL")
    public Boolean getIsGlobal() {
        return this.isGlobal;
    }

    public void setIsGlobal(Boolean value) {
        this.isGlobal = value;
    }
    
    
    
    @XmlElement(name="BASE-IS-THIS-PACKAGE")
    public Boolean getBaseIsThisPackage() {
        return this.baseIsThisPackage;
    }

    public void setBaseIsThisPackage(Boolean value) {
        this.baseIsThisPackage = value;
    }
    
    
    
    @XmlElement(name="GLOBAL-IN-PACKAGE-REFS")
    public GlobalInPackageRefs getGlobalInPackageRefs() {
        return this.globalInPackageRefs;
    }

    public void setGlobalInPackageRefs(GlobalInPackageRefs value) {
        this.globalInPackageRefs = value;
    }
    
    
    
    @XmlElement(name="GLOBAL-ELEMENTS")
    public GlobalElements getGlobalElements() {
        return this.globalElements;
    }

    public void setGlobalElements(GlobalElements value) {
        this.globalElements = value;
    }
    
    
    
    @XmlElement(name="PACKAGE-REF")
    public PackageRef getPackageRef() {
        return this.packageRef;
    }

    public void setPackageRef(PackageRef value) {
        this.packageRef = value;
    }
    
    
}