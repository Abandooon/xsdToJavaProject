package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ServiceNeedsWrapper {

    
    private ServiceNeeds serviceNeeds;

    public ServiceNeedsWrapper(ServiceNeeds serviceNeeds) {
        this.serviceNeeds = serviceNeeds;
    }

   
    public BswMgrNeedsWrapper getBswMgrNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getBswMgrNeeds())) {
            
            return new BswMgrNeedsWrapper(serviceNeeds.getBswMgrNeeds());
            
        } else {
            return null;
        }
        
    }

    public ComMgrUserNeedsWrapper getComMgrUserNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getComMgrUserNeeds())) {
            
            return new ComMgrUserNeedsWrapper(serviceNeeds.getComMgrUserNeeds());
            
        } else {
            return null;
        }
        
    }

    public CryptoServiceNeedsWrapper getCryptoServiceNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getCryptoServiceNeeds())) {
            
            return new CryptoServiceNeedsWrapper(serviceNeeds.getCryptoServiceNeeds());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticCommunicationManagerNeedsWrapper getDiagnosticCommunicationManagerNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDiagnosticCommunicationManagerNeeds())) {
            
            return new DiagnosticCommunicationManagerNeedsWrapper(serviceNeeds.getDiagnosticCommunicationManagerNeeds());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEnableConditionNeedsWrapper getDiagnosticEnableConditionNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDiagnosticEnableConditionNeeds())) {
            
            return new DiagnosticEnableConditionNeedsWrapper(serviceNeeds.getDiagnosticEnableConditionNeeds());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEventInfoNeedsWrapper getDiagnosticEventInfoNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDiagnosticEventInfoNeeds())) {
            
            return new DiagnosticEventInfoNeedsWrapper(serviceNeeds.getDiagnosticEventInfoNeeds());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEventManagerNeedsWrapper getDiagnosticEventManagerNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDiagnosticEventManagerNeeds())) {
            
            return new DiagnosticEventManagerNeedsWrapper(serviceNeeds.getDiagnosticEventManagerNeeds());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEventNeedsWrapper getDiagnosticEventNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDiagnosticEventNeeds())) {
            
            return new DiagnosticEventNeedsWrapper(serviceNeeds.getDiagnosticEventNeeds());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticIoControlNeedsWrapper getDiagnosticIoControlNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDiagnosticIoControlNeeds())) {
            
            return new DiagnosticIoControlNeedsWrapper(serviceNeeds.getDiagnosticIoControlNeeds());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticOperationCycleNeedsWrapper getDiagnosticOperationCycleNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDiagnosticOperationCycleNeeds())) {
            
            return new DiagnosticOperationCycleNeedsWrapper(serviceNeeds.getDiagnosticOperationCycleNeeds());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticRoutineNeedsWrapper getDiagnosticRoutineNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDiagnosticRoutineNeeds())) {
            
            return new DiagnosticRoutineNeedsWrapper(serviceNeeds.getDiagnosticRoutineNeeds());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticStorageConditionNeedsWrapper getDiagnosticStorageConditionNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDiagnosticStorageConditionNeeds())) {
            
            return new DiagnosticStorageConditionNeedsWrapper(serviceNeeds.getDiagnosticStorageConditionNeeds());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticValueNeedsWrapper getDiagnosticValueNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDiagnosticValueNeeds())) {
            
            return new DiagnosticValueNeedsWrapper(serviceNeeds.getDiagnosticValueNeeds());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticsCommunicationSecurityNeedsWrapper getDiagnosticsCommunicationSecurityNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDiagnosticsCommunicationSecurityNeeds())) {
            
            return new DiagnosticsCommunicationSecurityNeedsWrapper(serviceNeeds.getDiagnosticsCommunicationSecurityNeeds());
            
        } else {
            return null;
        }
        
    }

    public DltUserNeedsWrapper getDltUserNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDltUserNeeds())) {
            
            return new DltUserNeedsWrapper(serviceNeeds.getDltUserNeeds());
            
        } else {
            return null;
        }
        
    }

    public DoIpActivationLineNeedsWrapper getDoIpActivationLineNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDoIpActivationLineNeeds())) {
            
            return new DoIpActivationLineNeedsWrapper(serviceNeeds.getDoIpActivationLineNeeds());
            
        } else {
            return null;
        }
        
    }

    public DoIpGidNeedsWrapper getDoIpGidNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDoIpGidNeeds())) {
            
            return new DoIpGidNeedsWrapper(serviceNeeds.getDoIpGidNeeds());
            
        } else {
            return null;
        }
        
    }

    public DoIpGidSynchronizationNeedsWrapper getDoIpGidSynchronizationNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDoIpGidSynchronizationNeeds())) {
            
            return new DoIpGidSynchronizationNeedsWrapper(serviceNeeds.getDoIpGidSynchronizationNeeds());
            
        } else {
            return null;
        }
        
    }

    public DoIpPowerModeStatusNeedsWrapper getDoIpPowerModeStatusNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDoIpPowerModeStatusNeeds())) {
            
            return new DoIpPowerModeStatusNeedsWrapper(serviceNeeds.getDoIpPowerModeStatusNeeds());
            
        } else {
            return null;
        }
        
    }

    public DoIpRoutingActivationAuthenticationNeedsWrapper getDoIpRoutingActivationAuthenticationNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDoIpRoutingActivationAuthenticationNeeds())) {
            
            return new DoIpRoutingActivationAuthenticationNeedsWrapper(serviceNeeds.getDoIpRoutingActivationAuthenticationNeeds());
            
        } else {
            return null;
        }
        
    }

    public DoIpRoutingActivationConfirmationNeedsWrapper getDoIpRoutingActivationConfirmationNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDoIpRoutingActivationConfirmationNeeds())) {
            
            return new DoIpRoutingActivationConfirmationNeedsWrapper(serviceNeeds.getDoIpRoutingActivationConfirmationNeeds());
            
        } else {
            return null;
        }
        
    }

    public DtcStatusChangeNotificationNeedsWrapper getDtcStatusChangeNotificationNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getDtcStatusChangeNotificationNeeds())) {
            
            return new DtcStatusChangeNotificationNeedsWrapper(serviceNeeds.getDtcStatusChangeNotificationNeeds());
            
        } else {
            return null;
        }
        
    }

    public EcuStateMgrUserNeedsWrapper getEcuStateMgrUserNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getEcuStateMgrUserNeeds())) {
            
            return new EcuStateMgrUserNeedsWrapper(serviceNeeds.getEcuStateMgrUserNeeds());
            
        } else {
            return null;
        }
        
    }

    public FunctionInhibitionNeedsWrapper getFunctionInhibitionNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getFunctionInhibitionNeeds())) {
            
            return new FunctionInhibitionNeedsWrapper(serviceNeeds.getFunctionInhibitionNeeds());
            
        } else {
            return null;
        }
        
    }

    public NvBlockNeedsWrapper getNvBlockNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getNvBlockNeeds())) {
            
            return new NvBlockNeedsWrapper(serviceNeeds.getNvBlockNeeds());
            
        } else {
            return null;
        }
        
    }

    public ObdControlServiceNeedsWrapper getObdControlServiceNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getObdControlServiceNeeds())) {
            
            return new ObdControlServiceNeedsWrapper(serviceNeeds.getObdControlServiceNeeds());
            
        } else {
            return null;
        }
        
    }

    public ObdInfoServiceNeedsWrapper getObdInfoServiceNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getObdInfoServiceNeeds())) {
            
            return new ObdInfoServiceNeedsWrapper(serviceNeeds.getObdInfoServiceNeeds());
            
        } else {
            return null;
        }
        
    }

    public ObdMonitorServiceNeedsWrapper getObdMonitorServiceNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getObdMonitorServiceNeeds())) {
            
            return new ObdMonitorServiceNeedsWrapper(serviceNeeds.getObdMonitorServiceNeeds());
            
        } else {
            return null;
        }
        
    }

    public ObdPidServiceNeedsWrapper getObdPidServiceNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getObdPidServiceNeeds())) {
            
            return new ObdPidServiceNeedsWrapper(serviceNeeds.getObdPidServiceNeeds());
            
        } else {
            return null;
        }
        
    }

    public ObdRatioServiceNeedsWrapper getObdRatioServiceNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getObdRatioServiceNeeds())) {
            
            return new ObdRatioServiceNeedsWrapper(serviceNeeds.getObdRatioServiceNeeds());
            
        } else {
            return null;
        }
        
    }

    public SupervisedEntityNeedsWrapper getSupervisedEntityNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getSupervisedEntityNeeds())) {
            
            return new SupervisedEntityNeedsWrapper(serviceNeeds.getSupervisedEntityNeeds());
            
        } else {
            return null;
        }
        
    }

    public SyncTimeBaseMgrUserNeedsWrapper getSyncTimeBaseMgrUserNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getSyncTimeBaseMgrUserNeeds())) {
            
            return new SyncTimeBaseMgrUserNeedsWrapper(serviceNeeds.getSyncTimeBaseMgrUserNeeds());
            
        } else {
            return null;
        }
        
    }

    public WarningIndicatorRequestedBitNeedsWrapper getWarningIndicatorRequestedBitNeeds() {
        
        if (CollUtil.isNotEmpty(serviceNeeds.getWarningIndicatorRequestedBitNeeds())) {
            
            return new WarningIndicatorRequestedBitNeedsWrapper(serviceNeeds.getWarningIndicatorRequestedBitNeeds());
            
        } else {
            return null;
        }
        
    }




    


    
}