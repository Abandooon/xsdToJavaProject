package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticResponseOnEventWrapper {

    
    private DiagnosticResponseOnEvent diagnosticResponseOnEvent;

    public DiagnosticResponseOnEventWrapper(DiagnosticResponseOnEvent diagnosticResponseOnEvent) {
        this.diagnosticResponseOnEvent = diagnosticResponseOnEvent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getS())) {
            
            return diagnosticResponseOnEvent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getT())) {
            
            return diagnosticResponseOnEvent.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getUuid())) {
            
            return diagnosticResponseOnEvent.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getShortName())) {
            
            return new IdentifierWrapper(diagnosticResponseOnEvent.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticResponseOnEvent.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticResponseOnEvent.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticResponseOnEvent.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticResponseOnEvent.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticResponseOnEvent.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticResponseOnEvent.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticResponseOnEvent.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticResponseOnEvent.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticResponseOnEvent.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public Events_DiagnosticResponseOnEventWrapper getEvents() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getEvents())) {
            
            return new Events_DiagnosticResponseOnEventWrapper(diagnosticResponseOnEvent.getEvents());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticEventWindowWrapper> getEventWindows() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getEventWindows())) {
            ArrayList<DiagnosticEventWindow> originalList = diagnosticResponseOnEvent.getEventWindows();
            ArrayList<DiagnosticEventWindowWrapper> wrapperList = (ArrayList<DiagnosticEventWindowWrapper>)originalList.stream()
                .map(item -> new DiagnosticEventWindowWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ResponseOnEventClassRefWrapper getResponseOnEventClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEvent.getResponseOnEventClassRef())) {
            
            return new ResponseOnEventClassRefWrapper(diagnosticResponseOnEvent.getResponseOnEventClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}