package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticDataTransferClassWrapper {

    
    private DiagnosticDataTransferClass diagnosticDataTransferClass;

    public DiagnosticDataTransferClassWrapper(DiagnosticDataTransferClass diagnosticDataTransferClass) {
        this.diagnosticDataTransferClass = diagnosticDataTransferClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getS())) {
            
            return diagnosticDataTransferClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getT())) {
            
            return diagnosticDataTransferClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getUuid())) {
            
            return diagnosticDataTransferClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticDataTransferClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticDataTransferClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticDataTransferClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticDataTransferClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticDataTransferClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticDataTransferClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticDataTransferClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticDataTransferClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticDataTransferClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticDataTransferClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransferClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticDataTransferClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}