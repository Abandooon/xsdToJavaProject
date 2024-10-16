package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticRoutineControlClassWrapper {

    
    private DiagnosticRoutineControlClass diagnosticRoutineControlClass;

    public DiagnosticRoutineControlClassWrapper(DiagnosticRoutineControlClass diagnosticRoutineControlClass) {
        this.diagnosticRoutineControlClass = diagnosticRoutineControlClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getS())) {
            
            return diagnosticRoutineControlClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getT())) {
            
            return diagnosticRoutineControlClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getUuid())) {
            
            return diagnosticRoutineControlClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticRoutineControlClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticRoutineControlClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticRoutineControlClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticRoutineControlClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticRoutineControlClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticRoutineControlClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticRoutineControlClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticRoutineControlClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticRoutineControlClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticRoutineControlClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticRoutineControlClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticRoutineControlClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}