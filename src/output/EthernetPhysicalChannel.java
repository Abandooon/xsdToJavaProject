package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EthernetPhysicalChannel {

    
    
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
    
    
    
    protected CommConnectors commConnectors;
    
    
    
    protected FrameTriggerings frameTriggerings;
    
    
    
    protected ISignalTriggerings iSignalTriggerings;
    
    
    
    protected PduTriggerings pduTriggerings;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected NetworkEndpoints networkEndpoints;
    
    
    
    protected SoAdConfig soAdConfig;
    
    
    
    protected VlanConfig vlan;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMM-CONNECTORS")
    public CommConnectors getCommConnectors() {
        return this.commConnectors;
    }

    public void setCommConnectors(CommConnectors value) {
        this.commConnectors = value;
    }
    
    
    
    @XmlElement(name="FRAME-TRIGGERINGS")
    public FrameTriggerings getFrameTriggerings() {
        return this.frameTriggerings;
    }

    public void setFrameTriggerings(FrameTriggerings value) {
        this.frameTriggerings = value;
    }
    
    
    
    @XmlElement(name="I-SIGNAL-TRIGGERINGS")
    public ISignalTriggerings getISignalTriggerings() {
        return this.iSignalTriggerings;
    }

    public void setISignalTriggerings(ISignalTriggerings value) {
        this.iSignalTriggerings = value;
    }
    
    
    
    @XmlElement(name="PDU-TRIGGERINGS")
    public PduTriggerings getPduTriggerings() {
        return this.pduTriggerings;
    }

    public void setPduTriggerings(PduTriggerings value) {
        this.pduTriggerings = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="NETWORK-ENDPOINTS")
    public NetworkEndpoints getNetworkEndpoints() {
        return this.networkEndpoints;
    }

    public void setNetworkEndpoints(NetworkEndpoints value) {
        this.networkEndpoints = value;
    }
    
    
    
    @XmlElement(name="SO-AD-CONFIG")
    public SoAdConfig getSoAdConfig() {
        return this.soAdConfig;
    }

    public void setSoAdConfig(SoAdConfig value) {
        this.soAdConfig = value;
    }
    
    
    
    @XmlElement(name="VLAN")
    public VlanConfig getVlan() {
        return this.vlan;
    }

    public void setVlan(VlanConfig value) {
        this.vlan = value;
    }
    
    
}