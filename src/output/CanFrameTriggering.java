package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class CanFrameTriggering {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected Annotations annotations;
    
    
    
    protected FramePortRefs framePortRefs;
    
    
    
    protected FrameRef frameRef;
    
    
    
    protected PduTriggerings pduTriggerings;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected AbsolutelyScheduledTimings absolutelyScheduledTimings;
    
    
    
    protected CanAddressingModeType canAddressingMode;
    
    
    
    protected Boolean canFdFrameSupport;
    
    
    
    protected CanFrameRxBehaviorEnum canFrameRxBehavior;
    
    
    
    protected CanFrameTxBehaviorEnum canFrameTxBehavior;
    
    
    
    protected Integer identifier;
    
    
    
    protected Boolean j1939Requestable;
    
    
    
    protected RxIdentifierRange rxIdentifierRange;
    
    
    
    protected PositiveInteger rxMask;
    
    
    
    protected PositiveInteger txMask;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="UUID")
    public java.lang.String getUuid() {
        return this.uuid;
    }

    public void setUuid(java.lang.String value) {
        this.uuid = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
        return this.shortName;
    }

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME-FRAGMENTS")
    public ShortNameFragments getShortNameFragments() {
        return this.shortNameFragments;
    }

    public void setShortNameFragments(ShortNameFragments value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElement(name="LONG-NAME")
    public MultilanguageLongName getLongName() {
        return this.longName;
    }

    public void setLongName(MultilanguageLongName value) {
        this.longName = value;
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
    
    
    
    @XmlElement(name="ADMIN-DATA")
    public AdminData getAdminData() {
        return this.adminData;
    }

    public void setAdminData(AdminData value) {
        this.adminData = value;
    }
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
        return this.introduction;
    }

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="ANNOTATIONS")
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Annotations value) {
        this.annotations = value;
    }
    
    
    
    @XmlElement(name="FRAME-PORT-REFS")
    public FramePortRefs getFramePortRefs() {
        return this.framePortRefs;
    }

    public void setFramePortRefs(FramePortRefs value) {
        this.framePortRefs = value;
    }
    
    
    
    @XmlElement(name="FRAME-REF")
    public FrameRef getFrameRef() {
        return this.frameRef;
    }

    public void setFrameRef(FrameRef value) {
        this.frameRef = value;
    }
    
    
    
    @XmlElement(name="PDU-TRIGGERINGS")
    public PduTriggerings getPduTriggerings() {
        return this.pduTriggerings;
    }

    public void setPduTriggerings(PduTriggerings value) {
        this.pduTriggerings = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="ABSOLUTELY-SCHEDULED-TIMINGS")
    public AbsolutelyScheduledTimings getAbsolutelyScheduledTimings() {
        return this.absolutelyScheduledTimings;
    }

    public void setAbsolutelyScheduledTimings(AbsolutelyScheduledTimings value) {
        this.absolutelyScheduledTimings = value;
    }
    
    
    
    @XmlElement(name="CAN-ADDRESSING-MODE")
    public CanAddressingModeType getCanAddressingMode() {
        return this.canAddressingMode;
    }

    public void setCanAddressingMode(CanAddressingModeType value) {
        this.canAddressingMode = value;
    }
    
    
    
    @XmlElement(name="CAN-FD-FRAME-SUPPORT")
    public Boolean getCanFdFrameSupport() {
        return this.canFdFrameSupport;
    }

    public void setCanFdFrameSupport(Boolean value) {
        this.canFdFrameSupport = value;
    }
    
    
    
    @XmlElement(name="CAN-FRAME-RX-BEHAVIOR")
    public CanFrameRxBehaviorEnum getCanFrameRxBehavior() {
        return this.canFrameRxBehavior;
    }

    public void setCanFrameRxBehavior(CanFrameRxBehaviorEnum value) {
        this.canFrameRxBehavior = value;
    }
    
    
    
    @XmlElement(name="CAN-FRAME-TX-BEHAVIOR")
    public CanFrameTxBehaviorEnum getCanFrameTxBehavior() {
        return this.canFrameTxBehavior;
    }

    public void setCanFrameTxBehavior(CanFrameTxBehaviorEnum value) {
        this.canFrameTxBehavior = value;
    }
    
    
    
    @XmlElement(name="IDENTIFIER")
    public Integer getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(Integer value) {
        this.identifier = value;
    }
    
    
    
    @XmlElement(name="J-1939-REQUESTABLE")
    public Boolean getJ1939Requestable() {
        return this.j1939Requestable;
    }

    public void setJ1939Requestable(Boolean value) {
        this.j1939Requestable = value;
    }
    
    
    
    @XmlElement(name="RX-IDENTIFIER-RANGE")
    public RxIdentifierRange getRxIdentifierRange() {
        return this.rxIdentifierRange;
    }

    public void setRxIdentifierRange(RxIdentifierRange value) {
        this.rxIdentifierRange = value;
    }
    
    
    
    @XmlElement(name="RX-MASK")
    public PositiveInteger getRxMask() {
        return this.rxMask;
    }

    public void setRxMask(PositiveInteger value) {
        this.rxMask = value;
    }
    
    
    
    @XmlElement(name="TX-MASK")
    public PositiveInteger getTxMask() {
        return this.txMask;
    }

    public void setTxMask(PositiveInteger value) {
        this.txMask = value;
    }
    
    
}