package stdgui.data.model.orimodel;
@XmlRootElement(name = "I-SIGNAL")
public class ISignal {

    
    
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
    
    
    
    protected ArrayList<DataTransformationRefConditional> dataTransformations;
    
    
    
    protected DataTypePolicyEnum dataTypePolicy;
    
    
    
    protected ISignalProps iSignalProps;
    
    
    
    protected InitValue initValue;
    
    
    
    protected Integer length;
    
    
    
    protected SwDataDefProps networkRepresentationProps;
    
    
    
    protected SystemSignalRef systemSignalRef;
    
    
    
    protected TransformationISignalPropss transformationISignalPropss;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="DATA-TRANSFORMATIONS")
@XmlElement(name="DATA-TRANSFORMATION-REF-CONDITIONAL")
    public ArrayList<DataTransformationRefConditional> getDataTransformations() {
    return this.dataTransformations;
}

    public void setDataTransformations(ArrayList<DataTransformationRefConditional> value) {
        this.dataTransformations = value;
    }
    
    
    
    @XmlElement(name="DATA-TYPE-POLICY")
    public DataTypePolicyEnum getDataTypePolicy() {
    return this.dataTypePolicy;
}

    public void setDataTypePolicy(DataTypePolicyEnum value) {
        this.dataTypePolicy = value;
    }
    
    
    
    @XmlElement(name="I-SIGNAL-PROPS")
    public ISignalProps getISignalProps() {
    return this.iSignalProps;
}

    public void setISignalProps(ISignalProps value) {
        this.iSignalProps = value;
    }
    
    
    
    @XmlElement(name="INIT-VALUE")
    public InitValue getInitValue() {
    return this.initValue;
}

    public void setInitValue(InitValue value) {
        this.initValue = value;
    }
    
    
    
    @XmlElement(name="LENGTH")
    public Integer getLength() {
    return this.length;
}

    public void setLength(Integer value) {
        this.length = value;
    }
    
    
    
    @XmlElement(name="NETWORK-REPRESENTATION-PROPS")
    public SwDataDefProps getNetworkRepresentationProps() {
    return this.networkRepresentationProps;
}

    public void setNetworkRepresentationProps(SwDataDefProps value) {
        this.networkRepresentationProps = value;
    }
    
    
    
    @XmlElement(name="SYSTEM-SIGNAL-REF")
    public SystemSignalRef getSystemSignalRef() {
    return this.systemSignalRef;
}

    public void setSystemSignalRef(SystemSignalRef value) {
        this.systemSignalRef = value;
    }
    
    
    
    @XmlElement(name="TRANSFORMATION-I-SIGNAL-PROPSS")
    public TransformationISignalPropss getTransformationISignalPropss() {
    return this.transformationISignalPropss;
}

    public void setTransformationISignalPropss(TransformationISignalPropss value) {
        this.transformationISignalPropss = value;
    }
    
    
}