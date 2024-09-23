package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DiagnosticCommonPropsConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean agingRequiresTestedCycle;
    
    
    
    protected DiagnosticClearDtcLimitationEnum clearDtcLimitation;
    
    
    
    protected DebounceAlgorithmPropss debounceAlgorithmPropss;
    
    
    
    protected ByteOrderEnum defaultEndianness;
    
    
    
    protected PositiveInteger dtcStatusAvailabilityMask;
    
    
    
    protected DiagnosticDataCaptureEnum environmentDataCapture;
    
    
    
    protected DiagnosticEventDisplacementStrategyEnum eventDisplacementStrategy;
    
    
    
    protected PositiveInteger maxNumberOfEventEntries;
    
    
    
    protected PositiveInteger maxNumberOfRequestCorrectlyReceivedResponsePending;
    
    
    
    protected DiagnosticMemoryEntryStorageTriggerEnum memoryEntryStorageTrigger;
    
    
    
    protected DiagnosticOccurrenceCounterProcessingEnum occurrenceCounterProcessing;
    
    
    
    protected Boolean resetConfirmedBitOnOverflow;
    
    
    
    protected Boolean responseOnAllRequestSids;
    
    
    
    protected Boolean responseOnSecondDeclinedRequest;
    
    
    
    protected TimeValue securityDelayTimeOnBoot;
    
    
    
    protected DiagnosticStatusBitHandlingTestFailedSinceLastClearEnum statusBitHandlingTestFailedSinceLastClear;
    
    
    
    protected Boolean statusBitStorageTestFailed;
    
    
    
    protected DiagnosticTypeOfDtcSupportedEnum typeOfDtcSupported;
    
    
    
    protected DiagnosticTypeOfFreezeFrameRecordNumerationEnum typeOfFreezeFrameRecordNumeration;
    
    
    
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
    
    
    
    @XmlElement(name="AGING-REQUIRES-TESTED-CYCLE")
    public Boolean getAgingRequiresTestedCycle() {
        return this.agingRequiresTestedCycle;
    }

    public void setAgingRequiresTestedCycle(Boolean value) {
        this.agingRequiresTestedCycle = value;
    }
    
    
    
    @XmlElement(name="CLEAR-DTC-LIMITATION")
    public DiagnosticClearDtcLimitationEnum getClearDtcLimitation() {
        return this.clearDtcLimitation;
    }

    public void setClearDtcLimitation(DiagnosticClearDtcLimitationEnum value) {
        this.clearDtcLimitation = value;
    }
    
    
    
    @XmlElement(name="DEBOUNCE-ALGORITHM-PROPSS")
    public DebounceAlgorithmPropss getDebounceAlgorithmPropss() {
        return this.debounceAlgorithmPropss;
    }

    public void setDebounceAlgorithmPropss(DebounceAlgorithmPropss value) {
        this.debounceAlgorithmPropss = value;
    }
    
    
    
    @XmlElement(name="DEFAULT-ENDIANNESS")
    public ByteOrderEnum getDefaultEndianness() {
        return this.defaultEndianness;
    }

    public void setDefaultEndianness(ByteOrderEnum value) {
        this.defaultEndianness = value;
    }
    
    
    
    @XmlElement(name="DTC-STATUS-AVAILABILITY-MASK")
    public PositiveInteger getDtcStatusAvailabilityMask() {
        return this.dtcStatusAvailabilityMask;
    }

    public void setDtcStatusAvailabilityMask(PositiveInteger value) {
        this.dtcStatusAvailabilityMask = value;
    }
    
    
    
    @XmlElement(name="ENVIRONMENT-DATA-CAPTURE")
    public DiagnosticDataCaptureEnum getEnvironmentDataCapture() {
        return this.environmentDataCapture;
    }

    public void setEnvironmentDataCapture(DiagnosticDataCaptureEnum value) {
        this.environmentDataCapture = value;
    }
    
    
    
    @XmlElement(name="EVENT-DISPLACEMENT-STRATEGY")
    public DiagnosticEventDisplacementStrategyEnum getEventDisplacementStrategy() {
        return this.eventDisplacementStrategy;
    }

    public void setEventDisplacementStrategy(DiagnosticEventDisplacementStrategyEnum value) {
        this.eventDisplacementStrategy = value;
    }
    
    
    
    @XmlElement(name="MAX-NUMBER-OF-EVENT-ENTRIES")
    public PositiveInteger getMaxNumberOfEventEntries() {
        return this.maxNumberOfEventEntries;
    }

    public void setMaxNumberOfEventEntries(PositiveInteger value) {
        this.maxNumberOfEventEntries = value;
    }
    
    
    
    @XmlElement(name="MAX-NUMBER-OF-REQUEST-CORRECTLY-RECEIVED-RESPONSE-PENDING")
    public PositiveInteger getMaxNumberOfRequestCorrectlyReceivedResponsePending() {
        return this.maxNumberOfRequestCorrectlyReceivedResponsePending;
    }

    public void setMaxNumberOfRequestCorrectlyReceivedResponsePending(PositiveInteger value) {
        this.maxNumberOfRequestCorrectlyReceivedResponsePending = value;
    }
    
    
    
    @XmlElement(name="MEMORY-ENTRY-STORAGE-TRIGGER")
    public DiagnosticMemoryEntryStorageTriggerEnum getMemoryEntryStorageTrigger() {
        return this.memoryEntryStorageTrigger;
    }

    public void setMemoryEntryStorageTrigger(DiagnosticMemoryEntryStorageTriggerEnum value) {
        this.memoryEntryStorageTrigger = value;
    }
    
    
    
    @XmlElement(name="OCCURRENCE-COUNTER-PROCESSING")
    public DiagnosticOccurrenceCounterProcessingEnum getOccurrenceCounterProcessing() {
        return this.occurrenceCounterProcessing;
    }

    public void setOccurrenceCounterProcessing(DiagnosticOccurrenceCounterProcessingEnum value) {
        this.occurrenceCounterProcessing = value;
    }
    
    
    
    @XmlElement(name="RESET-CONFIRMED-BIT-ON-OVERFLOW")
    public Boolean getResetConfirmedBitOnOverflow() {
        return this.resetConfirmedBitOnOverflow;
    }

    public void setResetConfirmedBitOnOverflow(Boolean value) {
        this.resetConfirmedBitOnOverflow = value;
    }
    
    
    
    @XmlElement(name="RESPONSE-ON-ALL-REQUEST-SIDS")
    public Boolean getResponseOnAllRequestSids() {
        return this.responseOnAllRequestSids;
    }

    public void setResponseOnAllRequestSids(Boolean value) {
        this.responseOnAllRequestSids = value;
    }
    
    
    
    @XmlElement(name="RESPONSE-ON-SECOND-DECLINED-REQUEST")
    public Boolean getResponseOnSecondDeclinedRequest() {
        return this.responseOnSecondDeclinedRequest;
    }

    public void setResponseOnSecondDeclinedRequest(Boolean value) {
        this.responseOnSecondDeclinedRequest = value;
    }
    
    
    
    @XmlElement(name="SECURITY-DELAY-TIME-ON-BOOT")
    public TimeValue getSecurityDelayTimeOnBoot() {
        return this.securityDelayTimeOnBoot;
    }

    public void setSecurityDelayTimeOnBoot(TimeValue value) {
        this.securityDelayTimeOnBoot = value;
    }
    
    
    
    @XmlElement(name="STATUS-BIT-HANDLING-TEST-FAILED-SINCE-LAST-CLEAR")
    public DiagnosticStatusBitHandlingTestFailedSinceLastClearEnum getStatusBitHandlingTestFailedSinceLastClear() {
        return this.statusBitHandlingTestFailedSinceLastClear;
    }

    public void setStatusBitHandlingTestFailedSinceLastClear(DiagnosticStatusBitHandlingTestFailedSinceLastClearEnum value) {
        this.statusBitHandlingTestFailedSinceLastClear = value;
    }
    
    
    
    @XmlElement(name="STATUS-BIT-STORAGE-TEST-FAILED")
    public Boolean getStatusBitStorageTestFailed() {
        return this.statusBitStorageTestFailed;
    }

    public void setStatusBitStorageTestFailed(Boolean value) {
        this.statusBitStorageTestFailed = value;
    }
    
    
    
    @XmlElement(name="TYPE-OF-DTC-SUPPORTED")
    public DiagnosticTypeOfDtcSupportedEnum getTypeOfDtcSupported() {
        return this.typeOfDtcSupported;
    }

    public void setTypeOfDtcSupported(DiagnosticTypeOfDtcSupportedEnum value) {
        this.typeOfDtcSupported = value;
    }
    
    
    
    @XmlElement(name="TYPE-OF-FREEZE-FRAME-RECORD-NUMERATION")
    public DiagnosticTypeOfFreezeFrameRecordNumerationEnum getTypeOfFreezeFrameRecordNumeration() {
        return this.typeOfFreezeFrameRecordNumeration;
    }

    public void setTypeOfFreezeFrameRecordNumeration(DiagnosticTypeOfFreezeFrameRecordNumerationEnum value) {
        this.typeOfFreezeFrameRecordNumeration = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}