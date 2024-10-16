package stdgui.data.model.orimodel;
@XmlRootElement(name = "CAN-FRAME-TRIGGERING")
public class CanFrameTriggering {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ArrayList<Annotation> annotations;
    
    
    
    protected ArrayList<FramePortRef> framePortRefs;
    
    
    
    protected FrameRef frameRef;
    
    
    
    protected ArrayList<PduTriggeringRefConditional> pduTriggerings;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ArrayList<TtcanAbsolutelyScheduledTiming> absolutelyScheduledTimings;
    
    
    
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
    
    
    
    @XmlElementWrapper(name="SHORT-NAME-FRAGMENTS")
@XmlElement(name="SHORT-NAME-FRAGMENT")
    public ArrayList<ShortNameFragment> getShortNameFragments() {
    return this.shortNameFragments;
}

    public void setShortNameFragments(ArrayList<ShortNameFragment> value) {
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
    
    
    
    @XmlElementWrapper(name="ANNOTATIONS")
@XmlElement(name="ANNOTATION")
    public ArrayList<Annotation> getAnnotations() {
    return this.annotations;
}

    public void setAnnotations(ArrayList<Annotation> value) {
        this.annotations = value;
    }
    
    
    
    @XmlElementWrapper(name="FRAME-PORT-REFS")
@XmlElement(name="FRAME-PORT-REF")
    public ArrayList<FramePortRef> getFramePortRefs() {
    return this.framePortRefs;
}

    public void setFramePortRefs(ArrayList<FramePortRef> value) {
        this.framePortRefs = value;
    }
    
    
    
    @XmlElement(name="FRAME-REF")
    public FrameRef getFrameRef() {
    return this.frameRef;
}

    public void setFrameRef(FrameRef value) {
        this.frameRef = value;
    }
    
    
    
    @XmlElementWrapper(name="PDU-TRIGGERINGS")
@XmlElement(name="PDU-TRIGGERING-REF-CONDITIONAL")
    public ArrayList<PduTriggeringRefConditional> getPduTriggerings() {
    return this.pduTriggerings;
}

    public void setPduTriggerings(ArrayList<PduTriggeringRefConditional> value) {
        this.pduTriggerings = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElementWrapper(name="ABSOLUTELY-SCHEDULED-TIMINGS")
@XmlElement(name="TTCAN-ABSOLUTELY-SCHEDULED-TIMING")
    public ArrayList<TtcanAbsolutelyScheduledTiming> getAbsolutelyScheduledTimings() {
    return this.absolutelyScheduledTimings;
}

    public void setAbsolutelyScheduledTimings(ArrayList<TtcanAbsolutelyScheduledTiming> value) {
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