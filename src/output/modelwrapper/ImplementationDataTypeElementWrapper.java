package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ImplementationDataTypeElementWrapper {

    
    private ImplementationDataTypeElement implementationDataTypeElement;

    public ImplementationDataTypeElementWrapper(ImplementationDataTypeElement implementationDataTypeElement) {
        this.implementationDataTypeElement = implementationDataTypeElement;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getS())) {
            
            return implementationDataTypeElement.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getT())) {
            
            return implementationDataTypeElement.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getUuid())) {
            
            return implementationDataTypeElement.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getShortName())) {
            
            return new IdentifierWrapper(implementationDataTypeElement.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = implementationDataTypeElement.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getLongName())) {
            
            return new MultilanguageLongNameWrapper(implementationDataTypeElement.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(implementationDataTypeElement.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getCategory())) {
            
            return new CategoryStringWrapper(implementationDataTypeElement.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getAdminData())) {
            
            return new AdminDataWrapper(implementationDataTypeElement.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getIntroduction())) {
            
            return new DocumentationBlockWrapper(implementationDataTypeElement.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getAnnotations())) {
            ArrayList<Annotation> originalList = implementationDataTypeElement.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getArraySize() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getArraySize())) {
            
            return new PositiveIntegerValueVariationPointWrapper(implementationDataTypeElement.getArraySize());
            
        } else {
            return null;
        }
        
    }

    public ArraySizeHandlingEnumWrapper getArraySizeHandling() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getArraySizeHandling())) {
            
            return new ArraySizeHandlingEnumWrapper(implementationDataTypeElement.getArraySizeHandling());
            
        } else {
            return null;
        }
        
    }

    public ArraySizeSemanticsEnumWrapper getArraySizeSemantics() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getArraySizeSemantics())) {
            
            return new ArraySizeSemanticsEnumWrapper(implementationDataTypeElement.getArraySizeSemantics());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ImplementationDataTypeElementWrapper> getSubElements() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getSubElements())) {
            ArrayList<ImplementationDataTypeElement> originalList = implementationDataTypeElement.getSubElements();
            ArrayList<ImplementationDataTypeElementWrapper> wrapperList = (ArrayList<ImplementationDataTypeElementWrapper>)originalList.stream()
                .map(item -> new ImplementationDataTypeElementWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(implementationDataTypeElement.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(implementationDataTypeElement.getVariationPoint())) {
            
            return new VariationPointWrapper(implementationDataTypeElement.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}