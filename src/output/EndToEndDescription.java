package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EndToEndDescription {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected NmtokenString category;
    
    
    
    protected DataIds dataIds;
    
    
    
    protected PositiveInteger dataIdMode;
    
    
    
    protected PositiveInteger dataLength;
    
    
    
    protected PositiveInteger maxDeltaCounterInit;
    
    
    
    protected PositiveInteger crcOffset;
    
    
    
    protected PositiveInteger counterOffset;
    
    
    
    protected PositiveInteger maxNoNewOrRepeatedData;
    
    
    
    protected PositiveInteger syncCounterInit;
    
    
    
    protected PositiveInteger dataIdNibbleOffset;
    
    

    
    
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
    
    
    
    @XmlElement(name="CATEGORY")
    public NmtokenString getCategory() {
        return this.category;
    }

    public void setCategory(NmtokenString value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="DATA-IDS")
    public DataIds getDataIds() {
        return this.dataIds;
    }

    public void setDataIds(DataIds value) {
        this.dataIds = value;
    }
    
    
    
    @XmlElement(name="DATA-ID-MODE")
    public PositiveInteger getDataIdMode() {
        return this.dataIdMode;
    }

    public void setDataIdMode(PositiveInteger value) {
        this.dataIdMode = value;
    }
    
    
    
    @XmlElement(name="DATA-LENGTH")
    public PositiveInteger getDataLength() {
        return this.dataLength;
    }

    public void setDataLength(PositiveInteger value) {
        this.dataLength = value;
    }
    
    
    
    @XmlElement(name="MAX-DELTA-COUNTER-INIT")
    public PositiveInteger getMaxDeltaCounterInit() {
        return this.maxDeltaCounterInit;
    }

    public void setMaxDeltaCounterInit(PositiveInteger value) {
        this.maxDeltaCounterInit = value;
    }
    
    
    
    @XmlElement(name="CRC-OFFSET")
    public PositiveInteger getCrcOffset() {
        return this.crcOffset;
    }

    public void setCrcOffset(PositiveInteger value) {
        this.crcOffset = value;
    }
    
    
    
    @XmlElement(name="COUNTER-OFFSET")
    public PositiveInteger getCounterOffset() {
        return this.counterOffset;
    }

    public void setCounterOffset(PositiveInteger value) {
        this.counterOffset = value;
    }
    
    
    
    @XmlElement(name="MAX-NO-NEW-OR-REPEATED-DATA")
    public PositiveInteger getMaxNoNewOrRepeatedData() {
        return this.maxNoNewOrRepeatedData;
    }

    public void setMaxNoNewOrRepeatedData(PositiveInteger value) {
        this.maxNoNewOrRepeatedData = value;
    }
    
    
    
    @XmlElement(name="SYNC-COUNTER-INIT")
    public PositiveInteger getSyncCounterInit() {
        return this.syncCounterInit;
    }

    public void setSyncCounterInit(PositiveInteger value) {
        this.syncCounterInit = value;
    }
    
    
    
    @XmlElement(name="DATA-ID-NIBBLE-OFFSET")
    public PositiveInteger getDataIdNibbleOffset() {
        return this.dataIdNibbleOffset;
    }

    public void setDataIdNibbleOffset(PositiveInteger value) {
        this.dataIdNibbleOffset = value;
    }
    
    
}