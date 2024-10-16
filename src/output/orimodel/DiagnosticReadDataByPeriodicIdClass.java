package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS")
public class DiagnosticReadDataByPeriodicIdClass {

    
    
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
    
    
    
    protected AccessPermissionRef accessPermissionRef;
    
    
    
    protected DiagnosticAccessPermissionValidityEnum accessPermissionValidity;
    
    
    
    protected PositiveInteger maxPeriodicDidToRead;
    
    
    
    protected ArrayList<DiagnosticPeriodicRate> periodicRates;
    
    
    
    protected PositiveInteger schedulerMaxNumber;
    
    

    
    
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
    
    
    
    @XmlElement(name="ACCESS-PERMISSION-REF")
    public AccessPermissionRef getAccessPermissionRef() {
    return this.accessPermissionRef;
}

    public void setAccessPermissionRef(AccessPermissionRef value) {
        this.accessPermissionRef = value;
    }
    
    
    
    @XmlElement(name="ACCESS-PERMISSION-VALIDITY")
    public DiagnosticAccessPermissionValidityEnum getAccessPermissionValidity() {
    return this.accessPermissionValidity;
}

    public void setAccessPermissionValidity(DiagnosticAccessPermissionValidityEnum value) {
        this.accessPermissionValidity = value;
    }
    
    
    
    @XmlElement(name="MAX-PERIODIC-DID-TO-READ")
    public PositiveInteger getMaxPeriodicDidToRead() {
    return this.maxPeriodicDidToRead;
}

    public void setMaxPeriodicDidToRead(PositiveInteger value) {
        this.maxPeriodicDidToRead = value;
    }
    
    
    
    @XmlElementWrapper(name="PERIODIC-RATES")
@XmlElement(name="DIAGNOSTIC-PERIODIC-RATE")
    public ArrayList<DiagnosticPeriodicRate> getPeriodicRates() {
    return this.periodicRates;
}

    public void setPeriodicRates(ArrayList<DiagnosticPeriodicRate> value) {
        this.periodicRates = value;
    }
    
    
    
    @XmlElement(name="SCHEDULER-MAX-NUMBER")
    public PositiveInteger getSchedulerMaxNumber() {
    return this.schedulerMaxNumber;
}

    public void setSchedulerMaxNumber(PositiveInteger value) {
        this.schedulerMaxNumber = value;
    }
    
    
}