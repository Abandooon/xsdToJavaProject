package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class IoHwAbstractionServerAnnotation {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultilanguageLongName label;
    
    
    
    protected String annotationOrigin;
    
    
    
    protected DocumentationBlock annotationText;
    
    
    
    protected MultidimensionalTime age;
    
    
    
    protected ArgumentRef argumentRef;
    
    
    
    protected Float bswResolution;
    
    
    
    protected DataElementRef dataElementRef;
    
    
    
    protected FailureMonitoringRef failureMonitoringRef;
    
    
    
    protected FilterDebouncingEnum filteringDebouncing;
    
    
    
    protected PulseTestEnum pulseTest;
    
    
    
    protected TriggerRef triggerRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="LABEL")
    public MultilanguageLongName getLabel() {
        return this.label;
    }

    public void setLabel(MultilanguageLongName value) {
        this.label = value;
    }
    
    
    
    @XmlElement(name="ANNOTATION-ORIGIN")
    public String getAnnotationOrigin() {
        return this.annotationOrigin;
    }

    public void setAnnotationOrigin(String value) {
        this.annotationOrigin = value;
    }
    
    
    
    @XmlElement(name="ANNOTATION-TEXT")
    public DocumentationBlock getAnnotationText() {
        return this.annotationText;
    }

    public void setAnnotationText(DocumentationBlock value) {
        this.annotationText = value;
    }
    
    
    
    @XmlElement(name="AGE")
    public MultidimensionalTime getAge() {
        return this.age;
    }

    public void setAge(MultidimensionalTime value) {
        this.age = value;
    }
    
    
    
    @XmlElement(name="ARGUMENT-REF")
    public ArgumentRef getArgumentRef() {
        return this.argumentRef;
    }

    public void setArgumentRef(ArgumentRef value) {
        this.argumentRef = value;
    }
    
    
    
    @XmlElement(name="BSW-RESOLUTION")
    public Float getBswResolution() {
        return this.bswResolution;
    }

    public void setBswResolution(Float value) {
        this.bswResolution = value;
    }
    
    
    
    @XmlElement(name="DATA-ELEMENT-REF")
    public DataElementRef getDataElementRef() {
        return this.dataElementRef;
    }

    public void setDataElementRef(DataElementRef value) {
        this.dataElementRef = value;
    }
    
    
    
    @XmlElement(name="FAILURE-MONITORING-REF")
    public FailureMonitoringRef getFailureMonitoringRef() {
        return this.failureMonitoringRef;
    }

    public void setFailureMonitoringRef(FailureMonitoringRef value) {
        this.failureMonitoringRef = value;
    }
    
    
    
    @XmlElement(name="FILTERING-DEBOUNCING")
    public FilterDebouncingEnum getFilteringDebouncing() {
        return this.filteringDebouncing;
    }

    public void setFilteringDebouncing(FilterDebouncingEnum value) {
        this.filteringDebouncing = value;
    }
    
    
    
    @XmlElement(name="PULSE-TEST")
    public PulseTestEnum getPulseTest() {
        return this.pulseTest;
    }

    public void setPulseTest(PulseTestEnum value) {
        this.pulseTest = value;
    }
    
    
    
    @XmlElement(name="TRIGGER-REF")
    public TriggerRef getTriggerRef() {
        return this.triggerRef;
    }

    public void setTriggerRef(TriggerRef value) {
        this.triggerRef = value;
    }
    
    
}