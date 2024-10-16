package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticRequestDownloadClassWrapper {

    
    private DiagnosticRequestDownloadClass diagnosticRequestDownloadClass;

    public DiagnosticRequestDownloadClassWrapper(DiagnosticRequestDownloadClass diagnosticRequestDownloadClass) {
        this.diagnosticRequestDownloadClass = diagnosticRequestDownloadClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getS())) {
            
            return diagnosticRequestDownloadClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getT())) {
            
            return diagnosticRequestDownloadClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getUuid())) {
            
            return diagnosticRequestDownloadClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticRequestDownloadClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticRequestDownloadClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticRequestDownloadClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticRequestDownloadClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticRequestDownloadClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticRequestDownloadClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticRequestDownloadClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticRequestDownloadClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticRequestDownloadClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticRequestDownloadClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownloadClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticRequestDownloadClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}