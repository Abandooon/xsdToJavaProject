package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticConnectionWrapper {

    
    private DiagnosticConnection diagnosticConnection;

    public DiagnosticConnectionWrapper(DiagnosticConnection diagnosticConnection) {
        this.diagnosticConnection = diagnosticConnection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getS())) {
            
            return diagnosticConnection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getT())) {
            
            return diagnosticConnection.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getUuid())) {
            
            return diagnosticConnection.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getShortName())) {
            
            return new IdentifierWrapper(diagnosticConnection.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticConnection.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticConnection.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticConnection.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticConnection.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticConnection.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticConnection.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticConnection.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticConnection.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FunctionalRequestRefWrapper> getFunctionalRequestRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getFunctionalRequestRefs())) {
            ArrayList<FunctionalRequestRef> originalList = diagnosticConnection.getFunctionalRequestRefs();
            ArrayList<FunctionalRequestRefWrapper> wrapperList = (ArrayList<FunctionalRequestRefWrapper>)originalList.stream()
                .map(item -> new FunctionalRequestRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PeriodicResponseUudtRefWrapper> getPeriodicResponseUudtRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getPeriodicResponseUudtRefs())) {
            ArrayList<PeriodicResponseUudtRef> originalList = diagnosticConnection.getPeriodicResponseUudtRefs();
            ArrayList<PeriodicResponseUudtRefWrapper> wrapperList = (ArrayList<PeriodicResponseUudtRefWrapper>)originalList.stream()
                .map(item -> new PeriodicResponseUudtRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PhysicalRequestRefWrapper getPhysicalRequestRef() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getPhysicalRequestRef())) {
            
            return new PhysicalRequestRefWrapper(diagnosticConnection.getPhysicalRequestRef());
            
        } else {
            return null;
        }
        
    }

    public ResponseOnEventRefWrapper getResponseOnEventRef() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getResponseOnEventRef())) {
            
            return new ResponseOnEventRefWrapper(diagnosticConnection.getResponseOnEventRef());
            
        } else {
            return null;
        }
        
    }

    public ResponseRefWrapper getResponseRef() {
        
        if (CollUtil.isNotEmpty(diagnosticConnection.getResponseRef())) {
            
            return new ResponseRefWrapper(diagnosticConnection.getResponseRef());
            
        } else {
            return null;
        }
        
    }




    


    
}