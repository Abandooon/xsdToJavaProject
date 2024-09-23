package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BswServiceDependency {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected AssignedDataTypes assignedDataTypes;
    
    
    
    protected SymbolicNameProps symbolicNameProps;
    
    
    
    protected BswServiceDependencyIdent ident;
    
    
    
    protected AssignedDatas assignedDatas;
    
    
    
    protected AssignedEntryRoles assignedEntryRoles;
    
    
    
    protected ServiceNeeds serviceNeeds;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="ASSIGNED-DATA-TYPES")
    public AssignedDataTypes getAssignedDataTypes() {
        return this.assignedDataTypes;
    }

    public void setAssignedDataTypes(AssignedDataTypes value) {
        this.assignedDataTypes = value;
    }
    
    
    
    @XmlElement(name="SYMBOLIC-NAME-PROPS")
    public SymbolicNameProps getSymbolicNameProps() {
        return this.symbolicNameProps;
    }

    public void setSymbolicNameProps(SymbolicNameProps value) {
        this.symbolicNameProps = value;
    }
    
    
    
    @XmlElement(name="IDENT")
    public BswServiceDependencyIdent getIdent() {
        return this.ident;
    }

    public void setIdent(BswServiceDependencyIdent value) {
        this.ident = value;
    }
    
    
    
    @XmlElement(name="ASSIGNED-DATAS")
    public AssignedDatas getAssignedDatas() {
        return this.assignedDatas;
    }

    public void setAssignedDatas(AssignedDatas value) {
        this.assignedDatas = value;
    }
    
    
    
    @XmlElement(name="ASSIGNED-ENTRY-ROLES")
    public AssignedEntryRoles getAssignedEntryRoles() {
        return this.assignedEntryRoles;
    }

    public void setAssignedEntryRoles(AssignedEntryRoles value) {
        this.assignedEntryRoles = value;
    }
    
    
    
    @XmlElement(name="SERVICE-NEEDS")
    public ServiceNeeds getServiceNeeds() {
        return this.serviceNeeds;
    }

    public void setServiceNeeds(ServiceNeeds value) {
        this.serviceNeeds = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}