package stdgui.data.model.orimodel;
@XmlRootElement(name = "PR-PORT-PROTOTYPE")
public class PrPortPrototype {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ArrayList<Annotation> annotations;
    
    
    
    protected ArrayList<ClientServerAnnotation> clientServerAnnotations;
    
    
    
    protected DelegatedPortAnnotation delegatedPortAnnotation;
    
    
    
    protected ArrayList<IoHwAbstractionServerAnnotation> ioHwAbstractionServerAnnotations;
    
    
    
    protected ArrayList<ModePortAnnotation> modePortAnnotations;
    
    
    
    protected ArrayList<NvDataPortAnnotation> nvDataPortAnnotations;
    
    
    
    protected ArrayList<ParameterPortAnnotation> parameterPortAnnotations;
    
    
    
    protected SenderReceiverAnnotations senderReceiverAnnotations;
    
    
    
    protected ArrayList<TriggerPortAnnotation> triggerPortAnnotations;
    
    
    
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
    
    
    
    @XmlElementWrapper(name="SHORT-NAME-FRAGMENTS")
@XmlElement(name="SHORT-NAME-FRAGMENT")
    public ArrayList<ShortNameFragment> getShortNameFragments() {
    return this.shortNameFragments;
}

    public void setShortNameFragments(ArrayList<ShortNameFragment> value) {
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
    
    
    
    @XmlElementWrapper(name="ANNOTATIONS")
@XmlElement(name="ANNOTATION")
    public ArrayList<Annotation> getAnnotations() {
    return this.annotations;
}

    public void setAnnotations(ArrayList<Annotation> value) {
        this.annotations = value;
    }
    
    
    
    @XmlElementWrapper(name="CLIENT-SERVER-ANNOTATIONS")
@XmlElement(name="CLIENT-SERVER-ANNOTATION")
    public ArrayList<ClientServerAnnotation> getClientServerAnnotations() {
    return this.clientServerAnnotations;
}

    public void setClientServerAnnotations(ArrayList<ClientServerAnnotation> value) {
        this.clientServerAnnotations = value;
    }
    
    
    
    @XmlElement(name="DELEGATED-PORT-ANNOTATION")
    public DelegatedPortAnnotation getDelegatedPortAnnotation() {
    return this.delegatedPortAnnotation;
}

    public void setDelegatedPortAnnotation(DelegatedPortAnnotation value) {
        this.delegatedPortAnnotation = value;
    }
    
    
    
    @XmlElementWrapper(name="IO-HW-ABSTRACTION-SERVER-ANNOTATIONS")
@XmlElement(name="IO-HW-ABSTRACTION-SERVER-ANNOTATION")
    public ArrayList<IoHwAbstractionServerAnnotation> getIoHwAbstractionServerAnnotations() {
    return this.ioHwAbstractionServerAnnotations;
}

    public void setIoHwAbstractionServerAnnotations(ArrayList<IoHwAbstractionServerAnnotation> value) {
        this.ioHwAbstractionServerAnnotations = value;
    }
    
    
    
    @XmlElementWrapper(name="MODE-PORT-ANNOTATIONS")
@XmlElement(name="MODE-PORT-ANNOTATION")
    public ArrayList<ModePortAnnotation> getModePortAnnotations() {
    return this.modePortAnnotations;
}

    public void setModePortAnnotations(ArrayList<ModePortAnnotation> value) {
        this.modePortAnnotations = value;
    }
    
    
    
    @XmlElementWrapper(name="NV-DATA-PORT-ANNOTATIONS")
@XmlElement(name="NV-DATA-PORT-ANNOTATION")
    public ArrayList<NvDataPortAnnotation> getNvDataPortAnnotations() {
    return this.nvDataPortAnnotations;
}

    public void setNvDataPortAnnotations(ArrayList<NvDataPortAnnotation> value) {
        this.nvDataPortAnnotations = value;
    }
    
    
    
    @XmlElementWrapper(name="PARAMETER-PORT-ANNOTATIONS")
@XmlElement(name="PARAMETER-PORT-ANNOTATION")
    public ArrayList<ParameterPortAnnotation> getParameterPortAnnotations() {
    return this.parameterPortAnnotations;
}

    public void setParameterPortAnnotations(ArrayList<ParameterPortAnnotation> value) {
        this.parameterPortAnnotations = value;
    }
    
    
    
    @XmlElement(name="SENDER-RECEIVER-ANNOTATIONS")
    public SenderReceiverAnnotations getSenderReceiverAnnotations() {
    return this.senderReceiverAnnotations;
}

    public void setSenderReceiverAnnotations(SenderReceiverAnnotations value) {
        this.senderReceiverAnnotations = value;
    }
    
    
    
    @XmlElementWrapper(name="TRIGGER-PORT-ANNOTATIONS")
@XmlElement(name="TRIGGER-PORT-ANNOTATION")
    public ArrayList<TriggerPortAnnotation> getTriggerPortAnnotations() {
    return this.triggerPortAnnotations;
}

    public void setTriggerPortAnnotations(ArrayList<TriggerPortAnnotation> value) {
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