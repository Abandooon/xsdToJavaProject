package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class IndentSample {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ItemLabelPosEnumSimple itemLabelPos;
    
    
    
    protected LOverviewParagraph l2;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="ITEM-LABEL-POS")
    public ItemLabelPosEnumSimple getItemLabelPos() {
        return this.itemLabelPos;
    }

    public void setItemLabelPos(ItemLabelPosEnumSimple value) {
        this.itemLabelPos = value;
    }
    
    
    
    @XmlElement(name="L-2")
    public LOverviewParagraph getL2() {
        return this.l2;
    }

    public void setL2(LOverviewParagraph value) {
        this.l2 = value;
    }
    
    


    
}