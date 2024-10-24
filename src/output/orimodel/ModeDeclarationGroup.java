package stdgui.data.model.orimodel;
@XmlRootElement(name = "MODE-DECLARATION-GROUP")
public class ModeDeclarationGroup {

    
    
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
    
    
    
    protected BlueprintPolicys blueprintPolicys;
    
    
    
    protected String shortNamePattern;
    
    
    
    protected InitialModeRef initialModeRef;
    
    
    
    protected ArrayList<ModeDeclaration> modeDeclarations;
    
    
    
    protected ModeErrorBehavior modeManagerErrorBehavior;
    
    
    
    protected ArrayList<ModeTransition> modeTransitions;
    
    
    
    protected ModeErrorBehavior modeUserErrorBehavior;
    
    
    
    protected PositiveInteger onTransitionValue;
    
    

    
    
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
    
    
    
    @XmlElement(name="BLUEPRINT-POLICYS")
    public BlueprintPolicys getBlueprintPolicys() {
    return this.blueprintPolicys;
}

    public void setBlueprintPolicys(BlueprintPolicys value) {
        this.blueprintPolicys = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME-PATTERN")
    public String getShortNamePattern() {
    return this.shortNamePattern;
}

    public void setShortNamePattern(String value) {
        this.shortNamePattern = value;
    }
    
    
    
    @XmlElement(name="INITIAL-MODE-REF")
    public InitialModeRef getInitialModeRef() {
    return this.initialModeRef;
}

    public void setInitialModeRef(InitialModeRef value) {
        this.initialModeRef = value;
    }
    
    
    
    @XmlElementWrapper(name="MODE-DECLARATIONS")
@XmlElement(name="MODE-DECLARATION")
    public ArrayList<ModeDeclaration> getModeDeclarations() {
    return this.modeDeclarations;
}

    public void setModeDeclarations(ArrayList<ModeDeclaration> value) {
        this.modeDeclarations = value;
    }
    
    
    
    @XmlElement(name="MODE-MANAGER-ERROR-BEHAVIOR")
    public ModeErrorBehavior getModeManagerErrorBehavior() {
    return this.modeManagerErrorBehavior;
}

    public void setModeManagerErrorBehavior(ModeErrorBehavior value) {
        this.modeManagerErrorBehavior = value;
    }
    
    
    
    @XmlElementWrapper(name="MODE-TRANSITIONS")
@XmlElement(name="MODE-TRANSITION")
    public ArrayList<ModeTransition> getModeTransitions() {
    return this.modeTransitions;
}

    public void setModeTransitions(ArrayList<ModeTransition> value) {
        this.modeTransitions = value;
    }
    
    
    
    @XmlElement(name="MODE-USER-ERROR-BEHAVIOR")
    public ModeErrorBehavior getModeUserErrorBehavior() {
    return this.modeUserErrorBehavior;
}

    public void setModeUserErrorBehavior(ModeErrorBehavior value) {
        this.modeUserErrorBehavior = value;
    }
    
    
    
    @XmlElement(name="ON-TRANSITION-VALUE")
    public PositiveInteger getOnTransitionValue() {
    return this.onTransitionValue;
}

    public void setOnTransitionValue(PositiveInteger value) {
        this.onTransitionValue = value;
    }
    
    
}