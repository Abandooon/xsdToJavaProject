package stdgui.data.model.orimodel;
@XmlRootElement(name = "SYSTEM")
public class System {

    
    
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
    
    
    
    protected ArrayList<Chapter> systemDocumentations;
    
    
    
    protected ArrayList<ClientIdDefinitionSetRef> clientIdDefinitionSetRefs;
    
    
    
    protected ByteOrderEnum containerIPduHeaderByteOrder;
    
    
    
    protected RevisionLabelString ecuExtractVersion;
    
    
    
    protected ArrayList<FibexElementRefConditional> fibexElements;
    
    
    
    protected ArrayList<SystemMapping> mappings;
    
    
    
    protected PositiveInteger pncVectorLength;
    
    
    
    protected PositiveInteger pncVectorOffset;
    
    
    
    protected ArrayList<RootSwCompositionPrototype> rootSoftwareCompositions;
    
    
    
    protected RevisionLabelString systemVersion;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="SYSTEM-DOCUMENTATIONS")
@XmlElement(name="CHAPTER")
    public ArrayList<Chapter> getSystemDocumentations() {
    return this.systemDocumentations;
}

    public void setSystemDocumentations(ArrayList<Chapter> value) {
        this.systemDocumentations = value;
    }
    
    
    
    @XmlElementWrapper(name="CLIENT-ID-DEFINITION-SET-REFS")
@XmlElement(name="CLIENT-ID-DEFINITION-SET-REF")
    public ArrayList<ClientIdDefinitionSetRef> getClientIdDefinitionSetRefs() {
    return this.clientIdDefinitionSetRefs;
}

    public void setClientIdDefinitionSetRefs(ArrayList<ClientIdDefinitionSetRef> value) {
        this.clientIdDefinitionSetRefs = value;
    }
    
    
    
    @XmlElement(name="CONTAINER-I-PDU-HEADER-BYTE-ORDER")
    public ByteOrderEnum getContainerIPduHeaderByteOrder() {
    return this.containerIPduHeaderByteOrder;
}

    public void setContainerIPduHeaderByteOrder(ByteOrderEnum value) {
        this.containerIPduHeaderByteOrder = value;
    }
    
    
    
    @XmlElement(name="ECU-EXTRACT-VERSION")
    public RevisionLabelString getEcuExtractVersion() {
    return this.ecuExtractVersion;
}

    public void setEcuExtractVersion(RevisionLabelString value) {
        this.ecuExtractVersion = value;
    }
    
    
    
    @XmlElementWrapper(name="FIBEX-ELEMENTS")
@XmlElement(name="FIBEX-ELEMENT-REF-CONDITIONAL")
    public ArrayList<FibexElementRefConditional> getFibexElements() {
    return this.fibexElements;
}

    public void setFibexElements(ArrayList<FibexElementRefConditional> value) {
        this.fibexElements = value;
    }
    
    
    
    @XmlElementWrapper(name="MAPPINGS")
@XmlElement(name="SYSTEM-MAPPING")
    public ArrayList<SystemMapping> getMappings() {
    return this.mappings;
}

    public void setMappings(ArrayList<SystemMapping> value) {
        this.mappings = value;
    }
    
    
    
    @XmlElement(name="PNC-VECTOR-LENGTH")
    public PositiveInteger getPncVectorLength() {
    return this.pncVectorLength;
}

    public void setPncVectorLength(PositiveInteger value) {
        this.pncVectorLength = value;
    }
    
    
    
    @XmlElement(name="PNC-VECTOR-OFFSET")
    public PositiveInteger getPncVectorOffset() {
    return this.pncVectorOffset;
}

    public void setPncVectorOffset(PositiveInteger value) {
        this.pncVectorOffset = value;
    }
    
    
    
    @XmlElementWrapper(name="ROOT-SOFTWARE-COMPOSITIONS")
@XmlElement(name="ROOT-SW-COMPOSITION-PROTOTYPE")
    public ArrayList<RootSwCompositionPrototype> getRootSoftwareCompositions() {
    return this.rootSoftwareCompositions;
}

    public void setRootSoftwareCompositions(ArrayList<RootSwCompositionPrototype> value) {
        this.rootSoftwareCompositions = value;
    }
    
    
    
    @XmlElement(name="SYSTEM-VERSION")
    public RevisionLabelString getSystemVersion() {
    return this.systemVersion;
}

    public void setSystemVersion(RevisionLabelString value) {
        this.systemVersion = value;
    }
    
    
}