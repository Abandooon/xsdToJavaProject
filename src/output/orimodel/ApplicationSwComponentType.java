package stdgui.data.model.orimodel;
@XmlRootElement(name = "APPLICATION-SW-COMPONENT-TYPE")
public class ApplicationSwComponentType {

    
    
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
    
    
    
    protected ArrayList<SwComponentDocumentation> swComponentDocumentations;
    
    
    
    protected ArrayList<ConsistencyNeeds> consistencyNeedss;
    
    
    
    protected Ports ports;
    
    
    
    protected ArrayList<PortGroup> portGroups;
    
    
    
    protected ArrayList<UnitGroupRef> unitGroupRefs;
    
    
    
    protected ArrayList<SwcInternalBehavior> internalBehaviors;
    
    
    
    protected SymbolProps symbolProps;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="SW-COMPONENT-DOCUMENTATIONS")
@XmlElement(name="SW-COMPONENT-DOCUMENTATION")
    public ArrayList<SwComponentDocumentation> getSwComponentDocumentations() {
    return this.swComponentDocumentations;
}

    public void setSwComponentDocumentations(ArrayList<SwComponentDocumentation> value) {
        this.swComponentDocumentations = value;
    }
    
    
    
    @XmlElementWrapper(name="CONSISTENCY-NEEDSS")
@XmlElement(name="CONSISTENCY-NEEDS")
    public ArrayList<ConsistencyNeeds> getConsistencyNeedss() {
    return this.consistencyNeedss;
}

    public void setConsistencyNeedss(ArrayList<ConsistencyNeeds> value) {
        this.consistencyNeedss = value;
    }
    
    
    
    @XmlElement(name="PORTS")
    public Ports getPorts() {
    return this.ports;
}

    public void setPorts(Ports value) {
        this.ports = value;
    }
    
    
    
    @XmlElementWrapper(name="PORT-GROUPS")
@XmlElement(name="PORT-GROUP")
    public ArrayList<PortGroup> getPortGroups() {
    return this.portGroups;
}

    public void setPortGroups(ArrayList<PortGroup> value) {
        this.portGroups = value;
    }
    
    
    
    @XmlElementWrapper(name="UNIT-GROUP-REFS")
@XmlElement(name="UNIT-GROUP-REF")
    public ArrayList<UnitGroupRef> getUnitGroupRefs() {
    return this.unitGroupRefs;
}

    public void setUnitGroupRefs(ArrayList<UnitGroupRef> value) {
        this.unitGroupRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="INTERNAL-BEHAVIORS")
@XmlElement(name="SWC-INTERNAL-BEHAVIOR")
    public ArrayList<SwcInternalBehavior> getInternalBehaviors() {
    return this.internalBehaviors;
}

    public void setInternalBehaviors(ArrayList<SwcInternalBehavior> value) {
        this.internalBehaviors = value;
    }
    
    
    
    @XmlElement(name="SYMBOL-PROPS")
    public SymbolProps getSymbolProps() {
    return this.symbolProps;
}

    public void setSymbolProps(SymbolProps value) {
        this.symbolProps = value;
    }
    
    
}