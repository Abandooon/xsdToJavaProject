package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticComControlWrapper {

    
    private DiagnosticComControl diagnosticComControl;

    public DiagnosticComControlWrapper(DiagnosticComControl diagnosticComControl) {
        this.diagnosticComControl = diagnosticComControl;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getS())) {
            
            return diagnosticComControl.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getT())) {
            
            return diagnosticComControl.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getUuid())) {
            
            return diagnosticComControl.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getShortName())) {
            
            return new IdentifierWrapper(diagnosticComControl.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticComControl.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticComControl.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticComControl.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticComControl.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticComControl.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticComControl.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticComControl.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticComControl.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticComControl.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public ComControlClassRefWrapper getComControlClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getComControlClassRef())) {
            
            return new ComControlClassRefWrapper(diagnosticComControl.getComControlClassRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getCustomSubFunctionNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticComControl.getCustomSubFunctionNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticComControl.getCustomSubFunctionNumber());
            
        } else {
            return null;
        }
        
    }




    


    
}