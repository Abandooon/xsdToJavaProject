package stdgui.data.model.orimodel;
@XmlRootElement(name = "MULTIPLEXED-I-PDU")
public class MultiplexedIPdu {

    
    
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
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected Integer length;
    
    
    
    protected PositiveInteger metaDataLength;
    
    
    
    protected ContainedIPduProps containedIPduProps;
    
    
    
    protected ArrayList<DynamicPart> dynamicParts;
    
    
    
    protected ByteOrderEnum selectorFieldByteOrder;
    
    
    
    protected Integer selectorFieldLength;
    
    
    
    protected Integer selectorFieldStartPosition;
    
    
    
    protected ArrayList<StaticPart> staticParts;
    
    
    
    protected TriggerMode triggerMode;
    
    
    
    protected Integer unusedBitPattern;
    
    

    
    
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
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="LENGTH")
    public Integer getLength() {
    return this.length;
}

    public void setLength(Integer value) {
        this.length = value;
    }
    
    
    
    @XmlElement(name="META-DATA-LENGTH")
    public PositiveInteger getMetaDataLength() {
    return this.metaDataLength;
}

    public void setMetaDataLength(PositiveInteger value) {
        this.metaDataLength = value;
    }
    
    
    
    @XmlElement(name="CONTAINED-I-PDU-PROPS")
    public ContainedIPduProps getContainedIPduProps() {
    return this.containedIPduProps;
}

    public void setContainedIPduProps(ContainedIPduProps value) {
        this.containedIPduProps = value;
    }
    
    
    
    @XmlElementWrapper(name="DYNAMIC-PARTS")
@XmlElement(name="DYNAMIC-PART")
    public ArrayList<DynamicPart> getDynamicParts() {
    return this.dynamicParts;
}

    public void setDynamicParts(ArrayList<DynamicPart> value) {
        this.dynamicParts = value;
    }
    
    
    
    @XmlElement(name="SELECTOR-FIELD-BYTE-ORDER")
    public ByteOrderEnum getSelectorFieldByteOrder() {
    return this.selectorFieldByteOrder;
}

    public void setSelectorFieldByteOrder(ByteOrderEnum value) {
        this.selectorFieldByteOrder = value;
    }
    
    
    
    @XmlElement(name="SELECTOR-FIELD-LENGTH")
    public Integer getSelectorFieldLength() {
    return this.selectorFieldLength;
}

    public void setSelectorFieldLength(Integer value) {
        this.selectorFieldLength = value;
    }
    
    
    
    @XmlElement(name="SELECTOR-FIELD-START-POSITION")
    public Integer getSelectorFieldStartPosition() {
    return this.selectorFieldStartPosition;
}

    public void setSelectorFieldStartPosition(Integer value) {
        this.selectorFieldStartPosition = value;
    }
    
    
    
    @XmlElementWrapper(name="STATIC-PARTS")
@XmlElement(name="STATIC-PART")
    public ArrayList<StaticPart> getStaticParts() {
    return this.staticParts;
}

    public void setStaticParts(ArrayList<StaticPart> value) {
        this.staticParts = value;
    }
    
    
    
    @XmlElement(name="TRIGGER-MODE")
    public TriggerMode getTriggerMode() {
    return this.triggerMode;
}

    public void setTriggerMode(TriggerMode value) {
        this.triggerMode = value;
    }
    
    
    
    @XmlElement(name="UNUSED-BIT-PATTERN")
    public Integer getUnusedBitPattern() {
    return this.unusedBitPattern;
}

    public void setUnusedBitPattern(Integer value) {
        this.unusedBitPattern = value;
    }
    
    
}