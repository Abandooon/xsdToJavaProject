package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class DiagnosticStorageConditionGroupWrapper {

    
    private DiagnosticStorageConditionGroup diagnosticStorageConditionGroup;

    public DiagnosticStorageConditionGroupWrapper(DiagnosticStorageConditionGroup diagnosticStorageConditionGroup) {
        this.diagnosticStorageConditionGroup = diagnosticStorageConditionGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionGroup.getS())) {
            
            return diagnosticStorageConditionGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionGroup.getT())) {
            
            return diagnosticStorageConditionGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionGroup.getUuid())) {
            
            return diagnosticStorageConditionGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionGroup.getShortName())) {
            
            return new IdentifierWrapper(diagnosticStorageConditionGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticStorageConditionGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticStorageConditionGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticStorageConditionGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionGroup.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticStorageConditionGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionGroup.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticStorageConditionGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticStorageConditionGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticStorageConditionGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticStorageConditionGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticStorageConditionRefConditionalWrapper> getStorageConditions() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionGroup.getStorageConditions())) {
            ArrayList<DiagnosticStorageConditionRefConditional> originalList = diagnosticStorageConditionGroup.getStorageConditions();
            ArrayList<DiagnosticStorageConditionRefConditionalWrapper> wrapperList = (ArrayList<DiagnosticStorageConditionRefConditionalWrapper>)originalList.stream()
                .map(item -> new DiagnosticStorageConditionRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}