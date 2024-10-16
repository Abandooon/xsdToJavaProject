package stdgui.data.model.orimodel;
@XmlRootElement(name = "FLEXRAY-COMMUNICATION-CONTROLLER-CONDITIONAL")
public class FlexrayCommunicationControllerConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean wakeUpByControllerSupported;
    
    
    
    protected Integer acceptedStartupRange;
    
    
    
    protected Boolean allowHaltDueToClock;
    
    
    
    protected Integer allowPassiveToActive;
    
    
    
    protected Integer clusterDriftDamping;
    
    
    
    protected Integer decodingCorrection;
    
    
    
    protected Integer delayCompensationA;
    
    
    
    protected Integer delayCompensationB;
    
    
    
    protected Integer externOffsetCorrection;
    
    
    
    protected Integer externRateCorrection;
    
    
    
    protected Boolean externalSync;
    
    
    
    protected Boolean fallBackInternal;
    
    
    
    protected ArrayList<FlexrayFifoConfiguration> flexrayFifos;
    
    
    
    protected PositiveInteger keySlotId;
    
    
    
    protected Boolean keySlotOnlyEnabled;
    
    
    
    protected Boolean keySlotUsedForStartUp;
    
    
    
    protected Boolean keySlotUsedForSync;
    
    
    
    protected Integer latestTx;
    
    
    
    protected Integer listenTimeout;
    
    
    
    protected Integer macroInitialOffsetA;
    
    
    
    protected Integer macroInitialOffsetB;
    
    
    
    protected Integer maximumDynamicPayloadLength;
    
    
    
    protected Integer microInitialOffsetA;
    
    
    
    protected Integer microInitialOffsetB;
    
    
    
    protected Integer microPerCycle;
    
    
    
    protected TimeValue microtickDuration;
    
    
    
    protected Boolean nmVectorEarlyUpdate;
    
    
    
    protected Integer offsetCorrectionOut;
    
    
    
    protected Integer rateCorrectionOut;
    
    
    
    protected Integer samplesPerMicrotick;
    
    
    
    protected PositiveInteger secondKeySlotId;
    
    
    
    protected Boolean twoKeySlotMode;
    
    
    
    protected Integer wakeUpPattern;
    
    
    
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
    
    
    
    @XmlElement(name="WAKE-UP-BY-CONTROLLER-SUPPORTED")
    public Boolean getWakeUpByControllerSupported() {
    return this.wakeUpByControllerSupported;
}

    public void setWakeUpByControllerSupported(Boolean value) {
        this.wakeUpByControllerSupported = value;
    }
    
    
    
    @XmlElement(name="ACCEPTED-STARTUP-RANGE")
    public Integer getAcceptedStartupRange() {
    return this.acceptedStartupRange;
}

    public void setAcceptedStartupRange(Integer value) {
        this.acceptedStartupRange = value;
    }
    
    
    
    @XmlElement(name="ALLOW-HALT-DUE-TO-CLOCK")
    public Boolean getAllowHaltDueToClock() {
    return this.allowHaltDueToClock;
}

    public void setAllowHaltDueToClock(Boolean value) {
        this.allowHaltDueToClock = value;
    }
    
    
    
    @XmlElement(name="ALLOW-PASSIVE-TO-ACTIVE")
    public Integer getAllowPassiveToActive() {
    return this.allowPassiveToActive;
}

    public void setAllowPassiveToActive(Integer value) {
        this.allowPassiveToActive = value;
    }
    
    
    
    @XmlElement(name="CLUSTER-DRIFT-DAMPING")
    public Integer getClusterDriftDamping() {
    return this.clusterDriftDamping;
}

    public void setClusterDriftDamping(Integer value) {
        this.clusterDriftDamping = value;
    }
    
    
    
    @XmlElement(name="DECODING-CORRECTION")
    public Integer getDecodingCorrection() {
    return this.decodingCorrection;
}

    public void setDecodingCorrection(Integer value) {
        this.decodingCorrection = value;
    }
    
    
    
    @XmlElement(name="DELAY-COMPENSATION-A")
    public Integer getDelayCompensationA() {
    return this.delayCompensationA;
}

    public void setDelayCompensationA(Integer value) {
        this.delayCompensationA = value;
    }
    
    
    
    @XmlElement(name="DELAY-COMPENSATION-B")
    public Integer getDelayCompensationB() {
    return this.delayCompensationB;
}

    public void setDelayCompensationB(Integer value) {
        this.delayCompensationB = value;
    }
    
    
    
    @XmlElement(name="EXTERN-OFFSET-CORRECTION")
    public Integer getExternOffsetCorrection() {
    return this.externOffsetCorrection;
}

    public void setExternOffsetCorrection(Integer value) {
        this.externOffsetCorrection = value;
    }
    
    
    
    @XmlElement(name="EXTERN-RATE-CORRECTION")
    public Integer getExternRateCorrection() {
    return this.externRateCorrection;
}

    public void setExternRateCorrection(Integer value) {
        this.externRateCorrection = value;
    }
    
    
    
    @XmlElement(name="EXTERNAL-SYNC")
    public Boolean getExternalSync() {
    return this.externalSync;
}

    public void setExternalSync(Boolean value) {
        this.externalSync = value;
    }
    
    
    
    @XmlElement(name="FALL-BACK-INTERNAL")
    public Boolean getFallBackInternal() {
    return this.fallBackInternal;
}

    public void setFallBackInternal(Boolean value) {
        this.fallBackInternal = value;
    }
    
    
    
    @XmlElementWrapper(name="FLEXRAY-FIFOS")
