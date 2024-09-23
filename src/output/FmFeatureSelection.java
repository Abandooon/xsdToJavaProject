package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FmFeatureSelection {

    
    
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
    
    
    
    protected FeatureRef featureRef;
    
    
    
    protected FmFeatureSelectionState state;
    
    
    
    protected BindingTimeEnum minimumSelectedBindingTime;
    
    
    
    protected BindingTimeEnum maximumSelectedBindingTime;
    
    
    
    protected AttributeValues attributeValues;
    
    

    
    
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
    
    
    
    @XmlElement(name="FEATURE-REF")
    public FeatureRef getFeatureRef() {
        return this.featureRef;
    }

    public void setFeatureRef(FeatureRef value) {
        this.featureRef = value;
    }
    
    
    
    @XmlElement(name="STATE")
    public FmFeatureSelectionState getState() {
        return this.state;
    }

    public void setState(FmFeatureSelectionState value) {
        this.state = value;
    }
    
    
    
    @XmlElement(name="MINIMUM-SELECTED-BINDING-TIME")
    public BindingTimeEnum getMinimumSelectedBindingTime() {
        return this.minimumSelectedBindingTime;
    }

    public void setMinimumSelectedBindingTime(BindingTimeEnum value) {
        this.minimumSelectedBindingTime = value;
    }
    
    
    
    @XmlElement(name="MAXIMUM-SELECTED-BINDING-TIME")
    public BindingTimeEnum getMaximumSelectedBindingTime() {
        return this.maximumSelectedBindingTime;
    }

    public void setMaximumSelectedBindingTime(BindingTimeEnum value) {
        this.maximumSelectedBindingTime = value;
    }
    
    
    
    @XmlElement(name="ATTRIBUTE-VALUES")
    public AttributeValues getAttributeValues() {
        return this.attributeValues;
    }

    public void setAttributeValues(AttributeValues value) {
        this.attributeValues = value;
    }
    
    
}