package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class NvBlockSwComponentType {

    
    
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
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected BlueprintPolicys blueprintPolicys;
    
    
    
    protected String shortNamePattern;
    
    
    
    protected SwComponentDocumentations swComponentDocumentations;
    
    
    
    protected ConsistencyNeedss consistencyNeedss;
    
    
    
    protected Ports ports;
    
    
    
    protected PortGroups portGroups;
    
    
    
    protected UnitGroupRefs unitGroupRefs;
    
    
    
    protected InternalBehaviors internalBehaviors;
    
    
    
    protected SymbolProps symbolProps;
    
    
    
    protected NvBlockDescriptors nvBlockDescriptors;
    
    

    
    
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
    
    
    
    @XmlElement(name="SW-COMPONENT-DOCUMENTATIONS")
    public SwComponentDocumentations getSwComponentDocumentations() {
        return this.swComponentDocumentations;
    }

    public void setSwComponentDocumentations(SwComponentDocumentations value) {
        this.swComponentDocumentations = value;
    }
    
    
    
    @XmlElement(name="CONSISTENCY-NEEDSS")
    public ConsistencyNeedss getConsistencyNeedss() {
        return this.consistencyNeedss;
    }

    public void setConsistencyNeedss(ConsistencyNeedss value) {
        this.consistencyNeedss = value;
    }
    
    
    
    @XmlElement(name="PORTS")
    public Ports getPorts() {
        return this.ports;
    }

    public void setPorts(Ports value) {
        this.ports = value;
    }
    
    
    
    @XmlElement(name="PORT-GROUPS")
    public PortGroups getPortGroups() {
        return this.portGroups;
    }

    public void setPortGroups(PortGroups value) {
        this.portGroups = value;
    }
    
    
    
    @XmlElement(name="UNIT-GROUP-REFS")
    public UnitGroupRefs getUnitGroupRefs() {
        return this.unitGroupRefs;
    }

    public void setUnitGroupRefs(UnitGroupRefs value) {
        this.unitGroupRefs = value;
    }
    
    
    
    @XmlElement(name="INTERNAL-BEHAVIORS")
    public InternalBehaviors getInternalBehaviors() {
        return this.internalBehaviors;
    }

    public void setInternalBehaviors(InternalBehaviors value) {
        this.internalBehaviors = value;
    }
    
    
    
    @XmlElement(name="SYMBOL-PROPS")
    public SymbolProps getSymbolProps() {
        return this.symbolProps;
    }

    public void setSymbolProps(SymbolProps value) {
        this.symbolProps = value;
    }
    
    
    
    @XmlElement(name="NV-BLOCK-DESCRIPTORS")
    public NvBlockDescriptors getNvBlockDescriptors() {
        return this.nvBlockDescriptors;
    }

    public void setNvBlockDescriptors(NvBlockDescriptors value) {
        this.nvBlockDescriptors = value;
    }
    
    
}