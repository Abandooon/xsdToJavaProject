package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SystemMapping {

    
    
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
    
    
    
    protected DataMappings dataMappings;
    
    
    
    protected EcuResourceMappings ecuResourceMappings;
    
    
    
    protected MappingConstraints mappingConstraints;
    
    
    
    protected PncMappings pncMappings;
    
    
    
    protected ResourceEstimations resourceEstimations;
    
    
    
    protected SignalPathConstraints signalPathConstraints;
    
    
    
    protected SwImplMappings swImplMappings;
    
    
    
    protected SwMappings swMappings;
    
    
    
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
    
    
    
    @XmlElement(name="DATA-MAPPINGS")
    public DataMappings getDataMappings() {
        return this.dataMappings;
    }

    public void setDataMappings(DataMappings value) {
        this.dataMappings = value;
    }
    
    
    
    @XmlElement(name="ECU-RESOURCE-MAPPINGS")
    public EcuResourceMappings getEcuResourceMappings() {
        return this.ecuResourceMappings;
    }

    public void setEcuResourceMappings(EcuResourceMappings value) {
        this.ecuResourceMappings = value;
    }
    
    
    
    @XmlElement(name="MAPPING-CONSTRAINTS")
    public MappingConstraints getMappingConstraints() {
        return this.mappingConstraints;
    }

    public void setMappingConstraints(MappingConstraints value) {
        this.mappingConstraints = value;
    }
    
    
    
    @XmlElement(name="PNC-MAPPINGS")
    public PncMappings getPncMappings() {
        return this.pncMappings;
    }

    public void setPncMappings(PncMappings value) {
        this.pncMappings = value;
    }
    
    
    
    @XmlElement(name="RESOURCE-ESTIMATIONS")
    public ResourceEstimations getResourceEstimations() {
        return this.resourceEstimations;
    }

    public void setResourceEstimations(ResourceEstimations value) {
        this.resourceEstimations = value;
    }
    
    
    
    @XmlElement(name="SIGNAL-PATH-CONSTRAINTS")
    public SignalPathConstraints getSignalPathConstraints() {
        return this.signalPathConstraints;
    }

    public void setSignalPathConstraints(SignalPathConstraints value) {
        this.signalPathConstraints = value;
    }
    
    
    
    @XmlElement(name="SW-IMPL-MAPPINGS")
    public SwImplMappings getSwImplMappings() {
        return this.swImplMappings;
    }

    public void setSwImplMappings(SwImplMappings value) {
        this.swImplMappings = value;
    }
    
    
    
    @XmlElement(name="SW-MAPPINGS")
    public SwMappings getSwMappings() {
        return this.swMappings;
    }

    public void setSwMappings(SwMappings value) {
        this.swMappings = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}