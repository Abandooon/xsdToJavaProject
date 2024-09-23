package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class PrPortPrototype {

    
    
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
    
    
    
    protected ClientServerAnnotations clientServerAnnotations;
    
    
    
    protected DelegatedPortAnnotation delegatedPortAnnotation;
    
    
    
    protected IoHwAbstractionServerAnnotations ioHwAbstractionServerAnnotations;
    
    
    
    protected ModePortAnnotations modePortAnnotations;
    
    
    
    protected NvDataPortAnnotations nvDataPortAnnotations;
    
    
    
    protected ParameterPortAnnotations parameterPortAnnotations;
    
    
    
    protected SenderReceiverAnnotations senderReceiverAnnotations;
    
    
    
    protected TriggerPortAnnotations triggerPortAnnotations;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ProvidedComSpecs providedComSpecs;
    
    
    
    protected RequiredComSpecs requiredComSpecs;
    
    
    
    protected ProvidedRequiredInterfaceTref providedRequiredInterfaceTref;
    
    

    
    
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
    
    
    
    @XmlElement(name="CLIENT-SERVER-ANNOTATIONS")
    public ClientServerAnnotations getClientServerAnnotations() {
        return this.clientServerAnnotations;
    }

    public void setClientServerAnnotations(ClientServerAnnotations value) {
        this.clientServerAnnotations = value;
    }
    
    
    
    @XmlElement(name="DELEGATED-PORT-ANNOTATION")
    public DelegatedPortAnnotation getDelegatedPortAnnotation() {
        return this.delegatedPortAnnotation;
    }

    public void setDelegatedPortAnnotation(DelegatedPortAnnotation value) {
        this.delegatedPortAnnotation = value;
    }
    
    
    
    @XmlElement(name="IO-HW-ABSTRACTION-SERVER-ANNOTATIONS")
    public IoHwAbstractionServerAnnotations getIoHwAbstractionServerAnnotations() {
        return this.ioHwAbstractionServerAnnotations;
    }

    public void setIoHwAbstractionServerAnnotations(IoHwAbstractionServerAnnotations value) {
        this.ioHwAbstractionServerAnnotations = value;
    }
    
    
    
    @XmlElement(name="MODE-PORT-ANNOTATIONS")
    public ModePortAnnotations getModePortAnnotations() {
        return this.modePortAnnotations;
    }

    public void setModePortAnnotations(ModePortAnnotations value) {
        this.modePortAnnotations = value;
    }
    
    
    
    @XmlElement(name="NV-DATA-PORT-ANNOTATIONS")
    public NvDataPortAnnotations getNvDataPortAnnotations() {
        return this.nvDataPortAnnotations;
    }

    public void setNvDataPortAnnotations(NvDataPortAnnotations value) {
        this.nvDataPortAnnotations = value;
    }
    
    
    
    @XmlElement(name="PARAMETER-PORT-ANNOTATIONS")
    public ParameterPortAnnotations getParameterPortAnnotations() {
        return this.parameterPortAnnotations;
    }

    public void setParameterPortAnnotations(ParameterPortAnnotations value) {
        this.parameterPortAnnotations = value;
    }
    
    
    
    @XmlElement(name="SENDER-RECEIVER-ANNOTATIONS")
    public SenderReceiverAnnotations getSenderReceiverAnnotations() {
        return this.senderReceiverAnnotations;
    }

    public void setSenderReceiverAnnotations(SenderReceiverAnnotations value) {
        this.senderReceiverAnnotations = value;
    }
    
    
    
    @XmlElement(name="TRIGGER-PORT-ANNOTATIONS")
    public TriggerPortAnnotations getTriggerPortAnnotations() {
        return this.triggerPortAnnotations;
    }

    public void setTriggerPortAnnotations(TriggerPortAnnotations value) {
        this.triggerPortAnnotations = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="PROVIDED-COM-SPECS")
    public ProvidedComSpecs getProvidedComSpecs() {
        return this.providedComSpecs;
    }

    public void setProvidedComSpecs(ProvidedComSpecs value) {
        this.providedComSpecs = value;
    }
    
    
    
    @XmlElement(name="REQUIRED-COM-SPECS")
    public RequiredComSpecs getRequiredComSpecs() {
        return this.requiredComSpecs;
    }

    public void setRequiredComSpecs(RequiredComSpecs value) {
        this.requiredComSpecs = value;
    }
    
    
    
    @XmlElement(name="PROVIDED-REQUIRED-INTERFACE-TREF")
    public ProvidedRequiredInterfaceTref getProvidedRequiredInterfaceTref() {
        return this.providedRequiredInterfaceTref;
    }

    public void setProvidedRequiredInterfaceTref(ProvidedRequiredInterfaceTref value) {
        this.providedRequiredInterfaceTref = value;
    }
    
    
}