package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Serviceitems {

    
    
    protected ArrayList<BswMgrNeeds> bswMgrNeedss;
    
    
    
    protected ArrayList<ComMgrUserNeeds> comMgrUserNeedss;
    
    
    
    protected ArrayList<CryptoServiceNeeds> cryptoServiceNeedss;
    
    
    
    protected ArrayList<DiagnosticCommunicationManagerNeeds> diagnosticCommunicationManagerNeedss;
    
    
    
    protected ArrayList<DiagnosticEnableConditionNeeds> diagnosticEnableConditionNeedss;
    
    
    
    protected ArrayList<DiagnosticEventInfoNeeds> diagnosticEventInfoNeedss;
    
    
    
    protected ArrayList<DiagnosticEventManagerNeeds> diagnosticEventManagerNeedss;
    
    
    
    protected ArrayList<DiagnosticEventNeeds> diagnosticEventNeedss;
    
    
    
    protected ArrayList<DiagnosticIoControlNeeds> diagnosticIoControlNeedss;
    
    
    
    protected ArrayList<DiagnosticOperationCycleNeeds> diagnosticOperationCycleNeedss;
    
    
    
    protected ArrayList<DiagnosticRoutineNeeds> diagnosticRoutineNeedss;
    
    
    
    protected ArrayList<DiagnosticStorageConditionNeeds> diagnosticStorageConditionNeedss;
    
    
    
    protected ArrayList<DiagnosticValueNeeds> diagnosticValueNeedss;
    
    
    
    protected ArrayList<DiagnosticsCommunicationSecurityNeeds> diagnosticsCommunicationSecurityNeedss;
    
    
    
    protected ArrayList<DltUserNeeds> dltUserNeedss;
    
    
    
    protected ArrayList<DoIpActivationLineNeeds> doIpActivationLineNeedss;
    
    
    
    protected ArrayList<DoIpGidNeeds> doIpGidNeedss;
    
    
    
    protected ArrayList<DoIpGidSynchronizationNeeds> doIpGidSynchronizationNeedss;
    
    
    
    protected ArrayList<DoIpPowerModeStatusNeeds> doIpPowerModeStatusNeedss;
    
    
    
    protected ArrayList<DoIpRoutingActivationAuthenticationNeeds> doIpRoutingActivationAuthenticationNeedss;
    
    
    
    protected ArrayList<DoIpRoutingActivationConfirmationNeeds> doIpRoutingActivationConfirmationNeedss;
    
    
    
    protected ArrayList<DtcStatusChangeNotificationNeeds> dtcStatusChangeNotificationNeedss;
    
    
    
    protected ArrayList<EcuStateMgrUserNeeds> ecuStateMgrUserNeedss;
    
    
    
    protected ArrayList<FunctionInhibitionNeeds> functionInhibitionNeedss;
    
    
    
    protected ArrayList<NvBlockNeeds> nvBlockNeedss;
    
    
    
    protected ArrayList<ObdControlServiceNeeds> obdControlServiceNeedss;
    
    
    
    protected ArrayList<ObdInfoServiceNeeds> obdInfoServiceNeedss;
    
    
    
    protected ArrayList<ObdMonitorServiceNeeds> obdMonitorServiceNeedss;
    
    
    
    protected ArrayList<ObdPidServiceNeeds> obdPidServiceNeedss;
    
    
    
    protected ArrayList<ObdRatioServiceNeeds> obdRatioServiceNeedss;
    
    
    
    protected ArrayList<SupervisedEntityNeeds> supervisedEntityNeedss;
    
    
    
    protected ArrayList<SyncTimeBaseMgrUserNeeds> syncTimeBaseMgrUserNeedss;
    
    
    
    protected ArrayList<WarningIndicatorRequestedBitNeeds> warningIndicatorRequestedBitNeedss;
    
    

    
    
    @XmlElement(name="BSW-MGR-NEEDS")
    public ArrayList<BswMgrNeeds> getBswMgrNeedss() {
        return this.bswMgrNeedss;
    }

    public void setBswMgrNeedss(ArrayList<BswMgrNeeds> value) {
        this.bswMgrNeedss = value;
    }
    
    
    
    @XmlElement(name="COM-MGR-USER-NEEDS")
    public ArrayList<ComMgrUserNeeds> getComMgrUserNeedss() {
        return this.comMgrUserNeedss;
    }

    public void setComMgrUserNeedss(ArrayList<ComMgrUserNeeds> value) {
        this.comMgrUserNeedss = value;
    }
    
    
    
    @XmlElement(name="CRYPTO-SERVICE-NEEDS")
    public ArrayList<CryptoServiceNeeds> getCryptoServiceNeedss() {
        return this.cryptoServiceNeedss;
    }

    public void setCryptoServiceNeedss(ArrayList<CryptoServiceNeeds> value) {
        this.cryptoServiceNeedss = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-COMMUNICATION-MANAGER-NEEDS")
    public ArrayList<DiagnosticCommunicationManagerNeeds> getDiagnosticCommunicationManagerNeedss() {
        return this.diagnosticCommunicationManagerNeedss;
    }

    public void setDiagnosticCommunicationManagerNeedss(ArrayList<DiagnosticCommunicationManagerNeeds> value) {
        this.diagnosticCommunicationManagerNeedss = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-ENABLE-CONDITION-NEEDS")
    public ArrayList<DiagnosticEnableConditionNeeds> getDiagnosticEnableConditionNeedss() {
        return this.diagnosticEnableConditionNeedss;
    }

    public void setDiagnosticEnableConditionNeedss(ArrayList<DiagnosticEnableConditionNeeds> value) {
        this.diagnosticEnableConditionNeedss = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-EVENT-INFO-NEEDS")
    public ArrayList<DiagnosticEventInfoNeeds> getDiagnosticEventInfoNeedss() {
        return this.diagnosticEventInfoNeedss;
    }

    public void setDiagnosticEventInfoNeedss(ArrayList<DiagnosticEventInfoNeeds> value) {
        this.diagnosticEventInfoNeedss = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-EVENT-MANAGER-NEEDS")
    public ArrayList<DiagnosticEventManagerNeeds> getDiagnosticEventManagerNeedss() {
        return this.diagnosticEventManagerNeedss;
    }

    public void setDiagnosticEventManagerNeedss(ArrayList<DiagnosticEventManagerNeeds> value) {
        this.diagnosticEventManagerNeedss = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-EVENT-NEEDS")
    public ArrayList<DiagnosticEventNeeds> getDiagnosticEventNeedss() {
        return this.diagnosticEventNeedss;
    }

    public void setDiagnosticEventNeedss(ArrayList<DiagnosticEventNeeds> value) {
        this.diagnosticEventNeedss = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-IO-CONTROL-NEEDS")
    public ArrayList<DiagnosticIoControlNeeds> getDiagnosticIoControlNeedss() {
        return this.diagnosticIoControlNeedss;
    }

    public void setDiagnosticIoControlNeedss(ArrayList<DiagnosticIoControlNeeds> value) {
        this.diagnosticIoControlNeedss = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-OPERATION-CYCLE-NEEDS")
    public ArrayList<DiagnosticOperationCycleNeeds> getDiagnosticOperationCycleNeedss() {
        return this.diagnosticOperationCycleNeedss;
    }

    public void setDiagnosticOperationCycleNeedss(ArrayList<DiagnosticOperationCycleNeeds> value) {
        this.diagnosticOperationCycleNeedss = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-ROUTINE-NEEDS")
    public ArrayList<DiagnosticRoutineNeeds> getDiagnosticRoutineNeedss() {
        return this.diagnosticRoutineNeedss;
    }

    public void setDiagnosticRoutineNeedss(ArrayList<DiagnosticRoutineNeeds> value) {
        this.diagnosticRoutineNeedss = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-STORAGE-CONDITION-NEEDS")
    public ArrayList<DiagnosticStorageConditionNeeds> getDiagnosticStorageConditionNeedss() {
        return this.diagnosticStorageConditionNeedss;
    }

    public void setDiagnosticStorageConditionNeedss(ArrayList<DiagnosticStorageConditionNeeds> value) {
        this.diagnosticStorageConditionNeedss = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTIC-VALUE-NEEDS")
    public ArrayList<DiagnosticValueNeeds> getDiagnosticValueNeedss() {
        return this.diagnosticValueNeedss;
    }

    public void setDiagnosticValueNeedss(ArrayList<DiagnosticValueNeeds> value) {
        this.diagnosticValueNeedss = value;
    }
    
    
    
    @XmlElement(name="DIAGNOSTICS-COMMUNICATION-SECURITY-NEEDS")
    public ArrayList<DiagnosticsCommunicationSecurityNeeds> getDiagnosticsCommunicationSecurityNeedss() {
        return this.diagnosticsCommunicationSecurityNeedss;
    }

    public void setDiagnosticsCommunicationSecurityNeedss(ArrayList<DiagnosticsCommunicationSecurityNeeds> value) {
        this.diagnosticsCommunicationSecurityNeedss = value;
    }
    
    
    
    @XmlElement(name="DLT-USER-NEEDS")
    public ArrayList<DltUserNeeds> getDltUserNeedss() {
        return this.dltUserNeedss;
    }

    public void setDltUserNeedss(ArrayList<DltUserNeeds> value) {
        this.dltUserNeedss = value;
    }
    
    
    
    @XmlElement(name="DO-IP-ACTIVATION-LINE-NEEDS")
    public ArrayList<DoIpActivationLineNeeds> getDoIpActivationLineNeedss() {
        return this.doIpActivationLineNeedss;
    }

    public void setDoIpActivationLineNeedss(ArrayList<DoIpActivationLineNeeds> value) {
        this.doIpActivationLineNeedss = value;
    }
    
    
    
    @XmlElement(name="DO-IP-GID-NEEDS")
    public ArrayList<DoIpGidNeeds> getDoIpGidNeedss() {
        return this.doIpGidNeedss;
    }

    public void setDoIpGidNeedss(ArrayList<DoIpGidNeeds> value) {
        this.doIpGidNeedss = value;
    }
    
    
    
    @XmlElement(name="DO-IP-GID-SYNCHRONIZATION-NEEDS")
    public ArrayList<DoIpGidSynchronizationNeeds> getDoIpGidSynchronizationNeedss() {
        return this.doIpGidSynchronizationNeedss;
    }

    public void setDoIpGidSynchronizationNeedss(ArrayList<DoIpGidSynchronizationNeeds> value) {
        this.doIpGidSynchronizationNeedss = value;
    }
    
    
    
    @XmlElement(name="DO-IP-POWER-MODE-STATUS-NEEDS")
    public ArrayList<DoIpPowerModeStatusNeeds> getDoIpPowerModeStatusNeedss() {
        return this.doIpPowerModeStatusNeedss;
    }

    public void setDoIpPowerModeStatusNeedss(ArrayList<DoIpPowerModeStatusNeeds> value) {
        this.doIpPowerModeStatusNeedss = value;
    }
    
    
    
    @XmlElement(name="DO-IP-ROUTING-ACTIVATION-AUTHENTICATION-NEEDS")
    public ArrayList<DoIpRoutingActivationAuthenticationNeeds> getDoIpRoutingActivationAuthenticationNeedss() {
        return this.doIpRoutingActivationAuthenticationNeedss;
    }

    public void setDoIpRoutingActivationAuthenticationNeedss(ArrayList<DoIpRoutingActivationAuthenticationNeeds> value) {
        this.doIpRoutingActivationAuthenticationNeedss = value;
    }
    
    
    
    @XmlElement(name="DO-IP-ROUTING-ACTIVATION-CONFIRMATION-NEEDS")
    public ArrayList<DoIpRoutingActivationConfirmationNeeds> getDoIpRoutingActivationConfirmationNeedss() {
        return this.doIpRoutingActivationConfirmationNeedss;
    }

    public void setDoIpRoutingActivationConfirmationNeedss(ArrayList<DoIpRoutingActivationConfirmationNeeds> value) {
        this.doIpRoutingActivationConfirmationNeedss = value;
    }
    
    
    
    @XmlElement(name="DTC-STATUS-CHANGE-NOTIFICATION-NEEDS")
    public ArrayList<DtcStatusChangeNotificationNeeds> getDtcStatusChangeNotificationNeedss() {
        return this.dtcStatusChangeNotificationNeedss;
    }

    public void setDtcStatusChangeNotificationNeedss(ArrayList<DtcStatusChangeNotificationNeeds> value) {
        this.dtcStatusChangeNotificationNeedss = value;
    }
    
    
    
    @XmlElement(name="ECU-STATE-MGR-USER-NEEDS")
    public ArrayList<EcuStateMgrUserNeeds> getEcuStateMgrUserNeedss() {
        return this.ecuStateMgrUserNeedss;
    }

    public void setEcuStateMgrUserNeedss(ArrayList<EcuStateMgrUserNeeds> value) {
        this.ecuStateMgrUserNeedss = value;
    }
    
    
    
    @XmlElement(name="FUNCTION-INHIBITION-NEEDS")
    public ArrayList<FunctionInhibitionNeeds> getFunctionInhibitionNeedss() {
        return this.functionInhibitionNeedss;
    }

    public void setFunctionInhibitionNeedss(ArrayList<FunctionInhibitionNeeds> value) {
        this.functionInhibitionNeedss = value;
    }
    
    
    
    @XmlElement(name="NV-BLOCK-NEEDS")
    public ArrayList<NvBlockNeeds> getNvBlockNeedss() {
        return this.nvBlockNeedss;
    }

    public void setNvBlockNeedss(ArrayList<NvBlockNeeds> value) {
        this.nvBlockNeedss = value;
    }
    
    
    
    @XmlElement(name="OBD-CONTROL-SERVICE-NEEDS")
    public ArrayList<ObdControlServiceNeeds> getObdControlServiceNeedss() {
        return this.obdControlServiceNeedss;
    }

    public void setObdControlServiceNeedss(ArrayList<ObdControlServiceNeeds> value) {
        this.obdControlServiceNeedss = value;
    }
    
    
    
    @XmlElement(name="OBD-INFO-SERVICE-NEEDS")
    public ArrayList<ObdInfoServiceNeeds> getObdInfoServiceNeedss() {
        return this.obdInfoServiceNeedss;
    }

    public void setObdInfoServiceNeedss(ArrayList<ObdInfoServiceNeeds> value) {
        this.obdInfoServiceNeedss = value;
    }
    
    
    
    @XmlElement(name="OBD-MONITOR-SERVICE-NEEDS")
    public ArrayList<ObdMonitorServiceNeeds> getObdMonitorServiceNeedss() {
        return this.obdMonitorServiceNeedss;
    }

    public void setObdMonitorServiceNeedss(ArrayList<ObdMonitorServiceNeeds> value) {
        this.obdMonitorServiceNeedss = value;
    }
    
    
    
    @XmlElement(name="OBD-PID-SERVICE-NEEDS")
    public ArrayList<ObdPidServiceNeeds> getObdPidServiceNeedss() {
        return this.obdPidServiceNeedss;
    }

    public void setObdPidServiceNeedss(ArrayList<ObdPidServiceNeeds> value) {
        this.obdPidServiceNeedss = value;
    }
    
    
    
    @XmlElement(name="OBD-RATIO-SERVICE-NEEDS")
    public ArrayList<ObdRatioServiceNeeds> getObdRatioServiceNeedss() {
        return this.obdRatioServiceNeedss;
    }

    public void setObdRatioServiceNeedss(ArrayList<ObdRatioServiceNeeds> value) {
        this.obdRatioServiceNeedss = value;
    }
    
    
    
    @XmlElement(name="SUPERVISED-ENTITY-NEEDS")
    public ArrayList<SupervisedEntityNeeds> getSupervisedEntityNeedss() {
        return this.supervisedEntityNeedss;
    }

    public void setSupervisedEntityNeedss(ArrayList<SupervisedEntityNeeds> value) {
        this.supervisedEntityNeedss = value;
    }
    
    
    
    @XmlElement(name="SYNC-TIME-BASE-MGR-USER-NEEDS")
    public ArrayList<SyncTimeBaseMgrUserNeeds> getSyncTimeBaseMgrUserNeedss() {
        return this.syncTimeBaseMgrUserNeedss;
    }

    public void setSyncTimeBaseMgrUserNeedss(ArrayList<SyncTimeBaseMgrUserNeeds> value) {
        this.syncTimeBaseMgrUserNeedss = value;
    }
    
    
    
    @XmlElement(name="WARNING-INDICATOR-REQUESTED-BIT-NEEDS")
    public ArrayList<WarningIndicatorRequestedBitNeeds> getWarningIndicatorRequestedBitNeedss() {
        return this.warningIndicatorRequestedBitNeedss;
    }

    public void setWarningIndicatorRequestedBitNeedss(ArrayList<WarningIndicatorRequestedBitNeeds> value) {
        this.warningIndicatorRequestedBitNeedss = value;
    }
    
    
}