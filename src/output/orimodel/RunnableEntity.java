package stdgui.data.model.orimodel;
@XmlRootElement(name = "RUNNABLE-ENTITY")
public class RunnableEntity {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ArrayList<Annotation> annotations;
    
    
    
    protected ArrayList<ExecutableEntityActivationReason> activationReasons;
    
    
    
    protected ArrayList<CanEnterExclusiveAreaRef> canEnterExclusiveAreaRefs;
    
    
    
    protected ArrayList<ExclusiveAreaNestingOrderRef> exclusiveAreaNestingOrderRefs;
    
    
    
    protected TimeValue minimumStartInterval;
    
    
    
    protected ReentrancyLevelEnum reentrancyLevel;
    
    
    
    protected ArrayList<RunsInsideExclusiveAreaRef> runsInsideExclusiveAreaRefs;
    
    
    
    protected SwAddrMethodRef swAddrMethodRef;
    
    
    
    protected ArrayList<RunnableEntityArgument> arguments;
    
    
    
    protected ArrayList<AsynchronousServerCallResultPoint> asynchronousServerCallResultPoints;
    
    
    
    protected Boolean canBeInvokedConcurrently;
    
    
    
    protected ArrayList<VariableAccess> dataReadAccesss;
    
    
    
    protected ArrayList<VariableAccess> dataReceivePointByArguments;
    
    
    
    protected ArrayList<VariableAccess> dataReceivePointByValues;
    
    
    
    protected ArrayList<VariableAccess> dataSendPoints;
    
    
    
    protected ArrayList<VariableAccess> dataWriteAccesss;
    
    
    
    protected ArrayList<ExternalTriggeringPoint> externalTriggeringPoints;
    
    
    
    protected ArrayList<InternalTriggeringPoint> internalTriggeringPoints;
    
    
    
    protected ArrayList<ModeAccessPoint> modeAccessPoints;
    
    
    
    protected ArrayList<ModeSwitchPoint> modeSwitchPoints;
    
    
    
    protected ArrayList<ParameterAccess> parameterAccesss;
    
    
    
    protected ArrayList<VariableAccess> readLocalVariables;
    
    
    
    protected ServerCallPoints serverCallPoints;
    
    
    
    protected CIdentifier symbol;
    
    
    
    protected ArrayList<WaitPoint> waitPoints;
    
    
    
    protected ArrayList<VariableAccess> writtenLocalVariables;
    
    
    
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
    
    
    
    @XmlElementWrapper(name="SHORT-NAME-FRAGMENTS")
@XmlElement(name="SHORT-NAME-FRAGMENT")
    public ArrayList<ShortNameFragment> getShortNameFragments() {
    return this.shortNameFragments;
}

