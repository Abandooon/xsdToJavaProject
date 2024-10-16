package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    


public class VariableAndParameterInterfaceMappingWrapper {

    
    private VariableAndParameterInterfaceMapping variableAndParameterInterfaceMapping;

    public VariableAndParameterInterfaceMappingWrapper(VariableAndParameterInterfaceMapping variableAndParameterInterfaceMapping) {
        this.variableAndParameterInterfaceMapping = variableAndParameterInterfaceMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getS())) {
            
            return variableAndParameterInterfaceMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getT())) {
            
            return variableAndParameterInterfaceMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getUuid())) {
            
            return variableAndParameterInterfaceMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getShortName())) {
            
            return new IdentifierWrapper(variableAndParameterInterfaceMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = variableAndParameterInterfaceMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(variableAndParameterInterfaceMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(variableAndParameterInterfaceMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getCategory())) {
            
            return new CategoryStringWrapper(variableAndParameterInterfaceMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getAdminData())) {
            
            return new AdminDataWrapper(variableAndParameterInterfaceMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(variableAndParameterInterfaceMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = variableAndParameterInterfaceMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(variableAndParameterInterfaceMapping.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getShortNamePattern())) {
            
            return new StringWrapper(variableAndParameterInterfaceMapping.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(variableAndParameterInterfaceMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DataPrototypeMappingWrapper> getDataMappings() {
        
        if (CollUtil.isNotEmpty(variableAndParameterInterfaceMapping.getDataMappings())) {
            ArrayList<DataPrototypeMapping> originalList = variableAndParameterInterfaceMapping.getDataMappings();
            ArrayList<DataPrototypeMappingWrapper> wrapperList = (ArrayList<DataPrototypeMappingWrapper>)originalList.stream()
                .map(item -> new DataPrototypeMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}