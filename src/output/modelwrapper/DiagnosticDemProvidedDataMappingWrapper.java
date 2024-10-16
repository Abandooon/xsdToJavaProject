package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticDemProvidedDataMappingWrapper {

    
    private DiagnosticDemProvidedDataMapping diagnosticDemProvidedDataMapping;

    public DiagnosticDemProvidedDataMappingWrapper(DiagnosticDemProvidedDataMapping diagnosticDemProvidedDataMapping) {
        this.diagnosticDemProvidedDataMapping = diagnosticDemProvidedDataMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getS())) {
            
            return diagnosticDemProvidedDataMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getT())) {
            
            return diagnosticDemProvidedDataMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getUuid())) {
            
            return diagnosticDemProvidedDataMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getShortName())) {
            
            return new IdentifierWrapper(diagnosticDemProvidedDataMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticDemProvidedDataMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticDemProvidedDataMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticDemProvidedDataMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticDemProvidedDataMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticDemProvidedDataMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticDemProvidedDataMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticDemProvidedDataMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticDemProvidedDataMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DataElementRefWrapper getDataElementRef() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getDataElementRef())) {
            
            return new DataElementRefWrapper(diagnosticDemProvidedDataMapping.getDataElementRef());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getDataProvider() {
        
        if (CollUtil.isNotEmpty(diagnosticDemProvidedDataMapping.getDataProvider())) {
            
            return new NmtokenStringWrapper(diagnosticDemProvidedDataMapping.getDataProvider());
            
        } else {
            return null;
        }
        
    }




    


    
}