    public void setShortNameFragments(ArrayList<ShortNameFragment> value) {
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
    
    
    
    @XmlElementWrapper(name="ANNOTATIONS")
@XmlElement(name="ANNOTATION")
    public ArrayList<Annotation> getAnnotations() {
    return this.annotations;
}

    public void setAnnotations(ArrayList<Annotation> value) {
        this.annotations = value;
    }
    
    
    
    @XmlElementWrapper(name="ACTIVATION-REASONS")
@XmlElement(name="EXECUTABLE-ENTITY-ACTIVATION-REASON")
    public ArrayList<ExecutableEntityActivationReason> getActivationReasons() {
    return this.activationReasons;
}

    public void setActivationReasons(ArrayList<ExecutableEntityActivationReason> value) {
        this.activationReasons = value;
    }
    
    
    
    @XmlElementWrapper(name="CAN-ENTER-EXCLUSIVE-AREA-REFS")
@XmlElement(name="CAN-ENTER-EXCLUSIVE-AREA-REF")
    public ArrayList<CanEnterExclusiveAreaRef> getCanEnterExclusiveAreaRefs() {
    return this.canEnterExclusiveAreaRefs;
}

    public void setCanEnterExclusiveAreaRefs(ArrayList<CanEnterExclusiveAreaRef> value) {
        this.canEnterExclusiveAreaRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="EXCLUSIVE-AREA-NESTING-ORDER-REFS")
@XmlElement(name="EXCLUSIVE-AREA-NESTING-ORDER-REF")
    public ArrayList<ExclusiveAreaNestingOrderRef> getExclusiveAreaNestingOrderRefs() {
    return this.exclusiveAreaNestingOrderRefs;
}

    public void setExclusiveAreaNestingOrderRefs(ArrayList<ExclusiveAreaNestingOrderRef> value) {
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
    
    
    
    @XmlElementWrapper(name="RUNS-INSIDE-EXCLUSIVE-AREA-REFS")
@XmlElement(name="RUNS-INSIDE-EXCLUSIVE-AREA-REF")
    public ArrayList<RunsInsideExclusiveAreaRef> getRunsInsideExclusiveAreaRefs() {
    return this.runsInsideExclusiveAreaRefs;
}

    public void setRunsInsideExclusiveAreaRefs(ArrayList<RunsInsideExclusiveAreaRef> value) {
        this.runsInsideExclusiveAreaRefs = value;
    }
    
    
    
    @XmlElement(name="SW-ADDR-METHOD-REF")
    public SwAddrMethodRef getSwAddrMethodRef() {
    return this.swAddrMethodRef;
}

    public void setSwAddrMethodRef(SwAddrMethodRef value) {
        this.swAddrMethodRef = value;
    }
    
    
    
    @XmlElementWrapper(name="ARGUMENTS")
@XmlElement(name="RUNNABLE-ENTITY-ARGUMENT")
    public ArrayList<RunnableEntityArgument> getArguments() {
    return this.arguments;
}

    public void setArguments(ArrayList<RunnableEntityArgument> value) {
        this.arguments = value;
    }
    
    
    
    @XmlElementWrapper(name="ASYNCHRONOUS-SERVER-CALL-RESULT-POINTS")
@XmlElement(name="ASYNCHRONOUS-SERVER-CALL-RESULT-POINT")
    public ArrayList<AsynchronousServerCallResultPoint> getAsynchronousServerCallResultPoints() {
    return this.asynchronousServerCallResultPoints;
}

    public void setAsynchronousServerCallResultPoints(ArrayList<AsynchronousServerCallResultPoint> value) {
        this.asynchronousServerCallResultPoints = value;
    }
    
    
    
    @XmlElement(name="CAN-BE-INVOKED-CONCURRENTLY")
    public Boolean getCanBeInvokedConcurrently() {
    return this.canBeInvokedConcurrently;
}

    public void setCanBeInvokedConcurrently(Boolean value) {
        this.canBeInvokedConcurrently = value;
    }
    
    
    
    @XmlElementWrapper(name="DATA-READ-ACCESSS")
@XmlElement(name="VARIABLE-ACCESS")
    public ArrayList<VariableAccess> getDataReadAccesss() {
    return this.dataReadAccesss;
}

    public void setDataReadAccesss(ArrayList<VariableAccess> value) {
        this.dataReadAccesss = value;
    }
    
    
    
    @XmlElementWrapper(name="DATA-RECEIVE-POINT-BY-ARGUMENTS")
@XmlElement(name="VARIABLE-ACCESS")
    public ArrayList<VariableAccess> getDataReceivePointByArguments() {
    return this.dataReceivePointByArguments;
}

    public void setDataReceivePointByArguments(ArrayList<VariableAccess> value) {
        this.dataReceivePointByArguments = value;
    }
    
    
    
    @XmlElementWrapper(name="DATA-RECEIVE-POINT-BY-VALUES")
@XmlElement(name="VARIABLE-ACCESS")
    public ArrayList<VariableAccess> getDataReceivePointByValues() {
    return this.dataReceivePointByValues;
}

    public void setDataReceivePointByValues(ArrayList<VariableAccess> value) {
        this.dataReceivePointByValues = value;
    }
    
    
    
    @XmlElementWrapper(name="DATA-SEND-POINTS")
@XmlElement(name="VARIABLE-ACCESS")
    public ArrayList<VariableAccess> getDataSendPoints() {
    return this.dataSendPoints;
}

    public void setDataSendPoints(ArrayList<VariableAccess> value) {
        this.dataSendPoints = value;
    }
    
    
    
    @XmlElementWrapper(name="DATA-WRITE-ACCESSS")
@XmlElement(name="VARIABLE-ACCESS")
    public ArrayList<VariableAccess> getDataWriteAccesss() {
    return this.dataWriteAccesss;
}

    public void setDataWriteAccesss(ArrayList<VariableAccess> value) {
        this.dataWriteAccesss = value;
    }
    
    
    
    @XmlElementWrapper(name="EXTERNAL-TRIGGERING-POINTS")
@XmlElement(name="EXTERNAL-TRIGGERING-POINT")
    public ArrayList<ExternalTriggeringPoint> getExternalTriggeringPoints() {
    return this.externalTriggeringPoints;
}

    public void setExternalTriggeringPoints(ArrayList<ExternalTriggeringPoint> value) {
        this.externalTriggeringPoints = value;
    }
    
    
    
    @XmlElementWrapper(name="INTERNAL-TRIGGERING-POINTS")
@XmlElement(name="INTERNAL-TRIGGERING-POINT")
    public ArrayList<InternalTriggeringPoint> getInternalTriggeringPoints() {
    return this.internalTriggeringPoints;
}

    public void setInternalTriggeringPoints(ArrayList<InternalTriggeringPoint> value) {
        this.internalTriggeringPoints = value;
    }
    
    
    
    @XmlElementWrapper(name="MODE-ACCESS-POINTS")
@XmlElement(name="MODE-ACCESS-POINT")
    public ArrayList<ModeAccessPoint> getModeAccessPoints() {
    return this.modeAccessPoints;
}

    public void setModeAccessPoints(ArrayList<ModeAccessPoint> value) {
        this.modeAccessPoints = value;
    }
    
    
    
    @XmlElementWrapper(name="MODE-SWITCH-POINTS")
@XmlElement(name="MODE-SWITCH-POINT")
    public ArrayList<ModeSwitchPoint> getModeSwitchPoints() {
    return this.modeSwitchPoints;
}

    public void setModeSwitchPoints(ArrayList<ModeSwitchPoint> value) {
        this.modeSwitchPoints = value;
    }
    
    
    
    @XmlElementWrapper(name="PARAMETER-ACCESSS")
@XmlElement(name="PARAMETER-ACCESS")
    public ArrayList<ParameterAccess> getParameterAccesss() {
    return this.parameterAccesss;
}

    public void setParameterAccesss(ArrayList<ParameterAccess> value) {
        this.parameterAccesss = value;
    }
    
    
    
    @XmlElementWrapper(name="READ-LOCAL-VARIABLES")
@XmlElement(name="VARIABLE-ACCESS")
    public ArrayList<VariableAccess> getReadLocalVariables() {
    return this.readLocalVariables;
}

    public void setReadLocalVariables(ArrayList<VariableAccess> value) {
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
    
    
    
    @XmlElementWrapper(name="WAIT-POINTS")
@XmlElement(name="WAIT-POINT")
    public ArrayList<WaitPoint> getWaitPoints() {
    return this.waitPoints;
}

    public void setWaitPoints(ArrayList<WaitPoint> value) {
        this.waitPoints = value;
    }
    
    
    
    @XmlElementWrapper(name="WRITTEN-LOCAL-VARIABLES")
@XmlElement(name="VARIABLE-ACCESS")
    public ArrayList<VariableAccess> getWrittenLocalVariables() {
    return this.writtenLocalVariables;
}

    public void setWrittenLocalVariables(ArrayList<VariableAccess> value) {
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