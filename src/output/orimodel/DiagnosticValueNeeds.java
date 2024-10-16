package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-VALUE-NEEDS")
public class DiagnosticValueNeeds {

    
    
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
    
    
    
    protected PositiveInteger dataLength;
    
    
    
    protected DiagnosticValueAccessEnum diagnosticValueAccess;
    
    
    
    protected PositiveInteger didNumber;
    
    
    
    protected Boolean fixedLength;
    
    
    
    protected DiagnosticProcessingStyleEnum processingStyle;
    
    

    
    
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
    
    
    
    @XmlElement(name="DATA-LENGTH")
    public PositiveInteger getDataLength() {
    return this.dataLength;
}

    public void setDataLength(PositiveInteger value) {
        this.dataLength = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-VALUE-ACCESS")
    public DiagnosticValueAccessEnum getDiagnosticValueAccess() {
    return this.diagnosticValueAccess;
}

    public void setDiagnosticValueAccess(DiagnosticValueAccessEnum value) {
        this.diagnosticValueAccess = value;
    }
    
    
    
    @XmlElement(name="DID-NUMBER")
    public PositiveInteger getDidNumber() {
    return this.didNumber;
}

    public void setDidNumber(PositiveInteger value) {
        this.didNumber = value;
    }
    
    
    
    @XmlElement(name="FIXED-LENGTH")
    public Boolean getFixedLength() {
    return this.fixedLength;
}

    public void setFixedLength(Boolean value) {
        this.fixedLength = value;
    }
    
    
    
    @XmlElement(name="PROCESSING-STYLE")
    public DiagnosticProcessingStyleEnum getProcessingStyle() {
    return this.processingStyle;
}

    public void setProcessingStyle(DiagnosticProcessingStyleEnum value) {
        this.processingStyle = value;
    }
    
    
}