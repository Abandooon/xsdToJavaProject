package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class ApplicationArrayDataTypeWrapper {

    
    private ApplicationArrayDataType applicationArrayDataType;

    public ApplicationArrayDataTypeWrapper(ApplicationArrayDataType applicationArrayDataType) {
        this.applicationArrayDataType = applicationArrayDataType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getS())) {
            
            return applicationArrayDataType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getT())) {
            
            return applicationArrayDataType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getUuid())) {
            
            return applicationArrayDataType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getShortName())) {
            
            return new IdentifierWrapper(applicationArrayDataType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = applicationArrayDataType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(applicationArrayDataType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(applicationArrayDataType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getCategory())) {
            
            return new CategoryStringWrapper(applicationArrayDataType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getAdminData())) {
            
            return new AdminDataWrapper(applicationArrayDataType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(applicationArrayDataType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getAnnotations())) {
            ArrayList<Annotation> originalList = applicationArrayDataType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(applicationArrayDataType.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getShortNamePattern())) {
            
            return new StringWrapper(applicationArrayDataType.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getVariationPoint())) {
            
            return new VariationPointWrapper(applicationArrayDataType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(applicationArrayDataType.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getDynamicArraySizeProfile() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getDynamicArraySizeProfile())) {
            
            return new StringWrapper(applicationArrayDataType.getDynamicArraySizeProfile());
            
        } else {
            return null;
        }
        
    }

    public ApplicationArrayElementWrapper getElement() {
        
        if (CollUtil.isNotEmpty(applicationArrayDataType.getElement())) {
            
            return new ApplicationArrayElementWrapper(applicationArrayDataType.getElement());
            
        } else {
            return null;
        }
        
    }




    


    
}