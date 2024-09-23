package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EndToEndTransformationDescription {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected AdminData adminData;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected PositiveInteger counterOffset;
    
    
    
    protected PositiveInteger crcOffset;
    
    
    
    protected DataIdModeEnum dataIdMode;
    
    
    
    protected PositiveInteger dataIdNibbleOffset;
    
    
    
    protected PositiveInteger maxDeltaCounter;
    
    
    
    protected PositiveInteger maxErrorStateInit;
    
    
    
    protected PositiveInteger maxErrorStateInvalid;
    
    
    
    protected PositiveInteger maxErrorStateValid;
    
    
    
    protected PositiveInteger maxNoNewOrRepeatedData;
    
    
    
    protected PositiveInteger minOkStateInit;
    
    
    
    protected PositiveInteger minOkStateInvalid;
    
    
    
    protected PositiveInteger minOkStateValid;
    
    
    
    protected PositiveInteger offset;
    
    
    
    protected EndToEndProfileBehaviorEnum profileBehavior;
    
    
    
    protected NmtokenString profileName;
    
    
    
    protected PositiveInteger syncCounterInit;
    
    
    
    protected PositiveInteger upperHeaderBitsToShift;
    
    
    
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
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="COUNTER-OFFSET")
    public PositiveInteger getCounterOffset() {
        return this.counterOffset;
    }

    public void setCounterOffset(PositiveInteger value) {
        this.counterOffset = value;
    }
    
    
    
    @XmlElement(name="CRC-OFFSET")
    public PositiveInteger getCrcOffset() {
        return this.crcOffset;
    }

    public void setCrcOffset(PositiveInteger value) {
        this.crcOffset = value;
    }
    
    
    
    @XmlElement(name="DATA-ID-MODE")
    public DataIdModeEnum getDataIdMode() {
        return this.dataIdMode;
    }

    public void setDataIdMode(DataIdModeEnum value) {
        this.dataIdMode = value;
    }
    
    
    
    @XmlElement(name="DATA-ID-NIBBLE-OFFSET")
    public PositiveInteger getDataIdNibbleOffset() {
        return this.dataIdNibbleOffset;
    }

    public void setDataIdNibbleOffset(PositiveInteger value) {
        this.dataIdNibbleOffset = value;
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
    
    
    
    @XmlElement(name="OFFSET")
    public PositiveInteger getOffset() {
        return this.offset;
    }

    public void setOffset(PositiveInteger value) {
        this.offset = value;
    }
    
    
    
    @XmlElement(name="PROFILE-BEHAVIOR")
    public EndToEndProfileBehaviorEnum getProfileBehavior() {
        return this.profileBehavior;
    }

    public void setProfileBehavior(EndToEndProfileBehaviorEnum value) {
        this.profileBehavior = value;
    }
    
    
    
    @XmlElement(name="PROFILE-NAME")
    public NmtokenString getProfileName() {
        return this.profileName;
    }

    public void setProfileName(NmtokenString value) {
        this.profileName = value;
    }
    
    
    
    @XmlElement(name="SYNC-COUNTER-INIT")
    public PositiveInteger getSyncCounterInit() {
        return this.syncCounterInit;
    }

    public void setSyncCounterInit(PositiveInteger value) {
        this.syncCounterInit = value;
    }
    
    
    
    @XmlElement(name="UPPER-HEADER-BITS-TO-SHIFT")
    public PositiveInteger getUpperHeaderBitsToShift() {
        return this.upperHeaderBitsToShift;
    }

    public void setUpperHeaderBitsToShift(PositiveInteger value) {
        this.upperHeaderBitsToShift = value;
    }
    
    
    
    @XmlElement(name="WINDOW-SIZE")
    public PositiveInteger getWindowSize() {
        return this.windowSize;
    }

    public void setWindowSize(PositiveInteger value) {
        this.windowSize = value;
    }
    
    
}