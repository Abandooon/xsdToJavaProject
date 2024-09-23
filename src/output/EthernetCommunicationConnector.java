package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EthernetCommunicationConnector {

    
    
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
    
    
    
    protected Boolean ipV6PathMtuEnabled;
    
    
    
    protected TimeValue ipV6PathMtuTimeout;
    
    
    
    protected PositiveInteger maximumTransmissionUnit;
    
    
    
    protected NetworkEndpointRefs networkEndpointRefs;
    
    
    
    protected PositiveUnlimitedInteger pncFilterDataMask;
    
    

    
    
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
    
    
    
    @XmlElement(name="IP-V-6-PATH-MTU-ENABLED")
    public Boolean getIpV6PathMtuEnabled() {
        return this.ipV6PathMtuEnabled;
    }

    public void setIpV6PathMtuEnabled(Boolean value) {
        this.ipV6PathMtuEnabled = value;
    }
    
    
    
    @XmlElement(name="IP-V-6-PATH-MTU-TIMEOUT")
    public TimeValue getIpV6PathMtuTimeout() {
        return this.ipV6PathMtuTimeout;
    }

    public void setIpV6PathMtuTimeout(TimeValue value) {
        this.ipV6PathMtuTimeout = value;
    }
    
    
    
    @XmlElement(name="MAXIMUM-TRANSMISSION-UNIT")
    public PositiveInteger getMaximumTransmissionUnit() {
        return this.maximumTransmissionUnit;
    }

    public void setMaximumTransmissionUnit(PositiveInteger value) {
        this.maximumTransmissionUnit = value;
    }
    
    
    
    @XmlElement(name="NETWORK-ENDPOINT-REFS")
    public NetworkEndpointRefs getNetworkEndpointRefs() {
        return this.networkEndpointRefs;
    }

    public void setNetworkEndpointRefs(NetworkEndpointRefs value) {
        this.networkEndpointRefs = value;
    }
    
    
    
    @XmlElement(name="PNC-FILTER-DATA-MASK")
    public PositiveUnlimitedInteger getPncFilterDataMask() {
        return this.pncFilterDataMask;
    }

    public void setPncFilterDataMask(PositiveUnlimitedInteger value) {
        this.pncFilterDataMask = value;
    }
    
    
}