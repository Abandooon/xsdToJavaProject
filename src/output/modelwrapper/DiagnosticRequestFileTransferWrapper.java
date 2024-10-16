package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticRequestFileTransferWrapper {

    
    private DiagnosticRequestFileTransfer diagnosticRequestFileTransfer;

    public DiagnosticRequestFileTransferWrapper(DiagnosticRequestFileTransfer diagnosticRequestFileTransfer) {
        this.diagnosticRequestFileTransfer = diagnosticRequestFileTransfer;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getS())) {
            
            return diagnosticRequestFileTransfer.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getT())) {
            
            return diagnosticRequestFileTransfer.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getUuid())) {
            
            return diagnosticRequestFileTransfer.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getShortName())) {
            
            return new IdentifierWrapper(diagnosticRequestFileTransfer.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticRequestFileTransfer.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticRequestFileTransfer.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticRequestFileTransfer.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticRequestFileTransfer.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticRequestFileTransfer.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticRequestFileTransfer.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticRequestFileTransfer.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticRequestFileTransfer.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticRequestFileTransfer.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public RequestFileTransferClassRefWrapper getRequestFileTransferClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestFileTransfer.getRequestFileTransferClassRef())) {
            
            return new RequestFileTransferClassRefWrapper(diagnosticRequestFileTransfer.getRequestFileTransferClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}