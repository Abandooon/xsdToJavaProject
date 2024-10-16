package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticSecurityAccessClassWrapper {

    
    private DiagnosticSecurityAccessClass diagnosticSecurityAccessClass;

    public DiagnosticSecurityAccessClassWrapper(DiagnosticSecurityAccessClass diagnosticSecurityAccessClass) {
        this.diagnosticSecurityAccessClass = diagnosticSecurityAccessClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getS())) {
            
            return diagnosticSecurityAccessClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getT())) {
            
            return diagnosticSecurityAccessClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getUuid())) {
            
            return diagnosticSecurityAccessClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticSecurityAccessClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticSecurityAccessClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticSecurityAccessClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticSecurityAccessClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticSecurityAccessClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticSecurityAccessClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticSecurityAccessClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticSecurityAccessClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticSecurityAccessClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticSecurityAccessClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccessClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticSecurityAccessClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}