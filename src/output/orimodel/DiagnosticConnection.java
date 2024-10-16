package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-CONNECTION")
public class DiagnosticConnection {

    
    
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
    
    
    
    protected ArrayList<FunctionalRequestRef> functionalRequestRefs;
    
    
    
    protected ArrayList<PeriodicResponseUudtRef> periodicResponseUudtRefs;
    
    
    
    protected PhysicalRequestRef physicalRequestRef;
    
    
    
    protected ResponseOnEventRef responseOnEventRef;
    
    
    
    protected ResponseRef responseRef;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="FUNCTIONAL-REQUEST-REFS")
@XmlElement(name="FUNCTIONAL-REQUEST-REF")
    public ArrayList<FunctionalRequestRef> getFunctionalRequestRefs() {
    return this.functionalRequestRefs;
}

    public void setFunctionalRequestRefs(ArrayList<FunctionalRequestRef> value) {
        this.functionalRequestRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="PERIODIC-RESPONSE-UUDT-REFS")
@XmlElement(name="PERIODIC-RESPONSE-UUDT-REF")
    public ArrayList<PeriodicResponseUudtRef> getPeriodicResponseUudtRefs() {
    return this.periodicResponseUudtRefs;
}

    public void setPeriodicResponseUudtRefs(ArrayList<PeriodicResponseUudtRef> value) {
        this.periodicResponseUudtRefs = value;
    }
    
    
    
    @XmlElement(name="PHYSICAL-REQUEST-REF")
    public PhysicalRequestRef getPhysicalRequestRef() {
    return this.physicalRequestRef;
}

    public void setPhysicalRequestRef(PhysicalRequestRef value) {
        this.physicalRequestRef = value;
    }
    
    
    
    @XmlElement(name="RESPONSE-ON-EVENT-REF")
    public ResponseOnEventRef getResponseOnEventRef() {
    return this.responseOnEventRef;
}

    public void setResponseOnEventRef(ResponseOnEventRef value) {
        this.responseOnEventRef = value;
    }
    
    
    
    @XmlElement(name="RESPONSE-REF")
    public ResponseRef getResponseRef() {
    return this.responseRef;
}

    public void setResponseRef(ResponseRef value) {
        this.responseRef = value;
    }
    
    
}