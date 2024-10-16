package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class SwcInternalBehaviorWrapper {

    
    private SwcInternalBehavior swcInternalBehavior;

    public SwcInternalBehaviorWrapper(SwcInternalBehavior swcInternalBehavior) {
        this.swcInternalBehavior = swcInternalBehavior;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getS())) {
            
            return swcInternalBehavior.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getT())) {
            
            return swcInternalBehavior.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getUuid())) {
            
            return swcInternalBehavior.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getShortName())) {
            
            return new IdentifierWrapper(swcInternalBehavior.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swcInternalBehavior.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swcInternalBehavior.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swcInternalBehavior.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getCategory())) {
            
            return new CategoryStringWrapper(swcInternalBehavior.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getAdminData())) {
            
            return new AdminDataWrapper(swcInternalBehavior.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swcInternalBehavior.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getAnnotations())) {
            ArrayList<Annotation> originalList = swcInternalBehavior.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterDataPrototypeWrapper> getConstantMemorys() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getConstantMemorys())) {
            ArrayList<ParameterDataPrototype> originalList = swcInternalBehavior.getConstantMemorys();
            ArrayList<ParameterDataPrototypeWrapper> wrapperList = (ArrayList<ParameterDataPrototypeWrapper>)originalList.stream()
                .map(item -> new ParameterDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConstantValueMappingRefWrapper> getConstantValueMappingRefs() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getConstantValueMappingRefs())) {
            ArrayList<ConstantValueMappingRef> originalList = swcInternalBehavior.getConstantValueMappingRefs();
            ArrayList<ConstantValueMappingRefWrapper> wrapperList = (ArrayList<ConstantValueMappingRefWrapper>)originalList.stream()
                .map(item -> new ConstantValueMappingRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataTypeMappingRefWrapper> getDataTypeMappingRefs() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getDataTypeMappingRefs())) {
            ArrayList<DataTypeMappingRef> originalList = swcInternalBehavior.getDataTypeMappingRefs();
            ArrayList<DataTypeMappingRefWrapper> wrapperList = (ArrayList<DataTypeMappingRefWrapper>)originalList.stream()
                .map(item -> new DataTypeMappingRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExclusiveAreaWrapper> getExclusiveAreas() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getExclusiveAreas())) {
            ArrayList<ExclusiveArea> originalList = swcInternalBehavior.getExclusiveAreas();
            ArrayList<ExclusiveAreaWrapper> wrapperList = (ArrayList<ExclusiveAreaWrapper>)originalList.stream()
                .map(item -> new ExclusiveAreaWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ExclusiveAreaNestingOrderWrapper> getExclusiveAreaNestingOrders() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getExclusiveAreaNestingOrders())) {
            ArrayList<ExclusiveAreaNestingOrder> originalList = swcInternalBehavior.getExclusiveAreaNestingOrders();
            ArrayList<ExclusiveAreaNestingOrderWrapper> wrapperList = (ArrayList<ExclusiveAreaNestingOrderWrapper>)originalList.stream()
                .map(item -> new ExclusiveAreaNestingOrderWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableDataPrototypeWrapper> getStaticMemorys() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getStaticMemorys())) {
            ArrayList<VariableDataPrototype> originalList = swcInternalBehavior.getStaticMemorys();
            ArrayList<VariableDataPrototypeWrapper> wrapperList = (ArrayList<VariableDataPrototypeWrapper>)originalList.stream()
                .map(item -> new VariableDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableDataPrototypeWrapper> getArTypedPerInstanceMemorys() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getArTypedPerInstanceMemorys())) {
            ArrayList<VariableDataPrototype> originalList = swcInternalBehavior.getArTypedPerInstanceMemorys();
            ArrayList<VariableDataPrototypeWrapper> wrapperList = (ArrayList<VariableDataPrototypeWrapper>)originalList.stream()
                .map(item -> new VariableDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public Events_SwcInternalBehaviorWrapper getEvents() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getEvents())) {
            
            return new Events_SwcInternalBehaviorWrapper(swcInternalBehavior.getEvents());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableDataPrototypeWrapper> getExplicitInterRunnableVariables() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getExplicitInterRunnableVariables())) {
            ArrayList<VariableDataPrototype> originalList = swcInternalBehavior.getExplicitInterRunnableVariables();
            ArrayList<VariableDataPrototypeWrapper> wrapperList = (ArrayList<VariableDataPrototypeWrapper>)originalList.stream()
                .map(item -> new VariableDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public HandleTerminationAndRestartEnumWrapper getHandleTerminationAndRestart() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getHandleTerminationAndRestart())) {
            
            return new HandleTerminationAndRestartEnumWrapper(swcInternalBehavior.getHandleTerminationAndRestart());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableDataPrototypeWrapper> getImplicitInterRunnableVariables() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getImplicitInterRunnableVariables())) {
            ArrayList<VariableDataPrototype> originalList = swcInternalBehavior.getImplicitInterRunnableVariables();
            ArrayList<VariableDataPrototypeWrapper> wrapperList = (ArrayList<VariableDataPrototypeWrapper>)originalList.stream()
                .map(item -> new VariableDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<IncludedDataTypeSetWrapper> getIncludedDataTypeSets() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getIncludedDataTypeSets())) {
            ArrayList<IncludedDataTypeSet> originalList = swcInternalBehavior.getIncludedDataTypeSets();
            ArrayList<IncludedDataTypeSetWrapper> wrapperList = (ArrayList<IncludedDataTypeSetWrapper>)originalList.stream()
                .map(item -> new IncludedDataTypeSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<IncludedModeDeclarationGroupSetWrapper> getIncludedModeDeclarationGroupSets() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getIncludedModeDeclarationGroupSets())) {
            ArrayList<IncludedModeDeclarationGroupSet> originalList = swcInternalBehavior.getIncludedModeDeclarationGroupSets();
            ArrayList<IncludedModeDeclarationGroupSetWrapper> wrapperList = (ArrayList<IncludedModeDeclarationGroupSetWrapper>)originalList.stream()
                .map(item -> new IncludedModeDeclarationGroupSetWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<InstantiationDataDefPropsWrapper> getInstantiationDataDefPropss() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getInstantiationDataDefPropss())) {
            ArrayList<InstantiationDataDefProps> originalList = swcInternalBehavior.getInstantiationDataDefPropss();
            ArrayList<InstantiationDataDefPropsWrapper> wrapperList = (ArrayList<InstantiationDataDefPropsWrapper>)originalList.stream()
                .map(item -> new InstantiationDataDefPropsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PerInstanceMemoryWrapper> getPerInstanceMemorys() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getPerInstanceMemorys())) {
            ArrayList<PerInstanceMemory> originalList = swcInternalBehavior.getPerInstanceMemorys();
            ArrayList<PerInstanceMemoryWrapper> wrapperList = (ArrayList<PerInstanceMemoryWrapper>)originalList.stream()
                .map(item -> new PerInstanceMemoryWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterDataPrototypeWrapper> getPerInstanceParameters() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getPerInstanceParameters())) {
            ArrayList<ParameterDataPrototype> originalList = swcInternalBehavior.getPerInstanceParameters();
            ArrayList<ParameterDataPrototypeWrapper> wrapperList = (ArrayList<ParameterDataPrototypeWrapper>)originalList.stream()
                .map(item -> new ParameterDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PortApiOptionWrapper> getPortApiOptions() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getPortApiOptions())) {
            ArrayList<PortApiOption> originalList = swcInternalBehavior.getPortApiOptions();
            ArrayList<PortApiOptionWrapper> wrapperList = (ArrayList<PortApiOptionWrapper>)originalList.stream()
                .map(item -> new PortApiOptionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RunnableEntityWrapper> getRunnables() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getRunnables())) {
            ArrayList<RunnableEntity> originalList = swcInternalBehavior.getRunnables();
            ArrayList<RunnableEntityWrapper> wrapperList = (ArrayList<RunnableEntityWrapper>)originalList.stream()
                .map(item -> new RunnableEntityWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcServiceDependencyWrapper> getServiceDependencys() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getServiceDependencys())) {
            ArrayList<SwcServiceDependency> originalList = swcInternalBehavior.getServiceDependencys();
            ArrayList<SwcServiceDependencyWrapper> wrapperList = (ArrayList<SwcServiceDependencyWrapper>)originalList.stream()
                .map(item -> new SwcServiceDependencyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterDataPrototypeWrapper> getSharedParameters() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getSharedParameters())) {
            ArrayList<ParameterDataPrototype> originalList = swcInternalBehavior.getSharedParameters();
            ArrayList<ParameterDataPrototypeWrapper> wrapperList = (ArrayList<ParameterDataPrototypeWrapper>)originalList.stream()
                .map(item -> new ParameterDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getSupportsMultipleInstantiation() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getSupportsMultipleInstantiation())) {
            
            return new BooleanWrapper(swcInternalBehavior.getSupportsMultipleInstantiation());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<VariationPointProxyWrapper> getVariationPointProxys() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getVariationPointProxys())) {
            ArrayList<VariationPointProxy> originalList = swcInternalBehavior.getVariationPointProxys();
            ArrayList<VariationPointProxyWrapper> wrapperList = (ArrayList<VariationPointProxyWrapper>)originalList.stream()
                .map(item -> new VariationPointProxyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swcInternalBehavior.getVariationPoint())) {
            
            return new VariationPointWrapper(swcInternalBehavior.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}