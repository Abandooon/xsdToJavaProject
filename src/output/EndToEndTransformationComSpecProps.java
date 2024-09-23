package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EndToEndTransformationComSpecProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected AdminData adminData;
    
    
    
    protected Boolean disableEndToEndCheck;
    
    
    
    protected PositiveInteger maxDeltaCounter;
    
    
    
    protected PositiveInteger maxErrorStateInit;
    
    
    
    protected PositiveInteger maxErrorStateInvalid;
    
    
    
    protected PositiveInteger maxErrorStateValid;
    
    
    
    protected PositiveInteger maxNoNewOrRepeatedData;
    
    
    
    protected PositiveInteger minOkStateInit;
    
    
    
    protected PositiveInteger minOkStateInvalid;
    
    
    
    protected PositiveInteger minOkStateValid;
    
    
    
    protected PositiveInteger syncCounterInit;
    
    
    
    protected PositiveInteger windowSize;
    
    

    
    
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
    
    
    
    @XmlElement(name="DESC")
    public MultiLanguageOverviewParagraph getDesc() {
        return this.desc;
    }

    public void setDesc(MultiLanguageOverviewParagraph value) {
        this.desc = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public CategoryString getCategory() {
        return this.category;
    }

    public void setCategory(CategoryString value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
        return this.introduction;
    }

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="ADMIN-DATA")
    public AdminData getAdminData() {
        return this.adminData;
    }

    public void setAdminData(AdminData value) {
        this.adminData = value;
    }
    
    
    
    @XmlElement(name="DISABLE-END-TO-END-CHECK")
    public Boolean getDisableEndToEndCheck() {
        return this.disableEndToEndCheck;
    }

    public void setDisableEndToEndCheck(Boolean value) {
        this.disableEndToEndCheck = value;
    }
    
    
    
    @XmlElement(name="MAX-DELTA-COUNTER")
    public PositiveInteger getMaxDeltaCounter() {
        return this.maxDeltaCounter;
    }

    public void setMaxDeltaCounter(PositiveInteger value) {
        this.maxDeltaCounter = value;
    }
    
    
    
    @XmlElement(name="MAX-ERROR-STATE-INIT")
    public PositiveInteger getMaxErrorStateInit() {
        return this.maxErrorStateInit;
    }

    public void setMaxErrorStateInit(PositiveInteger value) {
        this.maxErrorStateInit = value;
    }
    
    
    
    @XmlElement(name="MAX-ERROR-STATE-INVALID")
    public PositiveInteger getMaxErrorStateInvalid() {
        return this.maxErrorStateInvalid;
    }

    public void setMaxErrorStateInvalid(PositiveInteger value) {
        this.maxErrorStateInvalid = value;
    }
    
    
    
    @XmlElement(name="MAX-ERROR-STATE-VALID")
    public PositiveInteger getMaxErrorStateValid() {
        return this.maxErrorStateValid;
    }

    public void setMaxErrorStateValid(PositiveInteger value) {
        this.maxErrorStateValid = value;
    }
    
    
    
    @XmlElement(name="MAX-NO-NEW-OR-REPEATED-DATA")
    public PositiveInteger getMaxNoNewOrRepeatedData() {
        return this.maxNoNewOrRepeatedData;
    }

    public void setMaxNoNewOrRepeatedData(PositiveInteger value) {
        this.maxNoNewOrRepeatedData = value;
    }
    
    
    
    @XmlElement(name="MIN-OK-STATE-INIT")
    public PositiveInteger getMinOkStateInit() {
        return this.minOkStateInit;
    }

    public void setMinOkStateInit(PositiveInteger value) {
        this.minOkStateInit = value;
    }
    
    
    
    @XmlElement(name="MIN-OK-STATE-INVALID")
    public PositiveInteger getMinOkStateInvalid() {
        return this.minOkStateInvalid;
    }

    public void setMinOkStateInvalid(PositiveInteger value) {
        this.minOkStateInvalid = value;
    }
    
    
    
    @XmlElement(name="MIN-OK-STATE-VALID")
    public PositiveInteger getMinOkStateValid() {
        return this.minOkStateValid;
    }

    public void setMinOkStateValid(PositiveInteger value) {
        this.minOkStateValid = value;
    }
    
    
    
    @XmlElement(name="SYNC-COUNTER-INIT")
    public PositiveInteger getSyncCounterInit() {
        return this.syncCounterInit;
    }

    public void setSyncCounterInit(PositiveInteger value) {
        this.syncCounterInit = value;
    }
    
    
    
    @XmlElement(name="WINDOW-SIZE")
    public PositiveInteger getWindowSize() {
        return this.windowSize;
    }

    public void setWindowSize(PositiveInteger value) {
        this.windowSize = value;
    }
    
    
}