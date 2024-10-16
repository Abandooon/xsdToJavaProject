package stdgui.data.model.orimodel;
@XmlRootElement(name = "SWC-INTERNAL-BEHAVIOR")
public class SwcInternalBehavior {

    
    
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
    
    
    
    protected ArrayList<ParameterDataPrototype> constantMemorys;
    
    
    
    protected ArrayList<ConstantValueMappingRef> constantValueMappingRefs;
    
    
    
    protected ArrayList<DataTypeMappingRef> dataTypeMappingRefs;
    
    
    
    protected ArrayList<ExclusiveArea> exclusiveAreas;
    
    
    
    protected ArrayList<ExclusiveAreaNestingOrder> exclusiveAreaNestingOrders;
    
    
    
    protected ArrayList<VariableDataPrototype> staticMemorys;
    
    
    
    protected ArrayList<VariableDataPrototype> arTypedPerInstanceMemorys;
    
    
    
    protected Events_SwcInternalBehavior events;
    
    
    
    protected ArrayList<VariableDataPrototype> explicitInterRunnableVariables;
    
    
    
    protected HandleTerminationAndRestartEnum handleTerminationAndRestart;
    
    
    
    protected ArrayList<VariableDataPrototype> implicitInterRunnableVariables;
    
    
    
    protected ArrayList<IncludedDataTypeSet> includedDataTypeSets;
    
    
    
    protected ArrayList<IncludedModeDeclarationGroupSet> includedModeDeclarationGroupSets;
    
    
    
    protected ArrayList<InstantiationDataDefProps> instantiationDataDefPropss;
    
    
    
    protected ArrayList<PerInstanceMemory> perInstanceMemorys;
    
    
    
    protected ArrayList<ParameterDataPrototype> perInstanceParameters;
    
    
    
    protected ArrayList<PortApiOption> portApiOptions;
    
    
    
    protected ArrayList<RunnableEntity> runnables;
    
    
    
    protected ArrayList<SwcServiceDependency> serviceDependencys;
    
    
    
    protected ArrayList<ParameterDataPrototype> sharedParameters;
    
    
    
    protected Boolean supportsMultipleInstantiation;
    
    
    
    protected ArrayList<VariationPointProxy> variationPointProxys;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="CONSTANT-MEMORYS")
@XmlElement(name="PARAMETER-DATA-PROTOTYPE")
    public ArrayList<ParameterDataPrototype> getConstantMemorys() {
    return this.constantMemorys;
}

    public void setConstantMemorys(ArrayList<ParameterDataPrototype> value) {
        this.constantMemorys = value;
    }
    
    
    
    @XmlElementWrapper(name="CONSTANT-VALUE-MAPPING-REFS")
@XmlElement(name="CONSTANT-VALUE-MAPPING-REF")
    public ArrayList<ConstantValueMappingRef> getConstantValueMappingRefs() {
    return this.constantValueMappingRefs;
}

    public void setConstantValueMappingRefs(ArrayList<ConstantValueMappingRef> value) {
        this.constantValueMappingRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="DATA-TYPE-MAPPING-REFS")
@XmlElement(name="DATA-TYPE-MAPPING-REF")
    public ArrayList<DataTypeMappingRef> getDataTypeMappingRefs() {
    return this.dataTypeMappingRefs;
}

    public void setDataTypeMappingRefs(ArrayList<DataTypeMappingRef> value) {
        this.dataTypeMappingRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="EXCLUSIVE-AREAS")
@XmlElement(name="EXCLUSIVE-AREA")
    public ArrayList<ExclusiveArea> getExclusiveAreas() {
    return this.exclusiveAreas;
}

    public void setExclusiveAreas(ArrayList<ExclusiveArea> value) {
        this.exclusiveAreas = value;
    }
    
    
    
    @XmlElementWrapper(name="EXCLUSIVE-AREA-NESTING-ORDERS")
@XmlElement(name="EXCLUSIVE-AREA-NESTING-ORDER")
    public ArrayList<ExclusiveAreaNestingOrder> getExclusiveAreaNestingOrders() {
    return this.exclusiveAreaNestingOrders;
}

    public void setExclusiveAreaNestingOrders(ArrayList<ExclusiveAreaNestingOrder> value) {
        this.exclusiveAreaNestingOrders = value;
    }
    
    
    
    @XmlElementWrapper(name="STATIC-MEMORYS")
@XmlElement(name="VARIABLE-DATA-PROTOTYPE")
    public ArrayList<VariableDataPrototype> getStaticMemorys() {
    return this.staticMemorys;
}

    public void setStaticMemorys(ArrayList<VariableDataPrototype> value) {
        this.staticMemorys = value;
    }
    
    
    
    @XmlElementWrapper(name="AR-TYPED-PER-INSTANCE-MEMORYS")
@XmlElement(name="VARIABLE-DATA-PROTOTYPE")
    public ArrayList<VariableDataPrototype> getArTypedPerInstanceMemorys() {
    return this.arTypedPerInstanceMemorys;
}

    public void setArTypedPerInstanceMemorys(ArrayList<VariableDataPrototype> value) {
        this.arTypedPerInstanceMemorys = value;
    }
    
    
    
    @XmlElement(name="EVENTS")
    public Events_SwcInternalBehavior getEvents() {
    return this.events;
}

    public void setEvents(Events_SwcInternalBehavior value) {
        this.events = value;
    }
    
    
    
    @XmlElementWrapper(name="EXPLICIT-INTER-RUNNABLE-VARIABLES")
