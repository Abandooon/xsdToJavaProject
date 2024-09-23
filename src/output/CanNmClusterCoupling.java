package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class CanNmClusterCoupling {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected CoupledClusterRefs coupledClusterRefs;
    
    
    
    protected Boolean nmBusloadReductionEnabled;
    
    
    
    protected Boolean nmImmediateRestartEnabled;
    
    

    
    
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
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="COUPLED-CLUSTER-REFS")
    public CoupledClusterRefs getCoupledClusterRefs() {
        return this.coupledClusterRefs;
    }

    public void setCoupledClusterRefs(CoupledClusterRefs value) {
        this.coupledClusterRefs = value;
    }
    
    
    
    @XmlElement(name="NM-BUSLOAD-REDUCTION-ENABLED")
    public Boolean getNmBusloadReductionEnabled() {
        return this.nmBusloadReductionEnabled;
    }

    public void setNmBusloadReductionEnabled(Boolean value) {
        this.nmBusloadReductionEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-IMMEDIATE-RESTART-ENABLED")
    public Boolean getNmImmediateRestartEnabled() {
        return this.nmImmediateRestartEnabled;
    }

    public void setNmImmediateRestartEnabled(Boolean value) {
        this.nmImmediateRestartEnabled = value;
    }
    
    
}