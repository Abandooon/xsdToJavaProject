package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-IO-CONTROL-NEEDS")
public class DiagnosticIoControlNeeds {

    
    
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
    
    
    
    protected ArrayList<DiagnosticAudienceEnum> audiences;
    
    
    
    protected DiagRequirementIdString diagRequirement;
    
    
    
    protected PositiveInteger securityAccessLevel;
    
    
    
    protected CurrentValueRef currentValueRef;
    
    
    
    protected PositiveInteger didNumber;
    
    
    
    protected Boolean freezeCurrentStateSupported;
    
    
    
    protected Boolean resetToDefaultSupported;
    
    
    
    protected Boolean shortTermAdjustmentSupported;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="AUDIENCES")
@XmlElement(name="AUDIENCE")
    public ArrayList<DiagnosticAudienceEnum> getAudiences() {
    return this.audiences;
}

    public void setAudiences(ArrayList<DiagnosticAudienceEnum> value) {
        this.audiences = value;
    }
    
    
    
    @XmlElement(name="DIAG-REQUIREMENT")
    public DiagRequirementIdString getDiagRequirement() {
    return this.diagRequirement;
}

    public void setDiagRequirement(DiagRequirementIdString value) {
        this.diagRequirement = value;
    }
    
    
    
    @XmlElement(name="SECURITY-ACCESS-LEVEL")
    public PositiveInteger getSecurityAccessLevel() {
    return this.securityAccessLevel;
}

    public void setSecurityAccessLevel(PositiveInteger value) {
        this.securityAccessLevel = value;
    }
    
    
    
    @XmlElement(name="CURRENT-VALUE-REF")
    public CurrentValueRef getCurrentValueRef() {
    return this.currentValueRef;
}

    public void setCurrentValueRef(CurrentValueRef value) {
        this.currentValueRef = value;
    }
    
    
    
    @XmlElement(name="DID-NUMBER")
    public PositiveInteger getDidNumber() {
    return this.didNumber;
}

    public void setDidNumber(PositiveInteger value) {
        this.didNumber = value;
    }
    
    
    
    @XmlElement(name="FREEZE-CURRENT-STATE-SUPPORTED")
    public Boolean getFreezeCurrentStateSupported() {
    return this.freezeCurrentStateSupported;
}

    public void setFreezeCurrentStateSupported(Boolean value) {
        this.freezeCurrentStateSupported = value;
    }
    
    
    
    @XmlElement(name="RESET-TO-DEFAULT-SUPPORTED")
    public Boolean getResetToDefaultSupported() {
    return this.resetToDefaultSupported;
}

    public void setResetToDefaultSupported(Boolean value) {
        this.resetToDefaultSupported = value;
    }
    
    
    
    @XmlElement(name="SHORT-TERM-ADJUSTMENT-SUPPORTED")
    public Boolean getShortTermAdjustmentSupported() {
    return this.shortTermAdjustmentSupported;
}

    public void setShortTermAdjustmentSupported(Boolean value) {
        this.shortTermAdjustmentSupported = value;
    }
    
    
}