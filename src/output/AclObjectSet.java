package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class AclObjectSet {

    
    
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
    
    
    
    protected AclObjectClasss aclObjectClasss;
    
    
    
    protected AclScopeEnum aclScope;
    
    
    
    protected CollectionRef collectionRef;
    
    
    
    protected DerivedFromBlueprintRefs derivedFromBlueprintRefs;
    
    
    
    protected EngineeringObjects engineeringObjects;
    
    
    
    protected ObjectDefinitionRefs objectDefinitionRefs;
    
    
    
    protected ObjectDefintionRefs objectDefintionRefs;
    
    
    
    protected ObjectRefs objectRefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="ACL-OBJECT-CLASSS")
    public AclObjectClasss getAclObjectClasss() {
        return this.aclObjectClasss;
    }

    public void setAclObjectClasss(AclObjectClasss value) {
        this.aclObjectClasss = value;
    }
    
    
    
    @XmlElement(name="ACL-SCOPE")
    public AclScopeEnum getAclScope() {
        return this.aclScope;
    }

    public void setAclScope(AclScopeEnum value) {
        this.aclScope = value;
    }
    
    
    
    @XmlElement(name="COLLECTION-REF")
    public CollectionRef getCollectionRef() {
        return this.collectionRef;
    }

    public void setCollectionRef(CollectionRef value) {
        this.collectionRef = value;
    }
    
    
    
    @XmlElement(name="DERIVED-FROM-BLUEPRINT-REFS")
    public DerivedFromBlueprintRefs getDerivedFromBlueprintRefs() {
        return this.derivedFromBlueprintRefs;
    }

    public void setDerivedFromBlueprintRefs(DerivedFromBlueprintRefs value) {
        this.derivedFromBlueprintRefs = value;
    }
    
    
    
    @XmlElement(name="ENGINEERING-OBJECTS")
    public EngineeringObjects getEngineeringObjects() {
        return this.engineeringObjects;
    }

    public void setEngineeringObjects(EngineeringObjects value) {
        this.engineeringObjects = value;
    }
    
    
    
    @XmlElement(name="OBJECT-DEFINITION-REFS")
    public ObjectDefinitionRefs getObjectDefinitionRefs() {
        return this.objectDefinitionRefs;
    }

    public void setObjectDefinitionRefs(ObjectDefinitionRefs value) {
        this.objectDefinitionRefs = value;
    }
    
    
    
    @XmlElement(name="OBJECT-DEFINTION-REFS")
    public ObjectDefintionRefs getObjectDefintionRefs() {
        return this.objectDefintionRefs;
    }

    public void setObjectDefintionRefs(ObjectDefintionRefs value) {
        this.objectDefintionRefs = value;
    }
    
    
    
    @XmlElement(name="OBJECT-REFS")
    public ObjectRefs getObjectRefs() {
        return this.objectRefs;
    }

    public void setObjectRefs(ObjectRefs value) {
        this.objectRefs = value;
    }
    
    
}