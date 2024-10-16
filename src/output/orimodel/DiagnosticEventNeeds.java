package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-EVENT-NEEDS")
public class DiagnosticEventNeeds {

    
    
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
    
    
    
    protected Boolean considerPtoStatus;
    
    
    
    protected ArrayList<DeferringFidRef> deferringFidRefs;
    
    
    
    protected DiagEventDebounceAlgorithm diagEventDebounceAlgorithm;
    
    
    
    protected DtcKindEnum dtcKind;
    
    
    
    protected PositiveInteger dtcNumber;
    
    
    
    protected InhibitingFidRef inhibitingFidRef;
    
    
    
    protected ArrayList<InhibitingSecondaryFidRef> inhibitingSecondaryFidRefs;
    
    
    
    protected PositiveInteger obdDtcNumber;
    
    
    
    protected ReportBehaviorEnum reportBehavior;
    
    
    
    protected PositiveInteger udsDtcNumber;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONSIDER-PTO-STATUS")
    public Boolean getConsiderPtoStatus() {
    return this.considerPtoStatus;
}

    public void setConsiderPtoStatus(Boolean value) {
        this.considerPtoStatus = value;
    }
    
    
    
    @XmlElementWrapper(name="DEFERRING-FID-REFS")
@XmlElement(name="DEFERRING-FID-REF")
    public ArrayList<DeferringFidRef> getDeferringFidRefs() {
    return this.deferringFidRefs;
}

    public void setDeferringFidRefs(ArrayList<DeferringFidRef> value) {
        this.deferringFidRefs = value;
    }
    
    
    
    @XmlElement(name="DIAG-EVENT-DEBOUNCE-ALGORITHM")
    public DiagEventDebounceAlgorithm getDiagEventDebounceAlgorithm() {
    return this.diagEventDebounceAlgorithm;
}

    public void setDiagEventDebounceAlgorithm(DiagEventDebounceAlgorithm value) {
        this.diagEventDebounceAlgorithm = value;
    }
    
    
    
    @XmlElement(name="DTC-KIND")
    public DtcKindEnum getDtcKind() {
    return this.dtcKind;
}

    public void setDtcKind(DtcKindEnum value) {
        this.dtcKind = value;
    }
    
    
    
    @XmlElement(name="DTC-NUMBER")
    public PositiveInteger getDtcNumber() {
    return this.dtcNumber;
}

    public void setDtcNumber(PositiveInteger value) {
        this.dtcNumber = value;
    }
    
    
    
    @XmlElement(name="INHIBITING-FID-REF")
    public InhibitingFidRef getInhibitingFidRef() {
    return this.inhibitingFidRef;
}

    public void setInhibitingFidRef(InhibitingFidRef value) {
        this.inhibitingFidRef = value;
    }
    
    
    
    @XmlElementWrapper(name="INHIBITING-SECONDARY-FID-REFS")
@XmlElement(name="INHIBITING-SECONDARY-FID-REF")
    public ArrayList<InhibitingSecondaryFidRef> getInhibitingSecondaryFidRefs() {
    return this.inhibitingSecondaryFidRefs;
}

    public void setInhibitingSecondaryFidRefs(ArrayList<InhibitingSecondaryFidRef> value) {
        this.inhibitingSecondaryFidRefs = value;
    }
    
    
    
    @XmlElement(name="OBD-DTC-NUMBER")
    public PositiveInteger getObdDtcNumber() {
    return this.obdDtcNumber;
}

    public void setObdDtcNumber(PositiveInteger value) {
        this.obdDtcNumber = value;
    }
    
    
    
    @XmlElement(name="REPORT-BEHAVIOR")
    public ReportBehaviorEnum getReportBehavior() {
    return this.reportBehavior;
}

    public void setReportBehavior(ReportBehaviorEnum value) {
        this.reportBehavior = value;
    }
    
    
    
    @XmlElement(name="UDS-DTC-NUMBER")
    public PositiveInteger getUdsDtcNumber() {
    return this.udsDtcNumber;
}

    public void setUdsDtcNumber(PositiveInteger value) {
        this.udsDtcNumber = value;
    }
    
    
}