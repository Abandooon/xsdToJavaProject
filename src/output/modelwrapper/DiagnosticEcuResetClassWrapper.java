package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticEcuResetClassWrapper {

    
    private DiagnosticEcuResetClass diagnosticEcuResetClass;

    public DiagnosticEcuResetClassWrapper(DiagnosticEcuResetClass diagnosticEcuResetClass) {
        this.diagnosticEcuResetClass = diagnosticEcuResetClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getS())) {
            
            return diagnosticEcuResetClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getT())) {
            
            return diagnosticEcuResetClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getUuid())) {
            
            return diagnosticEcuResetClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEcuResetClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEcuResetClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEcuResetClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEcuResetClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEcuResetClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEcuResetClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEcuResetClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEcuResetClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticEcuResetClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticEcuResetClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuResetClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticEcuResetClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}