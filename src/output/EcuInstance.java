package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EcuInstance {

    
    
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
    
    
    
    protected AssociatedComIPduGroupRefs associatedComIPduGroupRefs;
    
    
    
    protected AssociatedPdurIPduGroupRefs associatedPdurIPduGroupRefs;
    
    
    
    protected CanTpAddressRefs canTpAddressRefs;
    
    
    
    protected ClientIdRange clientIdRange;
    
    
    
    protected TimeValue comConfigurationGwTimeBase;
    
    
    
    protected TimeValue comConfigurationRxTimeBase;
    
    
    
    protected TimeValue comConfigurationTxTimeBase;
    
    
    
    protected Boolean comEnableMdtForCyclicTransmission;
    
    
    
    protected CommControllers commControllers;
    
    
    
    protected Connectors connectors;
    
    
    
    protected Integer diagnosticAddress;
    
    
    
    protected DiagnosticEcuProps diagnosticProps;
    
    
    
    protected Partitions partitions;
    
    
    
    protected TimeValue pnResetTime;
    
    
    
    protected TimeValue pncPrepareSleepTimer;
    
    
    
    protected Boolean sleepModeSupported;
    
    
    
    protected TpAddressRefs tpAddressRefs;
    
    
    
    protected Boolean wakeUpOverBusSupported;
    
    

    
    
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
    
    
    
    @XmlElement(name="ASSOCIATED-COM-I-PDU-GROUP-REFS")
    public AssociatedComIPduGroupRefs getAssociatedComIPduGroupRefs() {
        return this.associatedComIPduGroupRefs;
    }

    public void setAssociatedComIPduGroupRefs(AssociatedComIPduGroupRefs value) {
        this.associatedComIPduGroupRefs = value;
    }
    
    
    
    @XmlElement(name="ASSOCIATED-PDUR-I-PDU-GROUP-REFS")
    public AssociatedPdurIPduGroupRefs getAssociatedPdurIPduGroupRefs() {
        return this.associatedPdurIPduGroupRefs;
    }

    public void setAssociatedPdurIPduGroupRefs(AssociatedPdurIPduGroupRefs value) {
        this.associatedPdurIPduGroupRefs = value;
    }
    
    
    
    @XmlElement(name="CAN-TP-ADDRESS-REFS")
    public CanTpAddressRefs getCanTpAddressRefs() {
        return this.canTpAddressRefs;
    }

    public void setCanTpAddressRefs(CanTpAddressRefs value) {
        this.canTpAddressRefs = value;
    }
    
    
    
    @XmlElement(name="CLIENT-ID-RANGE")
    public ClientIdRange getClientIdRange() {
        return this.clientIdRange;
    }

    public void setClientIdRange(ClientIdRange value) {
        this.clientIdRange = value;
    }
    
    
    
    @XmlElement(name="COM-CONFIGURATION-GW-TIME-BASE")
    public TimeValue getComConfigurationGwTimeBase() {
        return this.comConfigurationGwTimeBase;
    }

    public void setComConfigurationGwTimeBase(TimeValue value) {
        this.comConfigurationGwTimeBase = value;
    }
    
    
    
    @XmlElement(name="COM-CONFIGURATION-RX-TIME-BASE")
    public TimeValue getComConfigurationRxTimeBase() {
        return this.comConfigurationRxTimeBase;
    }

    public void setComConfigurationRxTimeBase(TimeValue value) {
        this.comConfigurationRxTimeBase = value;
    }
    
    
    
    @XmlElement(name="COM-CONFIGURATION-TX-TIME-BASE")
    public TimeValue getComConfigurationTxTimeBase() {
        return this.comConfigurationTxTimeBase;
    }

    public void setComConfigurationTxTimeBase(TimeValue value) {
        this.comConfigurationTxTimeBase = value;
    }
    
    
    
    @XmlElement(name="COM-ENABLE-MDT-FOR-CYCLIC-TRANSMISSION")
    public Boolean getComEnableMdtForCyclicTransmission() {
        return this.comEnableMdtForCyclicTransmission;
    }

    public void setComEnableMdtForCyclicTransmission(Boolean value) {
        this.comEnableMdtForCyclicTransmission = value;
    }
    
    
    
    @XmlElement(name="COMM-CONTROLLERS")
    public CommControllers getCommControllers() {
        return this.commControllers;
    }

    public void setCommControllers(CommControllers value) {
        this.commControllers = value;
    }
    
    
    
    @XmlElement(name="CONNECTORS")
    public Connectors getConnectors() {
        return this.connectors;
    }

    public void setConnectors(Connectors value) {
        this.connectors = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-ADDRESS")
    public Integer getDiagnosticAddress() {
        return this.diagnosticAddress;
    }

    public void setDiagnosticAddress(Integer value) {
        this.diagnosticAddress = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-PROPS")
    public DiagnosticEcuProps getDiagnosticProps() {
        return this.diagnosticProps;
    }

    public void setDiagnosticProps(DiagnosticEcuProps value) {
        this.diagnosticProps = value;
    }
    
    
    
    @XmlElement(name="PARTITIONS")
    public Partitions getPartitions() {
        return this.partitions;
    }

    public void setPartitions(Partitions value) {
        this.partitions = value;
    }
    
    
    
    @XmlElement(name="PN-RESET-TIME")
    public TimeValue getPnResetTime() {
        return this.pnResetTime;
    }

    public void setPnResetTime(TimeValue value) {
        this.pnResetTime = value;
    }
    
    
    
    @XmlElement(name="PNC-PREPARE-SLEEP-TIMER")
    public TimeValue getPncPrepareSleepTimer() {
        return this.pncPrepareSleepTimer;
    }

    public void setPncPrepareSleepTimer(TimeValue value) {
        this.pncPrepareSleepTimer = value;
    }
    
    
    
    @XmlElement(name="SLEEP-MODE-SUPPORTED")
    public Boolean getSleepModeSupported() {
        return this.sleepModeSupported;
    }

    public void setSleepModeSupported(Boolean value) {
        this.sleepModeSupported = value;
    }
    
    
    
    @XmlElement(name="TP-ADDRESS-REFS")
    public TpAddressRefs getTpAddressRefs() {
        return this.tpAddressRefs;
    }

    public void setTpAddressRefs(TpAddressRefs value) {
        this.tpAddressRefs = value;
    }
    
    
    
    @XmlElement(name="WAKE-UP-OVER-BUS-SUPPORTED")
    public Boolean getWakeUpOverBusSupported() {
        return this.wakeUpOverBusSupported;
    }

    public void setWakeUpOverBusSupported(Boolean value) {
        this.wakeUpOverBusSupported = value;
    }
    
    
}