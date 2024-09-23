package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwcInternalBehavior {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected Annotations annotations;
    
    
    
    protected ConstantMemorys constantMemorys;
    
    
    
    protected ConstantValueMappingRefs constantValueMappingRefs;
    
    
    
    protected DataTypeMappingRefs dataTypeMappingRefs;
    
    
    
    protected ExclusiveAreas exclusiveAreas;
    
    
    
    protected ExclusiveAreaNestingOrders exclusiveAreaNestingOrders;
    
    
    
    protected StaticMemorys staticMemorys;
    
    
    
    protected ArTypedPerInstanceMemorys arTypedPerInstanceMemorys;
    
    
    
    protected Events events;
    
    
    
    protected ExplicitInterRunnableVariables explicitInterRunnableVariables;
    
    
    
    protected HandleTerminationAndRestartEnum handleTerminationAndRestart;
    
    
    
    protected ImplicitInterRunnableVariables implicitInterRunnableVariables;
    
    
    
    protected IncludedDataTypeSets includedDataTypeSets;
    
    
    
    protected IncludedModeDeclarationGroupSets includedModeDeclarationGroupSets;
    
    
    
    protected InstantiationDataDefPropss instantiationDataDefPropss;
    
    
    
    protected PerInstanceMemorys perInstanceMemorys;
    
    
    
    protected PerInstanceParameters perInstanceParameters;
    
    
    
    protected PortApiOptions portApiOptions;
    
    
    
    protected Runnables runnables;
    
    
    
    protected ServiceDependencys serviceDependencys;
    
    
    
    protected SharedParameters sharedParameters;
    
    
    
    protected Boolean supportsMultipleInstantiation;
    
    
    
    protected VariationPointProxys variationPointProxys;
    
    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME-FRAGMENTS")
    public ShortNameFragments getShortNameFragments() {
        return this.shortNameFragments;
    }

    public void setShortNameFragments(ShortNameFragments value) {
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
    
    
    
    @XmlElement(name="ANNOTATIONS")
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Annotations value) {
        this.annotations = value;
    }
    
    
    
    @XmlElement(name="CONSTANT-MEMORYS")
    public ConstantMemorys getConstantMemorys() {
        return this.constantMemorys;
    }

    public void setConstantMemorys(ConstantMemorys value) {
        this.constantMemorys = value;
    }
    
    
    
    @XmlElement(name="CONSTANT-VALUE-MAPPING-REFS")
    public ConstantValueMappingRefs getConstantValueMappingRefs() {
        return this.constantValueMappingRefs;
    }

    public void setConstantValueMappingRefs(ConstantValueMappingRefs value) {
        this.constantValueMappingRefs = value;
    }
    
    
    
    @XmlElement(name="DATA-TYPE-MAPPING-REFS")
    public DataTypeMappingRefs getDataTypeMappingRefs() {
        return this.dataTypeMappingRefs;
    }

    public void setDataTypeMappingRefs(DataTypeMappingRefs value) {
        this.dataTypeMappingRefs = value;
    }
    
    
    
    @XmlElement(name="EXCLUSIVE-AREAS")
    public ExclusiveAreas getExclusiveAreas() {
        return this.exclusiveAreas;
    }

    public void setExclusiveAreas(ExclusiveAreas value) {
        this.exclusiveAreas = value;
    }
    
    
    
    @XmlElement(name="EXCLUSIVE-AREA-NESTING-ORDERS")
    public ExclusiveAreaNestingOrders getExclusiveAreaNestingOrders() {
        return this.exclusiveAreaNestingOrders;
    }

    public void setExclusiveAreaNestingOrders(ExclusiveAreaNestingOrders value) {
        this.exclusiveAreaNestingOrders = value;
    }
    
    
    
    @XmlElement(name="STATIC-MEMORYS")
    public StaticMemorys getStaticMemorys() {
        return this.staticMemorys;
    }

    public void setStaticMemorys(StaticMemorys value) {
        this.staticMemorys = value;
    }
    
    
    
    @XmlElement(name="AR-TYPED-PER-INSTANCE-MEMORYS")
    public ArTypedPerInstanceMemorys getArTypedPerInstanceMemorys() {
        return this.arTypedPerInstanceMemorys;
    }

    public void setArTypedPerInstanceMemorys(ArTypedPerInstanceMemorys value) {
        this.arTypedPerInstanceMemorys = value;
    }
    
    
    
    @XmlElement(name="EVENTS")
    public Events getEvents() {
        return this.events;
    }

    public void setEvents(Events value) {
        this.events = value;
    }
    
    
    
    @XmlElement(name="EXPLICIT-INTER-RUNNABLE-VARIABLES")
    public ExplicitInterRunnableVariables getExplicitInterRunnableVariables() {
        return this.explicitInterRunnableVariables;
    }

    public void setExplicitInterRunnableVariables(ExplicitInterRunnableVariables value) {
        this.explicitInterRunnableVariables = value;
    }
    
    
    
    @XmlElement(name="HANDLE-TERMINATION-AND-RESTART")
    public HandleTerminationAndRestartEnum getHandleTerminationAndRestart() {
        return this.handleTerminationAndRestart;
    }

    public void setHandleTerminationAndRestart(HandleTerminationAndRestartEnum value) {
        this.handleTerminationAndRestart = value;
    }
    
    
    
    @XmlElement(name="IMPLICIT-INTER-RUNNABLE-VARIABLES")
    public ImplicitInterRunnableVariables getImplicitInterRunnableVariables() {
        return this.implicitInterRunnableVariables;
    }

    public void setImplicitInterRunnableVariables(ImplicitInterRunnableVariables value) {
        this.implicitInterRunnableVariables = value;
    }
    
    
    
    @XmlElement(name="INCLUDED-DATA-TYPE-SETS")
    public IncludedDataTypeSets getIncludedDataTypeSets() {
        return this.includedDataTypeSets;
    }

    public void setIncludedDataTypeSets(IncludedDataTypeSets value) {
        this.includedDataTypeSets = value;
    }
    
    
    
    @XmlElement(name="INCLUDED-MODE-DECLARATION-GROUP-SETS")
    public IncludedModeDeclarationGroupSets getIncludedModeDeclarationGroupSets() {
        return this.includedModeDeclarationGroupSets;
    }

    public void setIncludedModeDeclarationGroupSets(IncludedModeDeclarationGroupSets value) {
        this.includedModeDeclarationGroupSets = value;
    }
    
    
    
    @XmlElement(name="INSTANTIATION-DATA-DEF-PROPSS")
    public InstantiationDataDefPropss getInstantiationDataDefPropss() {
        return this.instantiationDataDefPropss;
    }

    public void setInstantiationDataDefPropss(InstantiationDataDefPropss value) {
        this.instantiationDataDefPropss = value;
    }
    
    
    
    @XmlElement(name="PER-INSTANCE-MEMORYS")
    public PerInstanceMemorys getPerInstanceMemorys() {
        return this.perInstanceMemorys;
    }

    public void setPerInstanceMemorys(PerInstanceMemorys value) {
        this.perInstanceMemorys = value;
    }
    
    
    
    @XmlElement(name="PER-INSTANCE-PARAMETERS")
    public PerInstanceParameters getPerInstanceParameters() {
        return this.perInstanceParameters;
    }

    public void setPerInstanceParameters(PerInstanceParameters value) {
        this.perInstanceParameters = value;
    }
    
    
    
    @XmlElement(name="PORT-API-OPTIONS")
    public PortApiOptions getPortApiOptions() {
        return this.portApiOptions;
    }

    public void setPortApiOptions(PortApiOptions value) {
        this.portApiOptions = value;
    }
    
    
    
    @XmlElement(name="RUNNABLES")
    public Runnables getRunnables() {
        return this.runnables;
    }

    public void setRunnables(Runnables value) {
        this.runnables = value;
    }
    
    
    
    @XmlElement(name="SERVICE-DEPENDENCYS")
    public ServiceDependencys getServiceDependencys() {
        return this.serviceDependencys;
    }

    public void setServiceDependencys(ServiceDependencys value) {
        this.serviceDependencys = value;
    }
    
    
    
    @XmlElement(name="SHARED-PARAMETERS")
    public SharedParameters getSharedParameters() {
        return this.sharedParameters;
    }

    public void setSharedParameters(SharedParameters value) {
        this.sharedParameters = value;
    }
    
    
    
    @XmlElement(name="SUPPORTS-MULTIPLE-INSTANTIATION")
    public Boolean getSupportsMultipleInstantiation() {
        return this.supportsMultipleInstantiation;
    }

    public void setSupportsMultipleInstantiation(Boolean value) {
        this.supportsMultipleInstantiation = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT-PROXYS")
    public VariationPointProxys getVariationPointProxys() {
        return this.variationPointProxys;
    }

    public void setVariationPointProxys(VariationPointProxys value) {
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