package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BswModuleDescription {

    
    
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
    
    
    
    protected PositiveInteger moduleId;
    
    
    
    protected BswModuleDocumentations bswModuleDocumentations;
    
    
    
    protected ProvidedEntrys providedEntrys;
    
    
    
    protected OutgoingCallbacks outgoingCallbacks;
    
    
    
    protected BswModuleDependencys bswModuleDependencys;
    
    
    
    protected ProvidedModeGroups providedModeGroups;
    
    
    
    protected RequiredModeGroups requiredModeGroups;
    
    
    
    protected ReleasedTriggers releasedTriggers;
    
    
    
    protected RequiredTriggers requiredTriggers;
    
    
    
    protected ProvidedClientServerEntrys providedClientServerEntrys;
    
    
    
    protected RequiredClientServerEntrys requiredClientServerEntrys;
    
    
    
    protected ProvidedDatas providedDatas;
    
    
    
    protected RequiredDatas requiredDatas;
    
    
    
    protected InternalBehaviors internalBehaviors;
    
    

    
    
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
    
    
    
    @XmlElement(name="MODULE-ID")
    public PositiveInteger getModuleId() {
        return this.moduleId;
    }

    public void setModuleId(PositiveInteger value) {
        this.moduleId = value;
    }
    
    
    
    @XmlElement(name="BSW-MODULE-DOCUMENTATIONS")
    public BswModuleDocumentations getBswModuleDocumentations() {
        return this.bswModuleDocumentations;
    }

    public void setBswModuleDocumentations(BswModuleDocumentations value) {
        this.bswModuleDocumentations = value;
    }
    
    
    
    @XmlElement(name="PROVIDED-ENTRYS")
    public ProvidedEntrys getProvidedEntrys() {
        return this.providedEntrys;
    }

    public void setProvidedEntrys(ProvidedEntrys value) {
        this.providedEntrys = value;
    }
    
    
    
    @XmlElement(name="OUTGOING-CALLBACKS")
    public OutgoingCallbacks getOutgoingCallbacks() {
        return this.outgoingCallbacks;
    }

    public void setOutgoingCallbacks(OutgoingCallbacks value) {
        this.outgoingCallbacks = value;
    }
    
    
    
    @XmlElement(name="BSW-MODULE-DEPENDENCYS")
    public BswModuleDependencys getBswModuleDependencys() {
        return this.bswModuleDependencys;
    }

    public void setBswModuleDependencys(BswModuleDependencys value) {
        this.bswModuleDependencys = value;
    }
    
    
    
    @XmlElement(name="PROVIDED-MODE-GROUPS")
    public ProvidedModeGroups getProvidedModeGroups() {
        return this.providedModeGroups;
    }

    public void setProvidedModeGroups(ProvidedModeGroups value) {
        this.providedModeGroups = value;
    }
    
    
    
    @XmlElement(name="REQUIRED-MODE-GROUPS")
    public RequiredModeGroups getRequiredModeGroups() {
        return this.requiredModeGroups;
    }

    public void setRequiredModeGroups(RequiredModeGroups value) {
        this.requiredModeGroups = value;
    }
    
    
    
    @XmlElement(name="RELEASED-TRIGGERS")
    public ReleasedTriggers getReleasedTriggers() {
        return this.releasedTriggers;
    }

    public void setReleasedTriggers(ReleasedTriggers value) {
        this.releasedTriggers = value;
    }
    
    
    
    @XmlElement(name="REQUIRED-TRIGGERS")
    public RequiredTriggers getRequiredTriggers() {
        return this.requiredTriggers;
    }

    public void setRequiredTriggers(RequiredTriggers value) {
        this.requiredTriggers = value;
    }
    
    
    
    @XmlElement(name="PROVIDED-CLIENT-SERVER-ENTRYS")
    public ProvidedClientServerEntrys getProvidedClientServerEntrys() {
        return this.providedClientServerEntrys;
    }

    public void setProvidedClientServerEntrys(ProvidedClientServerEntrys value) {
        this.providedClientServerEntrys = value;
    }
    
    
    
    @XmlElement(name="REQUIRED-CLIENT-SERVER-ENTRYS")
    public RequiredClientServerEntrys getRequiredClientServerEntrys() {
        return this.requiredClientServerEntrys;
    }

    public void setRequiredClientServerEntrys(RequiredClientServerEntrys value) {
        this.requiredClientServerEntrys = value;
    }
    
    
    
    @XmlElement(name="PROVIDED-DATAS")
    public ProvidedDatas getProvidedDatas() {
        return this.providedDatas;
    }

    public void setProvidedDatas(ProvidedDatas value) {
        this.providedDatas = value;
    }
    
    
    
    @XmlElement(name="REQUIRED-DATAS")
    public RequiredDatas getRequiredDatas() {
        return this.requiredDatas;
    }

    public void setRequiredDatas(RequiredDatas value) {
        this.requiredDatas = value;
    }
    
    
    
    @XmlElement(name="INTERNAL-BEHAVIORS")
    public InternalBehaviors getInternalBehaviors() {
        return this.internalBehaviors;
    }

    public void setInternalBehaviors(InternalBehaviors value) {
        this.internalBehaviors = value;
    }
    
    
}