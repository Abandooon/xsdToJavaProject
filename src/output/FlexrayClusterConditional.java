package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FlexrayClusterConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveUnlimitedInteger baudrate;
    
    
    
    protected PhysicalChannels physicalChannels;
    
    
    
    protected String protocolName;
    
    
    
    protected String protocolVersion;
    
    
    
    protected Integer speed;
    
    
    
    protected Integer actionPointOffset;
    
    
    
    protected TimeValue bit;
    
    
    
    protected Integer casRxLowMax;
    
    
    
    protected Integer coldStartAttempts;
    
    
    
    protected TimeValue cycle;
    
    
    
    protected Integer cycleCountMax;
    
    
    
    protected Boolean detectNitError;
    
    
    
    protected Integer dynamicSlotIdlePhase;
    
    
    
    protected Integer ignoreAfterTx;
    
    
    
    protected Integer listenNoise;
    
    
    
    protected Integer macroPerCycle;
    
    
    
    protected TimeValue macrotickDuration;
    
    
    
    protected Integer maxWithoutClockCorrectionFatal;
    
    
    
    protected Integer maxWithoutClockCorrectionPassive;
    
    
    
    protected Integer minislotActionPointOffset;
    
    
    
    protected Integer minislotDuration;
    
    
    
    protected Integer networkIdleTime;
    
    
    
    protected Integer networkManagementVectorLength;
    
    
    
    protected Integer numberOfMinislots;
    
    
    
    protected Integer numberOfStaticSlots;
    
    
    
    protected Integer offsetCorrectionStart;
    
    
    
    protected Integer payloadLengthStatic;
    
    
    
    protected Integer safetyMargin;
    
    
    
    protected TimeValue sampleClockPeriod;
    
    
    
    protected Integer staticSlotDuration;
    
    
    
    protected Integer symbolWindow;
    
    
    
    protected Integer symbolWindowActionPointOffset;
    
    
    
    protected Integer syncFrameIdCountMax;
    
    
    
    protected Float tranceiverStandbyDelay;
    
    
    
    protected Integer transmissionStartSequenceDuration;
    
    
    
    protected Integer wakeupRxIdle;
    
    
    
    protected Integer wakeupRxLow;
    
    
    
    protected Integer wakeupRxWindow;
    
    
    
    protected Integer wakeupTxActive;
    
    
    
    protected Integer wakeupTxIdle;
    
    
    
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
    
    
    
    @XmlElement(name="BAUDRATE")
    public PositiveUnlimitedInteger getBaudrate() {
        return this.baudrate;
    }

    public void setBaudrate(PositiveUnlimitedInteger value) {
        this.baudrate = value;
    }
    
    
    
    @XmlElement(name="PHYSICAL-CHANNELS")
    public PhysicalChannels getPhysicalChannels() {
        return this.physicalChannels;
    }

    public void setPhysicalChannels(PhysicalChannels value) {
        this.physicalChannels = value;
    }
    
    
    
    @XmlElement(name="PROTOCOL-NAME")
    public String getProtocolName() {
        return this.protocolName;
    }

    public void setProtocolName(String value) {
        this.protocolName = value;
    }
    
    
    
    @XmlElement(name="PROTOCOL-VERSION")
    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    public void setProtocolVersion(String value) {
        this.protocolVersion = value;
    }
    
    
    
    @XmlElement(name="SPEED")
    public Integer getSpeed() {
        return this.speed;
    }

    public void setSpeed(Integer value) {
        this.speed = value;
    }
    
    
    
    @XmlElement(name="ACTION-POINT-OFFSET")
    public Integer getActionPointOffset() {
        return this.actionPointOffset;
    }

    public void setActionPointOffset(Integer value) {
        this.actionPointOffset = value;
    }
    
    
    
    @XmlElement(name="BIT")
    public TimeValue getBit() {
        return this.bit;
    }

    public void setBit(TimeValue value) {
        this.bit = value;
    }
    
    
    
    @XmlElement(name="CAS-RX-LOW-MAX")
    public Integer getCasRxLowMax() {
        return this.casRxLowMax;
    }

    public void setCasRxLowMax(Integer value) {
        this.casRxLowMax = value;
    }
    
    
    
    @XmlElement(name="COLD-START-ATTEMPTS")
    public Integer getColdStartAttempts() {
        return this.coldStartAttempts;
    }

    public void setColdStartAttempts(Integer value) {
        this.coldStartAttempts = value;
    }
    
    
    
    @XmlElement(name="CYCLE")
    public TimeValue getCycle() {
        return this.cycle;
    }

    public void setCycle(TimeValue value) {
        this.cycle = value;
    }
    
    
    
    @XmlElement(name="CYCLE-COUNT-MAX")
    public Integer getCycleCountMax() {
        return this.cycleCountMax;
    }

    public void setCycleCountMax(Integer value) {
        this.cycleCountMax = value;
    }
    
    
    
    @XmlElement(name="DETECT-NIT-ERROR")
    public Boolean getDetectNitError() {
        return this.detectNitError;
    }

    public void setDetectNitError(Boolean value) {
        this.detectNitError = value;
    }
    
    
    
    @XmlElement(name="DYNAMIC-SLOT-IDLE-PHASE")
    public Integer getDynamicSlotIdlePhase() {
        return this.dynamicSlotIdlePhase;
    }

    public void setDynamicSlotIdlePhase(Integer value) {
        this.dynamicSlotIdlePhase = value;
    }
    
    
    
    @XmlElement(name="IGNORE-AFTER-TX")
    public Integer getIgnoreAfterTx() {
        return this.ignoreAfterTx;
    }

    public void setIgnoreAfterTx(Integer value) {
        this.ignoreAfterTx = value;
    }
    
    
    
    @XmlElement(name="LISTEN-NOISE")
    public Integer getListenNoise() {
        return this.listenNoise;
    }

    public void setListenNoise(Integer value) {
        this.listenNoise = value;
    }
    
    
    
    @XmlElement(name="MACRO-PER-CYCLE")
    public Integer getMacroPerCycle() {
        return this.macroPerCycle;
    }

    public void setMacroPerCycle(Integer value) {
        this.macroPerCycle = value;
    }
    
    
    
    @XmlElement(name="MACROTICK-DURATION")
    public TimeValue getMacrotickDuration() {
        return this.macrotickDuration;
    }

    public void setMacrotickDuration(TimeValue value) {
        this.macrotickDuration = value;
    }
    
    
    
    @XmlElement(name="MAX-WITHOUT-CLOCK-CORRECTION-FATAL")
    public Integer getMaxWithoutClockCorrectionFatal() {
        return this.maxWithoutClockCorrectionFatal;
    }

    public void setMaxWithoutClockCorrectionFatal(Integer value) {
        this.maxWithoutClockCorrectionFatal = value;
    }
    
    
    
    @XmlElement(name="MAX-WITHOUT-CLOCK-CORRECTION-PASSIVE")
    public Integer getMaxWithoutClockCorrectionPassive() {
        return this.maxWithoutClockCorrectionPassive;
    }

    public void setMaxWithoutClockCorrectionPassive(Integer value) {
        this.maxWithoutClockCorrectionPassive = value;
    }
    
    
    
    @XmlElement(name="MINISLOT-ACTION-POINT-OFFSET")
    public Integer getMinislotActionPointOffset() {
        return this.minislotActionPointOffset;
    }

    public void setMinislotActionPointOffset(Integer value) {
        this.minislotActionPointOffset = value;
    }
    
    
    
    @XmlElement(name="MINISLOT-DURATION")
    public Integer getMinislotDuration() {
        return this.minislotDuration;
    }

    public void setMinislotDuration(Integer value) {
        this.minislotDuration = value;
    }
    
    
    
    @XmlElement(name="NETWORK-IDLE-TIME")
    public Integer getNetworkIdleTime() {
        return this.networkIdleTime;
    }

    public void setNetworkIdleTime(Integer value) {
        this.networkIdleTime = value;
    }
    
    
    
    @XmlElement(name="NETWORK-MANAGEMENT-VECTOR-LENGTH")
    public Integer getNetworkManagementVectorLength() {
        return this.networkManagementVectorLength;
    }

    public void setNetworkManagementVectorLength(Integer value) {
        this.networkManagementVectorLength = value;
    }
    
    
    
    @XmlElement(name="NUMBER-OF-MINISLOTS")
    public Integer getNumberOfMinislots() {
        return this.numberOfMinislots;
    }

    public void setNumberOfMinislots(Integer value) {
        this.numberOfMinislots = value;
    }
    
    
    
    @XmlElement(name="NUMBER-OF-STATIC-SLOTS")
    public Integer getNumberOfStaticSlots() {
        return this.numberOfStaticSlots;
    }

    public void setNumberOfStaticSlots(Integer value) {
        this.numberOfStaticSlots = value;
    }
    
    
    
    @XmlElement(name="OFFSET-CORRECTION-START")
    public Integer getOffsetCorrectionStart() {
        return this.offsetCorrectionStart;
    }

    public void setOffsetCorrectionStart(Integer value) {
        this.offsetCorrectionStart = value;
    }
    
    
    
    @XmlElement(name="PAYLOAD-LENGTH-STATIC")
    public Integer getPayloadLengthStatic() {
        return this.payloadLengthStatic;
    }

    public void setPayloadLengthStatic(Integer value) {
        this.payloadLengthStatic = value;
    }
    
    
    
    @XmlElement(name="SAFETY-MARGIN")
    public Integer getSafetyMargin() {
        return this.safetyMargin;
    }

    public void setSafetyMargin(Integer value) {
        this.safetyMargin = value;
    }
    
    
    
    @XmlElement(name="SAMPLE-CLOCK-PERIOD")
    public TimeValue getSampleClockPeriod() {
        return this.sampleClockPeriod;
    }

    public void setSampleClockPeriod(TimeValue value) {
        this.sampleClockPeriod = value;
    }
    
    
    
    @XmlElement(name="STATIC-SLOT-DURATION")
    public Integer getStaticSlotDuration() {
        return this.staticSlotDuration;
    }

    public void setStaticSlotDuration(Integer value) {
        this.staticSlotDuration = value;
    }
    
    
    
    @XmlElement(name="SYMBOL-WINDOW")
    public Integer getSymbolWindow() {
        return this.symbolWindow;
    }

    public void setSymbolWindow(Integer value) {
        this.symbolWindow = value;
    }
    
    
    
    @XmlElement(name="SYMBOL-WINDOW-ACTION-POINT-OFFSET")
    public Integer getSymbolWindowActionPointOffset() {
        return this.symbolWindowActionPointOffset;
    }

    public void setSymbolWindowActionPointOffset(Integer value) {
        this.symbolWindowActionPointOffset = value;
    }
    
    
    
    @XmlElement(name="SYNC-FRAME-ID-COUNT-MAX")
    public Integer getSyncFrameIdCountMax() {
        return this.syncFrameIdCountMax;
    }

    public void setSyncFrameIdCountMax(Integer value) {
        this.syncFrameIdCountMax = value;
    }
    
    
    
    @XmlElement(name="TRANCEIVER-STANDBY-DELAY")
    public Float getTranceiverStandbyDelay() {
        return this.tranceiverStandbyDelay;
    }

    public void setTranceiverStandbyDelay(Float value) {
        this.tranceiverStandbyDelay = value;
    }
    
    
    
    @XmlElement(name="TRANSMISSION-START-SEQUENCE-DURATION")
    public Integer getTransmissionStartSequenceDuration() {
        return this.transmissionStartSequenceDuration;
    }

    public void setTransmissionStartSequenceDuration(Integer value) {
        this.transmissionStartSequenceDuration = value;
    }
    
    
    
    @XmlElement(name="WAKEUP-RX-IDLE")
    public Integer getWakeupRxIdle() {
        return this.wakeupRxIdle;
    }

    public void setWakeupRxIdle(Integer value) {
        this.wakeupRxIdle = value;
    }
    
    
    
    @XmlElement(name="WAKEUP-RX-LOW")
    public Integer getWakeupRxLow() {
        return this.wakeupRxLow;
    }

    public void setWakeupRxLow(Integer value) {
        this.wakeupRxLow = value;
    }
    
    
    
    @XmlElement(name="WAKEUP-RX-WINDOW")
    public Integer getWakeupRxWindow() {
        return this.wakeupRxWindow;
    }

    public void setWakeupRxWindow(Integer value) {
        this.wakeupRxWindow = value;
    }
    
    
    
    @XmlElement(name="WAKEUP-TX-ACTIVE")
    public Integer getWakeupTxActive() {
        return this.wakeupTxActive;
    }

    public void setWakeupTxActive(Integer value) {
        this.wakeupTxActive = value;
    }
    
    
    
    @XmlElement(name="WAKEUP-TX-IDLE")
    public Integer getWakeupTxIdle() {
        return this.wakeupTxIdle;
    }

    public void setWakeupTxIdle(Integer value) {
        this.wakeupTxIdle = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}