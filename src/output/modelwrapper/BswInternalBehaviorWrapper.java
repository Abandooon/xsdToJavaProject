package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswInternalBehaviorWrapper {

    
    private BswInternalBehavior bswInternalBehavior;

    public BswInternalBehaviorWrapper(BswInternalBehavior bswInternalBehavior) {
        this.bswInternalBehavior = bswInternalBehavior;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getS())) {
            
            return bswInternalBehavior.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getT())) {
            
            return bswInternalBehavior.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getUuid())) {
            
            return bswInternalBehavior.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getShortName())) {
            
            return new IdentifierWrapper(bswInternalBehavior.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswInternalBehavior.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswInternalBehavior.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswInternalBehavior.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getCategory())) {
            
            return new CategoryStringWrapper(bswInternalBehavior.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getAdminData())) {
            
            return new AdminDataWrapper(bswInternalBehavior.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswInternalBehavior.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getAnnotations())) {
            ArrayList<Annotation> originalList = bswInternalBehavior.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterDataPrototypeWrapper> getConstantMemorys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getConstantMemorys())) {
            ArrayList<ParameterDataPrototype> originalList = bswInternalBehavior.getConstantMemorys();
            ArrayList<ParameterDataPrototypeWrapper> wrapperList = (ArrayList<ParameterDataPrototypeWrapper>)originalList.stream()
                .map(item -> new ParameterDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConstantValueMappingRefWrapper> getConstantValueMappingRefs() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getConstantValueMappingRefs())) {
            ArrayList<ConstantValueMappingRef> originalList = bswInternalBehavior.getConstantValueMappingRefs();
            ArrayList<ConstantValueMappingRefWrapper> wrapperList = (ArrayList<ConstantValueMappingRefWrapper>)originalList.stream()
                .map(item -> new ConstantValueMappingRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataTypeMappingRefWrapper> getDataTypeMappingRefs() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getDataTypeMappingRefs())) {
            ArrayList<DataTypeMappingRef> originalList = bswInternalBehavior.getDataTypeMappingRefs();
            ArrayList<DataTypeMappingRefWrapper> wrapperList = (ArrayList<DataTypeMappingRefWrapper>)originalList.stream()
                .map(item -> new DataTypeMappingRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExclusiveAreaWrapper> getExclusiveAreas() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getExclusiveAreas())) {
            ArrayList<ExclusiveArea> originalList = bswInternalBehavior.getExclusiveAreas();
            ArrayList<ExclusiveAreaWrapper> wrapperList = (ArrayList<ExclusiveAreaWrapper>)originalList.stream()
                .map(item -> new ExclusiveAreaWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExclusiveAreaNestingOrderWrapper> getExclusiveAreaNestingOrders() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getExclusiveAreaNestingOrders())) {
            ArrayList<ExclusiveAreaNestingOrder> originalList = bswInternalBehavior.getExclusiveAreaNestingOrders();
            ArrayList<ExclusiveAreaNestingOrderWrapper> wrapperList = (ArrayList<ExclusiveAreaNestingOrderWrapper>)originalList.stream()
                .map(item -> new ExclusiveAreaNestingOrderWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableDataPrototypeWrapper> getStaticMemorys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getStaticMemorys())) {
            ArrayList<VariableDataPrototype> originalList = bswInternalBehavior.getStaticMemorys();
            ArrayList<VariableDataPrototypeWrapper> wrapperList = (ArrayList<VariableDataPrototypeWrapper>)originalList.stream()
                .map(item -> new VariableDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswPerInstanceMemoryPolicyWrapper> getBswPerInstanceMemoryPolicys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getBswPerInstanceMemoryPolicys())) {
            ArrayList<BswPerInstanceMemoryPolicy> originalList = bswInternalBehavior.getBswPerInstanceMemoryPolicys();
            ArrayList<BswPerInstanceMemoryPolicyWrapper> wrapperList = (ArrayList<BswPerInstanceMemoryPolicyWrapper>)originalList.stream()
                .map(item -> new BswPerInstanceMemoryPolicyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswClientPolicyWrapper> getClientPolicys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getClientPolicys())) {
            ArrayList<BswClientPolicy> originalList = bswInternalBehavior.getClientPolicys();
            ArrayList<BswClientPolicyWrapper> wrapperList = (ArrayList<BswClientPolicyWrapper>)originalList.stream()
                .map(item -> new BswClientPolicyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswExclusiveAreaPolicyWrapper> getExclusiveAreaPolicys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getExclusiveAreaPolicys())) {
            ArrayList<BswExclusiveAreaPolicy> originalList = bswInternalBehavior.getExclusiveAreaPolicys();
            ArrayList<BswExclusiveAreaPolicyWrapper> wrapperList = (ArrayList<BswExclusiveAreaPolicyWrapper>)originalList.stream()
                .map(item -> new BswExclusiveAreaPolicyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<IncludedDataTypeSetWrapper> getIncludedDataTypeSets() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getIncludedDataTypeSets())) {
            ArrayList<IncludedDataTypeSet> originalList = bswInternalBehavior.getIncludedDataTypeSets();
            ArrayList<IncludedDataTypeSetWrapper> wrapperList = (ArrayList<IncludedDataTypeSetWrapper>)originalList.stream()
                .map(item -> new IncludedDataTypeSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswInternalTriggeringPointPolicyWrapper> getInternalTriggeringPointPolicys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getInternalTriggeringPointPolicys())) {
            ArrayList<BswInternalTriggeringPointPolicy> originalList = bswInternalBehavior.getInternalTriggeringPointPolicys();
            ArrayList<BswInternalTriggeringPointPolicyWrapper> wrapperList = (ArrayList<BswInternalTriggeringPointPolicyWrapper>)originalList.stream()
                .map(item -> new BswInternalTriggeringPointPolicyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswParameterPolicyWrapper> getParameterPolicys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getParameterPolicys())) {
            ArrayList<BswParameterPolicy> originalList = bswInternalBehavior.getParameterPolicys();
            ArrayList<BswParameterPolicyWrapper> wrapperList = (ArrayList<BswParameterPolicyWrapper>)originalList.stream()
                .map(item -> new BswParameterPolicyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswReleasedTriggerPolicyWrapper> getReleasedTriggerPolicys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getReleasedTriggerPolicys())) {
            ArrayList<BswReleasedTriggerPolicy> originalList = bswInternalBehavior.getReleasedTriggerPolicys();
            ArrayList<BswReleasedTriggerPolicyWrapper> wrapperList = (ArrayList<BswReleasedTriggerPolicyWrapper>)originalList.stream()
                .map(item -> new BswReleasedTriggerPolicyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswDataSendPolicyWrapper> getSendPolicys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getSendPolicys())) {
            ArrayList<BswDataSendPolicy> originalList = bswInternalBehavior.getSendPolicys();
            ArrayList<BswDataSendPolicyWrapper> wrapperList = (ArrayList<BswDataSendPolicyWrapper>)originalList.stream()
                .map(item -> new BswDataSendPolicyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariationPointProxyWrapper> getVariationPointProxys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getVariationPointProxys())) {
            ArrayList<VariationPointProxy> originalList = bswInternalBehavior.getVariationPointProxys();
            ArrayList<VariationPointProxyWrapper> wrapperList = (ArrayList<VariationPointProxyWrapper>)originalList.stream()
                .map(item -> new VariationPointProxyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswInternalTriggeringPointWrapper> getInternalTriggeringPoints() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getInternalTriggeringPoints())) {
            ArrayList<BswInternalTriggeringPoint> originalList = bswInternalBehavior.getInternalTriggeringPoints();
            ArrayList<BswInternalTriggeringPointWrapper> wrapperList = (ArrayList<BswInternalTriggeringPointWrapper>)originalList.stream()
                .map(item -> new BswInternalTriggeringPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EntitysWrapper getEntitys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getEntitys())) {
            
            return new EntitysWrapper(bswInternalBehavior.getEntitys());
            
        } else {
            return null;
        }
        
    }

    public EventsWrapper getEvents() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getEvents())) {
            
            return new EventsWrapper(bswInternalBehavior.getEvents());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<BswTriggerDirectImplementationWrapper> getTriggerDirectImplementations() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getTriggerDirectImplementations())) {
            ArrayList<BswTriggerDirectImplementation> originalList = bswInternalBehavior.getTriggerDirectImplementations();
            ArrayList<BswTriggerDirectImplementationWrapper> wrapperList = (ArrayList<BswTriggerDirectImplementationWrapper>)originalList.stream()
                .map(item -> new BswTriggerDirectImplementationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModeSenderPolicyWrapper> getModeSenderPolicys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getModeSenderPolicys())) {
            ArrayList<BswModeSenderPolicy> originalList = bswInternalBehavior.getModeSenderPolicys();
            ArrayList<BswModeSenderPolicyWrapper> wrapperList = (ArrayList<BswModeSenderPolicyWrapper>)originalList.stream()
                .map(item -> new BswModeSenderPolicyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModeReceiverPolicyWrapper> getModeReceiverPolicys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getModeReceiverPolicys())) {
            ArrayList<BswModeReceiverPolicy> originalList = bswInternalBehavior.getModeReceiverPolicys();
            ArrayList<BswModeReceiverPolicyWrapper> wrapperList = (ArrayList<BswModeReceiverPolicyWrapper>)originalList.stream()
                .map(item -> new BswModeReceiverPolicyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswServiceDependencyWrapper> getServiceDependencys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getServiceDependencys())) {
            ArrayList<BswServiceDependency> originalList = bswInternalBehavior.getServiceDependencys();
            ArrayList<BswServiceDependencyWrapper> wrapperList = (ArrayList<BswServiceDependencyWrapper>)originalList.stream()
                .map(item -> new BswServiceDependencyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterDataPrototypeWrapper> getPerInstanceParameters() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getPerInstanceParameters())) {
            ArrayList<ParameterDataPrototype> originalList = bswInternalBehavior.getPerInstanceParameters();
            ArrayList<ParameterDataPrototypeWrapper> wrapperList = (ArrayList<ParameterDataPrototypeWrapper>)originalList.stream()
                .map(item -> new ParameterDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswSchedulerNamePrefixWrapper> getSchedulerNamePrefixs() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getSchedulerNamePrefixs())) {
            ArrayList<BswSchedulerNamePrefix> originalList = bswInternalBehavior.getSchedulerNamePrefixs();
            ArrayList<BswSchedulerNamePrefixWrapper> wrapperList = (ArrayList<BswSchedulerNamePrefixWrapper>)originalList.stream()
                .map(item -> new BswSchedulerNamePrefixWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswQueuedDataReceptionPolicyWrapper> getReceptionPolicys() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getReceptionPolicys())) {
            ArrayList<BswQueuedDataReceptionPolicy> originalList = bswInternalBehavior.getReceptionPolicys();
            ArrayList<BswQueuedDataReceptionPolicyWrapper> wrapperList = (ArrayList<BswQueuedDataReceptionPolicyWrapper>)originalList.stream()
                .map(item -> new BswQueuedDataReceptionPolicyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswDistinguishedPartitionWrapper> getDistinguishedPartitions() {
        
        if (CollUtil.isNotEmpty(bswInternalBehavior.getDistinguishedPartitions())) {
            ArrayList<BswDistinguishedPartition> originalList = bswInternalBehavior.getDistinguishedPartitions();
            ArrayList<BswDistinguishedPartitionWrapper> wrapperList = (ArrayList<BswDistinguishedPartitionWrapper>)originalList.stream()
                .map(item -> new BswDistinguishedPartitionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}