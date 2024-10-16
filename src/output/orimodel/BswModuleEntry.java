package stdgui.data.model.orimodel;
@XmlRootElement(name = "BSW-MODULE-ENTRY")
public class BswModuleEntry {

    
    
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
    
    
    
    protected PositiveInteger serviceId;
    
    
    
    protected Identifier role;
    
    
    
    protected Boolean isReentrant;
    
    
    
    protected Boolean isSynchronous;
    
    
    
    protected BswCallType callType;
    
    
    
    protected BswExecutionContext executionContext;
    
    
    
    protected SwServiceImplPolicyEnum swServiceImplPolicy;
    
    
    
    protected SwServiceArg returnType;
    
    
    
    protected ArrayList<SwServiceArg> arguments;
    
    

    
    
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
    
    
    
    @XmlElement(name="SERVICE-ID")
    public PositiveInteger getServiceId() {
    return this.serviceId;
}

    public void setServiceId(PositiveInteger value) {
        this.serviceId = value;
    }
    
    
    
    @XmlElement(name="ROLE")
    public Identifier getRole() {
    return this.role;
}

    public void setRole(Identifier value) {
        this.role = value;
    }
    
    
    
    @XmlElement(name="IS-REENTRANT")
    public Boolean getIsReentrant() {
    return this.isReentrant;
}

    public void setIsReentrant(Boolean value) {
        this.isReentrant = value;
    }
    
    
    
    @XmlElement(name="IS-SYNCHRONOUS")
    public Boolean getIsSynchronous() {
    return this.isSynchronous;
}

    public void setIsSynchronous(Boolean value) {
        this.isSynchronous = value;
    }
    
    
    
    @XmlElement(name="CALL-TYPE")
    public BswCallType getCallType() {
    return this.callType;
}

    public void setCallType(BswCallType value) {
        this.callType = value;
    }
    
    
    
    @XmlElement(name="EXECUTION-CONTEXT")
    public BswExecutionContext getExecutionContext() {
    return this.executionContext;
}

    public void setExecutionContext(BswExecutionContext value) {
        this.executionContext = value;
    }
    
    
    
    @XmlElement(name="SW-SERVICE-IMPL-POLICY")
    public SwServiceImplPolicyEnum getSwServiceImplPolicy() {
    return this.swServiceImplPolicy;
}

    public void setSwServiceImplPolicy(SwServiceImplPolicyEnum value) {
        this.swServiceImplPolicy = value;
    }
    
    
    
    @XmlElement(name="RETURN-TYPE")
    public SwServiceArg getReturnType() {
    return this.returnType;
}

    public void setReturnType(SwServiceArg value) {
        this.returnType = value;
    }
    
    
    
    @XmlElementWrapper(name="ARGUMENTS")
@XmlElement(name="SW-SERVICE-ARG")
    public ArrayList<SwServiceArg> getArguments() {
    return this.arguments;
}

    public void setArguments(ArrayList<SwServiceArg> value) {
        this.arguments = value;
    }
    
    
}