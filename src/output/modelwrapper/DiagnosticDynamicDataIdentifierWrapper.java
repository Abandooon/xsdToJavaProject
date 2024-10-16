package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class DiagnosticDynamicDataIdentifierWrapper {

    
    private DiagnosticDynamicDataIdentifier diagnosticDynamicDataIdentifier;

    public DiagnosticDynamicDataIdentifierWrapper(DiagnosticDynamicDataIdentifier diagnosticDynamicDataIdentifier) {
        this.diagnosticDynamicDataIdentifier = diagnosticDynamicDataIdentifier;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicDataIdentifier.getS())) {
            
            return diagnosticDynamicDataIdentifier.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicDataIdentifier.getT())) {
            
            return diagnosticDynamicDataIdentifier.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicDataIdentifier.getUuid())) {
            
            return diagnosticDynamicDataIdentifier.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicDataIdentifier.getShortName())) {
            
            return new IdentifierWrapper(diagnosticDynamicDataIdentifier.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicDataIdentifier.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticDynamicDataIdentifier.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicDataIdentifier.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticDynamicDataIdentifier.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicDataIdentifier.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticDynamicDataIdentifier.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicDataIdentifier.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticDynamicDataIdentifier.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicDataIdentifier.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticDynamicDataIdentifier.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicDataIdentifier.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticDynamicDataIdentifier.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicDataIdentifier.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticDynamicDataIdentifier.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicDataIdentifier.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticDynamicDataIdentifier.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getId() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicDataIdentifier.getId())) {
            
            return new PositiveIntegerWrapper(diagnosticDynamicDataIdentifier.getId());
            
        } else {
            return null;
        }
        
    }




    


    
}