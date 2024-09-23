package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FlexrayNmClusterCoupling {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected CoupledClusterRefs coupledClusterRefs;
    
    
    
    protected Boolean nmControlBitVectorEnabled;
    
    
    
    protected Boolean nmDataDisabled;
    
    
    
    protected FlexrayNmScheduleVariant nmScheduleVariant;
    
    

    
    
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
    
    
    
    @XmlElement(name="NM-CONTROL-BIT-VECTOR-ENABLED")
    public Boolean getNmControlBitVectorEnabled() {
        return this.nmControlBitVectorEnabled;
    }

    public void setNmControlBitVectorEnabled(Boolean value) {
        this.nmControlBitVectorEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-DATA-DISABLED")
    public Boolean getNmDataDisabled() {
        return this.nmDataDisabled;
    }

    public void setNmDataDisabled(Boolean value) {
        this.nmDataDisabled = value;
    }
    
    
    
    @XmlElement(name="NM-SCHEDULE-VARIANT")
    public FlexrayNmScheduleVariant getNmScheduleVariant() {
        return this.nmScheduleVariant;
    }

    public void setNmScheduleVariant(FlexrayNmScheduleVariant value) {
        this.nmScheduleVariant = value;
    }
    
    
}