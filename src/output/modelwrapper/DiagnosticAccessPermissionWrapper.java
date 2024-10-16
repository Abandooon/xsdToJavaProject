package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticAccessPermissionWrapper {

    
    private DiagnosticAccessPermission diagnosticAccessPermission;

    public DiagnosticAccessPermissionWrapper(DiagnosticAccessPermission diagnosticAccessPermission) {
        this.diagnosticAccessPermission = diagnosticAccessPermission;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getS())) {
            
            return diagnosticAccessPermission.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getT())) {
            
            return diagnosticAccessPermission.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getUuid())) {
            
            return diagnosticAccessPermission.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getShortName())) {
            
            return new IdentifierWrapper(diagnosticAccessPermission.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticAccessPermission.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticAccessPermission.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticAccessPermission.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticAccessPermission.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticAccessPermission.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticAccessPermission.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticAccessPermission.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticAccessPermission.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticSessionRefWrapper> getDiagnosticSessionRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getDiagnosticSessionRefs())) {
            ArrayList<DiagnosticSessionRef> originalList = diagnosticAccessPermission.getDiagnosticSessionRefs();
            ArrayList<DiagnosticSessionRefWrapper> wrapperList = (ArrayList<DiagnosticSessionRefWrapper>)originalList.stream()
                .map(item -> new DiagnosticSessionRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SecurityLevelRefWrapper> getSecurityLevelRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticAccessPermission.getSecurityLevelRefs())) {
            ArrayList<SecurityLevelRef> originalList = diagnosticAccessPermission.getSecurityLevelRefs();
            ArrayList<SecurityLevelRefWrapper> wrapperList = (ArrayList<SecurityLevelRefWrapper>)originalList.stream()
                .map(item -> new SecurityLevelRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}