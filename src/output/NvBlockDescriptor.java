package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class NvBlockDescriptor {

    
    
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
    
    
    
    protected ClientServerPorts clientServerPorts;
    
    
    
    protected ConstantValueMappingRefs constantValueMappingRefs;
    
    
    
    protected DataTypeMappingRefs dataTypeMappingRefs;
    
    
    
    protected InstantiationDataDefPropss instantiationDataDefPropss;
    
    
    
    protected NvBlockDataMappings nvBlockDataMappings;
    
    
    
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
    
    
    
    @XmlElement(name="CLIENT-SERVER-PORTS")
    public ClientServerPorts getClientServerPorts() {
        return this.clientServerPorts;
    }

    public void setClientServerPorts(ClientServerPorts value) {
        this.clientServerPorts = value;
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
    
    
    
    @XmlElement(name="INSTANTIATION-DATA-DEF-PROPSS")
    public InstantiationDataDefPropss getInstantiationDataDefPropss() {
        return this.instantiationDataDefPropss;
    }

    public void setInstantiationDataDefPropss(InstantiationDataDefPropss value) {
        this.instantiationDataDefPropss = value;
    }
    
    
    
    @XmlElement(name="NV-BLOCK-DATA-MAPPINGS")
    public NvBlockDataMappings getNvBlockDataMappings() {
        return this.nvBlockDataMappings;
    }

    public void setNvBlockDataMappings(NvBlockDataMappings value) {
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