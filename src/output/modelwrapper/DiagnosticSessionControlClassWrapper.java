package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticSessionControlClassWrapper {

    
    private DiagnosticSessionControlClass diagnosticSessionControlClass;

    public DiagnosticSessionControlClassWrapper(DiagnosticSessionControlClass diagnosticSessionControlClass) {
        this.diagnosticSessionControlClass = diagnosticSessionControlClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getS())) {
            
            return diagnosticSessionControlClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getT())) {
            
            return diagnosticSessionControlClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getUuid())) {
            
            return diagnosticSessionControlClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticSessionControlClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticSessionControlClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticSessionControlClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticSessionControlClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticSessionControlClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticSessionControlClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticSessionControlClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticSessionControlClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticSessionControlClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticSessionControlClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticSessionControlClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticSessionControlClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}