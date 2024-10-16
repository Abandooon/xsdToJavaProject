package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ServiceItemsWrapper {

    
    private ServiceItems serviceItems;

    public ServiceItemsWrapper(ServiceItems serviceItems) {
        this.serviceItems = serviceItems;
    }

   
    public ArrayList<BswMgrNeedsWrapper> getBswMgrNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getBswMgrNeeds())) {
            ArrayList<BswMgrNeeds> originalList = serviceItems.getBswMgrNeeds();
            ArrayList<BswMgrNeedsWrapper> wrapperList = (ArrayList<BswMgrNeedsWrapper>)originalList.stream()
                .map(item -> new BswMgrNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ComMgrUserNeedsWrapper> getComMgrUserNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getComMgrUserNeeds())) {
            ArrayList<ComMgrUserNeeds> originalList = serviceItems.getComMgrUserNeeds();
            ArrayList<ComMgrUserNeedsWrapper> wrapperList = (ArrayList<ComMgrUserNeedsWrapper>)originalList.stream()
                .map(item -> new ComMgrUserNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CryptoServiceNeedsWrapper> getCryptoServiceNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getCryptoServiceNeeds())) {
            ArrayList<CryptoServiceNeeds> originalList = serviceItems.getCryptoServiceNeeds();
            ArrayList<CryptoServiceNeedsWrapper> wrapperList = (ArrayList<CryptoServiceNeedsWrapper>)originalList.stream()
                .map(item -> new CryptoServiceNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticCommunicationManagerNeedsWrapper> getDiagnosticCommunicationManagerNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDiagnosticCommunicationManagerNeeds())) {
            ArrayList<DiagnosticCommunicationManagerNeeds> originalList = serviceItems.getDiagnosticCommunicationManagerNeeds();
            ArrayList<DiagnosticCommunicationManagerNeedsWrapper> wrapperList = (ArrayList<DiagnosticCommunicationManagerNeedsWrapper>)originalList.stream()
                .map(item -> new DiagnosticCommunicationManagerNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEnableConditionNeedsWrapper> getDiagnosticEnableConditionNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDiagnosticEnableConditionNeeds())) {
            ArrayList<DiagnosticEnableConditionNeeds> originalList = serviceItems.getDiagnosticEnableConditionNeeds();
            ArrayList<DiagnosticEnableConditionNeedsWrapper> wrapperList = (ArrayList<DiagnosticEnableConditionNeedsWrapper>)originalList.stream()
                .map(item -> new DiagnosticEnableConditionNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEventInfoNeedsWrapper> getDiagnosticEventInfoNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDiagnosticEventInfoNeeds())) {
            ArrayList<DiagnosticEventInfoNeeds> originalList = serviceItems.getDiagnosticEventInfoNeeds();
            ArrayList<DiagnosticEventInfoNeedsWrapper> wrapperList = (ArrayList<DiagnosticEventInfoNeedsWrapper>)originalList.stream()
                .map(item -> new DiagnosticEventInfoNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEventManagerNeedsWrapper> getDiagnosticEventManagerNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDiagnosticEventManagerNeeds())) {
            ArrayList<DiagnosticEventManagerNeeds> originalList = serviceItems.getDiagnosticEventManagerNeeds();
            ArrayList<DiagnosticEventManagerNeedsWrapper> wrapperList = (ArrayList<DiagnosticEventManagerNeedsWrapper>)originalList.stream()
                .map(item -> new DiagnosticEventManagerNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEventNeedsWrapper> getDiagnosticEventNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDiagnosticEventNeeds())) {
            ArrayList<DiagnosticEventNeeds> originalList = serviceItems.getDiagnosticEventNeeds();
            ArrayList<DiagnosticEventNeedsWrapper> wrapperList = (ArrayList<DiagnosticEventNeedsWrapper>)originalList.stream()
                .map(item -> new DiagnosticEventNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticIoControlNeedsWrapper> getDiagnosticIoControlNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDiagnosticIoControlNeeds())) {
            ArrayList<DiagnosticIoControlNeeds> originalList = serviceItems.getDiagnosticIoControlNeeds();
            ArrayList<DiagnosticIoControlNeedsWrapper> wrapperList = (ArrayList<DiagnosticIoControlNeedsWrapper>)originalList.stream()
                .map(item -> new DiagnosticIoControlNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticOperationCycleNeedsWrapper> getDiagnosticOperationCycleNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDiagnosticOperationCycleNeeds())) {
            ArrayList<DiagnosticOperationCycleNeeds> originalList = serviceItems.getDiagnosticOperationCycleNeeds();
            ArrayList<DiagnosticOperationCycleNeedsWrapper> wrapperList = (ArrayList<DiagnosticOperationCycleNeedsWrapper>)originalList.stream()
                .map(item -> new DiagnosticOperationCycleNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticRoutineNeedsWrapper> getDiagnosticRoutineNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDiagnosticRoutineNeeds())) {
            ArrayList<DiagnosticRoutineNeeds> originalList = serviceItems.getDiagnosticRoutineNeeds();
            ArrayList<DiagnosticRoutineNeedsWrapper> wrapperList = (ArrayList<DiagnosticRoutineNeedsWrapper>)originalList.stream()
                .map(item -> new DiagnosticRoutineNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticStorageConditionNeedsWrapper> getDiagnosticStorageConditionNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDiagnosticStorageConditionNeeds())) {
            ArrayList<DiagnosticStorageConditionNeeds> originalList = serviceItems.getDiagnosticStorageConditionNeeds();
            ArrayList<DiagnosticStorageConditionNeedsWrapper> wrapperList = (ArrayList<DiagnosticStorageConditionNeedsWrapper>)originalList.stream()
                .map(item -> new DiagnosticStorageConditionNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticValueNeedsWrapper> getDiagnosticValueNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDiagnosticValueNeeds())) {
            ArrayList<DiagnosticValueNeeds> originalList = serviceItems.getDiagnosticValueNeeds();
            ArrayList<DiagnosticValueNeedsWrapper> wrapperList = (ArrayList<DiagnosticValueNeedsWrapper>)originalList.stream()
                .map(item -> new DiagnosticValueNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticsCommunicationSecurityNeedsWrapper> getDiagnosticsCommunicationSecurityNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDiagnosticsCommunicationSecurityNeeds())) {
            ArrayList<DiagnosticsCommunicationSecurityNeeds> originalList = serviceItems.getDiagnosticsCommunicationSecurityNeeds();
            ArrayList<DiagnosticsCommunicationSecurityNeedsWrapper> wrapperList = (ArrayList<DiagnosticsCommunicationSecurityNeedsWrapper>)originalList.stream()
                .map(item -> new DiagnosticsCommunicationSecurityNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DltUserNeedsWrapper> getDltUserNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDltUserNeeds())) {
            ArrayList<DltUserNeeds> originalList = serviceItems.getDltUserNeeds();
            ArrayList<DltUserNeedsWrapper> wrapperList = (ArrayList<DltUserNeedsWrapper>)originalList.stream()
                .map(item -> new DltUserNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DoIpActivationLineNeedsWrapper> getDoIpActivationLineNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDoIpActivationLineNeeds())) {
            ArrayList<DoIpActivationLineNeeds> originalList = serviceItems.getDoIpActivationLineNeeds();
            ArrayList<DoIpActivationLineNeedsWrapper> wrapperList = (ArrayList<DoIpActivationLineNeedsWrapper>)originalList.stream()
                .map(item -> new DoIpActivationLineNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DoIpGidNeedsWrapper> getDoIpGidNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDoIpGidNeeds())) {
            ArrayList<DoIpGidNeeds> originalList = serviceItems.getDoIpGidNeeds();
            ArrayList<DoIpGidNeedsWrapper> wrapperList = (ArrayList<DoIpGidNeedsWrapper>)originalList.stream()
                .map(item -> new DoIpGidNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DoIpGidSynchronizationNeedsWrapper> getDoIpGidSynchronizationNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDoIpGidSynchronizationNeeds())) {
            ArrayList<DoIpGidSynchronizationNeeds> originalList = serviceItems.getDoIpGidSynchronizationNeeds();
            ArrayList<DoIpGidSynchronizationNeedsWrapper> wrapperList = (ArrayList<DoIpGidSynchronizationNeedsWrapper>)originalList.stream()
                .map(item -> new DoIpGidSynchronizationNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DoIpPowerModeStatusNeedsWrapper> getDoIpPowerModeStatusNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDoIpPowerModeStatusNeeds())) {
            ArrayList<DoIpPowerModeStatusNeeds> originalList = serviceItems.getDoIpPowerModeStatusNeeds();
            ArrayList<DoIpPowerModeStatusNeedsWrapper> wrapperList = (ArrayList<DoIpPowerModeStatusNeedsWrapper>)originalList.stream()
                .map(item -> new DoIpPowerModeStatusNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DoIpRoutingActivationAuthenticationNeedsWrapper> getDoIpRoutingActivationAuthenticationNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDoIpRoutingActivationAuthenticationNeeds())) {
            ArrayList<DoIpRoutingActivationAuthenticationNeeds> originalList = serviceItems.getDoIpRoutingActivationAuthenticationNeeds();
            ArrayList<DoIpRoutingActivationAuthenticationNeedsWrapper> wrapperList = (ArrayList<DoIpRoutingActivationAuthenticationNeedsWrapper>)originalList.stream()
                .map(item -> new DoIpRoutingActivationAuthenticationNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DoIpRoutingActivationConfirmationNeedsWrapper> getDoIpRoutingActivationConfirmationNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDoIpRoutingActivationConfirmationNeeds())) {
            ArrayList<DoIpRoutingActivationConfirmationNeeds> originalList = serviceItems.getDoIpRoutingActivationConfirmationNeeds();
            ArrayList<DoIpRoutingActivationConfirmationNeedsWrapper> wrapperList = (ArrayList<DoIpRoutingActivationConfirmationNeedsWrapper>)originalList.stream()
                .map(item -> new DoIpRoutingActivationConfirmationNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DtcStatusChangeNotificationNeedsWrapper> getDtcStatusChangeNotificationNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getDtcStatusChangeNotificationNeeds())) {
            ArrayList<DtcStatusChangeNotificationNeeds> originalList = serviceItems.getDtcStatusChangeNotificationNeeds();
            ArrayList<DtcStatusChangeNotificationNeedsWrapper> wrapperList = (ArrayList<DtcStatusChangeNotificationNeedsWrapper>)originalList.stream()
                .map(item -> new DtcStatusChangeNotificationNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcuStateMgrUserNeedsWrapper> getEcuStateMgrUserNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getEcuStateMgrUserNeeds())) {
            ArrayList<EcuStateMgrUserNeeds> originalList = serviceItems.getEcuStateMgrUserNeeds();
            ArrayList<EcuStateMgrUserNeedsWrapper> wrapperList = (ArrayList<EcuStateMgrUserNeedsWrapper>)originalList.stream()
                .map(item -> new EcuStateMgrUserNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FunctionInhibitionNeedsWrapper> getFunctionInhibitionNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getFunctionInhibitionNeeds())) {
            ArrayList<FunctionInhibitionNeeds> originalList = serviceItems.getFunctionInhibitionNeeds();
            ArrayList<FunctionInhibitionNeedsWrapper> wrapperList = (ArrayList<FunctionInhibitionNeedsWrapper>)originalList.stream()
                .map(item -> new FunctionInhibitionNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NvBlockNeedsWrapper> getNvBlockNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getNvBlockNeeds())) {
            ArrayList<NvBlockNeeds> originalList = serviceItems.getNvBlockNeeds();
            ArrayList<NvBlockNeedsWrapper> wrapperList = (ArrayList<NvBlockNeedsWrapper>)originalList.stream()
                .map(item -> new NvBlockNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ObdControlServiceNeedsWrapper> getObdControlServiceNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getObdControlServiceNeeds())) {
            ArrayList<ObdControlServiceNeeds> originalList = serviceItems.getObdControlServiceNeeds();
            ArrayList<ObdControlServiceNeedsWrapper> wrapperList = (ArrayList<ObdControlServiceNeedsWrapper>)originalList.stream()
                .map(item -> new ObdControlServiceNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ObdInfoServiceNeedsWrapper> getObdInfoServiceNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getObdInfoServiceNeeds())) {
            ArrayList<ObdInfoServiceNeeds> originalList = serviceItems.getObdInfoServiceNeeds();
            ArrayList<ObdInfoServiceNeedsWrapper> wrapperList = (ArrayList<ObdInfoServiceNeedsWrapper>)originalList.stream()
                .map(item -> new ObdInfoServiceNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ObdMonitorServiceNeedsWrapper> getObdMonitorServiceNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getObdMonitorServiceNeeds())) {
            ArrayList<ObdMonitorServiceNeeds> originalList = serviceItems.getObdMonitorServiceNeeds();
            ArrayList<ObdMonitorServiceNeedsWrapper> wrapperList = (ArrayList<ObdMonitorServiceNeedsWrapper>)originalList.stream()
                .map(item -> new ObdMonitorServiceNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ObdPidServiceNeedsWrapper> getObdPidServiceNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getObdPidServiceNeeds())) {
            ArrayList<ObdPidServiceNeeds> originalList = serviceItems.getObdPidServiceNeeds();
            ArrayList<ObdPidServiceNeedsWrapper> wrapperList = (ArrayList<ObdPidServiceNeedsWrapper>)originalList.stream()
                .map(item -> new ObdPidServiceNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ObdRatioServiceNeedsWrapper> getObdRatioServiceNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getObdRatioServiceNeeds())) {
            ArrayList<ObdRatioServiceNeeds> originalList = serviceItems.getObdRatioServiceNeeds();
            ArrayList<ObdRatioServiceNeedsWrapper> wrapperList = (ArrayList<ObdRatioServiceNeedsWrapper>)originalList.stream()
                .map(item -> new ObdRatioServiceNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SupervisedEntityNeedsWrapper> getSupervisedEntityNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getSupervisedEntityNeeds())) {
            ArrayList<SupervisedEntityNeeds> originalList = serviceItems.getSupervisedEntityNeeds();
            ArrayList<SupervisedEntityNeedsWrapper> wrapperList = (ArrayList<SupervisedEntityNeedsWrapper>)originalList.stream()
                .map(item -> new SupervisedEntityNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SyncTimeBaseMgrUserNeedsWrapper> getSyncTimeBaseMgrUserNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getSyncTimeBaseMgrUserNeeds())) {
            ArrayList<SyncTimeBaseMgrUserNeeds> originalList = serviceItems.getSyncTimeBaseMgrUserNeeds();
            ArrayList<SyncTimeBaseMgrUserNeedsWrapper> wrapperList = (ArrayList<SyncTimeBaseMgrUserNeedsWrapper>)originalList.stream()
                .map(item -> new SyncTimeBaseMgrUserNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<WarningIndicatorRequestedBitNeedsWrapper> getWarningIndicatorRequestedBitNeeds() {
        
        if (CollUtil.isNotEmpty(serviceItems.getWarningIndicatorRequestedBitNeeds())) {
            ArrayList<WarningIndicatorRequestedBitNeeds> originalList = serviceItems.getWarningIndicatorRequestedBitNeeds();
            ArrayList<WarningIndicatorRequestedBitNeedsWrapper> wrapperList = (ArrayList<WarningIndicatorRequestedBitNeedsWrapper>)originalList.stream()
                .map(item -> new WarningIndicatorRequestedBitNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}