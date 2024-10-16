package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class DiagnosticMemoryDestinationPrimaryWrapper {

    
    private DiagnosticMemoryDestinationPrimary diagnosticMemoryDestinationPrimary;

    public DiagnosticMemoryDestinationPrimaryWrapper(DiagnosticMemoryDestinationPrimary diagnosticMemoryDestinationPrimary) {
        this.diagnosticMemoryDestinationPrimary = diagnosticMemoryDestinationPrimary;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationPrimary.getS())) {
            
            return diagnosticMemoryDestinationPrimary.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationPrimary.getT())) {
            
            return diagnosticMemoryDestinationPrimary.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationPrimary.getUuid())) {
            
            return diagnosticMemoryDestinationPrimary.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationPrimary.getShortName())) {
            
            return new IdentifierWrapper(diagnosticMemoryDestinationPrimary.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationPrimary.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticMemoryDestinationPrimary.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationPrimary.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticMemoryDestinationPrimary.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationPrimary.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticMemoryDestinationPrimary.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationPrimary.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticMemoryDestinationPrimary.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationPrimary.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticMemoryDestinationPrimary.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationPrimary.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticMemoryDestinationPrimary.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationPrimary.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticMemoryDestinationPrimary.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationPrimary.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticMemoryDestinationPrimary.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}