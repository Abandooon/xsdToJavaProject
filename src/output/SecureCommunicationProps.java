package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SecureCommunicationProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected String authAlgorithm;
    
    
    
    protected PositiveInteger authInfoTxLength;
    
    
    
    protected PositiveInteger authenticationRetries;
    
    
    
    protected PositiveInteger dataId;
    
    
    
    protected PositiveInteger freshnessCounterSyncAttempts;
    
    
    
    protected PositiveInteger freshnessTimestampTimePeriodFactor;
    
    
    
    protected PositiveInteger freshnessValueId;
    
    
    
    protected PositiveInteger freshnessValueLength;
    
    
    
    protected PositiveInteger freshnessValueTxLength;
    
    
    
    protected PositiveInteger secondaryFreshnessValueId;
    
    
    
    protected Boolean useFreshnessTimestamp;
    
    

    
    
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
    
    
    
    @XmlElement(name="AUTH-ALGORITHM")
    public String getAuthAlgorithm() {
        return this.authAlgorithm;
    }

    public void setAuthAlgorithm(String value) {
        this.authAlgorithm = value;
    }
    
    
    
    @XmlElement(name="AUTH-INFO-TX-LENGTH")
    public PositiveInteger getAuthInfoTxLength() {
        return this.authInfoTxLength;
    }

    public void setAuthInfoTxLength(PositiveInteger value) {
        this.authInfoTxLength = value;
    }
    
    
    
    @XmlElement(name="AUTHENTICATION-RETRIES")
    public PositiveInteger getAuthenticationRetries() {
        return this.authenticationRetries;
    }

    public void setAuthenticationRetries(PositiveInteger value) {
        this.authenticationRetries = value;
    }
    
    
    
    @XmlElement(name="DATA-ID")
    public PositiveInteger getDataId() {
        return this.dataId;
    }

    public void setDataId(PositiveInteger value) {
        this.dataId = value;
    }
    
    
    
    @XmlElement(name="FRESHNESS-COUNTER-SYNC-ATTEMPTS")
    public PositiveInteger getFreshnessCounterSyncAttempts() {
        return this.freshnessCounterSyncAttempts;
    }

    public void setFreshnessCounterSyncAttempts(PositiveInteger value) {
        this.freshnessCounterSyncAttempts = value;
    }
    
    
    
    @XmlElement(name="FRESHNESS-TIMESTAMP-TIME-PERIOD-FACTOR")
    public PositiveInteger getFreshnessTimestampTimePeriodFactor() {
        return this.freshnessTimestampTimePeriodFactor;
    }

    public void setFreshnessTimestampTimePeriodFactor(PositiveInteger value) {
        this.freshnessTimestampTimePeriodFactor = value;
    }
    
    
    
    @XmlElement(name="FRESHNESS-VALUE-ID")
    public PositiveInteger getFreshnessValueId() {
        return this.freshnessValueId;
    }

    public void setFreshnessValueId(PositiveInteger value) {
        this.freshnessValueId = value;
    }
    
    
    
    @XmlElement(name="FRESHNESS-VALUE-LENGTH")
    public PositiveInteger getFreshnessValueLength() {
        return this.freshnessValueLength;
    }

    public void setFreshnessValueLength(PositiveInteger value) {
        this.freshnessValueLength = value;
    }
    
    
    
    @XmlElement(name="FRESHNESS-VALUE-TX-LENGTH")
    public PositiveInteger getFreshnessValueTxLength() {
        return this.freshnessValueTxLength;
    }

    public void setFreshnessValueTxLength(PositiveInteger value) {
        this.freshnessValueTxLength = value;
    }
    
    
    
    @XmlElement(name="SECONDARY-FRESHNESS-VALUE-ID")
    public PositiveInteger getSecondaryFreshnessValueId() {
        return this.secondaryFreshnessValueId;
    }

    public void setSecondaryFreshnessValueId(PositiveInteger value) {
        this.secondaryFreshnessValueId = value;
    }
    
    
    
    @XmlElement(name="USE-FRESHNESS-TIMESTAMP")
    public Boolean getUseFreshnessTimestamp() {
        return this.useFreshnessTimestamp;
    }

    public void setUseFreshnessTimestamp(Boolean value) {
        this.useFreshnessTimestamp = value;
    }
    
    
}