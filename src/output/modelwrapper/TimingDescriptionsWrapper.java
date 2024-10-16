package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TimingDescriptionsWrapper {

    
    private TimingDescriptions timingDescriptions;

    public TimingDescriptionsWrapper(TimingDescriptions timingDescriptions) {
        this.timingDescriptions = timingDescriptions;
    }

   
    public ArrayList<TdEventBswInternalBehaviorWrapper> getTdEventBswInternalBehavior() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventBswInternalBehavior())) {
            ArrayList<TdEventBswInternalBehavior> originalList = timingDescriptions.getTdEventBswInternalBehavior();
            ArrayList<TdEventBswInternalBehaviorWrapper> wrapperList = (ArrayList<TdEventBswInternalBehaviorWrapper>)originalList.stream()
                .map(item -> new TdEventBswInternalBehaviorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventBswModeDeclarationWrapper> getTdEventBswModeDeclaration() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventBswModeDeclaration())) {
            ArrayList<TdEventBswModeDeclaration> originalList = timingDescriptions.getTdEventBswModeDeclaration();
            ArrayList<TdEventBswModeDeclarationWrapper> wrapperList = (ArrayList<TdEventBswModeDeclarationWrapper>)originalList.stream()
                .map(item -> new TdEventBswModeDeclarationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventBswModuleWrapper> getTdEventBswModule() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventBswModule())) {
            ArrayList<TdEventBswModule> originalList = timingDescriptions.getTdEventBswModule();
            ArrayList<TdEventBswModuleWrapper> wrapperList = (ArrayList<TdEventBswModuleWrapper>)originalList.stream()
                .map(item -> new TdEventBswModuleWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventComplexWrapper> getTdEventComplex() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventComplex())) {
            ArrayList<TdEventComplex> originalList = timingDescriptions.getTdEventComplex();
            ArrayList<TdEventComplexWrapper> wrapperList = (ArrayList<TdEventComplexWrapper>)originalList.stream()
                .map(item -> new TdEventComplexWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventFrClusterCycleStartWrapper> getTdEventFrClusterCycleStart() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventFrClusterCycleStart())) {
            ArrayList<TdEventFrClusterCycleStart> originalList = timingDescriptions.getTdEventFrClusterCycleStart();
            ArrayList<TdEventFrClusterCycleStartWrapper> wrapperList = (ArrayList<TdEventFrClusterCycleStartWrapper>)originalList.stream()
                .map(item -> new TdEventFrClusterCycleStartWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventFrameWrapper> getTdEventFrame() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventFrame())) {
            ArrayList<TdEventFrame> originalList = timingDescriptions.getTdEventFrame();
            ArrayList<TdEventFrameWrapper> wrapperList = (ArrayList<TdEventFrameWrapper>)originalList.stream()
                .map(item -> new TdEventFrameWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventIPduWrapper> getTdEventIPdu() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventIPdu())) {
            ArrayList<TdEventIPdu> originalList = timingDescriptions.getTdEventIPdu();
            ArrayList<TdEventIPduWrapper> wrapperList = (ArrayList<TdEventIPduWrapper>)originalList.stream()
                .map(item -> new TdEventIPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventISignalWrapper> getTdEventISignal() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventISignal())) {
            ArrayList<TdEventISignal> originalList = timingDescriptions.getTdEventISignal();
            ArrayList<TdEventISignalWrapper> wrapperList = (ArrayList<TdEventISignalWrapper>)originalList.stream()
                .map(item -> new TdEventISignalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventModeDeclarationWrapper> getTdEventModeDeclaration() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventModeDeclaration())) {
            ArrayList<TdEventModeDeclaration> originalList = timingDescriptions.getTdEventModeDeclaration();
            ArrayList<TdEventModeDeclarationWrapper> wrapperList = (ArrayList<TdEventModeDeclarationWrapper>)originalList.stream()
                .map(item -> new TdEventModeDeclarationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventOperationWrapper> getTdEventOperation() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventOperation())) {
            ArrayList<TdEventOperation> originalList = timingDescriptions.getTdEventOperation();
            ArrayList<TdEventOperationWrapper> wrapperList = (ArrayList<TdEventOperationWrapper>)originalList.stream()
                .map(item -> new TdEventOperationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventSwcInternalBehaviorWrapper> getTdEventSwcInternalBehavior() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventSwcInternalBehavior())) {
            ArrayList<TdEventSwcInternalBehavior> originalList = timingDescriptions.getTdEventSwcInternalBehavior();
            ArrayList<TdEventSwcInternalBehaviorWrapper> wrapperList = (ArrayList<TdEventSwcInternalBehaviorWrapper>)originalList.stream()
                .map(item -> new TdEventSwcInternalBehaviorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventSwcInternalBehaviorReferenceWrapper> getTdEventSwcInternalBehaviorReference() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventSwcInternalBehaviorReference())) {
            ArrayList<TdEventSwcInternalBehaviorReference> originalList = timingDescriptions.getTdEventSwcInternalBehaviorReference();
            ArrayList<TdEventSwcInternalBehaviorReferenceWrapper> wrapperList = (ArrayList<TdEventSwcInternalBehaviorReferenceWrapper>)originalList.stream()
                .map(item -> new TdEventSwcInternalBehaviorReferenceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventTtCanCycleStartWrapper> getTdEventTtCanCycleStart() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventTtCanCycleStart())) {
            ArrayList<TdEventTtCanCycleStart> originalList = timingDescriptions.getTdEventTtCanCycleStart();
            ArrayList<TdEventTtCanCycleStartWrapper> wrapperList = (ArrayList<TdEventTtCanCycleStartWrapper>)originalList.stream()
                .map(item -> new TdEventTtCanCycleStartWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventTriggerWrapper> getTdEventTrigger() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventTrigger())) {
            ArrayList<TdEventTrigger> originalList = timingDescriptions.getTdEventTrigger();
            ArrayList<TdEventTriggerWrapper> wrapperList = (ArrayList<TdEventTriggerWrapper>)originalList.stream()
                .map(item -> new TdEventTriggerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventVariableDataPrototypeWrapper> getTdEventVariableDataPrototype() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventVariableDataPrototype())) {
            ArrayList<TdEventVariableDataPrototype> originalList = timingDescriptions.getTdEventVariableDataPrototype();
            ArrayList<TdEventVariableDataPrototypeWrapper> wrapperList = (ArrayList<TdEventVariableDataPrototypeWrapper>)originalList.stream()
                .map(item -> new TdEventVariableDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TdEventVfbReferenceWrapper> getTdEventVfbReference() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTdEventVfbReference())) {
            ArrayList<TdEventVfbReference> originalList = timingDescriptions.getTdEventVfbReference();
            ArrayList<TdEventVfbReferenceWrapper> wrapperList = (ArrayList<TdEventVfbReferenceWrapper>)originalList.stream()
                .map(item -> new TdEventVfbReferenceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TimingDescriptionEventChainWrapper> getTimingDescriptionEventChain() {
        
        if (CollUtil.isNotEmpty(timingDescriptions.getTimingDescriptionEventChain())) {
            ArrayList<TimingDescriptionEventChain> originalList = timingDescriptions.getTimingDescriptionEventChain();
            ArrayList<TimingDescriptionEventChainWrapper> wrapperList = (ArrayList<TimingDescriptionEventChainWrapper>)originalList.stream()
                .map(item -> new TimingDescriptionEventChainWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}