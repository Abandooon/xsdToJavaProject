package stdgui.data.model.orimodel;
@XmlRootElement(name = "I-SIGNAL-TO-I-PDU-MAPPING")
public class ISignalToIPduMapping {

    
    
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
    
    
    
    protected ISignalGroupRef iSignalGroupRef;
    
    
    
    protected ISignalRef iSignalRef;
    
    
    
    protected ByteOrderEnum packingByteOrder;
    
    
    
    protected Integer startPosition;
    
    
    
    protected TransferPropertyEnum transferProperty;
    
    
    
    protected Integer updateIndicationBitPosition;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="I-SIGNAL-GROUP-REF")
    public ISignalGroupRef getISignalGroupRef() {
    return this.iSignalGroupRef;
}

    public void setISignalGroupRef(ISignalGroupRef value) {
        this.iSignalGroupRef = value;
    }
    
    
    
    @XmlElement(name="I-SIGNAL-REF")
    public ISignalRef getISignalRef() {
    return this.iSignalRef;
}

    public void setISignalRef(ISignalRef value) {
        this.iSignalRef = value;
    }
    
    
    
    @XmlElement(name="PACKING-BYTE-ORDER")
    public ByteOrderEnum getPackingByteOrder() {
    return this.packingByteOrder;
}

    public void setPackingByteOrder(ByteOrderEnum value) {
        this.packingByteOrder = value;
    }
    
    
    
    @XmlElement(name="START-POSITION")
    public Integer getStartPosition() {
    return this.startPosition;
}

    public void setStartPosition(Integer value) {
        this.startPosition = value;
    }
    
    
    
    @XmlElement(name="TRANSFER-PROPERTY")
    public TransferPropertyEnum getTransferProperty() {
    return this.transferProperty;
}

    public void setTransferProperty(TransferPropertyEnum value) {
        this.transferProperty = value;
    }
    
    
    
    @XmlElement(name="UPDATE-INDICATION-BIT-POSITION")
    public Integer getUpdateIndicationBitPosition() {
    return this.updateIndicationBitPosition;
}

    public void setUpdateIndicationBitPosition(Integer value) {
        this.updateIndicationBitPosition = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}