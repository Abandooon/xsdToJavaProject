package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticClearDiagnosticInformationClassWrapper {

    
    private DiagnosticClearDiagnosticInformationClass diagnosticClearDiagnosticInformationClass;

    public DiagnosticClearDiagnosticInformationClassWrapper(DiagnosticClearDiagnosticInformationClass diagnosticClearDiagnosticInformationClass) {
        this.diagnosticClearDiagnosticInformationClass = diagnosticClearDiagnosticInformationClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getS())) {
            
            return diagnosticClearDiagnosticInformationClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getT())) {
            
            return diagnosticClearDiagnosticInformationClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getUuid())) {
            
            return diagnosticClearDiagnosticInformationClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticClearDiagnosticInformationClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticClearDiagnosticInformationClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticClearDiagnosticInformationClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticClearDiagnosticInformationClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticClearDiagnosticInformationClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticClearDiagnosticInformationClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticClearDiagnosticInformationClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticClearDiagnosticInformationClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticClearDiagnosticInformationClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticClearDiagnosticInformationClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformationClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticClearDiagnosticInformationClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}