@XmlElement(name="VARIABLE-DATA-PROTOTYPE")
    public ArrayList<VariableDataPrototype> getExplicitInterRunnableVariables() {
    return this.explicitInterRunnableVariables;
}

    public void setExplicitInterRunnableVariables(ArrayList<VariableDataPrototype> value) {
        this.explicitInterRunnableVariables = value;
    }
    
    
    
    @XmlElement(name="HANDLE-TERMINATION-AND-RESTART")
    public HandleTerminationAndRestartEnum getHandleTerminationAndRestart() {
    return this.handleTerminationAndRestart;
}

    public void setHandleTerminationAndRestart(HandleTerminationAndRestartEnum value) {
        this.handleTerminationAndRestart = value;
    }
    
    
    
    @XmlElementWrapper(name="IMPLICIT-INTER-RUNNABLE-VARIABLES")
@XmlElement(name="VARIABLE-DATA-PROTOTYPE")
    public ArrayList<VariableDataPrototype> getImplicitInterRunnableVariables() {
    return this.implicitInterRunnableVariables;
}

    public void setImplicitInterRunnableVariables(ArrayList<VariableDataPrototype> value) {
        this.implicitInterRunnableVariables = value;
    }
    
    
    
    @XmlElementWrapper(name="INCLUDED-DATA-TYPE-SETS")
@XmlElement(name="INCLUDED-DATA-TYPE-SET")
    public ArrayList<IncludedDataTypeSet> getIncludedDataTypeSets() {
    return this.includedDataTypeSets;
}

    public void setIncludedDataTypeSets(ArrayList<IncludedDataTypeSet> value) {
        this.includedDataTypeSets = value;
    }
    
    
    
    @XmlElementWrapper(name="INCLUDED-MODE-DECLARATION-GROUP-SETS")
@XmlElement(name="INCLUDED-MODE-DECLARATION-GROUP-SET")
    public ArrayList<IncludedModeDeclarationGroupSet> getIncludedModeDeclarationGroupSets() {
    return this.includedModeDeclarationGroupSets;
}

    public void setIncludedModeDeclarationGroupSets(ArrayList<IncludedModeDeclarationGroupSet> value) {
        this.includedModeDeclarationGroupSets = value;
    }
    
    
    
    @XmlElementWrapper(name="INSTANTIATION-DATA-DEF-PROPSS")
@XmlElement(name="INSTANTIATION-DATA-DEF-PROPS")
    public ArrayList<InstantiationDataDefProps> getInstantiationDataDefPropss() {
    return this.instantiationDataDefPropss;
}

    public void setInstantiationDataDefPropss(ArrayList<InstantiationDataDefProps> value) {
        this.instantiationDataDefPropss = value;
    }
    
    
    
    @XmlElementWrapper(name="PER-INSTANCE-MEMORYS")
@XmlElement(name="PER-INSTANCE-MEMORY")
    public ArrayList<PerInstanceMemory> getPerInstanceMemorys() {
    return this.perInstanceMemorys;
}

    public void setPerInstanceMemorys(ArrayList<PerInstanceMemory> value) {
        this.perInstanceMemorys = value;
    }
    
    
    
    @XmlElementWrapper(name="PER-INSTANCE-PARAMETERS")
@XmlElement(name="PARAMETER-DATA-PROTOTYPE")
    public ArrayList<ParameterDataPrototype> getPerInstanceParameters() {
    return this.perInstanceParameters;
}

    public void setPerInstanceParameters(ArrayList<ParameterDataPrototype> value) {
        this.perInstanceParameters = value;
    }
    
    
    
    @XmlElementWrapper(name="PORT-API-OPTIONS")
@XmlElement(name="PORT-API-OPTION")
    public ArrayList<PortApiOption> getPortApiOptions() {
    return this.portApiOptions;
}

    public void setPortApiOptions(ArrayList<PortApiOption> value) {
        this.portApiOptions = value;
    }
    
    
    
    @XmlElementWrapper(name="RUNNABLES")
@XmlElement(name="RUNNABLE-ENTITY")
    public ArrayList<RunnableEntity> getRunnables() {
    return this.runnables;
}

    public void setRunnables(ArrayList<RunnableEntity> value) {
        this.runnables = value;
    }
    
    
    
    @XmlElementWrapper(name="SERVICE-DEPENDENCYS")
@XmlElement(name="SWC-SERVICE-DEPENDENCY")
    public ArrayList<SwcServiceDependency> getServiceDependencys() {
    return this.serviceDependencys;
}

    public void setServiceDependencys(ArrayList<SwcServiceDependency> value) {
        this.serviceDependencys = value;
    }
    
    
    
    @XmlElementWrapper(name="SHARED-PARAMETERS")
@XmlElement(name="PARAMETER-DATA-PROTOTYPE")
    public ArrayList<ParameterDataPrototype> getSharedParameters() {
    return this.sharedParameters;
}

    public void setSharedParameters(ArrayList<ParameterDataPrototype> value) {
        this.sharedParameters = value;
    }
    
    
    
    @XmlElement(name="SUPPORTS-MULTIPLE-INSTANTIATION")
    public Boolean getSupportsMultipleInstantiation() {
    return this.supportsMultipleInstantiation;
}

    public void setSupportsMultipleInstantiation(Boolean value) {
        this.supportsMultipleInstantiation = value;
    }
    
    
    
    @XmlElementWrapper(name="VARIATION-POINT-PROXYS")
@XmlElement(name="VARIATION-POINT-PROXY")
    public ArrayList<VariationPointProxy> getVariationPointProxys() {
    return this.variationPointProxys;
}

    public void setVariationPointProxys(ArrayList<VariationPointProxy> value) {
        this.variationPointProxys = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}