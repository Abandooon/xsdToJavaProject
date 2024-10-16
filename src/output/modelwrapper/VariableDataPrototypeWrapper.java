package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class VariableDataPrototypeWrapper {

    
    private VariableDataPrototype variableDataPrototype;

    public VariableDataPrototypeWrapper(VariableDataPrototype variableDataPrototype) {
        this.variableDataPrototype = variableDataPrototype;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getS())) {
            
            return variableDataPrototype.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getT())) {
            
            return variableDataPrototype.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getUuid())) {
            
            return variableDataPrototype.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getShortName())) {
            
            return new IdentifierWrapper(variableDataPrototype.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = variableDataPrototype.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getLongName())) {
            
            return new MultilanguageLongNameWrapper(variableDataPrototype.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(variableDataPrototype.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getCategory())) {
            
            return new CategoryStringWrapper(variableDataPrototype.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getAdminData())) {
            
            return new AdminDataWrapper(variableDataPrototype.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getIntroduction())) {
            
            return new DocumentationBlockWrapper(variableDataPrototype.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getAnnotations())) {
            ArrayList<Annotation> originalList = variableDataPrototype.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(variableDataPrototype.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public TypeTref_ArgumentDataPrototypeWrapper getTypeTref() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getTypeTref())) {
            
            return new TypeTref_ArgumentDataPrototypeWrapper(variableDataPrototype.getTypeTref());
            
        } else {
            return null;
        }
        
    }

    public InitValueWrapper getInitValue() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getInitValue())) {
            
            return new InitValueWrapper(variableDataPrototype.getInitValue());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(variableDataPrototype.getVariationPoint())) {
            
            return new VariationPointWrapper(variableDataPrototype.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}