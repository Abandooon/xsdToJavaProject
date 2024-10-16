package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ServiceItems {

    
    
    protected ArrayList<BswMgrNeeds> bswMgrNeeds;
    
    
    
    protected ArrayList<ComMgrUserNeeds> comMgrUserNeeds;
    
    
    
    protected ArrayList<CryptoServiceNeeds> cryptoServiceNeeds;
    
    
    
    protected ArrayList<DiagnosticCommunicationManagerNeeds> diagnosticCommunicationManagerNeeds;
    
    
    
    protected ArrayList<DiagnosticEnableConditionNeeds> diagnosticEnableConditionNeeds;
    
    
    
    protected ArrayList<DiagnosticEventInfoNeeds> diagnosticEventInfoNeeds;
    
    
    
    protected ArrayList<DiagnosticEventManagerNeeds> diagnosticEventManagerNeeds;
    
    
    
    protected ArrayList<DiagnosticEventNeeds> diagnosticEventNeeds;
    
    
    
    protected ArrayList<DiagnosticIoControlNeeds> diagnosticIoControlNeeds;
    
    
    
    protected ArrayList<DiagnosticOperationCycleNeeds> diagnosticOperationCycleNeeds;
    
    
    
    protected ArrayList<DiagnosticRoutineNeeds> diagnosticRoutineNeeds;
    
    
    
    protected ArrayList<DiagnosticStorageConditionNeeds> diagnosticStorageConditionNeeds;
    
    
    
    protected ArrayList<DiagnosticValueNeeds> diagnosticValueNeeds;
    
    
    
    protected ArrayList<DiagnosticsCommunicationSecurityNeeds> diagnosticsCommunicationSecurityNeeds;
    
    
    
    protected ArrayList<DltUserNeeds> dltUserNeeds;
    
    
    
    protected ArrayList<DoIpActivationLineNeeds> doIpActivationLineNeeds;
    
    
    
    protected ArrayList<DoIpGidNeeds> doIpGidNeeds;
    
    
    
    protected ArrayList<DoIpGidSynchronizationNeeds> doIpGidSynchronizationNeeds;
    
    
    
    protected ArrayList<DoIpPowerModeStatusNeeds> doIpPowerModeStatusNeeds;
    
    
    
    protected ArrayList<DoIpRoutingActivationAuthenticationNeeds> doIpRoutingActivationAuthenticationNeeds;
    
    
    
    protected ArrayList<DoIpRoutingActivationConfirmationNeeds> doIpRoutingActivationConfirmationNeeds;
    
    
    
    protected ArrayList<DtcStatusChangeNotificationNeeds> dtcStatusChangeNotificationNeeds;
    
    
    
    protected ArrayList<EcuStateMgrUserNeeds> ecuStateMgrUserNeeds;
    
    
    
    protected ArrayList<FunctionInhibitionNeeds> functionInhibitionNeeds;
    
    
    
    protected ArrayList<NvBlockNeeds> nvBlockNeeds;
    
    
    
    protected ArrayList<ObdControlServiceNeeds> obdControlServiceNeeds;
    
    
    
    protected ArrayList<ObdInfoServiceNeeds> obdInfoServiceNeeds;
    
    
    
    protected ArrayList<ObdMonitorServiceNeeds> obdMonitorServiceNeeds;
    
    
    
    protected ArrayList<ObdPidServiceNeeds> obdPidServiceNeeds;
    
    
    
    protected ArrayList<ObdRatioServiceNeeds> obdRatioServiceNeeds;
    
    
    
    protected ArrayList<SupervisedEntityNeeds> supervisedEntityNeeds;
    
    
    
    protected ArrayList<SyncTimeBaseMgrUserNeeds> syncTimeBaseMgrUserNeeds;
    
    
    
    protected ArrayList<WarningIndicatorRequestedBitNeeds> warningIndicatorRequestedBitNeeds;
    
    

    
    
    @XmlElement(name="BSW-MGR-NEEDS")
    public ArrayList<BswMgrNeeds> getBswMgrNeeds() {
    return this.bswMgrNeeds;
}

    public void setBswMgrNeeds(ArrayList<BswMgrNeeds> value) {
        this.bswMgrNeeds = value;
    }
    
    
    
    @XmlElement(name="COM-MGR-USER-NEEDS")
    public ArrayList<ComMgrUserNeeds> getComMgrUserNeeds() {
    return this.comMgrUserNeeds;
}

    public void setComMgrUserNeeds(ArrayList<ComMgrUserNeeds> value) {
        this.comMgrUserNeeds = value;
    }
    
    
    
    @XmlElement(name="CRYPTO-SERVICE-NEEDS")
    public ArrayList<CryptoServiceNeeds> getCryptoServiceNeeds() {
    return this.cryptoServiceNeeds;
}

    public void setCryptoServiceNeeds(ArrayList<CryptoServiceNeeds> value) {
        this.cryptoServiceNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-COMMUNICATION-MANAGER-NEEDS")
    public ArrayList<DiagnosticCommunicationManagerNeeds> getDiagnosticCommunicationManagerNeeds() {
    return this.diagnosticCommunicationManagerNeeds;
}

    public void setDiagnosticCommunicationManagerNeeds(ArrayList<DiagnosticCommunicationManagerNeeds> value) {
        this.diagnosticCommunicationManagerNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-ENABLE-CONDITION-NEEDS")
    public ArrayList<DiagnosticEnableConditionNeeds> getDiagnosticEnableConditionNeeds() {
    return this.diagnosticEnableConditionNeeds;
}

    public void setDiagnosticEnableConditionNeeds(ArrayList<DiagnosticEnableConditionNeeds> value) {
        this.diagnosticEnableConditionNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-EVENT-INFO-NEEDS")
    public ArrayList<DiagnosticEventInfoNeeds> getDiagnosticEventInfoNeeds() {
    return this.diagnosticEventInfoNeeds;
}

    public void setDiagnosticEventInfoNeeds(ArrayList<DiagnosticEventInfoNeeds> value) {
        this.diagnosticEventInfoNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-EVENT-MANAGER-NEEDS")
    public ArrayList<DiagnosticEventManagerNeeds> getDiagnosticEventManagerNeeds() {
    return this.diagnosticEventManagerNeeds;
}

    public void setDiagnosticEventManagerNeeds(ArrayList<DiagnosticEventManagerNeeds> value) {
        this.diagnosticEventManagerNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-EVENT-NEEDS")
    public ArrayList<DiagnosticEventNeeds> getDiagnosticEventNeeds() {
    return this.diagnosticEventNeeds;
}

    public void setDiagnosticEventNeeds(ArrayList<DiagnosticEventNeeds> value) {
        this.diagnosticEventNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-IO-CONTROL-NEEDS")
    public ArrayList<DiagnosticIoControlNeeds> getDiagnosticIoControlNeeds() {
    return this.diagnosticIoControlNeeds;
}

    public void setDiagnosticIoControlNeeds(ArrayList<DiagnosticIoControlNeeds> value) {
        this.diagnosticIoControlNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-OPERATION-CYCLE-NEEDS")
    public ArrayList<DiagnosticOperationCycleNeeds> getDiagnosticOperationCycleNeeds() {
    return this.diagnosticOperationCycleNeeds;
}

    public void setDiagnosticOperationCycleNeeds(ArrayList<DiagnosticOperationCycleNeeds> value) {
        this.diagnosticOperationCycleNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-ROUTINE-NEEDS")
    public ArrayList<DiagnosticRoutineNeeds> getDiagnosticRoutineNeeds() {
    return this.diagnosticRoutineNeeds;
}

    public void setDiagnosticRoutineNeeds(ArrayList<DiagnosticRoutineNeeds> value) {
        this.diagnosticRoutineNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-STORAGE-CONDITION-NEEDS")
    public ArrayList<DiagnosticStorageConditionNeeds> getDiagnosticStorageConditionNeeds() {
    return this.diagnosticStorageConditionNeeds;
}

    public void setDiagnosticStorageConditionNeeds(ArrayList<DiagnosticStorageConditionNeeds> value) {
        this.diagnosticStorageConditionNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-VALUE-NEEDS")
    public ArrayList<DiagnosticValueNeeds> getDiagnosticValueNeeds() {
    return this.diagnosticValueNeeds;
}

    public void setDiagnosticValueNeeds(ArrayList<DiagnosticValueNeeds> value) {
        this.diagnosticValueNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTICS-COMMUNICATION-SECURITY-NEEDS")
    public ArrayList<DiagnosticsCommunicationSecurityNeeds> getDiagnosticsCommunicationSecurityNeeds() {
    return this.diagnosticsCommunicationSecurityNeeds;
}

    public void setDiagnosticsCommunicationSecurityNeeds(ArrayList<DiagnosticsCommunicationSecurityNeeds> value) {
        this.diagnosticsCommunicationSecurityNeeds = value;
    }
    
    
    
    @XmlElement(name="DLT-USER-NEEDS")
    public ArrayList<DltUserNeeds> getDltUserNeeds() {
    return this.dltUserNeeds;
}

    public void setDltUserNeeds(ArrayList<DltUserNeeds> value) {
        this.dltUserNeeds = value;
    }
    
    
    
    @XmlElement(name="DO-IP-ACTIVATION-LINE-NEEDS")
    public ArrayList<DoIpActivationLineNeeds> getDoIpActivationLineNeeds() {
    return this.doIpActivationLineNeeds;
}

    public void setDoIpActivationLineNeeds(ArrayList<DoIpActivationLineNeeds> value) {
        this.doIpActivationLineNeeds = value;
    }
    
    
    
    @XmlElement(name="DO-IP-GID-NEEDS")
    public ArrayList<DoIpGidNeeds> getDoIpGidNeeds() {
    return this.doIpGidNeeds;
}

    public void setDoIpGidNeeds(ArrayList<DoIpGidNeeds> value) {
        this.doIpGidNeeds = value;
    }
    
    
    
    @XmlElement(name="DO-IP-GID-SYNCHRONIZATION-NEEDS")
    public ArrayList<DoIpGidSynchronizationNeeds> getDoIpGidSynchronizationNeeds() {
    return this.doIpGidSynchronizationNeeds;
}

    public void setDoIpGidSynchronizationNeeds(ArrayList<DoIpGidSynchronizationNeeds> value) {
        this.doIpGidSynchronizationNeeds = value;
    }
    
    
    
    @XmlElement(name="DO-IP-POWER-MODE-STATUS-NEEDS")
    public ArrayList<DoIpPowerModeStatusNeeds> getDoIpPowerModeStatusNeeds() {
    return this.doIpPowerModeStatusNeeds;
}

    public void setDoIpPowerModeStatusNeeds(ArrayList<DoIpPowerModeStatusNeeds> value) {
        this.doIpPowerModeStatusNeeds = value;
    }
    
    
    
    @XmlElement(name="DO-IP-ROUTING-ACTIVATION-AUTHENTICATION-NEEDS")
    public ArrayList<DoIpRoutingActivationAuthenticationNeeds> getDoIpRoutingActivationAuthenticationNeeds() {
    return this.doIpRoutingActivationAuthenticationNeeds;
}

    public void setDoIpRoutingActivationAuthenticationNeeds(ArrayList<DoIpRoutingActivationAuthenticationNeeds> value) {
        this.doIpRoutingActivationAuthenticationNeeds = value;
    }
    
    
    
    @XmlElement(name="DO-IP-ROUTING-ACTIVATION-CONFIRMATION-NEEDS")
    public ArrayList<DoIpRoutingActivationConfirmationNeeds> getDoIpRoutingActivationConfirmationNeeds() {
    return this.doIpRoutingActivationConfirmationNeeds;
}

    public void setDoIpRoutingActivationConfirmationNeeds(ArrayList<DoIpRoutingActivationConfirmationNeeds> value) {
        this.doIpRoutingActivationConfirmationNeeds = value;
    }
    
    
    
    @XmlElement(name="DTC-STATUS-CHANGE-NOTIFICATION-NEEDS")
    public ArrayList<DtcStatusChangeNotificationNeeds> getDtcStatusChangeNotificationNeeds() {
    return this.dtcStatusChangeNotificationNeeds;
}

    public void setDtcStatusChangeNotificationNeeds(ArrayList<DtcStatusChangeNotificationNeeds> value) {
        this.dtcStatusChangeNotificationNeeds = value;
    }
    
    
    
    @XmlElement(name="ECU-STATE-MGR-USER-NEEDS")
    public ArrayList<EcuStateMgrUserNeeds> getEcuStateMgrUserNeeds() {
    return this.ecuStateMgrUserNeeds;
}

    public void setEcuStateMgrUserNeeds(ArrayList<EcuStateMgrUserNeeds> value) {
        this.ecuStateMgrUserNeeds = value;
    }
    
    
    
    @XmlElement(name="FUNCTION-INHIBITION-NEEDS")
    public ArrayList<FunctionInhibitionNeeds> getFunctionInhibitionNeeds() {
    return this.functionInhibitionNeeds;
}

    public void setFunctionInhibitionNeeds(ArrayList<FunctionInhibitionNeeds> value) {
        this.functionInhibitionNeeds = value;
    }
    
    
    
    @XmlElement(name="NV-BLOCK-NEEDS")
    public ArrayList<NvBlockNeeds> getNvBlockNeeds() {
    return this.nvBlockNeeds;
}

    public void setNvBlockNeeds(ArrayList<NvBlockNeeds> value) {
        this.nvBlockNeeds = value;
    }
    
    
    
    @XmlElement(name="OBD-CONTROL-SERVICE-NEEDS")
    public ArrayList<ObdControlServiceNeeds> getObdControlServiceNeeds() {
    return this.obdControlServiceNeeds;
}

    public void setObdControlServiceNeeds(ArrayList<ObdControlServiceNeeds> value) {
        this.obdControlServiceNeeds = value;
    }
    
    
    
    @XmlElement(name="OBD-INFO-SERVICE-NEEDS")
    public ArrayList<ObdInfoServiceNeeds> getObdInfoServiceNeeds() {
    return this.obdInfoServiceNeeds;
}

    public void setObdInfoServiceNeeds(ArrayList<ObdInfoServiceNeeds> value) {
        this.obdInfoServiceNeeds = value;
    }
    
    
    
    @XmlElement(name="OBD-MONITOR-SERVICE-NEEDS")
    public ArrayList<ObdMonitorServiceNeeds> getObdMonitorServiceNeeds() {
    return this.obdMonitorServiceNeeds;
}

    public void setObdMonitorServiceNeeds(ArrayList<ObdMonitorServiceNeeds> value) {
        this.obdMonitorServiceNeeds = value;
    }
    
    
    
    @XmlElement(name="OBD-PID-SERVICE-NEEDS")
    public ArrayList<ObdPidServiceNeeds> getObdPidServiceNeeds() {
    return this.obdPidServiceNeeds;
}

    public void setObdPidServiceNeeds(ArrayList<ObdPidServiceNeeds> value) {
        this.obdPidServiceNeeds = value;
    }
    
    
    
    @XmlElement(name="OBD-RATIO-SERVICE-NEEDS")
    public ArrayList<ObdRatioServiceNeeds> getObdRatioServiceNeeds() {
    return this.obdRatioServiceNeeds;
}

    public void setObdRatioServiceNeeds(ArrayList<ObdRatioServiceNeeds> value) {
        this.obdRatioServiceNeeds = value;
    }
    
    
    
    @XmlElement(name="SUPERVISED-ENTITY-NEEDS")
    public ArrayList<SupervisedEntityNeeds> getSupervisedEntityNeeds() {
    return this.supervisedEntityNeeds;
}

    public void setSupervisedEntityNeeds(ArrayList<SupervisedEntityNeeds> value) {
        this.supervisedEntityNeeds = value;
    }
    
    
    
    @XmlElement(name="SYNC-TIME-BASE-MGR-USER-NEEDS")
    public ArrayList<SyncTimeBaseMgrUserNeeds> getSyncTimeBaseMgrUserNeeds() {
    return this.syncTimeBaseMgrUserNeeds;
}

    public void setSyncTimeBaseMgrUserNeeds(ArrayList<SyncTimeBaseMgrUserNeeds> value) {
        this.syncTimeBaseMgrUserNeeds = value;
    }
    
    
    
    @XmlElement(name="WARNING-INDICATOR-REQUESTED-BIT-NEEDS")
    public ArrayList<WarningIndicatorRequestedBitNeeds> getWarningIndicatorRequestedBitNeeds() {
    return this.warningIndicatorRequestedBitNeeds;
}

    public void setWarningIndicatorRequestedBitNeeds(ArrayList<WarningIndicatorRequestedBitNeeds> value) {
        this.warningIndicatorRequestedBitNeeds = value;
    }
    
    
}