package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class RunnableEntity {

    
    
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
    
    
    
    protected ActivationReasons activationReasons;
    
    
    
    protected CanEnterExclusiveAreaRefs canEnterExclusiveAreaRefs;
    
    
    
    protected ExclusiveAreaNestingOrderRefs exclusiveAreaNestingOrderRefs;
    
    
    
    protected TimeValue minimumStartInterval;
    
    
    
    protected ReentrancyLevelEnum reentrancyLevel;
    
    
    
    protected RunsInsideExclusiveAreaRefs runsInsideExclusiveAreaRefs;
    
    
    
    protected SwAddrMethodRef swAddrMethodRef;
    
    
    
    protected Arguments arguments;
    
    
    
    protected AsynchronousServerCallResultPoints asynchronousServerCallResultPoints;
    
    
    
    protected Boolean canBeInvokedConcurrently;
    
    
    
    protected DataReadAccesss dataReadAccesss;
    
    
    
    protected DataReceivePointByArguments dataReceivePointByArguments;
    
    
    
    protected DataReceivePointByValues dataReceivePointByValues;
    
    
    
    protected DataSendPoints dataSendPoints;
    
    
    
    protected DataWriteAccesss dataWriteAccesss;
    
    
    
    protected ExternalTriggeringPoints externalTriggeringPoints;
    
    
    
    protected InternalTriggeringPoints internalTriggeringPoints;
    
    
    
    protected ModeAccessPoints modeAccessPoints;
    
    
    
    protected ModeSwitchPoints modeSwitchPoints;
    
    
    
    protected ParameterAccesss parameterAccesss;
    
    
    
    protected ReadLocalVariables readLocalVariables;
    
    
    
    protected ServerCallPoints serverCallPoints;
    
    
    
    protected CIdentifier symbol;
    
    
    
    protected WaitPoints waitPoints;
    
    
    
    protected WrittenLocalVariables writtenLocalVariables;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="ACTIVATION-REASONS")
    public ActivationReasons getActivationReasons() {
        return this.activationReasons;
    }

    public void setActivationReasons(ActivationReasons value) {
        this.activationReasons = value;
    }
    
    
    
    @XmlElement(name="CAN-ENTER-EXCLUSIVE-AREA-REFS")
    public CanEnterExclusiveAreaRefs getCanEnterExclusiveAreaRefs() {
        return this.canEnterExclusiveAreaRefs;
    }

    public void setCanEnterExclusiveAreaRefs(CanEnterExclusiveAreaRefs value) {
        this.canEnterExclusiveAreaRefs = value;
    }
    
    
    
    @XmlElement(name="EXCLUSIVE-AREA-NESTING-ORDER-REFS")
    public ExclusiveAreaNestingOrderRefs getExclusiveAreaNestingOrderRefs() {
        return this.exclusiveAreaNestingOrderRefs;
    }

    public void setExclusiveAreaNestingOrderRefs(ExclusiveAreaNestingOrderRefs value) {
        this.exclusiveAreaNestingOrderRefs = value;
    }
    
    
    
    @XmlElement(name="MINIMUM-START-INTERVAL")
    public TimeValue getMinimumStartInterval() {
        return this.minimumStartInterval;
    }

    public void setMinimumStartInterval(TimeValue value) {
        this.minimumStartInterval = value;
    }
    
    
    
    @XmlElement(name="REENTRANCY-LEVEL")
    public ReentrancyLevelEnum getReentrancyLevel() {
        return this.reentrancyLevel;
    }

    public void setReentrancyLevel(ReentrancyLevelEnum value) {
        this.reentrancyLevel = value;
    }
    
    
    
    @XmlElement(name="RUNS-INSIDE-EXCLUSIVE-AREA-REFS")
    public RunsInsideExclusiveAreaRefs getRunsInsideExclusiveAreaRefs() {
        return this.runsInsideExclusiveAreaRefs;
    }

    public void setRunsInsideExclusiveAreaRefs(RunsInsideExclusiveAreaRefs value) {
        this.runsInsideExclusiveAreaRefs = value;
    }
    
    
    
    @XmlElement(name="SW-ADDR-METHOD-REF")
    public SwAddrMethodRef getSwAddrMethodRef() {
        return this.swAddrMethodRef;
    }

    public void setSwAddrMethodRef(SwAddrMethodRef value) {
        this.swAddrMethodRef = value;
    }
    
    
    
    @XmlElement(name="ARGUMENTS")
    public Arguments getArguments() {
        return this.arguments;
    }

    public void setArguments(Arguments value) {
        this.arguments = value;
    }
    
    
    
    @XmlElement(name="ASYNCHRONOUS-SERVER-CALL-RESULT-POINTS")
    public AsynchronousServerCallResultPoints getAsynchronousServerCallResultPoints() {
        return this.asynchronousServerCallResultPoints;
    }

    public void setAsynchronousServerCallResultPoints(AsynchronousServerCallResultPoints value) {
        this.asynchronousServerCallResultPoints = value;
    }
    
    
    
    @XmlElement(name="CAN-BE-INVOKED-CONCURRENTLY")
    public Boolean getCanBeInvokedConcurrently() {
        return this.canBeInvokedConcurrently;
    }

    public void setCanBeInvokedConcurrently(Boolean value) {
        this.canBeInvokedConcurrently = value;
    }
    
    
    
    @XmlElement(name="DATA-READ-ACCESSS")
    public DataReadAccesss getDataReadAccesss() {
        return this.dataReadAccesss;
    }

    public void setDataReadAccesss(DataReadAccesss value) {
        this.dataReadAccesss = value;
    }
    
    
    
    @XmlElement(name="DATA-RECEIVE-POINT-BY-ARGUMENTS")
    public DataReceivePointByArguments getDataReceivePointByArguments() {
        return this.dataReceivePointByArguments;
    }

    public void setDataReceivePointByArguments(DataReceivePointByArguments value) {
        this.dataReceivePointByArguments = value;
    }
    
    
    
    @XmlElement(name="DATA-RECEIVE-POINT-BY-VALUES")
    public DataReceivePointByValues getDataReceivePointByValues() {
        return this.dataReceivePointByValues;
    }

    public void setDataReceivePointByValues(DataReceivePointByValues value) {
        this.dataReceivePointByValues = value;
    }
    
    
    
    @XmlElement(name="DATA-SEND-POINTS")
    public DataSendPoints getDataSendPoints() {
        return this.dataSendPoints;
    }

    public void setDataSendPoints(DataSendPoints value) {
        this.dataSendPoints = value;
    }
    
    
    
    @XmlElement(name="DATA-WRITE-ACCESSS")
    public DataWriteAccesss getDataWriteAccesss() {
        return this.dataWriteAccesss;
    }

    public void setDataWriteAccesss(DataWriteAccesss value) {
        this.dataWriteAccesss = value;
    }
    
    
    
    @XmlElement(name="EXTERNAL-TRIGGERING-POINTS")
    public ExternalTriggeringPoints getExternalTriggeringPoints() {
        return this.externalTriggeringPoints;
    }

    public void setExternalTriggeringPoints(ExternalTriggeringPoints value) {
        this.externalTriggeringPoints = value;
    }
    
    
    
    @XmlElement(name="INTERNAL-TRIGGERING-POINTS")
    public InternalTriggeringPoints getInternalTriggeringPoints() {
        return this.internalTriggeringPoints;
    }

    public void setInternalTriggeringPoints(InternalTriggeringPoints value) {
        this.internalTriggeringPoints = value;
    }
    
    
    
    @XmlElement(name="MODE-ACCESS-POINTS")
    public ModeAccessPoints getModeAccessPoints() {
        return this.modeAccessPoints;
    }

    public void setModeAccessPoints(ModeAccessPoints value) {
        this.modeAccessPoints = value;
    }
    
    
    
    @XmlElement(name="MODE-SWITCH-POINTS")
    public ModeSwitchPoints getModeSwitchPoints() {
        return this.modeSwitchPoints;
    }

    public void setModeSwitchPoints(ModeSwitchPoints value) {
        this.modeSwitchPoints = value;
    }
    
    
    
    @XmlElement(name="PARAMETER-ACCESSS")
    public ParameterAccesss getParameterAccesss() {
        return this.parameterAccesss;
    }

    public void setParameterAccesss(ParameterAccesss value) {
        this.parameterAccesss = value;
    }
    
    
    
    @XmlElement(name="READ-LOCAL-VARIABLES")
    public ReadLocalVariables getReadLocalVariables() {
        return this.readLocalVariables;
    }

    public void setReadLocalVariables(ReadLocalVariables value) {
        this.readLocalVariables = value;
    }
    
    
    
    @XmlElement(name="SERVER-CALL-POINTS")
    public ServerCallPoints getServerCallPoints() {
        return this.serverCallPoints;
    }

    public void setServerCallPoints(ServerCallPoints value) {
        this.serverCallPoints = value;
    }
    
    
    
    @XmlElement(name="SYMBOL")
    public CIdentifier getSymbol() {
        return this.symbol;
    }

    public void setSymbol(CIdentifier value) {
        this.symbol = value;
    }
    
    
    
    @XmlElement(name="WAIT-POINTS")
    public WaitPoints getWaitPoints() {
        return this.waitPoints;
    }

    public void setWaitPoints(WaitPoints value) {
        this.waitPoints = value;
    }
    
    
    
    @XmlElement(name="WRITTEN-LOCAL-VARIABLES")
    public WrittenLocalVariables getWrittenLocalVariables() {
        return this.writtenLocalVariables;
    }

    public void setWrittenLocalVariables(WrittenLocalVariables value) {
        this.writtenLocalVariables = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}