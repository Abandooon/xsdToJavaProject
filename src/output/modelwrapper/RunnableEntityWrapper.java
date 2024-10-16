package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class RunnableEntityWrapper {

    
    private RunnableEntity runnableEntity;

    public RunnableEntityWrapper(RunnableEntity runnableEntity) {
        this.runnableEntity = runnableEntity;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getS())) {
            
            return runnableEntity.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getT())) {
            
            return runnableEntity.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getUuid())) {
            
            return runnableEntity.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getShortName())) {
            
            return new IdentifierWrapper(runnableEntity.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = runnableEntity.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getLongName())) {
            
            return new MultilanguageLongNameWrapper(runnableEntity.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(runnableEntity.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getCategory())) {
            
            return new CategoryStringWrapper(runnableEntity.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getAdminData())) {
            
            return new AdminDataWrapper(runnableEntity.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getIntroduction())) {
            
            return new DocumentationBlockWrapper(runnableEntity.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getAnnotations())) {
            ArrayList<Annotation> originalList = runnableEntity.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExecutableEntityActivationReasonWrapper> getActivationReasons() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getActivationReasons())) {
            ArrayList<ExecutableEntityActivationReason> originalList = runnableEntity.getActivationReasons();
            ArrayList<ExecutableEntityActivationReasonWrapper> wrapperList = (ArrayList<ExecutableEntityActivationReasonWrapper>)originalList.stream()
                .map(item -> new ExecutableEntityActivationReasonWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CanEnterExclusiveAreaRefWrapper> getCanEnterExclusiveAreaRefs() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getCanEnterExclusiveAreaRefs())) {
            ArrayList<CanEnterExclusiveAreaRef> originalList = runnableEntity.getCanEnterExclusiveAreaRefs();
            ArrayList<CanEnterExclusiveAreaRefWrapper> wrapperList = (ArrayList<CanEnterExclusiveAreaRefWrapper>)originalList.stream()
                .map(item -> new CanEnterExclusiveAreaRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExclusiveAreaNestingOrderRefWrapper> getExclusiveAreaNestingOrderRefs() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getExclusiveAreaNestingOrderRefs())) {
            ArrayList<ExclusiveAreaNestingOrderRef> originalList = runnableEntity.getExclusiveAreaNestingOrderRefs();
            ArrayList<ExclusiveAreaNestingOrderRefWrapper> wrapperList = (ArrayList<ExclusiveAreaNestingOrderRefWrapper>)originalList.stream()
                .map(item -> new ExclusiveAreaNestingOrderRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMinimumStartInterval() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getMinimumStartInterval())) {
            
            return new TimeValueWrapper(runnableEntity.getMinimumStartInterval());
            
        } else {
            return null;
        }
        
    }

    public ReentrancyLevelEnumWrapper getReentrancyLevel() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getReentrancyLevel())) {
            
            return new ReentrancyLevelEnumWrapper(runnableEntity.getReentrancyLevel());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RunsInsideExclusiveAreaRefWrapper> getRunsInsideExclusiveAreaRefs() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getRunsInsideExclusiveAreaRefs())) {
            ArrayList<RunsInsideExclusiveAreaRef> originalList = runnableEntity.getRunsInsideExclusiveAreaRefs();
            ArrayList<RunsInsideExclusiveAreaRefWrapper> wrapperList = (ArrayList<RunsInsideExclusiveAreaRefWrapper>)originalList.stream()
                .map(item -> new RunsInsideExclusiveAreaRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwAddrMethodRefWrapper getSwAddrMethodRef() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getSwAddrMethodRef())) {
            
            return new SwAddrMethodRefWrapper(runnableEntity.getSwAddrMethodRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RunnableEntityArgumentWrapper> getArguments() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getArguments())) {
            ArrayList<RunnableEntityArgument> originalList = runnableEntity.getArguments();
            ArrayList<RunnableEntityArgumentWrapper> wrapperList = (ArrayList<RunnableEntityArgumentWrapper>)originalList.stream()
                .map(item -> new RunnableEntityArgumentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AsynchronousServerCallResultPointWrapper> getAsynchronousServerCallResultPoints() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getAsynchronousServerCallResultPoints())) {
            ArrayList<AsynchronousServerCallResultPoint> originalList = runnableEntity.getAsynchronousServerCallResultPoints();
            ArrayList<AsynchronousServerCallResultPointWrapper> wrapperList = (ArrayList<AsynchronousServerCallResultPointWrapper>)originalList.stream()
                .map(item -> new AsynchronousServerCallResultPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getCanBeInvokedConcurrently() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getCanBeInvokedConcurrently())) {
            
            return new BooleanWrapper(runnableEntity.getCanBeInvokedConcurrently());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableAccessWrapper> getDataReadAccesss() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getDataReadAccesss())) {
            ArrayList<VariableAccess> originalList = runnableEntity.getDataReadAccesss();
            ArrayList<VariableAccessWrapper> wrapperList = (ArrayList<VariableAccessWrapper>)originalList.stream()
                .map(item -> new VariableAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableAccessWrapper> getDataReceivePointByArguments() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getDataReceivePointByArguments())) {
            ArrayList<VariableAccess> originalList = runnableEntity.getDataReceivePointByArguments();
            ArrayList<VariableAccessWrapper> wrapperList = (ArrayList<VariableAccessWrapper>)originalList.stream()
                .map(item -> new VariableAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableAccessWrapper> getDataReceivePointByValues() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getDataReceivePointByValues())) {
            ArrayList<VariableAccess> originalList = runnableEntity.getDataReceivePointByValues();
            ArrayList<VariableAccessWrapper> wrapperList = (ArrayList<VariableAccessWrapper>)originalList.stream()
                .map(item -> new VariableAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableAccessWrapper> getDataSendPoints() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getDataSendPoints())) {
            ArrayList<VariableAccess> originalList = runnableEntity.getDataSendPoints();
            ArrayList<VariableAccessWrapper> wrapperList = (ArrayList<VariableAccessWrapper>)originalList.stream()
                .map(item -> new VariableAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableAccessWrapper> getDataWriteAccesss() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getDataWriteAccesss())) {
            ArrayList<VariableAccess> originalList = runnableEntity.getDataWriteAccesss();
            ArrayList<VariableAccessWrapper> wrapperList = (ArrayList<VariableAccessWrapper>)originalList.stream()
                .map(item -> new VariableAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExternalTriggeringPointWrapper> getExternalTriggeringPoints() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getExternalTriggeringPoints())) {
            ArrayList<ExternalTriggeringPoint> originalList = runnableEntity.getExternalTriggeringPoints();
            ArrayList<ExternalTriggeringPointWrapper> wrapperList = (ArrayList<ExternalTriggeringPointWrapper>)originalList.stream()
                .map(item -> new ExternalTriggeringPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<InternalTriggeringPointWrapper> getInternalTriggeringPoints() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getInternalTriggeringPoints())) {
            ArrayList<InternalTriggeringPoint> originalList = runnableEntity.getInternalTriggeringPoints();
            ArrayList<InternalTriggeringPointWrapper> wrapperList = (ArrayList<InternalTriggeringPointWrapper>)originalList.stream()
                .map(item -> new InternalTriggeringPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeAccessPointWrapper> getModeAccessPoints() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getModeAccessPoints())) {
            ArrayList<ModeAccessPoint> originalList = runnableEntity.getModeAccessPoints();
            ArrayList<ModeAccessPointWrapper> wrapperList = (ArrayList<ModeAccessPointWrapper>)originalList.stream()
                .map(item -> new ModeAccessPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeSwitchPointWrapper> getModeSwitchPoints() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getModeSwitchPoints())) {
            ArrayList<ModeSwitchPoint> originalList = runnableEntity.getModeSwitchPoints();
            ArrayList<ModeSwitchPointWrapper> wrapperList = (ArrayList<ModeSwitchPointWrapper>)originalList.stream()
                .map(item -> new ModeSwitchPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterAccessWrapper> getParameterAccesss() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getParameterAccesss())) {
            ArrayList<ParameterAccess> originalList = runnableEntity.getParameterAccesss();
            ArrayList<ParameterAccessWrapper> wrapperList = (ArrayList<ParameterAccessWrapper>)originalList.stream()
                .map(item -> new ParameterAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableAccessWrapper> getReadLocalVariables() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getReadLocalVariables())) {
            ArrayList<VariableAccess> originalList = runnableEntity.getReadLocalVariables();
            ArrayList<VariableAccessWrapper> wrapperList = (ArrayList<VariableAccessWrapper>)originalList.stream()
                .map(item -> new VariableAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ServerCallPointsWrapper getServerCallPoints() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getServerCallPoints())) {
            
            return new ServerCallPointsWrapper(runnableEntity.getServerCallPoints());
            
        } else {
            return null;
        }
        
    }

    public CIdentifierWrapper getSymbol() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getSymbol())) {
            
            return new CIdentifierWrapper(runnableEntity.getSymbol());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<WaitPointWrapper> getWaitPoints() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getWaitPoints())) {
            ArrayList<WaitPoint> originalList = runnableEntity.getWaitPoints();
            ArrayList<WaitPointWrapper> wrapperList = (ArrayList<WaitPointWrapper>)originalList.stream()
                .map(item -> new WaitPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableAccessWrapper> getWrittenLocalVariables() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getWrittenLocalVariables())) {
            ArrayList<VariableAccess> originalList = runnableEntity.getWrittenLocalVariables();
            ArrayList<VariableAccessWrapper> wrapperList = (ArrayList<VariableAccessWrapper>)originalList.stream()
                .map(item -> new VariableAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(runnableEntity.getVariationPoint())) {
            
            return new VariationPointWrapper(runnableEntity.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}