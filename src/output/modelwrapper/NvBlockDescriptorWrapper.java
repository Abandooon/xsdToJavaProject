package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class NvBlockDescriptorWrapper {

    
    private NvBlockDescriptor nvBlockDescriptor;

    public NvBlockDescriptorWrapper(NvBlockDescriptor nvBlockDescriptor) {
        this.nvBlockDescriptor = nvBlockDescriptor;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getS())) {
            
            return nvBlockDescriptor.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getT())) {
            
            return nvBlockDescriptor.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getUuid())) {
            
            return nvBlockDescriptor.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getShortName())) {
            
            return new IdentifierWrapper(nvBlockDescriptor.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = nvBlockDescriptor.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getLongName())) {
            
            return new MultilanguageLongNameWrapper(nvBlockDescriptor.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(nvBlockDescriptor.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getCategory())) {
            
            return new CategoryStringWrapper(nvBlockDescriptor.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getAdminData())) {
            
            return new AdminDataWrapper(nvBlockDescriptor.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getIntroduction())) {
            
            return new DocumentationBlockWrapper(nvBlockDescriptor.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getAnnotations())) {
            ArrayList<Annotation> originalList = nvBlockDescriptor.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RoleBasedPortAssignmentWrapper> getClientServerPorts() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getClientServerPorts())) {
            ArrayList<RoleBasedPortAssignment> originalList = nvBlockDescriptor.getClientServerPorts();
            ArrayList<RoleBasedPortAssignmentWrapper> wrapperList = (ArrayList<RoleBasedPortAssignmentWrapper>)originalList.stream()
                .map(item -> new RoleBasedPortAssignmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConstantValueMappingRefWrapper> getConstantValueMappingRefs() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getConstantValueMappingRefs())) {
            ArrayList<ConstantValueMappingRef> originalList = nvBlockDescriptor.getConstantValueMappingRefs();
            ArrayList<ConstantValueMappingRefWrapper> wrapperList = (ArrayList<ConstantValueMappingRefWrapper>)originalList.stream()
                .map(item -> new ConstantValueMappingRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataTypeMappingRefWrapper> getDataTypeMappingRefs() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getDataTypeMappingRefs())) {
            ArrayList<DataTypeMappingRef> originalList = nvBlockDescriptor.getDataTypeMappingRefs();
            ArrayList<DataTypeMappingRefWrapper> wrapperList = (ArrayList<DataTypeMappingRefWrapper>)originalList.stream()
                .map(item -> new DataTypeMappingRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<InstantiationDataDefPropsWrapper> getInstantiationDataDefPropss() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getInstantiationDataDefPropss())) {
            ArrayList<InstantiationDataDefProps> originalList = nvBlockDescriptor.getInstantiationDataDefPropss();
            ArrayList<InstantiationDataDefPropsWrapper> wrapperList = (ArrayList<InstantiationDataDefPropsWrapper>)originalList.stream()
                .map(item -> new InstantiationDataDefPropsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NvBlockDataMappingWrapper> getNvBlockDataMappings() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getNvBlockDataMappings())) {
            ArrayList<NvBlockDataMapping> originalList = nvBlockDescriptor.getNvBlockDataMappings();
            ArrayList<NvBlockDataMappingWrapper> wrapperList = (ArrayList<NvBlockDataMappingWrapper>)originalList.stream()
                .map(item -> new NvBlockDataMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public NvBlockNeedsWrapper getNvBlockNeeds() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getNvBlockNeeds())) {
            
            return new NvBlockNeedsWrapper(nvBlockDescriptor.getNvBlockNeeds());
            
        } else {
            return null;
        }
        
    }

    public VariableDataPrototypeWrapper getRamBlock() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getRamBlock())) {
            
            return new VariableDataPrototypeWrapper(nvBlockDescriptor.getRamBlock());
            
        } else {
            return null;
        }
        
    }

    public ParameterDataPrototypeWrapper getRomBlock() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getRomBlock())) {
            
            return new ParameterDataPrototypeWrapper(nvBlockDescriptor.getRomBlock());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getSupportDirtyFlag() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getSupportDirtyFlag())) {
            
            return new BooleanWrapper(nvBlockDescriptor.getSupportDirtyFlag());
            
        } else {
            return null;
        }
        
    }

    public TimingEventRefWrapper getTimingEventRef() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getTimingEventRef())) {
            
            return new TimingEventRefWrapper(nvBlockDescriptor.getTimingEventRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(nvBlockDescriptor.getVariationPoint())) {
            
            return new VariationPointWrapper(nvBlockDescriptor.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}