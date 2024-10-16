package stdgui.data.model.orimodel;
@XmlRootElement(name = "DIAGNOSTIC-SERVICE-SW-MAPPING")
public class DiagnosticServiceSwMapping {

    
    
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
    
    
    
    protected DiagnosticDataElementRef diagnosticDataElementRef;
    
    
    
    protected MappedBswServiceDependencyRef mappedBswServiceDependencyRef;
    
    
    
    protected MappedFlatSwcServiceDependencyRef mappedFlatSwcServiceDependencyRef;
    
    
    
    protected SwcServiceDependencyInCompositionInstanceRef mappedSwcServiceDependencyIref;
    
    
    
    protected ServiceInstanceRef_DiagnosticServiceTable serviceInstanceRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="DIAGNOSTIC-DATA-ELEMENT-REF")
    public DiagnosticDataElementRef getDiagnosticDataElementRef() {
    return this.diagnosticDataElementRef;
}

    public void setDiagnosticDataElementRef(DiagnosticDataElementRef value) {
        this.diagnosticDataElementRef = value;
    }
    
    
    
    @XmlElement(name="MAPPED-BSW-SERVICE-DEPENDENCY-REF")
    public MappedBswServiceDependencyRef getMappedBswServiceDependencyRef() {
    return this.mappedBswServiceDependencyRef;
}

    public void setMappedBswServiceDependencyRef(MappedBswServiceDependencyRef value) {
        this.mappedBswServiceDependencyRef = value;
    }
    
    
    
    @XmlElement(name="MAPPED-FLAT-SWC-SERVICE-DEPENDENCY-REF")
    public MappedFlatSwcServiceDependencyRef getMappedFlatSwcServiceDependencyRef() {
    return this.mappedFlatSwcServiceDependencyRef;
}

    public void setMappedFlatSwcServiceDependencyRef(MappedFlatSwcServiceDependencyRef value) {
        this.mappedFlatSwcServiceDependencyRef = value;
    }
    
    
    
    @XmlElement(name="MAPPED-SWC-SERVICE-DEPENDENCY-IREF")
    public SwcServiceDependencyInCompositionInstanceRef getMappedSwcServiceDependencyIref() {
    return this.mappedSwcServiceDependencyIref;
}

    public void setMappedSwcServiceDependencyIref(SwcServiceDependencyInCompositionInstanceRef value) {
        this.mappedSwcServiceDependencyIref = value;
    }
    
    
    
    @XmlElement(name="SERVICE-INSTANCE-REF")
    public ServiceInstanceRef_DiagnosticServiceTable getServiceInstanceRef() {
    return this.serviceInstanceRef;
}

    public void setServiceInstanceRef(ServiceInstanceRef_DiagnosticServiceTable value) {
        this.serviceInstanceRef = value;
    }
    
    
}