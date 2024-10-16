package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class DiagnosticEnableConditionGroupWrapper {

    
    private DiagnosticEnableConditionGroup diagnosticEnableConditionGroup;

    public DiagnosticEnableConditionGroupWrapper(DiagnosticEnableConditionGroup diagnosticEnableConditionGroup) {
        this.diagnosticEnableConditionGroup = diagnosticEnableConditionGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionGroup.getS())) {
            
            return diagnosticEnableConditionGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionGroup.getT())) {
            
            return diagnosticEnableConditionGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionGroup.getUuid())) {
            
            return diagnosticEnableConditionGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionGroup.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEnableConditionGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEnableConditionGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEnableConditionGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEnableConditionGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionGroup.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEnableConditionGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionGroup.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEnableConditionGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEnableConditionGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEnableConditionGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticEnableConditionGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEnableConditionRefConditionalWrapper> getEnableConditions() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionGroup.getEnableConditions())) {
            ArrayList<DiagnosticEnableConditionRefConditional> originalList = diagnosticEnableConditionGroup.getEnableConditions();
            ArrayList<DiagnosticEnableConditionRefConditionalWrapper> wrapperList = (ArrayList<DiagnosticEnableConditionRefConditionalWrapper>)originalList.stream()
                .map(item -> new DiagnosticEnableConditionRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}