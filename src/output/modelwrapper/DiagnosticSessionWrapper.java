package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticSessionWrapper {

    
    private DiagnosticSession diagnosticSession;

    public DiagnosticSessionWrapper(DiagnosticSession diagnosticSession) {
        this.diagnosticSession = diagnosticSession;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getS())) {
            
            return diagnosticSession.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getT())) {
            
            return diagnosticSession.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getUuid())) {
            
            return diagnosticSession.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getShortName())) {
            
            return new IdentifierWrapper(diagnosticSession.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticSession.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticSession.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticSession.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticSession.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticSession.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticSession.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticSession.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticSession.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getId() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getId())) {
            
            return new PositiveIntegerWrapper(diagnosticSession.getId());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticJumpToBootLoaderEnumWrapper getJumpToBootLoader() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getJumpToBootLoader())) {
            
            return new DiagnosticJumpToBootLoaderEnumWrapper(diagnosticSession.getJumpToBootLoader());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getP2ServerMax() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getP2ServerMax())) {
            
            return new TimeValueWrapper(diagnosticSession.getP2ServerMax());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getP2StarServerMax() {
        
        if (CollUtil.isNotEmpty(diagnosticSession.getP2StarServerMax())) {
            
            return new TimeValueWrapper(diagnosticSession.getP2StarServerMax());
            
        } else {
            return null;
        }
        
    }




    


    
}