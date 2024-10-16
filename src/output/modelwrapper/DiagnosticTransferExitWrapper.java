package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticTransferExitWrapper {

    
    private DiagnosticTransferExit diagnosticTransferExit;

    public DiagnosticTransferExitWrapper(DiagnosticTransferExit diagnosticTransferExit) {
        this.diagnosticTransferExit = diagnosticTransferExit;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getS())) {
            
            return diagnosticTransferExit.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getT())) {
            
            return diagnosticTransferExit.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getUuid())) {
            
            return diagnosticTransferExit.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getShortName())) {
            
            return new IdentifierWrapper(diagnosticTransferExit.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticTransferExit.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticTransferExit.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticTransferExit.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticTransferExit.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticTransferExit.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticTransferExit.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticTransferExit.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticTransferExit.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticTransferExit.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public TransferExitClassRefWrapper getTransferExitClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticTransferExit.getTransferExitClassRef())) {
            
            return new TransferExitClassRefWrapper(diagnosticTransferExit.getTransferExitClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}