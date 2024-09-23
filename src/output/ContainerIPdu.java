package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ContainerIPdu {

    
    
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
    
    
    
    protected Integer length;
    
    
    
    protected PositiveInteger metaDataLength;
    
    
    
    protected ContainedIPduProps containedIPduProps;
    
    
    
    protected ContainedPduTriggeringRefs containedPduTriggeringRefs;
    
    
    
    protected TimeValue containerTimeout;
    
    
    
    protected ContainerIPduTriggerEnum containerTrigger;
    
    
    
    protected ContainerIPduHeaderTypeEnum headerType;
    
    
    
    protected RxAcceptContainedIPduEnum rxAcceptContainedIPdu;
    
    
    
    protected PositiveInteger thresholdSize;
    
    

    
    
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
    
    
    
    @XmlElement(name="LENGTH")
    public Integer getLength() {
        return this.length;
    }

    public void setLength(Integer value) {
        this.length = value;
    }
    
    
    
    @XmlElement(name="META-DATA-LENGTH")
    public PositiveInteger getMetaDataLength() {
        return this.metaDataLength;
    }

    public void setMetaDataLength(PositiveInteger value) {
        this.metaDataLength = value;
    }
    
    
    
    @XmlElement(name="CONTAINED-I-PDU-PROPS")
    public ContainedIPduProps getContainedIPduProps() {
        return this.containedIPduProps;
    }

    public void setContainedIPduProps(ContainedIPduProps value) {
        this.containedIPduProps = value;
    }
    
    
    
    @XmlElement(name="CONTAINED-PDU-TRIGGERING-REFS")
    public ContainedPduTriggeringRefs getContainedPduTriggeringRefs() {
        return this.containedPduTriggeringRefs;
    }

    public void setContainedPduTriggeringRefs(ContainedPduTriggeringRefs value) {
        this.containedPduTriggeringRefs = value;
    }
    
    
    
    @XmlElement(name="CONTAINER-TIMEOUT")
    public TimeValue getContainerTimeout() {
        return this.containerTimeout;
    }

    public void setContainerTimeout(TimeValue value) {
        this.containerTimeout = value;
    }
    
    
    
    @XmlElement(name="CONTAINER-TRIGGER")
    public ContainerIPduTriggerEnum getContainerTrigger() {
        return this.containerTrigger;
    }

    public void setContainerTrigger(ContainerIPduTriggerEnum value) {
        this.containerTrigger = value;
    }
    
    
    
    @XmlElement(name="HEADER-TYPE")
    public ContainerIPduHeaderTypeEnum getHeaderType() {
        return this.headerType;
    }

    public void setHeaderType(ContainerIPduHeaderTypeEnum value) {
        this.headerType = value;
    }
    
    
    
    @XmlElement(name="RX-ACCEPT-CONTAINED-I-PDU")
    public RxAcceptContainedIPduEnum getRxAcceptContainedIPdu() {
        return this.rxAcceptContainedIPdu;
    }

    public void setRxAcceptContainedIPdu(RxAcceptContainedIPduEnum value) {
        this.rxAcceptContainedIPdu = value;
    }
    
    
    
    @XmlElement(name="THRESHOLD-SIZE")
    public PositiveInteger getThresholdSize() {
        return this.thresholdSize;
    }

    public void setThresholdSize(PositiveInteger value) {
        this.thresholdSize = value;
    }
    
    
}