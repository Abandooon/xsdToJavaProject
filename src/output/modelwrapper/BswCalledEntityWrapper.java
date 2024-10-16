package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswCalledEntityWrapper {

    
    private BswCalledEntity bswCalledEntity;

    public BswCalledEntityWrapper(BswCalledEntity bswCalledEntity) {
        this.bswCalledEntity = bswCalledEntity;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getS())) {
            
            return bswCalledEntity.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getT())) {
            
            return bswCalledEntity.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getUuid())) {
            
            return bswCalledEntity.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getShortName())) {
            
            return new IdentifierWrapper(bswCalledEntity.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswCalledEntity.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswCalledEntity.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswCalledEntity.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getCategory())) {
            
            return new CategoryStringWrapper(bswCalledEntity.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getAdminData())) {
            
            return new AdminDataWrapper(bswCalledEntity.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswCalledEntity.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getAnnotations())) {
            ArrayList<Annotation> originalList = bswCalledEntity.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExecutableEntityActivationReasonWrapper> getActivationReasons() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getActivationReasons())) {
            ArrayList<ExecutableEntityActivationReason> originalList = bswCalledEntity.getActivationReasons();
            ArrayList<ExecutableEntityActivationReasonWrapper> wrapperList = (ArrayList<ExecutableEntityActivationReasonWrapper>)originalList.stream()
                .map(item -> new ExecutableEntityActivationReasonWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CanEnterExclusiveAreaRefWrapper> getCanEnterExclusiveAreaRefs() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getCanEnterExclusiveAreaRefs())) {
            ArrayList<CanEnterExclusiveAreaRef> originalList = bswCalledEntity.getCanEnterExclusiveAreaRefs();
            ArrayList<CanEnterExclusiveAreaRefWrapper> wrapperList = (ArrayList<CanEnterExclusiveAreaRefWrapper>)originalList.stream()
                .map(item -> new CanEnterExclusiveAreaRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExclusiveAreaNestingOrderRefWrapper> getExclusiveAreaNestingOrderRefs() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getExclusiveAreaNestingOrderRefs())) {
            ArrayList<ExclusiveAreaNestingOrderRef> originalList = bswCalledEntity.getExclusiveAreaNestingOrderRefs();
            ArrayList<ExclusiveAreaNestingOrderRefWrapper> wrapperList = (ArrayList<ExclusiveAreaNestingOrderRefWrapper>)originalList.stream()
                .map(item -> new ExclusiveAreaNestingOrderRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMinimumStartInterval() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getMinimumStartInterval())) {
            
            return new TimeValueWrapper(bswCalledEntity.getMinimumStartInterval());
            
        } else {
            return null;
        }
        
    }

    public ReentrancyLevelEnumWrapper getReentrancyLevel() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getReentrancyLevel())) {
            
            return new ReentrancyLevelEnumWrapper(bswCalledEntity.getReentrancyLevel());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RunsInsideExclusiveAreaRefWrapper> getRunsInsideExclusiveAreaRefs() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getRunsInsideExclusiveAreaRefs())) {
            ArrayList<RunsInsideExclusiveAreaRef> originalList = bswCalledEntity.getRunsInsideExclusiveAreaRefs();
            ArrayList<RunsInsideExclusiveAreaRefWrapper> wrapperList = (ArrayList<RunsInsideExclusiveAreaRefWrapper>)originalList.stream()
                .map(item -> new RunsInsideExclusiveAreaRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwAddrMethodRefWrapper getSwAddrMethodRef() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getSwAddrMethodRef())) {
            
            return new SwAddrMethodRefWrapper(bswCalledEntity.getSwAddrMethodRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper> getAccessedModeGroups() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getAccessedModeGroups())) {
            ArrayList<ModeDeclarationGroupPrototypeRefConditional> originalList = bswCalledEntity.getAccessedModeGroups();
            ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper> wrapperList = (ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationGroupPrototypeRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswInternalTriggeringPointRefConditionalWrapper> getActivationPoints() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getActivationPoints())) {
            ArrayList<BswInternalTriggeringPointRefConditional> originalList = bswCalledEntity.getActivationPoints();
            ArrayList<BswInternalTriggeringPointRefConditionalWrapper> wrapperList = (ArrayList<BswInternalTriggeringPointRefConditionalWrapper>)originalList.stream()
                .map(item -> new BswInternalTriggeringPointRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CallPointsWrapper getCallPoints() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getCallPoints())) {
            
            return new CallPointsWrapper(bswCalledEntity.getCallPoints());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleEntryRefConditionalWrapper> getCalledEntrys() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getCalledEntrys())) {
            ArrayList<BswModuleEntryRefConditional> originalList = bswCalledEntity.getCalledEntrys();
            ArrayList<BswModuleEntryRefConditionalWrapper> wrapperList = (ArrayList<BswModuleEntryRefConditionalWrapper>)originalList.stream()
                .map(item -> new BswModuleEntryRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswVariableAccessWrapper> getDataReceivePoints() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getDataReceivePoints())) {
            ArrayList<BswVariableAccess> originalList = bswCalledEntity.getDataReceivePoints();
            ArrayList<BswVariableAccessWrapper> wrapperList = (ArrayList<BswVariableAccessWrapper>)originalList.stream()
                .map(item -> new BswVariableAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswVariableAccessWrapper> getDataSendPoints() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getDataSendPoints())) {
            ArrayList<BswVariableAccess> originalList = bswCalledEntity.getDataSendPoints();
            ArrayList<BswVariableAccessWrapper> wrapperList = (ArrayList<BswVariableAccessWrapper>)originalList.stream()
                .map(item -> new BswVariableAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ImplementedEntryRefWrapper getImplementedEntryRef() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getImplementedEntryRef())) {
            
            return new ImplementedEntryRefWrapper(bswCalledEntity.getImplementedEntryRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerRefConditionalWrapper> getIssuedTriggers() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getIssuedTriggers())) {
            ArrayList<TriggerRefConditional> originalList = bswCalledEntity.getIssuedTriggers();
            ArrayList<TriggerRefConditionalWrapper> wrapperList = (ArrayList<TriggerRefConditionalWrapper>)originalList.stream()
                .map(item -> new TriggerRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper> getManagedModeGroups() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getManagedModeGroups())) {
            ArrayList<ModeDeclarationGroupPrototypeRefConditional> originalList = bswCalledEntity.getManagedModeGroups();
            ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper> wrapperList = (ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationGroupPrototypeRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SchedulerNamePrefixRefWrapper getSchedulerNamePrefixRef() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getSchedulerNamePrefixRef())) {
            
            return new SchedulerNamePrefixRefWrapper(bswCalledEntity.getSchedulerNamePrefixRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswCalledEntity.getVariationPoint())) {
            
            return new VariationPointWrapper(bswCalledEntity.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}