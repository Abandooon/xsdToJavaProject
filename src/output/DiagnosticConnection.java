package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DiagnosticConnection {

    
    
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
    
    
    
    protected FunctionalRequestRefs functionalRequestRefs;
    
    
    
    protected PeriodicResponseUudtRefs periodicResponseUudtRefs;
    
    
    
    protected PhysicalRequestRef physicalRequestRef;
    
    
    
    protected ResponseOnEventRef responseOnEventRef;
    
    
    
    protected ResponseRef responseRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="FUNCTIONAL-REQUEST-REFS")
    public FunctionalRequestRefs getFunctionalRequestRefs() {
        return this.functionalRequestRefs;
    }

    public void setFunctionalRequestRefs(FunctionalRequestRefs value) {
        this.functionalRequestRefs = value;
    }
    
    
    
    @XmlElement(name="PERIODIC-RESPONSE-UUDT-REFS")
    public PeriodicResponseUudtRefs getPeriodicResponseUudtRefs() {
        return this.periodicResponseUudtRefs;
    }

    public void setPeriodicResponseUudtRefs(PeriodicResponseUudtRefs value) {
        this.periodicResponseUudtRefs = value;
    }
    
    
    
    @XmlElement(name="PHYSICAL-REQUEST-REF")
    public PhysicalRequestRef getPhysicalRequestRef() {
        return this.physicalRequestRef;
    }

    public void setPhysicalRequestRef(PhysicalRequestRef value) {
        this.physicalRequestRef = value;
    }
    
    
    
    @XmlElement(name="RESPONSE-ON-EVENT-REF")
    public ResponseOnEventRef getResponseOnEventRef() {
        return this.responseOnEventRef;
    }

    public void setResponseOnEventRef(ResponseOnEventRef value) {
        this.responseOnEventRef = value;
    }
    
    
    
    @XmlElement(name="RESPONSE-REF")
    public ResponseRef getResponseRef() {
        return this.responseRef;
    }

    public void setResponseRef(ResponseRef value) {
        this.responseRef = value;
    }
    
    
}