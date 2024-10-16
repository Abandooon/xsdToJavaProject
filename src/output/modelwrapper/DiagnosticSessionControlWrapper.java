package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticSessionControlWrapper {

    
    private DiagnosticSessionControl diagnosticSessionControl;

    public DiagnosticSessionControlWrapper(DiagnosticSessionControl diagnosticSessionControl) {
        this.diagnosticSessionControl = diagnosticSessionControl;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getS())) {
            
            return diagnosticSessionControl.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getT())) {
            
            return diagnosticSessionControl.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getUuid())) {
            
            return diagnosticSessionControl.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getShortName())) {
            
            return new IdentifierWrapper(diagnosticSessionControl.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticSessionControl.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticSessionControl.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticSessionControl.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticSessionControl.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticSessionControl.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticSessionControl.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticSessionControl.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticSessionControl.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticSessionControl.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticSessionRefWrapper getDiagnosticSessionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getDiagnosticSessionRef())) {
            
            return new DiagnosticSessionRefWrapper(diagnosticSessionControl.getDiagnosticSessionRef());
            
        } else {
            return null;
        }
        
    }

    public SessionControlClassRefWrapper getSessionControlClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControl.getSessionControlClassRef())) {
            
            return new SessionControlClassRefWrapper(diagnosticSessionControl.getSessionControlClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}