@XmlElement(name="FLEXRAY-FIFO-CONFIGURATION")
    public ArrayList<FlexrayFifoConfiguration> getFlexrayFifos() {
    return this.flexrayFifos;
}

    public void setFlexrayFifos(ArrayList<FlexrayFifoConfiguration> value) {
        this.flexrayFifos = value;
    }
    
    
    
    @XmlElement(name="KEY-SLOT-ID")
    public PositiveInteger getKeySlotId() {
    return this.keySlotId;
}

    public void setKeySlotId(PositiveInteger value) {
        this.keySlotId = value;
    }
    
    
    
    @XmlElement(name="KEY-SLOT-ONLY-ENABLED")
    public Boolean getKeySlotOnlyEnabled() {
    return this.keySlotOnlyEnabled;
}

    public void setKeySlotOnlyEnabled(Boolean value) {
        this.keySlotOnlyEnabled = value;
    }
    
    
    
    @XmlElement(name="KEY-SLOT-USED-FOR-START-UP")
    public Boolean getKeySlotUsedForStartUp() {
    return this.keySlotUsedForStartUp;
}

    public void setKeySlotUsedForStartUp(Boolean value) {
        this.keySlotUsedForStartUp = value;
    }
    
    
    
    @XmlElement(name="KEY-SLOT-USED-FOR-SYNC")
    public Boolean getKeySlotUsedForSync() {
    return this.keySlotUsedForSync;
}

    public void setKeySlotUsedForSync(Boolean value) {
        this.keySlotUsedForSync = value;
    }
    
    
    
    @XmlElement(name="LATEST-TX")
    public Integer getLatestTx() {
    return this.latestTx;
}

    public void setLatestTx(Integer value) {
        this.latestTx = value;
    }
    
    
    
    @XmlElement(name="LISTEN-TIMEOUT")
    public Integer getListenTimeout() {
    return this.listenTimeout;
}

    public void setListenTimeout(Integer value) {
        this.listenTimeout = value;
    }
    
    
    
    @XmlElement(name="MACRO-INITIAL-OFFSET-A")
    public Integer getMacroInitialOffsetA() {
    return this.macroInitialOffsetA;
}

    public void setMacroInitialOffsetA(Integer value) {
        this.macroInitialOffsetA = value;
    }
    
    
    
    @XmlElement(name="MACRO-INITIAL-OFFSET-B")
    public Integer getMacroInitialOffsetB() {
    return this.macroInitialOffsetB;
}

    public void setMacroInitialOffsetB(Integer value) {
        this.macroInitialOffsetB = value;
    }
    
    
    
    @XmlElement(name="MAXIMUM-DYNAMIC-PAYLOAD-LENGTH")
    public Integer getMaximumDynamicPayloadLength() {
    return this.maximumDynamicPayloadLength;
}

    public void setMaximumDynamicPayloadLength(Integer value) {
        this.maximumDynamicPayloadLength = value;
    }
    
    
    
    @XmlElement(name="MICRO-INITIAL-OFFSET-A")
    public Integer getMicroInitialOffsetA() {
    return this.microInitialOffsetA;
}

    public void setMicroInitialOffsetA(Integer value) {
        this.microInitialOffsetA = value;
    }
    
    
    
    @XmlElement(name="MICRO-INITIAL-OFFSET-B")
    public Integer getMicroInitialOffsetB() {
    return this.microInitialOffsetB;
}

    public void setMicroInitialOffsetB(Integer value) {
        this.microInitialOffsetB = value;
    }
    
    
    
    @XmlElement(name="MICRO-PER-CYCLE")
    public Integer getMicroPerCycle() {
    return this.microPerCycle;
}

    public void setMicroPerCycle(Integer value) {
        this.microPerCycle = value;
    }
    
    
    
    @XmlElement(name="MICROTICK-DURATION")
    public TimeValue getMicrotickDuration() {
    return this.microtickDuration;
}

    public void setMicrotickDuration(TimeValue value) {
        this.microtickDuration = value;
    }
    
    
    
    @XmlElement(name="NM-VECTOR-EARLY-UPDATE")
    public Boolean getNmVectorEarlyUpdate() {
    return this.nmVectorEarlyUpdate;
}

    public void setNmVectorEarlyUpdate(Boolean value) {
        this.nmVectorEarlyUpdate = value;
    }
    
    
    
    @XmlElement(name="OFFSET-CORRECTION-OUT")
    public Integer getOffsetCorrectionOut() {
    return this.offsetCorrectionOut;
}

    public void setOffsetCorrectionOut(Integer value) {
        this.offsetCorrectionOut = value;
    }
    
    
    
    @XmlElement(name="RATE-CORRECTION-OUT")
    public Integer getRateCorrectionOut() {
    return this.rateCorrectionOut;
}

    public void setRateCorrectionOut(Integer value) {
        this.rateCorrectionOut = value;
    }
    
    
    
    @XmlElement(name="SAMPLES-PER-MICROTICK")
    public Integer getSamplesPerMicrotick() {
    return this.samplesPerMicrotick;
}

    public void setSamplesPerMicrotick(Integer value) {
        this.samplesPerMicrotick = value;
    }
    
    
    
    @XmlElement(name="SECOND-KEY-SLOT-ID")
    public PositiveInteger getSecondKeySlotId() {
    return this.secondKeySlotId;
}

    public void setSecondKeySlotId(PositiveInteger value) {
        this.secondKeySlotId = value;
    }
    
    
    
    @XmlElement(name="TWO-KEY-SLOT-MODE")
    public Boolean getTwoKeySlotMode() {
    return this.twoKeySlotMode;
}

    public void setTwoKeySlotMode(Boolean value) {
        this.twoKeySlotMode = value;
    }
    
    
    
    @XmlElement(name="WAKE-UP-PATTERN")
    public Integer getWakeUpPattern() {
    return this.wakeUpPattern;
}

    public void setWakeUpPattern(Integer value) {
        this.wakeUpPattern = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}