package stdgui.data.model.orimodel;
@XmlRootElement(name = "MEMORY-SECTION")
public class MemorySection {

    
    
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
    
    
    
    protected AlignmentType alignment;
    
    
    
    protected ArrayList<ExecutableEntityRef> executableEntityRefs;
    
    
    
    protected CIdentifier memClassSymbol;
    
    
    
    protected ArrayList<Identifier> options;
    
    
    
    protected PrefixRef prefixRef;
    
    
    
    protected PositiveInteger size;
    
    
    
    protected SwAddrmethodRef swAddrmethodRef;
    
    
    
    protected Identifier symbol;
    
    
    
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
    
    
    
    @XmlElement(name="ALIGNMENT")
    public AlignmentType getAlignment() {
    return this.alignment;
}

    public void setAlignment(AlignmentType value) {
        this.alignment = value;
    }
    
    
    
    @XmlElementWrapper(name="EXECUTABLE-ENTITY-REFS")
@XmlElement(name="EXECUTABLE-ENTITY-REF")
    public ArrayList<ExecutableEntityRef> getExecutableEntityRefs() {
    return this.executableEntityRefs;
}

    public void setExecutableEntityRefs(ArrayList<ExecutableEntityRef> value) {
        this.executableEntityRefs = value;
    }
    
    
    
    @XmlElement(name="MEM-CLASS-SYMBOL")
    public CIdentifier getMemClassSymbol() {
    return this.memClassSymbol;
}

    public void setMemClassSymbol(CIdentifier value) {
        this.memClassSymbol = value;
    }
    
    
    
    @XmlElementWrapper(name="OPTIONS")
@XmlElement(name="OPTION")
    public ArrayList<Identifier> getOptions() {
    return this.options;
}

    public void setOptions(ArrayList<Identifier> value) {
        this.options = value;
    }
    
    
    
    @XmlElement(name="PREFIX-REF")
    public PrefixRef getPrefixRef() {
    return this.prefixRef;
}

    public void setPrefixRef(PrefixRef value) {
        this.prefixRef = value;
    }
    
    
    
    @XmlElement(name="SIZE")
    public PositiveInteger getSize() {
    return this.size;
}

    public void setSize(PositiveInteger value) {
        this.size = value;
    }
    
    
    
    @XmlElement(name="SW-ADDRMETHOD-REF")
    public SwAddrmethodRef getSwAddrmethodRef() {
    return this.swAddrmethodRef;
}

    public void setSwAddrmethodRef(SwAddrmethodRef value) {
        this.swAddrmethodRef = value;
    }
    
    
    
    @XmlElement(name="SYMBOL")
    public Identifier getSymbol() {
    return this.symbol;
}

    public void setSymbol(Identifier value) {
        this.symbol = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}