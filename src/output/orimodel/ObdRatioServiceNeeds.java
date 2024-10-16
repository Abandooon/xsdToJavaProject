package stdgui.data.model.orimodel;
@XmlRootElement(name = "OBD-RATIO-SERVICE-NEEDS")
public class ObdRatioServiceNeeds {

    
    
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
    
    
    
    protected ObdRatioConnectionKindEnum connectionType;
    
    
    
    protected NmtokenString iumprGroup;
    
    
    
    protected RateBasedMonitoredEventRef rateBasedMonitoredEventRef;
    
    
    
    protected UsedFidRef usedFidRef;
    
    
    
    protected ArrayList<UsedSecondaryFidRef> usedSecondaryFidRefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONNECTION-TYPE")
    public ObdRatioConnectionKindEnum getConnectionType() {
    return this.connectionType;
}

    public void setConnectionType(ObdRatioConnectionKindEnum value) {
        this.connectionType = value;
    }
    
    
    
    @XmlElement(name="IUMPR-GROUP")
    public NmtokenString getIumprGroup() {
    return this.iumprGroup;
}

    public void setIumprGroup(NmtokenString value) {
        this.iumprGroup = value;
    }
    
    
    
    @XmlElement(name="RATE-BASED-MONITORED-EVENT-REF")
    public RateBasedMonitoredEventRef getRateBasedMonitoredEventRef() {
    return this.rateBasedMonitoredEventRef;
}

    public void setRateBasedMonitoredEventRef(RateBasedMonitoredEventRef value) {
        this.rateBasedMonitoredEventRef = value;
    }
    
    
    
    @XmlElement(name="USED-FID-REF")
    public UsedFidRef getUsedFidRef() {
    return this.usedFidRef;
}

    public void setUsedFidRef(UsedFidRef value) {
        this.usedFidRef = value;
    }
    
    
    
    @XmlElementWrapper(name="USED-SECONDARY-FID-REFS")
@XmlElement(name="USED-SECONDARY-FID-REF")
    public ArrayList<UsedSecondaryFidRef> getUsedSecondaryFidRefs() {
    return this.usedSecondaryFidRefs;
}

    public void setUsedSecondaryFidRefs(ArrayList<UsedSecondaryFidRef> value) {
        this.usedSecondaryFidRefs = value;
    }
    
    
}