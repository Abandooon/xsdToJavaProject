package stdgui.data.model.orimodel;
@XmlRootElement(name = "APPLICATION-ARRAY-ELEMENT")
public class ApplicationArrayElement {

    
    
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
    
    
    
    protected SwDataDefProps swDataDefProps;
    
    
    
    protected TypeTref typeTref;
    
    
    
    protected ArraySizeHandlingEnum arraySizeHandling;
    
    
    
    protected ArraySizeSemanticsEnum arraySizeSemantics;
    
    
    
    protected PositiveIntegerValueVariationPoint maxNumberOfElements;
    
    

    
    
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
    
    
    
    @XmlElement(name="SW-DATA-DEF-PROPS")
    public SwDataDefProps getSwDataDefProps() {
    return this.swDataDefProps;
}

    public void setSwDataDefProps(SwDataDefProps value) {
        this.swDataDefProps = value;
    }
    
    
    
    @XmlElement(name="TYPE-TREF")
    public TypeTref getTypeTref() {
    return this.typeTref;
}

    public void setTypeTref(TypeTref value) {
        this.typeTref = value;
    }
    
    
    
    @XmlElement(name="ARRAY-SIZE-HANDLING")
    public ArraySizeHandlingEnum getArraySizeHandling() {
    return this.arraySizeHandling;
}

    public void setArraySizeHandling(ArraySizeHandlingEnum value) {
        this.arraySizeHandling = value;
    }
    
    
    
    @XmlElement(name="ARRAY-SIZE-SEMANTICS")
    public ArraySizeSemanticsEnum getArraySizeSemantics() {
    return this.arraySizeSemantics;
}

    public void setArraySizeSemantics(ArraySizeSemanticsEnum value) {
        this.arraySizeSemantics = value;
    }
    
    
    
    @XmlElement(name="MAX-NUMBER-OF-ELEMENTS")
    public PositiveIntegerValueVariationPoint getMaxNumberOfElements() {
    return this.maxNumberOfElements;
}

    public void setMaxNumberOfElements(PositiveIntegerValueVariationPoint value) {
        this.maxNumberOfElements = value;
    }
    
    
}