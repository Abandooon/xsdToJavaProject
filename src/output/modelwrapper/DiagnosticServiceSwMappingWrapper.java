package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticServiceSwMappingWrapper {

    
    private DiagnosticServiceSwMapping diagnosticServiceSwMapping;

    public DiagnosticServiceSwMappingWrapper(DiagnosticServiceSwMapping diagnosticServiceSwMapping) {
        this.diagnosticServiceSwMapping = diagnosticServiceSwMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getS())) {
            
            return diagnosticServiceSwMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getT())) {
            
            return diagnosticServiceSwMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getUuid())) {
            
            return diagnosticServiceSwMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getShortName())) {
            
            return new IdentifierWrapper(diagnosticServiceSwMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticServiceSwMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticServiceSwMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticServiceSwMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticServiceSwMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticServiceSwMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticServiceSwMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticServiceSwMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticServiceSwMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticDataElementRefWrapper getDiagnosticDataElementRef() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getDiagnosticDataElementRef())) {
            
            return new DiagnosticDataElementRefWrapper(diagnosticServiceSwMapping.getDiagnosticDataElementRef());
            
        } else {
            return null;
        }
        
    }

    public MappedBswServiceDependencyRefWrapper getMappedBswServiceDependencyRef() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getMappedBswServiceDependencyRef())) {
            
            return new MappedBswServiceDependencyRefWrapper(diagnosticServiceSwMapping.getMappedBswServiceDependencyRef());
            
        } else {
            return null;
        }
        
    }

    public MappedFlatSwcServiceDependencyRefWrapper getMappedFlatSwcServiceDependencyRef() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getMappedFlatSwcServiceDependencyRef())) {
            
            return new MappedFlatSwcServiceDependencyRefWrapper(diagnosticServiceSwMapping.getMappedFlatSwcServiceDependencyRef());
            
        } else {
            return null;
        }
        
    }

    public SwcServiceDependencyInCompositionInstanceRefWrapper getMappedSwcServiceDependencyIref() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getMappedSwcServiceDependencyIref())) {
            
            return new SwcServiceDependencyInCompositionInstanceRefWrapper(diagnosticServiceSwMapping.getMappedSwcServiceDependencyIref());
            
        } else {
            return null;
        }
        
    }

    public ServiceInstanceRef_DiagnosticServiceTableWrapper getServiceInstanceRef() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceSwMapping.getServiceInstanceRef())) {
            
            return new ServiceInstanceRef_DiagnosticServiceTableWrapper(diagnosticServiceSwMapping.getServiceInstanceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}