package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticRequestUploadClassWrapper {

    
    private DiagnosticRequestUploadClass diagnosticRequestUploadClass;

    public DiagnosticRequestUploadClassWrapper(DiagnosticRequestUploadClass diagnosticRequestUploadClass) {
        this.diagnosticRequestUploadClass = diagnosticRequestUploadClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getS())) {
            
            return diagnosticRequestUploadClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getT())) {
            
            return diagnosticRequestUploadClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getUuid())) {
            
            return diagnosticRequestUploadClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticRequestUploadClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticRequestUploadClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticRequestUploadClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticRequestUploadClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticRequestUploadClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticRequestUploadClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticRequestUploadClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticRequestUploadClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticRequestUploadClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticRequestUploadClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUploadClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticRequestUploadClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}