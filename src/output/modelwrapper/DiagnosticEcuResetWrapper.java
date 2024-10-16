package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticEcuResetWrapper {

    
    private DiagnosticEcuReset diagnosticEcuReset;

    public DiagnosticEcuResetWrapper(DiagnosticEcuReset diagnosticEcuReset) {
        this.diagnosticEcuReset = diagnosticEcuReset;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getS())) {
            
            return diagnosticEcuReset.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getT())) {
            
            return diagnosticEcuReset.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getUuid())) {
            
            return diagnosticEcuReset.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEcuReset.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEcuReset.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEcuReset.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEcuReset.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEcuReset.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEcuReset.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEcuReset.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEcuReset.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticEcuReset.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticEcuReset.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getCustomSubFunctionNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getCustomSubFunctionNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticEcuReset.getCustomSubFunctionNumber());
            
        } else {
            return null;
        }
        
    }

    public EcuResetClassRefWrapper getEcuResetClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getEcuResetClassRef())) {
            
            return new EcuResetClassRefWrapper(diagnosticEcuReset.getEcuResetClassRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticResponseToEcuResetEnumWrapper getRespondToReset() {
        
        if (CollUtil.isNotEmpty(diagnosticEcuReset.getRespondToReset())) {
            
            return new DiagnosticResponseToEcuResetEnumWrapper(diagnosticEcuReset.getRespondToReset());
            
        } else {
            return null;
        }
        
    }




    


    
}