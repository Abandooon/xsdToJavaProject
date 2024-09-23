package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BuildAction {

    
    
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
    
    
    
    protected BlueprintPolicys blueprintPolicys;
    
    
    
    protected String shortNamePattern;
    
    
    
    protected DeliveryArtifacts deliveryArtifacts;
    
    
    
    protected BuildActionInvocator invocation;
    
    
    
    protected PredecessorActionRefs predecessorActionRefs;
    
    
    
    protected FollowUpActionRefs followUpActionRefs;
    
    
    
    protected CreatedDatas createdDatas;
    
    
    
    protected InputDatas inputDatas;
    
    
    
    protected ModifiedDatas modifiedDatas;
    
    
    
    protected RequiredEnvironmentRef requiredEnvironmentRef;
    
    
    
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
    
    
    
    @XmlElement(name="DELIVERY-ARTIFACTS")
    public DeliveryArtifacts getDeliveryArtifacts() {
        return this.deliveryArtifacts;
    }

    public void setDeliveryArtifacts(DeliveryArtifacts value) {
        this.deliveryArtifacts = value;
    }
    
    
    
    @XmlElement(name="INVOCATION")
    public BuildActionInvocator getInvocation() {
        return this.invocation;
    }

    public void setInvocation(BuildActionInvocator value) {
        this.invocation = value;
    }
    
    
    
    @XmlElement(name="PREDECESSOR-ACTION-REFS")
    public PredecessorActionRefs getPredecessorActionRefs() {
        return this.predecessorActionRefs;
    }

    public void setPredecessorActionRefs(PredecessorActionRefs value) {
        this.predecessorActionRefs = value;
    }
    
    
    
    @XmlElement(name="FOLLOW-UP-ACTION-REFS")
    public FollowUpActionRefs getFollowUpActionRefs() {
        return this.followUpActionRefs;
    }

    public void setFollowUpActionRefs(FollowUpActionRefs value) {
        this.followUpActionRefs = value;
    }
    
    
    
    @XmlElement(name="CREATED-DATAS")
    public CreatedDatas getCreatedDatas() {
        return this.createdDatas;
    }

    public void setCreatedDatas(CreatedDatas value) {
        this.createdDatas = value;
    }
    
    
    
    @XmlElement(name="INPUT-DATAS")
    public InputDatas getInputDatas() {
        return this.inputDatas;
    }

    public void setInputDatas(InputDatas value) {
        this.inputDatas = value;
    }
    
    
    
    @XmlElement(name="MODIFIED-DATAS")
    public ModifiedDatas getModifiedDatas() {
        return this.modifiedDatas;
    }

    public void setModifiedDatas(ModifiedDatas value) {
        this.modifiedDatas = value;
    }
    
    
    
    @XmlElement(name="REQUIRED-ENVIRONMENT-REF")
    public RequiredEnvironmentRef getRequiredEnvironmentRef() {
        return this.requiredEnvironmentRef;
    }

    public void setRequiredEnvironmentRef(RequiredEnvironmentRef value) {
        this.requiredEnvironmentRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}