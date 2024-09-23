package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EcuResourceEstimation {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ResourceConsumption bswResourceEstimation;
    
    
    
    protected EcuInstanceRef ecuInstanceRef;
    
    
    
    protected ResourceConsumption rteResourceEstimation;
    
    
    
    protected SwCompToEcuMappingRefs swCompToEcuMappingRefs;
    
    
    
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
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
        return this.introduction;
    }

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="BSW-RESOURCE-ESTIMATION")
    public ResourceConsumption getBswResourceEstimation() {
        return this.bswResourceEstimation;
    }

    public void setBswResourceEstimation(ResourceConsumption value) {
        this.bswResourceEstimation = value;
    }
    
    
    
    @XmlElement(name="ECU-INSTANCE-REF")
    public EcuInstanceRef getEcuInstanceRef() {
        return this.ecuInstanceRef;
    }

    public void setEcuInstanceRef(EcuInstanceRef value) {
        this.ecuInstanceRef = value;
    }
    
    
    
    @XmlElement(name="RTE-RESOURCE-ESTIMATION")
    public ResourceConsumption getRteResourceEstimation() {
        return this.rteResourceEstimation;
    }

    public void setRteResourceEstimation(ResourceConsumption value) {
        this.rteResourceEstimation = value;
    }
    
    
    
    @XmlElement(name="SW-COMP-TO-ECU-MAPPING-REFS")
    public SwCompToEcuMappingRefs getSwCompToEcuMappingRefs() {
        return this.swCompToEcuMappingRefs;
    }

    public void setSwCompToEcuMappingRefs(SwCompToEcuMappingRefs value) {
        this.swCompToEcuMappingRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}