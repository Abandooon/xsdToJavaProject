package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class MsrQueryP1 {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String si;
    
    
    
    protected java.lang.String view;
    
    
    
    protected ChapterEnumBreakSimple break;
    
    
    
    protected KeepWithPreviousEnumSimple keepWithPrevious;
    
    
    
    protected MsrQueryProps msrQueryProps;
    
    
    
    protected TopicContent msrQueryResultP1;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="SI")
    public java.lang.String getSi() {
        return this.si;
    }

    public void setSi(java.lang.String value) {
        this.si = value;
    }
    
    
    
    @XmlAttribute(name="VIEW")
    public java.lang.String getView() {
        return this.view;
    }

    public void setView(java.lang.String value) {
        this.view = value;
    }
    
    
    
    @XmlAttribute(name="BREAK")
    public ChapterEnumBreakSimple getBreak() {
        return this.break;
    }

    public void setBreak(ChapterEnumBreakSimple value) {
        this.break = value;
    }
    
    
    
    @XmlAttribute(name="KEEP-WITH-PREVIOUS")
    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        return this.keepWithPrevious;
    }

    public void setKeepWithPrevious(KeepWithPreviousEnumSimple value) {
        this.keepWithPrevious = value;
    }
    
    
    
    @XmlElement(name="MSR-QUERY-PROPS")
    public MsrQueryProps getMsrQueryProps() {
        return this.msrQueryProps;
    }

    public void setMsrQueryProps(MsrQueryProps value) {
        this.msrQueryProps = value;
    }
    
    
    
    @XmlElement(name="MSR-QUERY-RESULT-P-1")
    public TopicContent getMsrQueryResultP1() {
        return this.msrQueryResultP1;
    }

    public void setMsrQueryResultP1(TopicContent value) {
        this.msrQueryResultP1 = value;
    }
    
    
}