package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class ParameterDataPrototypeWrapper {

    
    private ParameterDataPrototype parameterDataPrototype;

    public ParameterDataPrototypeWrapper(ParameterDataPrototype parameterDataPrototype) {
        this.parameterDataPrototype = parameterDataPrototype;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getS())) {
            
            return parameterDataPrototype.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getT())) {
            
            return parameterDataPrototype.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getUuid())) {
            
            return parameterDataPrototype.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getShortName())) {
            
            return new IdentifierWrapper(parameterDataPrototype.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = parameterDataPrototype.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getLongName())) {
            
            return new MultilanguageLongNameWrapper(parameterDataPrototype.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(parameterDataPrototype.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getCategory())) {
            
            return new CategoryStringWrapper(parameterDataPrototype.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getAdminData())) {
            
            return new AdminDataWrapper(parameterDataPrototype.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getIntroduction())) {
            
            return new DocumentationBlockWrapper(parameterDataPrototype.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getAnnotations())) {
            ArrayList<Annotation> originalList = parameterDataPrototype.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(parameterDataPrototype.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public TypeTref_ArgumentDataPrototypeWrapper getTypeTref() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getTypeTref())) {
            
            return new TypeTref_ArgumentDataPrototypeWrapper(parameterDataPrototype.getTypeTref());
            
        } else {
            return null;
        }
        
    }

    public InitValueWrapper getInitValue() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getInitValue())) {
            
            return new InitValueWrapper(parameterDataPrototype.getInitValue());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(parameterDataPrototype.getVariationPoint())) {
            
            return new VariationPointWrapper(parameterDataPrototype.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}