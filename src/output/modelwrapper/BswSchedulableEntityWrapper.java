package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswSchedulableEntityWrapper {

    
    private BswSchedulableEntity bswSchedulableEntity;

    public BswSchedulableEntityWrapper(BswSchedulableEntity bswSchedulableEntity) {
        this.bswSchedulableEntity = bswSchedulableEntity;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getS())) {
            
            return bswSchedulableEntity.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getT())) {
            
            return bswSchedulableEntity.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getUuid())) {
            
            return bswSchedulableEntity.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getShortName())) {
            
            return new IdentifierWrapper(bswSchedulableEntity.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswSchedulableEntity.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswSchedulableEntity.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswSchedulableEntity.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getCategory())) {
            
            return new CategoryStringWrapper(bswSchedulableEntity.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getAdminData())) {
            
            return new AdminDataWrapper(bswSchedulableEntity.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswSchedulableEntity.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getAnnotations())) {
            ArrayList<Annotation> originalList = bswSchedulableEntity.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExecutableEntityActivationReasonWrapper> getActivationReasons() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getActivationReasons())) {
            ArrayList<ExecutableEntityActivationReason> originalList = bswSchedulableEntity.getActivationReasons();
            ArrayList<ExecutableEntityActivationReasonWrapper> wrapperList = (ArrayList<ExecutableEntityActivationReasonWrapper>)originalList.stream()
                .map(item -> new ExecutableEntityActivationReasonWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CanEnterExclusiveAreaRefWrapper> getCanEnterExclusiveAreaRefs() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getCanEnterExclusiveAreaRefs())) {
            ArrayList<CanEnterExclusiveAreaRef> originalList = bswSchedulableEntity.getCanEnterExclusiveAreaRefs();
            ArrayList<CanEnterExclusiveAreaRefWrapper> wrapperList = (ArrayList<CanEnterExclusiveAreaRefWrapper>)originalList.stream()
                .map(item -> new CanEnterExclusiveAreaRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExclusiveAreaNestingOrderRefWrapper> getExclusiveAreaNestingOrderRefs() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getExclusiveAreaNestingOrderRefs())) {
            ArrayList<ExclusiveAreaNestingOrderRef> originalList = bswSchedulableEntity.getExclusiveAreaNestingOrderRefs();
            ArrayList<ExclusiveAreaNestingOrderRefWrapper> wrapperList = (ArrayList<ExclusiveAreaNestingOrderRefWrapper>)originalList.stream()
                .map(item -> new ExclusiveAreaNestingOrderRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMinimumStartInterval() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getMinimumStartInterval())) {
            
            return new TimeValueWrapper(bswSchedulableEntity.getMinimumStartInterval());
            
        } else {
            return null;
        }
        
    }

    public ReentrancyLevelEnumWrapper getReentrancyLevel() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getReentrancyLevel())) {
            
            return new ReentrancyLevelEnumWrapper(bswSchedulableEntity.getReentrancyLevel());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RunsInsideExclusiveAreaRefWrapper> getRunsInsideExclusiveAreaRefs() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getRunsInsideExclusiveAreaRefs())) {
            ArrayList<RunsInsideExclusiveAreaRef> originalList = bswSchedulableEntity.getRunsInsideExclusiveAreaRefs();
            ArrayList<RunsInsideExclusiveAreaRefWrapper> wrapperList = (ArrayList<RunsInsideExclusiveAreaRefWrapper>)originalList.stream()
                .map(item -> new RunsInsideExclusiveAreaRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwAddrMethodRefWrapper getSwAddrMethodRef() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getSwAddrMethodRef())) {
            
            return new SwAddrMethodRefWrapper(bswSchedulableEntity.getSwAddrMethodRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper> getAccessedModeGroups() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getAccessedModeGroups())) {
            ArrayList<ModeDeclarationGroupPrototypeRefConditional> originalList = bswSchedulableEntity.getAccessedModeGroups();
            ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper> wrapperList = (ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationGroupPrototypeRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswInternalTriggeringPointRefConditionalWrapper> getActivationPoints() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getActivationPoints())) {
            ArrayList<BswInternalTriggeringPointRefConditional> originalList = bswSchedulableEntity.getActivationPoints();
            ArrayList<BswInternalTriggeringPointRefConditionalWrapper> wrapperList = (ArrayList<BswInternalTriggeringPointRefConditionalWrapper>)originalList.stream()
                .map(item -> new BswInternalTriggeringPointRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CallPointsWrapper getCallPoints() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getCallPoints())) {
            
            return new CallPointsWrapper(bswSchedulableEntity.getCallPoints());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleEntryRefConditionalWrapper> getCalledEntrys() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getCalledEntrys())) {
            ArrayList<BswModuleEntryRefConditional> originalList = bswSchedulableEntity.getCalledEntrys();
            ArrayList<BswModuleEntryRefConditionalWrapper> wrapperList = (ArrayList<BswModuleEntryRefConditionalWrapper>)originalList.stream()
                .map(item -> new BswModuleEntryRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswVariableAccessWrapper> getDataReceivePoints() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getDataReceivePoints())) {
            ArrayList<BswVariableAccess> originalList = bswSchedulableEntity.getDataReceivePoints();
            ArrayList<BswVariableAccessWrapper> wrapperList = (ArrayList<BswVariableAccessWrapper>)originalList.stream()
                .map(item -> new BswVariableAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswVariableAccessWrapper> getDataSendPoints() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getDataSendPoints())) {
            ArrayList<BswVariableAccess> originalList = bswSchedulableEntity.getDataSendPoints();
            ArrayList<BswVariableAccessWrapper> wrapperList = (ArrayList<BswVariableAccessWrapper>)originalList.stream()
                .map(item -> new BswVariableAccessWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ImplementedEntryRefWrapper getImplementedEntryRef() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getImplementedEntryRef())) {
            
            return new ImplementedEntryRefWrapper(bswSchedulableEntity.getImplementedEntryRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerRefConditionalWrapper> getIssuedTriggers() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getIssuedTriggers())) {
            ArrayList<TriggerRefConditional> originalList = bswSchedulableEntity.getIssuedTriggers();
            ArrayList<TriggerRefConditionalWrapper> wrapperList = (ArrayList<TriggerRefConditionalWrapper>)originalList.stream()
                .map(item -> new TriggerRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper> getManagedModeGroups() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getManagedModeGroups())) {
            ArrayList<ModeDeclarationGroupPrototypeRefConditional> originalList = bswSchedulableEntity.getManagedModeGroups();
            ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper> wrapperList = (ArrayList<ModeDeclarationGroupPrototypeRefConditionalWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationGroupPrototypeRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SchedulerNamePrefixRefWrapper getSchedulerNamePrefixRef() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getSchedulerNamePrefixRef())) {
            
            return new SchedulerNamePrefixRefWrapper(bswSchedulableEntity.getSchedulerNamePrefixRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswSchedulableEntity.getVariationPoint())) {
            
            return new VariationPointWrapper(bswSchedulableEntity.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}