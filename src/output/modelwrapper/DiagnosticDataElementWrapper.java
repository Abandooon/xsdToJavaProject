package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticDataElementWrapper {

    
    private DiagnosticDataElement diagnosticDataElement;

    public DiagnosticDataElementWrapper(DiagnosticDataElement diagnosticDataElement) {
        this.diagnosticDataElement = diagnosticDataElement;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getS())) {
            
            return diagnosticDataElement.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getT())) {
            
            return diagnosticDataElement.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getUuid())) {
            
            return diagnosticDataElement.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getShortName())) {
            
            return new IdentifierWrapper(diagnosticDataElement.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticDataElement.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticDataElement.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticDataElement.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticDataElement.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticDataElement.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticDataElement.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticDataElement.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArraySizeSemanticsEnumWrapper getArraySizeSemantics() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getArraySizeSemantics())) {
            
            return new ArraySizeSemanticsEnumWrapper(diagnosticDataElement.getArraySizeSemantics());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxNumberOfElements() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getMaxNumberOfElements())) {
            
            return new PositiveIntegerWrapper(diagnosticDataElement.getMaxNumberOfElements());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(diagnosticDataElement.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticDataElement.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticDataElement.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}