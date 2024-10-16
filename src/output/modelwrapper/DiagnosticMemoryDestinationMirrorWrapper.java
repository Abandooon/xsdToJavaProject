package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class DiagnosticMemoryDestinationMirrorWrapper {

    
    private DiagnosticMemoryDestinationMirror diagnosticMemoryDestinationMirror;

    public DiagnosticMemoryDestinationMirrorWrapper(DiagnosticMemoryDestinationMirror diagnosticMemoryDestinationMirror) {
        this.diagnosticMemoryDestinationMirror = diagnosticMemoryDestinationMirror;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationMirror.getS())) {
            
            return diagnosticMemoryDestinationMirror.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationMirror.getT())) {
            
            return diagnosticMemoryDestinationMirror.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationMirror.getUuid())) {
            
            return diagnosticMemoryDestinationMirror.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationMirror.getShortName())) {
            
            return new IdentifierWrapper(diagnosticMemoryDestinationMirror.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationMirror.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticMemoryDestinationMirror.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationMirror.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticMemoryDestinationMirror.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationMirror.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticMemoryDestinationMirror.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationMirror.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticMemoryDestinationMirror.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationMirror.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticMemoryDestinationMirror.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationMirror.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticMemoryDestinationMirror.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationMirror.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticMemoryDestinationMirror.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationMirror.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticMemoryDestinationMirror.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}