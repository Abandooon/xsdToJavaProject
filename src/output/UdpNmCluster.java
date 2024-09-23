package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class UdpNmCluster {

    
    
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
    
    
    
    protected Integer nmCbvPosition;
    
    
    
    protected Boolean nmChannelActive;
    
    
    
    protected TimeValue nmMessageTimeoutTime;
    
    
    
    protected TimeValue nmMsgCycleTime;
    
    
    
    protected TimeValue nmNetworkTimeout;
    
    
    
    protected Integer nmNidPosition;
    
    
    
    protected TimeValue nmRemoteSleepIndicationTime;
    
    
    
    protected TimeValue nmRepeatMessageTime;
    
    
    
    protected Integer nmUserDataLength;
    
    
    
    protected TimeValue nmWaitBusSleepTime;
    
    

    
    
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
    
    
    
    @XmlElement(name="NM-CBV-POSITION")
    public Integer getNmCbvPosition() {
        return this.nmCbvPosition;
    }

    public void setNmCbvPosition(Integer value) {
        this.nmCbvPosition = value;
    }
    
    
    
    @XmlElement(name="NM-CHANNEL-ACTIVE")
    public Boolean getNmChannelActive() {
        return this.nmChannelActive;
    }

    public void setNmChannelActive(Boolean value) {
        this.nmChannelActive = value;
    }
    
    
    
    @XmlElement(name="NM-MESSAGE-TIMEOUT-TIME")
    public TimeValue getNmMessageTimeoutTime() {
        return this.nmMessageTimeoutTime;
    }

    public void setNmMessageTimeoutTime(TimeValue value) {
        this.nmMessageTimeoutTime = value;
    }
    
    
    
    @XmlElement(name="NM-MSG-CYCLE-TIME")
    public TimeValue getNmMsgCycleTime() {
        return this.nmMsgCycleTime;
    }

    public void setNmMsgCycleTime(TimeValue value) {
        this.nmMsgCycleTime = value;
    }
    
    
    
    @XmlElement(name="NM-NETWORK-TIMEOUT")
    public TimeValue getNmNetworkTimeout() {
        return this.nmNetworkTimeout;
    }

    public void setNmNetworkTimeout(TimeValue value) {
        this.nmNetworkTimeout = value;
    }
    
    
    
    @XmlElement(name="NM-NID-POSITION")
    public Integer getNmNidPosition() {
        return this.nmNidPosition;
    }

    public void setNmNidPosition(Integer value) {
        this.nmNidPosition = value;
    }
    
    
    
    @XmlElement(name="NM-REMOTE-SLEEP-INDICATION-TIME")
    public TimeValue getNmRemoteSleepIndicationTime() {
        return this.nmRemoteSleepIndicationTime;
    }

    public void setNmRemoteSleepIndicationTime(TimeValue value) {
        this.nmRemoteSleepIndicationTime = value;
    }
    
    
    
    @XmlElement(name="NM-REPEAT-MESSAGE-TIME")
    public TimeValue getNmRepeatMessageTime() {
        return this.nmRepeatMessageTime;
    }

    public void setNmRepeatMessageTime(TimeValue value) {
        this.nmRepeatMessageTime = value;
    }
    
    
    
    @XmlElement(name="NM-USER-DATA-LENGTH")
    public Integer getNmUserDataLength() {
        return this.nmUserDataLength;
    }

    public void setNmUserDataLength(Integer value) {
        this.nmUserDataLength = value;
    }
    
    
    
    @XmlElement(name="NM-WAIT-BUS-SLEEP-TIME")
    public TimeValue getNmWaitBusSleepTime() {
        return this.nmWaitBusSleepTime;
    }

    public void setNmWaitBusSleepTime(TimeValue value) {
        this.nmWaitBusSleepTime = value;
    }
    
    
}