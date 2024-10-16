package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ServiceNeeds {

    
    
    protected BswMgrNeeds bswMgrNeeds;
    
    
    
    protected ComMgrUserNeeds comMgrUserNeeds;
    
    
    
    protected CryptoServiceNeeds cryptoServiceNeeds;
    
    
    
    protected DiagnosticCommunicationManagerNeeds diagnosticCommunicationManagerNeeds;
    
    
    
    protected DiagnosticEnableConditionNeeds diagnosticEnableConditionNeeds;
    
    
    
    protected DiagnosticEventInfoNeeds diagnosticEventInfoNeeds;
    
    
    
    protected DiagnosticEventManagerNeeds diagnosticEventManagerNeeds;
    
    
    
    protected DiagnosticEventNeeds diagnosticEventNeeds;
    
    
    
    protected DiagnosticIoControlNeeds diagnosticIoControlNeeds;
    
    
    
    protected DiagnosticOperationCycleNeeds diagnosticOperationCycleNeeds;
    
    
    
    protected DiagnosticRoutineNeeds diagnosticRoutineNeeds;
    
    
    
    protected DiagnosticStorageConditionNeeds diagnosticStorageConditionNeeds;
    
    
    
    protected DiagnosticValueNeeds diagnosticValueNeeds;
    
    
    
    protected DiagnosticsCommunicationSecurityNeeds diagnosticsCommunicationSecurityNeeds;
    
    
    
    protected DltUserNeeds dltUserNeeds;
    
    
    
    protected DoIpActivationLineNeeds doIpActivationLineNeeds;
    
    
    
    protected DoIpGidNeeds doIpGidNeeds;
    
    
    
    protected DoIpGidSynchronizationNeeds doIpGidSynchronizationNeeds;
    
    
    
    protected DoIpPowerModeStatusNeeds doIpPowerModeStatusNeeds;
    
    
    
    protected DoIpRoutingActivationAuthenticationNeeds doIpRoutingActivationAuthenticationNeeds;
    
    
    
    protected DoIpRoutingActivationConfirmationNeeds doIpRoutingActivationConfirmationNeeds;
    
    
    
    protected DtcStatusChangeNotificationNeeds dtcStatusChangeNotificationNeeds;
    
    
    
    protected EcuStateMgrUserNeeds ecuStateMgrUserNeeds;
    
    
    
    protected FunctionInhibitionNeeds functionInhibitionNeeds;
    
    
    
    protected NvBlockNeeds nvBlockNeeds;
    
    
    
    protected ObdControlServiceNeeds obdControlServiceNeeds;
    
    
    
    protected ObdInfoServiceNeeds obdInfoServiceNeeds;
    
    
    
    protected ObdMonitorServiceNeeds obdMonitorServiceNeeds;
    
    
    
    protected ObdPidServiceNeeds obdPidServiceNeeds;
    
    
    
    protected ObdRatioServiceNeeds obdRatioServiceNeeds;
    
    
    
    protected SupervisedEntityNeeds supervisedEntityNeeds;
    
    
    
    protected SyncTimeBaseMgrUserNeeds syncTimeBaseMgrUserNeeds;
    
    
    
    protected WarningIndicatorRequestedBitNeeds warningIndicatorRequestedBitNeeds;
    
    

    
    
    @XmlElement(name="BSW-MGR-NEEDS")
    public BswMgrNeeds getBswMgrNeeds() {
    return this.bswMgrNeeds;
}

    public void setBswMgrNeeds(BswMgrNeeds value) {
        this.bswMgrNeeds = value;
    }
    
    
    
    @XmlElement(name="COM-MGR-USER-NEEDS")
    public ComMgrUserNeeds getComMgrUserNeeds() {
    return this.comMgrUserNeeds;
}

    public void setComMgrUserNeeds(ComMgrUserNeeds value) {
        this.comMgrUserNeeds = value;
    }
    
    
    
    @XmlElement(name="CRYPTO-SERVICE-NEEDS")
    public CryptoServiceNeeds getCryptoServiceNeeds() {
    return this.cryptoServiceNeeds;
}

    public void setCryptoServiceNeeds(CryptoServiceNeeds value) {
        this.cryptoServiceNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-COMMUNICATION-MANAGER-NEEDS")
    public DiagnosticCommunicationManagerNeeds getDiagnosticCommunicationManagerNeeds() {
    return this.diagnosticCommunicationManagerNeeds;
}

    public void setDiagnosticCommunicationManagerNeeds(DiagnosticCommunicationManagerNeeds value) {
        this.diagnosticCommunicationManagerNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-ENABLE-CONDITION-NEEDS")
    public DiagnosticEnableConditionNeeds getDiagnosticEnableConditionNeeds() {
    return this.diagnosticEnableConditionNeeds;
}

    public void setDiagnosticEnableConditionNeeds(DiagnosticEnableConditionNeeds value) {
        this.diagnosticEnableConditionNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-EVENT-INFO-NEEDS")
    public DiagnosticEventInfoNeeds getDiagnosticEventInfoNeeds() {
    return this.diagnosticEventInfoNeeds;
}

    public void setDiagnosticEventInfoNeeds(DiagnosticEventInfoNeeds value) {
        this.diagnosticEventInfoNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-EVENT-MANAGER-NEEDS")
    public DiagnosticEventManagerNeeds getDiagnosticEventManagerNeeds() {
    return this.diagnosticEventManagerNeeds;
}

    public void setDiagnosticEventManagerNeeds(DiagnosticEventManagerNeeds value) {
        this.diagnosticEventManagerNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-EVENT-NEEDS")
    public DiagnosticEventNeeds getDiagnosticEventNeeds() {
    return this.diagnosticEventNeeds;
}

    public void setDiagnosticEventNeeds(DiagnosticEventNeeds value) {
        this.diagnosticEventNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-IO-CONTROL-NEEDS")
    public DiagnosticIoControlNeeds getDiagnosticIoControlNeeds() {
    return this.diagnosticIoControlNeeds;
}

    public void setDiagnosticIoControlNeeds(DiagnosticIoControlNeeds value) {
        this.diagnosticIoControlNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-OPERATION-CYCLE-NEEDS")
    public DiagnosticOperationCycleNeeds getDiagnosticOperationCycleNeeds() {
    return this.diagnosticOperationCycleNeeds;
}

    public void setDiagnosticOperationCycleNeeds(DiagnosticOperationCycleNeeds value) {
        this.diagnosticOperationCycleNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-ROUTINE-NEEDS")
    public DiagnosticRoutineNeeds getDiagnosticRoutineNeeds() {
    return this.diagnosticRoutineNeeds;
}

    public void setDiagnosticRoutineNeeds(DiagnosticRoutineNeeds value) {
        this.diagnosticRoutineNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-STORAGE-CONDITION-NEEDS")
    public DiagnosticStorageConditionNeeds getDiagnosticStorageConditionNeeds() {
    return this.diagnosticStorageConditionNeeds;
}

    public void setDiagnosticStorageConditionNeeds(DiagnosticStorageConditionNeeds value) {
        this.diagnosticStorageConditionNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-VALUE-NEEDS")
    public DiagnosticValueNeeds getDiagnosticValueNeeds() {
    return this.diagnosticValueNeeds;
}

    public void setDiagnosticValueNeeds(DiagnosticValueNeeds value) {
        this.diagnosticValueNeeds = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTICS-COMMUNICATION-SECURITY-NEEDS")
    public DiagnosticsCommunicationSecurityNeeds getDiagnosticsCommunicationSecurityNeeds() {
    return this.diagnosticsCommunicationSecurityNeeds;
}

    public void setDiagnosticsCommunicationSecurityNeeds(DiagnosticsCommunicationSecurityNeeds value) {
        this.diagnosticsCommunicationSecurityNeeds = value;
    }
    
    
    
    @XmlElement(name="DLT-USER-NEEDS")
    public DltUserNeeds getDltUserNeeds() {
    return this.dltUserNeeds;
}

    public void setDltUserNeeds(DltUserNeeds value) {
        this.dltUserNeeds = value;
    }
    
    
    
    @XmlElement(name="DO-IP-ACTIVATION-LINE-NEEDS")
    public DoIpActivationLineNeeds getDoIpActivationLineNeeds() {
    return this.doIpActivationLineNeeds;
}

    public void setDoIpActivationLineNeeds(DoIpActivationLineNeeds value) {
        this.doIpActivationLineNeeds = value;
    }
    
    
    
    @XmlElement(name="DO-IP-GID-NEEDS")
    public DoIpGidNeeds getDoIpGidNeeds() {
    return this.doIpGidNeeds;
}

    public void setDoIpGidNeeds(DoIpGidNeeds value) {
        this.doIpGidNeeds = value;
    }
    
    
    
    @XmlElement(name="DO-IP-GID-SYNCHRONIZATION-NEEDS")
    public DoIpGidSynchronizationNeeds getDoIpGidSynchronizationNeeds() {
    return this.doIpGidSynchronizationNeeds;
}

    public void setDoIpGidSynchronizationNeeds(DoIpGidSynchronizationNeeds value) {
        this.doIpGidSynchronizationNeeds = value;
    }
    
    
    
    @XmlElement(name="DO-IP-POWER-MODE-STATUS-NEEDS")
    public DoIpPowerModeStatusNeeds getDoIpPowerModeStatusNeeds() {
    return this.doIpPowerModeStatusNeeds;
}

    public void setDoIpPowerModeStatusNeeds(DoIpPowerModeStatusNeeds value) {
        this.doIpPowerModeStatusNeeds = value;
    }
    
    
    
    @XmlElement(name="DO-IP-ROUTING-ACTIVATION-AUTHENTICATION-NEEDS")
    public DoIpRoutingActivationAuthenticationNeeds getDoIpRoutingActivationAuthenticationNeeds() {
    return this.doIpRoutingActivationAuthenticationNeeds;
}

    public void setDoIpRoutingActivationAuthenticationNeeds(DoIpRoutingActivationAuthenticationNeeds value) {
        this.doIpRoutingActivationAuthenticationNeeds = value;
    }
    
    
    
    @XmlElement(name="DO-IP-ROUTING-ACTIVATION-CONFIRMATION-NEEDS")
    public DoIpRoutingActivationConfirmationNeeds getDoIpRoutingActivationConfirmationNeeds() {
    return this.doIpRoutingActivationConfirmationNeeds;
}

    public void setDoIpRoutingActivationConfirmationNeeds(DoIpRoutingActivationConfirmationNeeds value) {
        this.doIpRoutingActivationConfirmationNeeds = value;
    }
    
    
    
    @XmlElement(name="DTC-STATUS-CHANGE-NOTIFICATION-NEEDS")
    public DtcStatusChangeNotificationNeeds getDtcStatusChangeNotificationNeeds() {
    return this.dtcStatusChangeNotificationNeeds;
}

    public void setDtcStatusChangeNotificationNeeds(DtcStatusChangeNotificationNeeds value) {
        this.dtcStatusChangeNotificationNeeds = value;
    }
    
    
    
    @XmlElement(name="ECU-STATE-MGR-USER-NEEDS")
    public EcuStateMgrUserNeeds getEcuStateMgrUserNeeds() {
    return this.ecuStateMgrUserNeeds;
}

    public void setEcuStateMgrUserNeeds(EcuStateMgrUserNeeds value) {
        this.ecuStateMgrUserNeeds = value;
    }
    
    
    
    @XmlElement(name="FUNCTION-INHIBITION-NEEDS")
    public FunctionInhibitionNeeds getFunctionInhibitionNeeds() {
    return this.functionInhibitionNeeds;
}

    public void setFunctionInhibitionNeeds(FunctionInhibitionNeeds value) {
        this.functionInhibitionNeeds = value;
    }
    
    
    
    @XmlElement(name="NV-BLOCK-NEEDS")
    public NvBlockNeeds getNvBlockNeeds() {
    return this.nvBlockNeeds;
}

    public void setNvBlockNeeds(NvBlockNeeds value) {
        this.nvBlockNeeds = value;
    }
    
    
    
    @XmlElement(name="OBD-CONTROL-SERVICE-NEEDS")
    public ObdControlServiceNeeds getObdControlServiceNeeds() {
    return this.obdControlServiceNeeds;
}

    public void setObdControlServiceNeeds(ObdControlServiceNeeds value) {
        this.obdControlServiceNeeds = value;
    }
    
    
    
    @XmlElement(name="OBD-INFO-SERVICE-NEEDS")
    public ObdInfoServiceNeeds getObdInfoServiceNeeds() {
    return this.obdInfoServiceNeeds;
}

    public void setObdInfoServiceNeeds(ObdInfoServiceNeeds value) {
        this.obdInfoServiceNeeds = value;
    }
    
    
    
    @XmlElement(name="OBD-MONITOR-SERVICE-NEEDS")
    public ObdMonitorServiceNeeds getObdMonitorServiceNeeds() {
    return this.obdMonitorServiceNeeds;
}

    public void setObdMonitorServiceNeeds(ObdMonitorServiceNeeds value) {
        this.obdMonitorServiceNeeds = value;
    }
    
    
    
    @XmlElement(name="OBD-PID-SERVICE-NEEDS")
    public ObdPidServiceNeeds getObdPidServiceNeeds() {
    return this.obdPidServiceNeeds;
}

    public void setObdPidServiceNeeds(ObdPidServiceNeeds value) {
        this.obdPidServiceNeeds = value;
    }
    
    
    
    @XmlElement(name="OBD-RATIO-SERVICE-NEEDS")
    public ObdRatioServiceNeeds getObdRatioServiceNeeds() {
    return this.obdRatioServiceNeeds;
}

    public void setObdRatioServiceNeeds(ObdRatioServiceNeeds value) {
        this.obdRatioServiceNeeds = value;
    }
    
    
    
    @XmlElement(name="SUPERVISED-ENTITY-NEEDS")
    public SupervisedEntityNeeds getSupervisedEntityNeeds() {
    return this.supervisedEntityNeeds;
}

    public void setSupervisedEntityNeeds(SupervisedEntityNeeds value) {
        this.supervisedEntityNeeds = value;
    }
    
    
    
    @XmlElement(name="SYNC-TIME-BASE-MGR-USER-NEEDS")
    public SyncTimeBaseMgrUserNeeds getSyncTimeBaseMgrUserNeeds() {
    return this.syncTimeBaseMgrUserNeeds;
}

    public void setSyncTimeBaseMgrUserNeeds(SyncTimeBaseMgrUserNeeds value) {
        this.syncTimeBaseMgrUserNeeds = value;
    }
    
    
    
    @XmlElement(name="WARNING-INDICATOR-REQUESTED-BIT-NEEDS")
    public WarningIndicatorRequestedBitNeeds getWarningIndicatorRequestedBitNeeds() {
    return this.warningIndicatorRequestedBitNeeds;
}

    public void setWarningIndicatorRequestedBitNeeds(WarningIndicatorRequestedBitNeeds value) {
        this.warningIndicatorRequestedBitNeeds = value;
    }
    
    
}