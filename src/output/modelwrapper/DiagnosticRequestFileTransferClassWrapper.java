package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticRequestFileTransferClassWrapper {

    
    private DiagnosticRequestFileTransferClass diagnosticRequestFileTransferClass;

    public DiagnosticRequestFileTransferClassWrapper(DiagnosticRequestFileTransferClass diagnosticRequestFileTransferClass) {
        this.diagnosticRequestFileTransferClass = diagnosticRequestFileTransferClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getS())) {
            
            return diagnosticRequestFileTransferClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getT())) {
            
            return diagnosticRequestFileTransferClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getUuid())) {
            
            return diagnosticRequestFileTransferClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticRequestFileTransferClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticRequestFileTransferClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticRequestFileTransferClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticRequestFileTransferClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticRequestFileTransferClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticRequestFileTransferClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticRequestFileTransferClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticRequestFileTransferClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticRequestFileTransferClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticRequestFileTransferClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransferClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticRequestFileTransferClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}