package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SwcBswMapping {

    
    
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
    
    
    
    protected BswBehaviorRef bswBehaviorRef;
    
    
    
    protected RunnableMappings runnableMappings;
    
    
    
    protected SwcBehaviorRef swcBehaviorRef;
    
    
    
    protected SynchronizedModeGroups synchronizedModeGroups;
    
    
    
    protected SynchronizedTriggers synchronizedTriggers;
    
    

    
    
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
    
    
    
    @XmlElement(name="BSW-BEHAVIOR-REF")
    public BswBehaviorRef getBswBehaviorRef() {
        return this.bswBehaviorRef;
    }

    public void setBswBehaviorRef(BswBehaviorRef value) {
        this.bswBehaviorRef = value;
    }
    
    
    
    @XmlElement(name="RUNNABLE-MAPPINGS")
    public RunnableMappings getRunnableMappings() {
        return this.runnableMappings;
    }

    public void setRunnableMappings(RunnableMappings value) {
        this.runnableMappings = value;
    }
    
    
    
    @XmlElement(name="SWC-BEHAVIOR-REF")
    public SwcBehaviorRef getSwcBehaviorRef() {
        return this.swcBehaviorRef;
    }

    public void setSwcBehaviorRef(SwcBehaviorRef value) {
        this.swcBehaviorRef = value;
    }
    
    
    
    @XmlElement(name="SYNCHRONIZED-MODE-GROUPS")
    public SynchronizedModeGroups getSynchronizedModeGroups() {
        return this.synchronizedModeGroups;
    }

    public void setSynchronizedModeGroups(SynchronizedModeGroups value) {
        this.synchronizedModeGroups = value;
    }
    
    
    
    @XmlElement(name="SYNCHRONIZED-TRIGGERS")
    public SynchronizedTriggers getSynchronizedTriggers() {
        return this.synchronizedTriggers;
    }

    public void setSynchronizedTriggers(SynchronizedTriggers value) {
        this.synchronizedTriggers = value;
    }
    
    
}