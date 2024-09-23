package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ReceiverAnnotation {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultilanguageLongName label;
    
    
    
    protected String annotationOrigin;
    
    
    
    protected DocumentationBlock annotationText;
    
    
    
    protected Boolean computed;
    
    
    
    protected DataElementRef dataElementRef;
    
    
    
    protected DataLimitKindEnum limitKind;
    
    
    
    protected ProcessingKindEnum processingKind;
    
    
    
    protected MultidimensionalTime signalAge;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMPUTED")
    public Boolean getComputed() {
        return this.computed;
    }

    public void setComputed(Boolean value) {
        this.computed = value;
    }
    
    
    
    @XmlElement(name="DATA-ELEMENT-REF")
    public DataElementRef getDataElementRef() {
        return this.dataElementRef;
    }

    public void setDataElementRef(DataElementRef value) {
        this.dataElementRef = value;
    }
    
    
    
    @XmlElement(name="LIMIT-KIND")
    public DataLimitKindEnum getLimitKind() {
        return this.limitKind;
    }

    public void setLimitKind(DataLimitKindEnum value) {
        this.limitKind = value;
    }
    
    
    
    @XmlElement(name="PROCESSING-KIND")
    public ProcessingKindEnum getProcessingKind() {
        return this.processingKind;
    }

    public void setProcessingKind(ProcessingKindEnum value) {
        this.processingKind = value;
    }
    
    
    
    @XmlElement(name="SIGNAL-AGE")
    public MultidimensionalTime getSignalAge() {
        return this.signalAge;
    }

    public void setSignalAge(MultidimensionalTime value) {
        this.signalAge = value;
    }
    
    
}