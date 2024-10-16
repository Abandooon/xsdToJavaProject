package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticServiceDataMappingWrapper {

    
    private DiagnosticServiceDataMapping diagnosticServiceDataMapping;

    public DiagnosticServiceDataMappingWrapper(DiagnosticServiceDataMapping diagnosticServiceDataMapping) {
        this.diagnosticServiceDataMapping = diagnosticServiceDataMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getS())) {
            
            return diagnosticServiceDataMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getT())) {
            
            return diagnosticServiceDataMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getUuid())) {
            
            return diagnosticServiceDataMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getShortName())) {
            
            return new IdentifierWrapper(diagnosticServiceDataMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticServiceDataMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticServiceDataMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticServiceDataMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticServiceDataMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticServiceDataMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticServiceDataMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticServiceDataMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticServiceDataMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticDataElementRefWrapper getDiagnosticDataElementRef() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getDiagnosticDataElementRef())) {
            
            return new DiagnosticDataElementRefWrapper(diagnosticServiceDataMapping.getDiagnosticDataElementRef());
            
        } else {
            return null;
        }
        
    }

    public DataPrototypeInSystemInstanceRefWrapper getMappedDataElementIref() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceDataMapping.getMappedDataElementIref())) {
            
            return new DataPrototypeInSystemInstanceRefWrapper(diagnosticServiceDataMapping.getMappedDataElementIref());
            
        } else {
            return null;
        }
        
    }




    


    
}