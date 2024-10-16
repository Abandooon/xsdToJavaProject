package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class DiagnosticStorageConditionWrapper {

    
    private DiagnosticStorageCondition diagnosticStorageCondition;

    public DiagnosticStorageConditionWrapper(DiagnosticStorageCondition diagnosticStorageCondition) {
        this.diagnosticStorageCondition = diagnosticStorageCondition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageCondition.getS())) {
            
            return diagnosticStorageCondition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageCondition.getT())) {
            
            return diagnosticStorageCondition.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageCondition.getUuid())) {
            
            return diagnosticStorageCondition.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageCondition.getShortName())) {
            
            return new IdentifierWrapper(diagnosticStorageCondition.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageCondition.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticStorageCondition.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageCondition.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticStorageCondition.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageCondition.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticStorageCondition.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageCondition.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticStorageCondition.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageCondition.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticStorageCondition.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageCondition.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticStorageCondition.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageCondition.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticStorageCondition.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageCondition.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticStorageCondition.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getInitValue() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageCondition.getInitValue())) {
            
            return new BooleanWrapper(diagnosticStorageCondition.getInitValue());
            
        } else {
            return null;
        }
        
    }




    


    
}