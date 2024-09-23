package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class GlobalTimeDomain {

    
    
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
    
    
    
    protected CommunicationClusterRefs communicationClusterRefs;
    
    
    
    protected PositiveInteger domainId;
    
    
    
    protected TimeValue followUpTimeoutValue;
    
    
    
    protected Gateways gateways;
    
    
    
    protected GlobalTimePduRef globalTimePduRef;
    
    
    
    protected Master master;
    
    
    
    protected OffsetTimeDomainRef offsetTimeDomainRef;
    
    
    
    protected Slaves slaves;
    
    
    
    protected SubDomainRefs subDomainRefs;
    
    
    
    protected TimeValue syncLossThreshold;
    
    
    
    protected TimeValue syncLossTimeout;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMMUNICATION-CLUSTER-REFS")
    public CommunicationClusterRefs getCommunicationClusterRefs() {
        return this.communicationClusterRefs;
    }

    public void setCommunicationClusterRefs(CommunicationClusterRefs value) {
        this.communicationClusterRefs = value;
    }
    
    
    
    @XmlElement(name="DOMAIN-ID")
    public PositiveInteger getDomainId() {
        return this.domainId;
    }

    public void setDomainId(PositiveInteger value) {
        this.domainId = value;
    }
    
    
    
    @XmlElement(name="FOLLOW-UP-TIMEOUT-VALUE")
    public TimeValue getFollowUpTimeoutValue() {
        return this.followUpTimeoutValue;
    }

    public void setFollowUpTimeoutValue(TimeValue value) {
        this.followUpTimeoutValue = value;
    }
    
    
    
    @XmlElement(name="GATEWAYS")
    public Gateways getGateways() {
        return this.gateways;
    }

    public void setGateways(Gateways value) {
        this.gateways = value;
    }
    
    
    
    @XmlElement(name="GLOBAL-TIME-PDU-REF")
    public GlobalTimePduRef getGlobalTimePduRef() {
        return this.globalTimePduRef;
    }

    public void setGlobalTimePduRef(GlobalTimePduRef value) {
        this.globalTimePduRef = value;
    }
    
    
    
    @XmlElement(name="MASTER")
    public Master getMaster() {
        return this.master;
    }

    public void setMaster(Master value) {
        this.master = value;
    }
    
    
    
    @XmlElement(name="OFFSET-TIME-DOMAIN-REF")
    public OffsetTimeDomainRef getOffsetTimeDomainRef() {
        return this.offsetTimeDomainRef;
    }

    public void setOffsetTimeDomainRef(OffsetTimeDomainRef value) {
        this.offsetTimeDomainRef = value;
    }
    
    
    
    @XmlElement(name="SLAVES")
    public Slaves getSlaves() {
        return this.slaves;
    }

    public void setSlaves(Slaves value) {
        this.slaves = value;
    }
    
    
    
    @XmlElement(name="SUB-DOMAIN-REFS")
    public SubDomainRefs getSubDomainRefs() {
        return this.subDomainRefs;
    }

    public void setSubDomainRefs(SubDomainRefs value) {
        this.subDomainRefs = value;
    }
    
    
    
    @XmlElement(name="SYNC-LOSS-THRESHOLD")
    public TimeValue getSyncLossThreshold() {
        return this.syncLossThreshold;
    }

    public void setSyncLossThreshold(TimeValue value) {
        this.syncLossThreshold = value;
    }
    
    
    
    @XmlElement(name="SYNC-LOSS-TIMEOUT")
    public TimeValue getSyncLossTimeout() {
        return this.syncLossTimeout;
    }

    public void setSyncLossTimeout(TimeValue value) {
        this.syncLossTimeout = value;
    }
    
    
}