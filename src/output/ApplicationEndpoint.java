package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ApplicationEndpoint {

    
    
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
    
    
    
    protected ConsumedServiceInstances consumedServiceInstances;
    
    
    
    protected DiscoveryTechnology discoveryTechnology;
    
    
    
    protected NetworkEndpointRef networkEndpointRef;
    
    
    
    protected PositiveInteger priority;
    
    
    
    protected ProvidedServiceInstances providedServiceInstances;
    
    
    
    protected RemotingTechnology remotingTechnology;
    
    
    
    protected SerializationTechnologyRef serializationTechnologyRef;
    
    
    
    protected TpConfiguration tpConfiguration;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONSUMED-SERVICE-INSTANCES")
    public ConsumedServiceInstances getConsumedServiceInstances() {
        return this.consumedServiceInstances;
    }

    public void setConsumedServiceInstances(ConsumedServiceInstances value) {
        this.consumedServiceInstances = value;
    }
    
    
    
    @XmlElement(name="DISCOVERY-TECHNOLOGY")
    public DiscoveryTechnology getDiscoveryTechnology() {
        return this.discoveryTechnology;
    }

    public void setDiscoveryTechnology(DiscoveryTechnology value) {
        this.discoveryTechnology = value;
    }
    
    
    
    @XmlElement(name="NETWORK-ENDPOINT-REF")
    public NetworkEndpointRef getNetworkEndpointRef() {
        return this.networkEndpointRef;
    }

    public void setNetworkEndpointRef(NetworkEndpointRef value) {
        this.networkEndpointRef = value;
    }
    
    
    
    @XmlElement(name="PRIORITY")
    public PositiveInteger getPriority() {
        return this.priority;
    }

    public void setPriority(PositiveInteger value) {
        this.priority = value;
    }
    
    
    
    @XmlElement(name="PROVIDED-SERVICE-INSTANCES")
    public ProvidedServiceInstances getProvidedServiceInstances() {
        return this.providedServiceInstances;
    }

    public void setProvidedServiceInstances(ProvidedServiceInstances value) {
        this.providedServiceInstances = value;
    }
    
    
    
    @XmlElement(name="REMOTING-TECHNOLOGY")
    public RemotingTechnology getRemotingTechnology() {
        return this.remotingTechnology;
    }

    public void setRemotingTechnology(RemotingTechnology value) {
        this.remotingTechnology = value;
    }
    
    
    
    @XmlElement(name="SERIALIZATION-TECHNOLOGY-REF")
    public SerializationTechnologyRef getSerializationTechnologyRef() {
        return this.serializationTechnologyRef;
    }

    public void setSerializationTechnologyRef(SerializationTechnologyRef value) {
        this.serializationTechnologyRef = value;
    }
    
    
    
    @XmlElement(name="TP-CONFIGURATION")
    public TpConfiguration getTpConfiguration() {
        return this.tpConfiguration;
    }

    public void setTpConfiguration(TpConfiguration value) {
        this.tpConfiguration = value;
    }
    
    
}