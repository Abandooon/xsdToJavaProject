package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticRoutineControlWrapper {

    
    private DiagnosticRoutineControl diagnosticRoutineControl;

    public DiagnosticRoutineControlWrapper(DiagnosticRoutineControl diagnosticRoutineControl) {
        this.diagnosticRoutineControl = diagnosticRoutineControl;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getS())) {
            
            return diagnosticRoutineControl.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getT())) {
            
            return diagnosticRoutineControl.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getUuid())) {
            
            return diagnosticRoutineControl.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getShortName())) {
            
            return new IdentifierWrapper(diagnosticRoutineControl.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticRoutineControl.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticRoutineControl.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticRoutineControl.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticRoutineControl.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticRoutineControl.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticRoutineControl.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticRoutineControl.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticRoutineControl.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticRoutineControl.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public RoutineControlClassRefWrapper getRoutineControlClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getRoutineControlClassRef())) {
            
            return new RoutineControlClassRefWrapper(diagnosticRoutineControl.getRoutineControlClassRef());
            
        } else {
            return null;
        }
        
    }

    public RoutineRefWrapper getRoutineRef() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControl.getRoutineRef())) {
            
            return new RoutineRefWrapper(diagnosticRoutineControl.getRoutineRef());
            
        } else {
            return null;
        }
        
    }




    


    
}