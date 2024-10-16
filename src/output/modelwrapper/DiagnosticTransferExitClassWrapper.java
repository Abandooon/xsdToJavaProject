package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticTransferExitClassWrapper {

    
    private DiagnosticTransferExitClass diagnosticTransferExitClass;

    public DiagnosticTransferExitClassWrapper(DiagnosticTransferExitClass diagnosticTransferExitClass) {
        this.diagnosticTransferExitClass = diagnosticTransferExitClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getS())) {
            
            return diagnosticTransferExitClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getT())) {
            
            return diagnosticTransferExitClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getUuid())) {
            
            return diagnosticTransferExitClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticTransferExitClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticTransferExitClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticTransferExitClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticTransferExitClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticTransferExitClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticTransferExitClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticTransferExitClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticTransferExitClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticTransferExitClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticTransferExitClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExitClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticTransferExitClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}