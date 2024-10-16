package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticEventToEnableConditionGroupMappingWrapper {

    
    private DiagnosticEventToEnableConditionGroupMapping diagnosticEventToEnableConditionGroupMapping;

    public DiagnosticEventToEnableConditionGroupMappingWrapper(DiagnosticEventToEnableConditionGroupMapping diagnosticEventToEnableConditionGroupMapping) {
        this.diagnosticEventToEnableConditionGroupMapping = diagnosticEventToEnableConditionGroupMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getS())) {
            
            return diagnosticEventToEnableConditionGroupMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getT())) {
            
            return diagnosticEventToEnableConditionGroupMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getUuid())) {
            
            return diagnosticEventToEnableConditionGroupMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEventToEnableConditionGroupMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEventToEnableConditionGroupMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEventToEnableConditionGroupMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEventToEnableConditionGroupMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEventToEnableConditionGroupMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEventToEnableConditionGroupMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEventToEnableConditionGroupMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEventToEnableConditionGroupMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticEventToEnableConditionGroupMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEventRefWrapper getDiagnosticEventRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getDiagnosticEventRef())) {
            
            return new DiagnosticEventRefWrapper(diagnosticEventToEnableConditionGroupMapping.getDiagnosticEventRef());
            
        } else {
            return null;
        }
        
    }

    public EnableConditionGroupRefWrapper getEnableConditionGroupRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToEnableConditionGroupMapping.getEnableConditionGroupRef())) {
            
            return new EnableConditionGroupRefWrapper(diagnosticEventToEnableConditionGroupMapping.getEnableConditionGroupRef());
            
        } else {
            return null;
        }
        
    }




    


    
}