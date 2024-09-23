package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class LinCommunicationConnector {

    
    
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
    
    
    
    protected CommControllerRef commControllerRef;
    
    
    
    protected EcuCommPortInstances ecuCommPortInstances;
    
    
    
    protected PncGatewayTypeEnum pncGatewayType;
    
    
    
    protected Integer initialNad;
    
    
    
    protected LinConfigurableFrames linConfigurableFrames;
    
    
    
    protected LinOrderedConfigurableFrames linOrderedConfigurableFrames;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMM-CONTROLLER-REF")
    public CommControllerRef getCommControllerRef() {
        return this.commControllerRef;
    }

    public void setCommControllerRef(CommControllerRef value) {
        this.commControllerRef = value;
    }
    
    
    
    @XmlElement(name="ECU-COMM-PORT-INSTANCES")
    public EcuCommPortInstances getEcuCommPortInstances() {
        return this.ecuCommPortInstances;
    }

    public void setEcuCommPortInstances(EcuCommPortInstances value) {
        this.ecuCommPortInstances = value;
    }
    
    
    
    @XmlElement(name="PNC-GATEWAY-TYPE")
    public PncGatewayTypeEnum getPncGatewayType() {
        return this.pncGatewayType;
    }

    public void setPncGatewayType(PncGatewayTypeEnum value) {
        this.pncGatewayType = value;
    }
    
    
    
    @XmlElement(name="INITIAL-NAD")
    public Integer getInitialNad() {
        return this.initialNad;
    }

    public void setInitialNad(Integer value) {
        this.initialNad = value;
    }
    
    
    
    @XmlElement(name="LIN-CONFIGURABLE-FRAMES")
    public LinConfigurableFrames getLinConfigurableFrames() {
        return this.linConfigurableFrames;
    }

    public void setLinConfigurableFrames(LinConfigurableFrames value) {
        this.linConfigurableFrames = value;
    }
    
    
    
    @XmlElement(name="LIN-ORDERED-CONFIGURABLE-FRAMES")
    public LinOrderedConfigurableFrames getLinOrderedConfigurableFrames() {
        return this.linOrderedConfigurableFrames;
    }

    public void setLinOrderedConfigurableFrames(LinOrderedConfigurableFrames value) {
        this.linOrderedConfigurableFrames = value;
    }
    
    
}