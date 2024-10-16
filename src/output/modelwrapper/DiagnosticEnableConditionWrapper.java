package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class DiagnosticEnableConditionWrapper {

    
    private DiagnosticEnableCondition diagnosticEnableCondition;

    public DiagnosticEnableConditionWrapper(DiagnosticEnableCondition diagnosticEnableCondition) {
        this.diagnosticEnableCondition = diagnosticEnableCondition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableCondition.getS())) {
            
            return diagnosticEnableCondition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableCondition.getT())) {
            
            return diagnosticEnableCondition.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableCondition.getUuid())) {
            
            return diagnosticEnableCondition.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableCondition.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEnableCondition.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableCondition.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEnableCondition.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableCondition.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEnableCondition.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableCondition.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEnableCondition.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableCondition.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEnableCondition.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableCondition.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEnableCondition.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableCondition.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEnableCondition.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableCondition.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEnableCondition.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableCondition.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticEnableCondition.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getInitValue() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableCondition.getInitValue())) {
            
            return new BooleanWrapper(diagnosticEnableCondition.getInitValue());
            
        } else {
            return null;
        }
        
    }




    


    
}