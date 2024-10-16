package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticOperationCyclePortMappingWrapper {

    
    private DiagnosticOperationCyclePortMapping diagnosticOperationCyclePortMapping;

    public DiagnosticOperationCyclePortMappingWrapper(DiagnosticOperationCyclePortMapping diagnosticOperationCyclePortMapping) {
        this.diagnosticOperationCyclePortMapping = diagnosticOperationCyclePortMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getS())) {
            
            return diagnosticOperationCyclePortMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getT())) {
            
            return diagnosticOperationCyclePortMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getUuid())) {
            
            return diagnosticOperationCyclePortMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getShortName())) {
            
            return new IdentifierWrapper(diagnosticOperationCyclePortMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticOperationCyclePortMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticOperationCyclePortMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticOperationCyclePortMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticOperationCyclePortMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticOperationCyclePortMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticOperationCyclePortMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticOperationCyclePortMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticOperationCyclePortMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public OperationCycleRefWrapper getOperationCycleRef() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getOperationCycleRef())) {
            
            return new OperationCycleRefWrapper(diagnosticOperationCyclePortMapping.getOperationCycleRef());
            
        } else {
            return null;
        }
        
    }

    public SwcFlatServiceDependencyRefWrapper getSwcFlatServiceDependencyRef() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getSwcFlatServiceDependencyRef())) {
            
            return new SwcFlatServiceDependencyRefWrapper(diagnosticOperationCyclePortMapping.getSwcFlatServiceDependencyRef());
            
        } else {
            return null;
        }
        
    }

    public SwcServiceDependencyInCompositionInstanceRefWrapper getSwcServiceDependencyIref() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCyclePortMapping.getSwcServiceDependencyIref())) {
            
            return new SwcServiceDependencyInCompositionInstanceRefWrapper(diagnosticOperationCyclePortMapping.getSwcServiceDependencyIref());
            
        } else {
            return null;
        }
        
    }




    


    
}