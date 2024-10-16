package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    


public class ApplicationPrimitiveDataTypeWrapper {

    
    private ApplicationPrimitiveDataType applicationPrimitiveDataType;

    public ApplicationPrimitiveDataTypeWrapper(ApplicationPrimitiveDataType applicationPrimitiveDataType) {
        this.applicationPrimitiveDataType = applicationPrimitiveDataType;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getS())) {
            
            return applicationPrimitiveDataType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getT())) {
            
            return applicationPrimitiveDataType.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getUuid())) {
            
            return applicationPrimitiveDataType.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getShortName())) {
            
            return new IdentifierWrapper(applicationPrimitiveDataType.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = applicationPrimitiveDataType.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getLongName())) {
            
            return new MultilanguageLongNameWrapper(applicationPrimitiveDataType.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(applicationPrimitiveDataType.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getCategory())) {
            
            return new CategoryStringWrapper(applicationPrimitiveDataType.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getAdminData())) {
            
            return new AdminDataWrapper(applicationPrimitiveDataType.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getIntroduction())) {
            
            return new DocumentationBlockWrapper(applicationPrimitiveDataType.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getAnnotations())) {
            ArrayList<Annotation> originalList = applicationPrimitiveDataType.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(applicationPrimitiveDataType.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getShortNamePattern())) {
            
            return new StringWrapper(applicationPrimitiveDataType.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getVariationPoint())) {
            
            return new VariationPointWrapper(applicationPrimitiveDataType.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(applicationPrimitiveDataType.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(applicationPrimitiveDataType.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }




    


    
}