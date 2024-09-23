package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FlexrayNmCluster {

    
    
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
    
    
    
    protected CommunicationClusterRef communicationClusterRef;
    
    
    
    protected PositiveInteger nmChannelId;
    
    
    
    protected Boolean nmChannelSleepMaster;
    
    
    
    protected NmNodes nmNodes;
    
    
    
    protected Boolean nmSynchronizingNetwork;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected PositiveInteger nmCarWakeUpBitPosition;
    
    
    
    protected Boolean nmCarWakeUpFilterEnabled;
    
    
    
    protected PositiveInteger nmCarWakeUpFilterNodeId;
    
    
    
    protected Boolean nmCarWakeUpRxEnabled;
    
    
    
    protected Boolean nmControlBitVectorActive;
    
    
    
    protected Integer nmDataCycle;
    
    
    
    protected Boolean nmDataEnabled;
    
    
    
    protected TimeValue nmDetectionLock;
    
    
    
    protected TimeValue nmMainFunctionPeriod;
    
    
    
    protected TimeValue nmMessageTimeoutTime;
    
    
    
    protected Integer nmReadySleepCount;
    
    
    
    protected TimeValue nmRemoteSleepIndicationTime;
    
    
    
    protected Boolean nmRepeatMessageBitActive;
    
    
    
    protected TimeValue nmRepeatMessageTime;
    
    
    
    protected Integer nmRepetitionCycle;
    
    
    
    protected Integer nmVotingCycle;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMMUNICATION-CLUSTER-REF")
    public CommunicationClusterRef getCommunicationClusterRef() {
        return this.communicationClusterRef;
    }

    public void setCommunicationClusterRef(CommunicationClusterRef value) {
        this.communicationClusterRef = value;
    }
    
    
    
    @XmlElement(name="NM-CHANNEL-ID")
    public PositiveInteger getNmChannelId() {
        return this.nmChannelId;
    }

    public void setNmChannelId(PositiveInteger value) {
        this.nmChannelId = value;
    }
    
    
    
    @XmlElement(name="NM-CHANNEL-SLEEP-MASTER")
    public Boolean getNmChannelSleepMaster() {
        return this.nmChannelSleepMaster;
    }

    public void setNmChannelSleepMaster(Boolean value) {
        this.nmChannelSleepMaster = value;
    }
    
    
    
    @XmlElement(name="NM-NODES")
    public NmNodes getNmNodes() {
        return this.nmNodes;
    }

    public void setNmNodes(NmNodes value) {
        this.nmNodes = value;
    }
    
    
    
    @XmlElement(name="NM-SYNCHRONIZING-NETWORK")
    public Boolean getNmSynchronizingNetwork() {
        return this.nmSynchronizingNetwork;
    }

    public void setNmSynchronizingNetwork(Boolean value) {
        this.nmSynchronizingNetwork = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="NM-CAR-WAKE-UP-BIT-POSITION")
    public PositiveInteger getNmCarWakeUpBitPosition() {
        return this.nmCarWakeUpBitPosition;
    }

    public void setNmCarWakeUpBitPosition(PositiveInteger value) {
        this.nmCarWakeUpBitPosition = value;
    }
    
    
    
    @XmlElement(name="NM-CAR-WAKE-UP-FILTER-ENABLED")
    public Boolean getNmCarWakeUpFilterEnabled() {
        return this.nmCarWakeUpFilterEnabled;
    }

    public void setNmCarWakeUpFilterEnabled(Boolean value) {
        this.nmCarWakeUpFilterEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-CAR-WAKE-UP-FILTER-NODE-ID")
    public PositiveInteger getNmCarWakeUpFilterNodeId() {
        return this.nmCarWakeUpFilterNodeId;
    }

    public void setNmCarWakeUpFilterNodeId(PositiveInteger value) {
        this.nmCarWakeUpFilterNodeId = value;
    }
    
    
    
    @XmlElement(name="NM-CAR-WAKE-UP-RX-ENABLED")
    public Boolean getNmCarWakeUpRxEnabled() {
        return this.nmCarWakeUpRxEnabled;
    }

    public void setNmCarWakeUpRxEnabled(Boolean value) {
        this.nmCarWakeUpRxEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-CONTROL-BIT-VECTOR-ACTIVE")
    public Boolean getNmControlBitVectorActive() {
        return this.nmControlBitVectorActive;
    }

    public void setNmControlBitVectorActive(Boolean value) {
        this.nmControlBitVectorActive = value;
    }
    
    
    
    @XmlElement(name="NM-DATA-CYCLE")
    public Integer getNmDataCycle() {
        return this.nmDataCycle;
    }

    public void setNmDataCycle(Integer value) {
        this.nmDataCycle = value;
    }
    
    
    
    @XmlElement(name="NM-DATA-ENABLED")
    public Boolean getNmDataEnabled() {
        return this.nmDataEnabled;
    }

    public void setNmDataEnabled(Boolean value) {
        this.nmDataEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-DETECTION-LOCK")
    public TimeValue getNmDetectionLock() {
        return this.nmDetectionLock;
    }

    public void setNmDetectionLock(TimeValue value) {
        this.nmDetectionLock = value;
    }
    
    
    
    @XmlElement(name="NM-MAIN-FUNCTION-PERIOD")
    public TimeValue getNmMainFunctionPeriod() {
        return this.nmMainFunctionPeriod;
    }

    public void setNmMainFunctionPeriod(TimeValue value) {
        this.nmMainFunctionPeriod = value;
    }
    
    
    
    @XmlElement(name="NM-MESSAGE-TIMEOUT-TIME")
    public TimeValue getNmMessageTimeoutTime() {
        return this.nmMessageTimeoutTime;
    }

    public void setNmMessageTimeoutTime(TimeValue value) {
        this.nmMessageTimeoutTime = value;
    }
    
    
    
    @XmlElement(name="NM-READY-SLEEP-COUNT")
    public Integer getNmReadySleepCount() {
        return this.nmReadySleepCount;
    }

    public void setNmReadySleepCount(Integer value) {
        this.nmReadySleepCount = value;
    }
    
    
    
    @XmlElement(name="NM-REMOTE-SLEEP-INDICATION-TIME")
    public TimeValue getNmRemoteSleepIndicationTime() {
        return this.nmRemoteSleepIndicationTime;
    }

    public void setNmRemoteSleepIndicationTime(TimeValue value) {
        this.nmRemoteSleepIndicationTime = value;
    }
    
    
    
    @XmlElement(name="NM-REPEAT-MESSAGE-BIT-ACTIVE")
    public Boolean getNmRepeatMessageBitActive() {
        return this.nmRepeatMessageBitActive;
    }

    public void setNmRepeatMessageBitActive(Boolean value) {
        this.nmRepeatMessageBitActive = value;
    }
    
    
    
    @XmlElement(name="NM-REPEAT-MESSAGE-TIME")
    public TimeValue getNmRepeatMessageTime() {
        return this.nmRepeatMessageTime;
    }

    public void setNmRepeatMessageTime(TimeValue value) {
        this.nmRepeatMessageTime = value;
    }
    
    
    
    @XmlElement(name="NM-REPETITION-CYCLE")
    public Integer getNmRepetitionCycle() {
        return this.nmRepetitionCycle;
    }

    public void setNmRepetitionCycle(Integer value) {
        this.nmRepetitionCycle = value;
    }
    
    
    
    @XmlElement(name="NM-VOTING-CYCLE")
    public Integer getNmVotingCycle() {
        return this.nmVotingCycle;
    }

    public void setNmVotingCycle(Integer value) {
        this.nmVotingCycle = value;
    }
    
    
}