package stdgui.data.model.orimodel;
@XmlRootElement(name = "BSW-MODE-SWITCH-EVENT")
public class BswModeSwitchEvent {

    
    
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
    
    
    
    protected ActivationReasonRepresentationRef activationReasonRepresentationRef;
    
    
    
    protected ArrayList<ContextLimitationRef> contextLimitationRefs;
    
    
    
    protected ArrayList<ModeInBswModuleDescriptionInstanceRef> disabledInModeIrefs;
    
    
    
    protected StartsOnEventRef startsOnEventRef;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ModeActivationKind activation;
    
    
    
    protected ArrayList<ModeInBswModuleDescriptionInstanceRef> modeIrefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="ACTIVATION-REASON-REPRESENTATION-REF")
    public ActivationReasonRepresentationRef getActivationReasonRepresentationRef() {
    return this.activationReasonRepresentationRef;
}

    public void setActivationReasonRepresentationRef(ActivationReasonRepresentationRef value) {
        this.activationReasonRepresentationRef = value;
    }
    
    
    
    @XmlElementWrapper(name="CONTEXT-LIMITATION-REFS")
@XmlElement(name="CONTEXT-LIMITATION-REF")
    public ArrayList<ContextLimitationRef> getContextLimitationRefs() {
    return this.contextLimitationRefs;
}

    public void setContextLimitationRefs(ArrayList<ContextLimitationRef> value) {
        this.contextLimitationRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="DISABLED-IN-MODE-IREFS")
@XmlElement(name="DISABLED-IN-MODE-IREF")
    public ArrayList<ModeInBswModuleDescriptionInstanceRef> getDisabledInModeIrefs() {
    return this.disabledInModeIrefs;
}

    public void setDisabledInModeIrefs(ArrayList<ModeInBswModuleDescriptionInstanceRef> value) {
        this.disabledInModeIrefs = value;
    }
    
    
    
    @XmlElement(name="STARTS-ON-EVENT-REF")
    public StartsOnEventRef getStartsOnEventRef() {
    return this.startsOnEventRef;
}

    public void setStartsOnEventRef(StartsOnEventRef value) {
        this.startsOnEventRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="ACTIVATION")
    public ModeActivationKind getActivation() {
    return this.activation;
}

    public void setActivation(ModeActivationKind value) {
        this.activation = value;
    }
    
    
    
    @XmlElementWrapper(name="MODE-IREFS")
@XmlElement(name="MODE-IREF")
    public ArrayList<ModeInBswModuleDescriptionInstanceRef> getModeIrefs() {
    return this.modeIrefs;
}

    public void setModeIrefs(ArrayList<ModeInBswModuleDescriptionInstanceRef> value) {
        this.modeIrefs = value;
    }
    
    
}