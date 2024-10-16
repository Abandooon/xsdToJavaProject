package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class ApplicationArrayElementWrapper {

    
    private ApplicationArrayElement applicationArrayElement;

    public ApplicationArrayElementWrapper(ApplicationArrayElement applicationArrayElement) {
        this.applicationArrayElement = applicationArrayElement;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getS())) {
            
            return applicationArrayElement.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getT())) {
            
            return applicationArrayElement.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getUuid())) {
            
            return applicationArrayElement.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getShortName())) {
            
            return new IdentifierWrapper(applicationArrayElement.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = applicationArrayElement.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getLongName())) {
            
            return new MultilanguageLongNameWrapper(applicationArrayElement.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(applicationArrayElement.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getCategory())) {
            
            return new CategoryStringWrapper(applicationArrayElement.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getAdminData())) {
            
            return new AdminDataWrapper(applicationArrayElement.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getIntroduction())) {
            
            return new DocumentationBlockWrapper(applicationArrayElement.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getAnnotations())) {
            ArrayList<Annotation> originalList = applicationArrayElement.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(applicationArrayElement.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public TypeTrefWrapper getTypeTref() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getTypeTref())) {
            
            return new TypeTrefWrapper(applicationArrayElement.getTypeTref());
            
        } else {
            return null;
        }
        
    }

    public ArraySizeHandlingEnumWrapper getArraySizeHandling() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getArraySizeHandling())) {
            
            return new ArraySizeHandlingEnumWrapper(applicationArrayElement.getArraySizeHandling());
            
        } else {
            return null;
        }
        
    }

    public ArraySizeSemanticsEnumWrapper getArraySizeSemantics() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getArraySizeSemantics())) {
            
            return new ArraySizeSemanticsEnumWrapper(applicationArrayElement.getArraySizeSemantics());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getMaxNumberOfElements() {
        
        if (CollUtil.isNotEmpty(applicationArrayElement.getMaxNumberOfElements())) {
            
            return new PositiveIntegerValueVariationPointWrapper(applicationArrayElement.getMaxNumberOfElements());
            
        } else {
            return null;
        }
        
    }




    


    
}