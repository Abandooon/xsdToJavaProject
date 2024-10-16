package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class DiagnosticCommonPropsConditionalWrapper {

    
    private DiagnosticCommonPropsConditional diagnosticCommonPropsConditional;

    public DiagnosticCommonPropsConditionalWrapper(DiagnosticCommonPropsConditional diagnosticCommonPropsConditional) {
        this.diagnosticCommonPropsConditional = diagnosticCommonPropsConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getS())) {
            
            return diagnosticCommonPropsConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getT())) {
            
            return diagnosticCommonPropsConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getAgingRequiresTestedCycle() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getAgingRequiresTestedCycle())) {
            
            return new BooleanWrapper(diagnosticCommonPropsConditional.getAgingRequiresTestedCycle());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticClearDtcLimitationEnumWrapper getClearDtcLimitation() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getClearDtcLimitation())) {
            
            return new DiagnosticClearDtcLimitationEnumWrapper(diagnosticCommonPropsConditional.getClearDtcLimitation());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticDebounceAlgorithmPropsWrapper> getDebounceAlgorithmPropss() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getDebounceAlgorithmPropss())) {
            ArrayList<DiagnosticDebounceAlgorithmProps> originalList = diagnosticCommonPropsConditional.getDebounceAlgorithmPropss();
            ArrayList<DiagnosticDebounceAlgorithmPropsWrapper> wrapperList = (ArrayList<DiagnosticDebounceAlgorithmPropsWrapper>)originalList.stream()
                .map(item -> new DiagnosticDebounceAlgorithmPropsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ByteOrderEnumWrapper getDefaultEndianness() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getDefaultEndianness())) {
            
            return new ByteOrderEnumWrapper(diagnosticCommonPropsConditional.getDefaultEndianness());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDtcStatusAvailabilityMask() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getDtcStatusAvailabilityMask())) {
            
            return new PositiveIntegerWrapper(diagnosticCommonPropsConditional.getDtcStatusAvailabilityMask());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticDataCaptureEnumWrapper getEnvironmentDataCapture() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getEnvironmentDataCapture())) {
            
            return new DiagnosticDataCaptureEnumWrapper(diagnosticCommonPropsConditional.getEnvironmentDataCapture());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEventDisplacementStrategyEnumWrapper getEventDisplacementStrategy() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getEventDisplacementStrategy())) {
            
            return new DiagnosticEventDisplacementStrategyEnumWrapper(diagnosticCommonPropsConditional.getEventDisplacementStrategy());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxNumberOfEventEntries() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getMaxNumberOfEventEntries())) {
            
            return new PositiveIntegerWrapper(diagnosticCommonPropsConditional.getMaxNumberOfEventEntries());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxNumberOfRequestCorrectlyReceivedResponsePending() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getMaxNumberOfRequestCorrectlyReceivedResponsePending())) {
            
            return new PositiveIntegerWrapper(diagnosticCommonPropsConditional.getMaxNumberOfRequestCorrectlyReceivedResponsePending());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticMemoryEntryStorageTriggerEnumWrapper getMemoryEntryStorageTrigger() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getMemoryEntryStorageTrigger())) {
            
            return new DiagnosticMemoryEntryStorageTriggerEnumWrapper(diagnosticCommonPropsConditional.getMemoryEntryStorageTrigger());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticOccurrenceCounterProcessingEnumWrapper getOccurrenceCounterProcessing() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getOccurrenceCounterProcessing())) {
            
            return new DiagnosticOccurrenceCounterProcessingEnumWrapper(diagnosticCommonPropsConditional.getOccurrenceCounterProcessing());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getResetConfirmedBitOnOverflow() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getResetConfirmedBitOnOverflow())) {
            
            return new BooleanWrapper(diagnosticCommonPropsConditional.getResetConfirmedBitOnOverflow());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getResponseOnAllRequestSids() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getResponseOnAllRequestSids())) {
            
            return new BooleanWrapper(diagnosticCommonPropsConditional.getResponseOnAllRequestSids());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getResponseOnSecondDeclinedRequest() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getResponseOnSecondDeclinedRequest())) {
            
            return new BooleanWrapper(diagnosticCommonPropsConditional.getResponseOnSecondDeclinedRequest());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getSecurityDelayTimeOnBoot() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getSecurityDelayTimeOnBoot())) {
            
            return new TimeValueWrapper(diagnosticCommonPropsConditional.getSecurityDelayTimeOnBoot());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticStatusBitHandlingTestFailedSinceLastClearEnumWrapper getStatusBitHandlingTestFailedSinceLastClear() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getStatusBitHandlingTestFailedSinceLastClear())) {
            
            return new DiagnosticStatusBitHandlingTestFailedSinceLastClearEnumWrapper(diagnosticCommonPropsConditional.getStatusBitHandlingTestFailedSinceLastClear());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getStatusBitStorageTestFailed() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getStatusBitStorageTestFailed())) {
            
            return new BooleanWrapper(diagnosticCommonPropsConditional.getStatusBitStorageTestFailed());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticTypeOfDtcSupportedEnumWrapper getTypeOfDtcSupported() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getTypeOfDtcSupported())) {
            
            return new DiagnosticTypeOfDtcSupportedEnumWrapper(diagnosticCommonPropsConditional.getTypeOfDtcSupported());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticTypeOfFreezeFrameRecordNumerationEnumWrapper getTypeOfFreezeFrameRecordNumeration() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getTypeOfFreezeFrameRecordNumeration())) {
            
            return new DiagnosticTypeOfFreezeFrameRecordNumerationEnumWrapper(diagnosticCommonPropsConditional.getTypeOfFreezeFrameRecordNumeration());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticCommonPropsConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticCommonPropsConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}