package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class ParameterInterfaceWrapper {

    
    private ParameterInterface parameterInterface;

    public ParameterInterfaceWrapper(ParameterInterface parameterInterface) {
        this.parameterInterface = parameterInterface;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getS())) {
            
            return parameterInterface.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getT())) {
            
            return parameterInterface.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getUuid())) {
            
            return parameterInterface.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getShortName())) {
            
            return new IdentifierWrapper(parameterInterface.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = parameterInterface.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getLongName())) {
            
            return new MultilanguageLongNameWrapper(parameterInterface.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(parameterInterface.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getCategory())) {
            
            return new CategoryStringWrapper(parameterInterface.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getAdminData())) {
            
            return new AdminDataWrapper(parameterInterface.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getIntroduction())) {
            
            return new DocumentationBlockWrapper(parameterInterface.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getAnnotations())) {
            ArrayList<Annotation> originalList = parameterInterface.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getVariationPoint())) {
            
            return new VariationPointWrapper(parameterInterface.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(parameterInterface.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getShortNamePattern())) {
            
            return new StringWrapper(parameterInterface.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsService() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getIsService())) {
            
            return new BooleanWrapper(parameterInterface.getIsService());
            
        } else {
            return null;
        }
        
    }

    public ServiceProviderEnumWrapper getServiceKind() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getServiceKind())) {
            
            return new ServiceProviderEnumWrapper(parameterInterface.getServiceKind());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterDataPrototypeWrapper> getParameters() {
        
        if (CollUtil.isNotEmpty(parameterInterface.getParameters())) {
            ArrayList<ParameterDataPrototype> originalList = parameterInterface.getParameters();
            ArrayList<ParameterDataPrototypeWrapper> wrapperList = (ArrayList<ParameterDataPrototypeWrapper>)originalList.stream()
                .map(item -> new ParameterDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}