package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class DiagnosticDataIdentifierWrapper {

    
    private DiagnosticDataIdentifier diagnosticDataIdentifier;

    public DiagnosticDataIdentifierWrapper(DiagnosticDataIdentifier diagnosticDataIdentifier) {
        this.diagnosticDataIdentifier = diagnosticDataIdentifier;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getS())) {
            
            return diagnosticDataIdentifier.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getT())) {
            
            return diagnosticDataIdentifier.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getUuid())) {
            
            return diagnosticDataIdentifier.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getShortName())) {
            
            return new IdentifierWrapper(diagnosticDataIdentifier.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticDataIdentifier.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticDataIdentifier.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticDataIdentifier.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticDataIdentifier.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticDataIdentifier.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticDataIdentifier.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticDataIdentifier.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticDataIdentifier.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getId() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getId())) {
            
            return new PositiveIntegerWrapper(diagnosticDataIdentifier.getId());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticParameterWrapper> getDataElements() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getDataElements())) {
            ArrayList<DiagnosticParameter> originalList = diagnosticDataIdentifier.getDataElements();
            ArrayList<DiagnosticParameterWrapper> wrapperList = (ArrayList<DiagnosticParameterWrapper>)originalList.stream()
                .map(item -> new DiagnosticParameterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRepresentsVin() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifier.getRepresentsVin())) {
            
            return new BooleanWrapper(diagnosticDataIdentifier.getRepresentsVin());
            
        } else {
            return null;
        }
        
    }




    


    
}