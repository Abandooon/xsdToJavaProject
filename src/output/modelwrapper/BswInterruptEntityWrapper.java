package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class BswInterruptEntityWrapper {

    
    private BswInterruptEntity bswInterruptEntity;

    public BswInterruptEntityWrapper(BswInterruptEntity bswInterruptEntity) {
        this.bswInterruptEntity = bswInterruptEntity;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getS())) {
            
            return bswInterruptEntity.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getT())) {
            
            return bswInterruptEntity.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getUuid())) {
            
            return bswInterruptEntity.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getShortName())) {
            
            return new IdentifierWrapper(bswInterruptEntity.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswInterruptEntity.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswInterruptEntity.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswInterruptEntity.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getCategory())) {
            
            return new CategoryStringWrapper(bswInterruptEntity.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getAdminData())) {
            
            return new AdminDataWrapper(bswInterruptEntity.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswInterruptEntity.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getAnnotations())) {
            ArrayList<Annotation> originalList = bswInterruptEntity.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExecutableEntityActivationReasonWrapper> getActivationReasons() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getActivationReasons())) {
            ArrayList<ExecutableEntityActivationReason> originalList = bswInterruptEntity.getActivationReasons();
            ArrayList<ExecutableEntityActivationReasonWrapper> wrapperList = (ArrayList<ExecutableEntityActivationReasonWrapper>)originalList.stream()
                .map(item -> new ExecutableEntityActivationReasonWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CanEnterExclusiveAreaRefWrapper> getCanEnterExclusiveAreaRefs() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getCanEnterExclusiveAreaRefs())) {
            ArrayList<CanEnterExclusiveAreaRef> originalList = bswInterruptEntity.getCanEnterExclusiveAreaRefs();
            ArrayList<CanEnterExclusiveAreaRefWrapper> wrapperList = (ArrayList<CanEnterExclusiveAreaRefWrapper>)originalList.stream()
                .map(item -> new CanEnterExclusiveAreaRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExclusiveAreaNestingOrderRefWrapper> getExclusiveAreaNestingOrderRefs() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getExclusiveAreaNestingOrderRefs())) {
            ArrayList<ExclusiveAreaNestingOrderRef> originalList = bswInterruptEntity.getExclusiveAreaNestingOrderRefs();
            ArrayList<ExclusiveAreaNestingOrderRefWrapper> wrapperList = (ArrayList<ExclusiveAreaNestingOrderRefWrapper>)originalList.stream()
                .map(item -> new ExclusiveAreaNestingOrderRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMinimumStartInterval() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getMinimumStartInterval())) {
            
            return new TimeValueWrapper(bswInterruptEntity.getMinimumStartInterval());
            
        } else {
            return null;
        }
        
    }

    public ReentrancyLevelEnumWrapper getReentrancyLevel() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getReentrancyLevel())) {
            
            return new ReentrancyLevelEnumWrapper(bswInterruptEntity.getReentrancyLevel());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RunsInsideExclusiveAreaRefWrapper> getRunsInsideExclusiveAreaRefs() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getRunsInsideExclusiveAreaRefs())) {
            ArrayList<RunsInsideExclusiveAreaRef> originalList = bswInterruptEntity.getRunsInsideExclusiveAreaRefs();
            ArrayList<RunsInsideExclusiveAreaRefWrapper> wrapperList = (ArrayList<RunsInsideExclusiveAreaRefWrapper>)originalList.stream()
                .map(item -> new RunsInsideExclusiveAreaRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwAddrMethodRefWrapper getSwAddrMethodRef() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getSwAddrMethodRef())) {
            
            return new SwAddrMethodRefWrapper(bswInterruptEntity.getSwAddrMethodRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper> getAccessedModeGroups() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getAccessedModeGroups())) {
            ArrayList<ModeDeclarationGroupPrototypeRefConditional> originalList = bswInterruptEntity.getAccessedModeGroups();
            ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper> wrapperList = (ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationGroupPrototypeRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswInternalTriggeringPointRefConditionalWrapper> getActivationPoints() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getActivationPoints())) {
            ArrayList<BswInternalTriggeringPointRefConditional> originalList = bswInterruptEntity.getActivationPoints();
            ArrayList<BswInternalTriggeringPointRefConditionalWrapper> wrapperList = (ArrayList<BswInternalTriggeringPointRefConditionalWrapper>)originalList.stream()
                .map(item -> new BswInternalTriggeringPointRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CallPointsWrapper getCallPoints() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getCallPoints())) {
            
            return new CallPointsWrapper(bswInterruptEntity.getCallPoints());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleEntryRefConditionalWrapper> getCalledEntrys() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getCalledEntrys())) {
            ArrayList<BswModuleEntryRefConditional> originalList = bswInterruptEntity.getCalledEntrys();
            ArrayList<BswModuleEntryRefConditionalWrapper> wrapperList = (ArrayList<BswModuleEntryRefConditionalWrapper>)originalList.stream()
                .map(item -> new BswModuleEntryRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswVariableAccessWrapper> getDataReceivePoints() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getDataReceivePoints())) {
            ArrayList<BswVariableAccess> originalList = bswInterruptEntity.getDataReceivePoints();
            ArrayList<BswVariableAccessWrapper> wrapperList = (ArrayList<BswVariableAccessWrapper>)originalList.stream()
                .map(item -> new BswVariableAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswVariableAccessWrapper> getDataSendPoints() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getDataSendPoints())) {
            ArrayList<BswVariableAccess> originalList = bswInterruptEntity.getDataSendPoints();
            ArrayList<BswVariableAccessWrapper> wrapperList = (ArrayList<BswVariableAccessWrapper>)originalList.stream()
                .map(item -> new BswVariableAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ImplementedEntryRefWrapper getImplementedEntryRef() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getImplementedEntryRef())) {
            
            return new ImplementedEntryRefWrapper(bswInterruptEntity.getImplementedEntryRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerRefConditionalWrapper> getIssuedTriggers() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getIssuedTriggers())) {
            ArrayList<TriggerRefConditional> originalList = bswInterruptEntity.getIssuedTriggers();
            ArrayList<TriggerRefConditionalWrapper> wrapperList = (ArrayList<TriggerRefConditionalWrapper>)originalList.stream()
                .map(item -> new TriggerRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper> getManagedModeGroups() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getManagedModeGroups())) {
            ArrayList<ModeDeclarationGroupPrototypeRefConditional> originalList = bswInterruptEntity.getManagedModeGroups();
            ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper> wrapperList = (ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationGroupPrototypeRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SchedulerNamePrefixRefWrapper getSchedulerNamePrefixRef() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getSchedulerNamePrefixRef())) {
            
            return new SchedulerNamePrefixRefWrapper(bswInterruptEntity.getSchedulerNamePrefixRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getVariationPoint())) {
            
            return new VariationPointWrapper(bswInterruptEntity.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BswInterruptCategoryWrapper getInterruptCategory() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getInterruptCategory())) {
            
            return new BswInterruptCategoryWrapper(bswInterruptEntity.getInterruptCategory());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getInterruptSource() {
        
        if (CollUtil.isNotEmpty(bswInterruptEntity.getInterruptSource())) {
            
            return new StringWrapper(bswInterruptEntity.getInterruptSource());
            
        } else {
            return null;
        }
        
    }




    


    
}