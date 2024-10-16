package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticStorageConditionPortMappingWrapper {

    
    private DiagnosticStorageConditionPortMapping diagnosticStorageConditionPortMapping;

    public DiagnosticStorageConditionPortMappingWrapper(DiagnosticStorageConditionPortMapping diagnosticStorageConditionPortMapping) {
        this.diagnosticStorageConditionPortMapping = diagnosticStorageConditionPortMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getS())) {
            
            return diagnosticStorageConditionPortMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getT())) {
            
            return diagnosticStorageConditionPortMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getUuid())) {
            
            return diagnosticStorageConditionPortMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getShortName())) {
            
            return new IdentifierWrapper(diagnosticStorageConditionPortMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticStorageConditionPortMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticStorageConditionPortMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticStorageConditionPortMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticStorageConditionPortMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticStorageConditionPortMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticStorageConditionPortMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticStorageConditionPortMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticStorageConditionPortMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticStorageConditionRefWrapper getDiagnosticStorageConditionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getDiagnosticStorageConditionRef())) {
            
            return new DiagnosticStorageConditionRefWrapper(diagnosticStorageConditionPortMapping.getDiagnosticStorageConditionRef());
            
        } else {
            return null;
        }
        
    }

    public SwcFlatServiceDependencyRefWrapper getSwcFlatServiceDependencyRef() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getSwcFlatServiceDependencyRef())) {
            
            return new SwcFlatServiceDependencyRefWrapper(diagnosticStorageConditionPortMapping.getSwcFlatServiceDependencyRef());
            
        } else {
            return null;
        }
        
    }

    public SwcServiceDependencyInCompositionInstanceRefWrapper getSwcServiceDependencyIref() {
        
        if (CollUtil.isNotEmpty(diagnosticStorageConditionPortMapping.getSwcServiceDependencyIref())) {
            
            return new SwcServiceDependencyInCompositionInstanceRefWrapper(diagnosticStorageConditionPortMapping.getSwcServiceDependencyIref());
            
        } else {
            return null;
        }
        
    }




    


    
}