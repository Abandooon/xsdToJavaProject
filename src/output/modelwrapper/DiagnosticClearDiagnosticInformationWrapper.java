package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticClearDiagnosticInformationWrapper {

    
    private DiagnosticClearDiagnosticInformation diagnosticClearDiagnosticInformation;

    public DiagnosticClearDiagnosticInformationWrapper(DiagnosticClearDiagnosticInformation diagnosticClearDiagnosticInformation) {
        this.diagnosticClearDiagnosticInformation = diagnosticClearDiagnosticInformation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getS())) {
            
            return diagnosticClearDiagnosticInformation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getT())) {
            
            return diagnosticClearDiagnosticInformation.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getUuid())) {
            
            return diagnosticClearDiagnosticInformation.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getShortName())) {
            
            return new IdentifierWrapper(diagnosticClearDiagnosticInformation.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticClearDiagnosticInformation.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticClearDiagnosticInformation.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticClearDiagnosticInformation.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticClearDiagnosticInformation.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticClearDiagnosticInformation.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticClearDiagnosticInformation.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticClearDiagnosticInformation.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticClearDiagnosticInformation.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticClearDiagnosticInformation.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public ClearDiagnosticInformationClassRefWrapper getClearDiagnosticInformationClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticClearDiagnosticInformation.getClearDiagnosticInformationClassRef())) {
            
            return new ClearDiagnosticInformationClassRefWrapper(diagnosticClearDiagnosticInformation.getClearDiagnosticInformationClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}