package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class NvDataInterfaceWrapper {

    
    private NvDataInterface nvDataInterface;

    public NvDataInterfaceWrapper(NvDataInterface nvDataInterface) {
        this.nvDataInterface = nvDataInterface;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getS())) {
            
            return nvDataInterface.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getT())) {
            
            return nvDataInterface.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getUuid())) {
            
            return nvDataInterface.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getShortName())) {
            
            return new IdentifierWrapper(nvDataInterface.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = nvDataInterface.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getLongName())) {
            
            return new MultilanguageLongNameWrapper(nvDataInterface.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(nvDataInterface.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getCategory())) {
            
            return new CategoryStringWrapper(nvDataInterface.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getAdminData())) {
            
            return new AdminDataWrapper(nvDataInterface.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getIntroduction())) {
            
            return new DocumentationBlockWrapper(nvDataInterface.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getAnnotations())) {
            ArrayList<Annotation> originalList = nvDataInterface.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getVariationPoint())) {
            
            return new VariationPointWrapper(nvDataInterface.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(nvDataInterface.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getShortNamePattern())) {
            
            return new StringWrapper(nvDataInterface.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsService() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getIsService())) {
            
            return new BooleanWrapper(nvDataInterface.getIsService());
            
        } else {
            return null;
        }
        
    }

    public ServiceProviderEnumWrapper getServiceKind() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getServiceKind())) {
            
            return new ServiceProviderEnumWrapper(nvDataInterface.getServiceKind());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableDataPrototypeWrapper> getNvDatas() {
        
        if (CollUtil.isNotEmpty(nvDataInterface.getNvDatas())) {
            ArrayList<VariableDataPrototype> originalList = nvDataInterface.getNvDatas();
            ArrayList<VariableDataPrototypeWrapper> wrapperList = (ArrayList<VariableDataPrototypeWrapper>)originalList.stream()
                .map(item -> new VariableDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}