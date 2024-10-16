package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticEnableConditionPortMappingWrapper {

    
    private DiagnosticEnableConditionPortMapping diagnosticEnableConditionPortMapping;

    public DiagnosticEnableConditionPortMappingWrapper(DiagnosticEnableConditionPortMapping diagnosticEnableConditionPortMapping) {
        this.diagnosticEnableConditionPortMapping = diagnosticEnableConditionPortMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getS())) {
            
            return diagnosticEnableConditionPortMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getT())) {
            
            return diagnosticEnableConditionPortMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getUuid())) {
            
            return diagnosticEnableConditionPortMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEnableConditionPortMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEnableConditionPortMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEnableConditionPortMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEnableConditionPortMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEnableConditionPortMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEnableConditionPortMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEnableConditionPortMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEnableConditionPortMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticEnableConditionPortMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EnableConditionRefWrapper getEnableConditionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getEnableConditionRef())) {
            
            return new EnableConditionRefWrapper(diagnosticEnableConditionPortMapping.getEnableConditionRef());
            
        } else {
            return null;
        }
        
    }

    public SwcFlatServiceDependencyRefWrapper getSwcFlatServiceDependencyRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getSwcFlatServiceDependencyRef())) {
            
            return new SwcFlatServiceDependencyRefWrapper(diagnosticEnableConditionPortMapping.getSwcFlatServiceDependencyRef());
            
        } else {
            return null;
        }
        
    }

    public SwcServiceDependencyInCompositionInstanceRefWrapper getSwcServiceDependencyIref() {
        
        if (CollUtil.isNotEmpty(diagnosticEnableConditionPortMapping.getSwcServiceDependencyIref())) {
            
            return new SwcServiceDependencyInCompositionInstanceRefWrapper(diagnosticEnableConditionPortMapping.getSwcServiceDependencyIref());
            
        } else {
            return null;
        }
        
    }




    


    
}