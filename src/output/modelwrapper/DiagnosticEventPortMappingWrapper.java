package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticEventPortMappingWrapper {

    
    private DiagnosticEventPortMapping diagnosticEventPortMapping;

    public DiagnosticEventPortMappingWrapper(DiagnosticEventPortMapping diagnosticEventPortMapping) {
        this.diagnosticEventPortMapping = diagnosticEventPortMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getS())) {
            
            return diagnosticEventPortMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getT())) {
            
            return diagnosticEventPortMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getUuid())) {
            
            return diagnosticEventPortMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEventPortMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEventPortMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEventPortMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEventPortMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEventPortMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEventPortMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEventPortMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEventPortMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticEventPortMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BswServiceDependencyRefWrapper getBswServiceDependencyRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getBswServiceDependencyRef())) {
            
            return new BswServiceDependencyRefWrapper(diagnosticEventPortMapping.getBswServiceDependencyRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEventRefWrapper getDiagnosticEventRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getDiagnosticEventRef())) {
            
            return new DiagnosticEventRefWrapper(diagnosticEventPortMapping.getDiagnosticEventRef());
            
        } else {
            return null;
        }
        
    }

    public SwcFlatServiceDependencyRefWrapper getSwcFlatServiceDependencyRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getSwcFlatServiceDependencyRef())) {
            
            return new SwcFlatServiceDependencyRefWrapper(diagnosticEventPortMapping.getSwcFlatServiceDependencyRef());
            
        } else {
            return null;
        }
        
    }

    public SwcServiceDependencyInCompositionInstanceRefWrapper getSwcServiceDependencyIref() {
        
        if (CollUtil.isNotEmpty(diagnosticEventPortMapping.getSwcServiceDependencyIref())) {
            
            return new SwcServiceDependencyInCompositionInstanceRefWrapper(diagnosticEventPortMapping.getSwcServiceDependencyIref());
            
        } else {
            return null;
        }
        
    }




    


    
}