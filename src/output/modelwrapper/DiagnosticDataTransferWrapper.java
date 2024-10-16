package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticDataTransferWrapper {

    
    private DiagnosticDataTransfer diagnosticDataTransfer;

    public DiagnosticDataTransferWrapper(DiagnosticDataTransfer diagnosticDataTransfer) {
        this.diagnosticDataTransfer = diagnosticDataTransfer;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getS())) {
            
            return diagnosticDataTransfer.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getT())) {
            
            return diagnosticDataTransfer.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getUuid())) {
            
            return diagnosticDataTransfer.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getShortName())) {
            
            return new IdentifierWrapper(diagnosticDataTransfer.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticDataTransfer.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticDataTransfer.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticDataTransfer.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticDataTransfer.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticDataTransfer.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticDataTransfer.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticDataTransfer.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticDataTransfer.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticDataTransfer.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DataTransferClassRefWrapper getDataTransferClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticDataTransfer.getDataTransferClassRef())) {
            
            return new DataTransferClassRefWrapper(diagnosticDataTransfer.getDataTransferClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}