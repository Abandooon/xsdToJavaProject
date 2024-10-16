package stdgui.data.model.orimodel;
@XmlRootElement(name = "TD-EVENT-BSW-MODE-DECLARATION")
public class TdEventBswModeDeclaration {

    
    
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
    
    
    
    protected TdEventOccurrenceExpression occurrenceExpression;
    
    
    
    protected BswModuleDescriptionRef bswModuleDescriptionRef;
    
    
    
    protected EntryModeDeclarationRef entryModeDeclarationRef;
    
    
    
    protected ExitModeDeclarationRef exitModeDeclarationRef;
    
    
    
    protected ModeDeclarationRef_TdEventBswModeDeclaration modeDeclarationRef;
    
    
    
    protected TdEventBswModeDeclarationTypeEnum tdEventBswModeDeclarationType;
    
    

    
    
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
    
    
    
    @XmlElement(name="OCCURRENCE-EXPRESSION")
    public TdEventOccurrenceExpression getOccurrenceExpression() {
    return this.occurrenceExpression;
}

    public void setOccurrenceExpression(TdEventOccurrenceExpression value) {
        this.occurrenceExpression = value;
    }
    
    
    
    @XmlElement(name="BSW-MODULE-DESCRIPTION-REF")
    public BswModuleDescriptionRef getBswModuleDescriptionRef() {
    return this.bswModuleDescriptionRef;
}

    public void setBswModuleDescriptionRef(BswModuleDescriptionRef value) {
        this.bswModuleDescriptionRef = value;
    }
    
    
    
    @XmlElement(name="ENTRY-MODE-DECLARATION-REF")
    public EntryModeDeclarationRef getEntryModeDeclarationRef() {
    return this.entryModeDeclarationRef;
}

    public void setEntryModeDeclarationRef(EntryModeDeclarationRef value) {
        this.entryModeDeclarationRef = value;
    }
    
    
    
    @XmlElement(name="EXIT-MODE-DECLARATION-REF")
    public ExitModeDeclarationRef getExitModeDeclarationRef() {
    return this.exitModeDeclarationRef;
}

    public void setExitModeDeclarationRef(ExitModeDeclarationRef value) {
        this.exitModeDeclarationRef = value;
    }
    
    
    
    @XmlElement(name="MODE-DECLARATION-REF")
    public ModeDeclarationRef_TdEventBswModeDeclaration getModeDeclarationRef() {
    return this.modeDeclarationRef;
}

    public void setModeDeclarationRef(ModeDeclarationRef_TdEventBswModeDeclaration value) {
        this.modeDeclarationRef = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-BSW-MODE-DECLARATION-TYPE")
    public TdEventBswModeDeclarationTypeEnum getTdEventBswModeDeclarationType() {
    return this.tdEventBswModeDeclarationType;
}

    public void setTdEventBswModeDeclarationType(TdEventBswModeDeclarationTypeEnum value) {
        this.tdEventBswModeDeclarationType = value;
    }
    
    
}