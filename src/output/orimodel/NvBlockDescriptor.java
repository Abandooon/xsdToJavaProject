package stdgui.data.model.orimodel;
@XmlRootElement(name = "NV-BLOCK-DESCRIPTOR")
public class NvBlockDescriptor {

    
    
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
    
    
    
    protected ArrayList<RoleBasedPortAssignment> clientServerPorts;
    
    
    
    protected ArrayList<ConstantValueMappingRef> constantValueMappingRefs;
    
    
    
    protected ArrayList<DataTypeMappingRef> dataTypeMappingRefs;
    
    
    
    protected ArrayList<InstantiationDataDefProps> instantiationDataDefPropss;
    
    
    
    protected ArrayList<NvBlockDataMapping> nvBlockDataMappings;
    
    
    
    protected NvBlockNeeds nvBlockNeeds;
    
    
    
    protected VariableDataPrototype ramBlock;
    
    
    
    protected ParameterDataPrototype romBlock;
    
    
    
    protected Boolean supportDirtyFlag;
    
    
    
    protected TimingEventRef timingEventRef;
    
    
    
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
    
    
    
    @XmlElementWrapper(name="CLIENT-SERVER-PORTS")
@XmlElement(name="ROLE-BASED-PORT-ASSIGNMENT")
    public ArrayList<RoleBasedPortAssignment> getClientServerPorts() {
    return this.clientServerPorts;
}

    public void setClientServerPorts(ArrayList<RoleBasedPortAssignment> value) {
        this.clientServerPorts = value;
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
    
    
    
    @XmlElementWrapper(name="INSTANTIATION-DATA-DEF-PROPSS")
@XmlElement(name="INSTANTIATION-DATA-DEF-PROPS")
    public ArrayList<InstantiationDataDefProps> getInstantiationDataDefPropss() {
    return this.instantiationDataDefPropss;
}

    public void setInstantiationDataDefPropss(ArrayList<InstantiationDataDefProps> value) {
        this.instantiationDataDefPropss = value;
    }
    
    
    
    @XmlElementWrapper(name="NV-BLOCK-DATA-MAPPINGS")
@XmlElement(name="NV-BLOCK-DATA-MAPPING")
    public ArrayList<NvBlockDataMapping> getNvBlockDataMappings() {
    return this.nvBlockDataMappings;
}

    public void setNvBlockDataMappings(ArrayList<NvBlockDataMapping> value) {
        this.nvBlockDataMappings = value;
    }
    
    
    
    @XmlElement(name="NV-BLOCK-NEEDS")
    public NvBlockNeeds getNvBlockNeeds() {
    return this.nvBlockNeeds;
}

    public void setNvBlockNeeds(NvBlockNeeds value) {
        this.nvBlockNeeds = value;
    }
    
    
    
    @XmlElement(name="RAM-BLOCK")
    public VariableDataPrototype getRamBlock() {
    return this.ramBlock;
}

    public void setRamBlock(VariableDataPrototype value) {
        this.ramBlock = value;
    }
    
    
    
    @XmlElement(name="ROM-BLOCK")
    public ParameterDataPrototype getRomBlock() {
    return this.romBlock;
}

    public void setRomBlock(ParameterDataPrototype value) {
        this.romBlock = value;
    }
    
    
    
    @XmlElement(name="SUPPORT-DIRTY-FLAG")
    public Boolean getSupportDirtyFlag() {
    return this.supportDirtyFlag;
}

    public void setSupportDirtyFlag(Boolean value) {
        this.supportDirtyFlag = value;
    }
    
    
    
    @XmlElement(name="TIMING-EVENT-REF")
    public TimingEventRef getTimingEventRef() {
    return this.timingEventRef;
}

    public void setTimingEventRef(TimingEventRef value) {
        this.timingEventRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}