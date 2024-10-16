package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticDynamicallyDefineDataIdentifierWrapper {

    
    private DiagnosticDynamicallyDefineDataIdentifier diagnosticDynamicallyDefineDataIdentifier;

    public DiagnosticDynamicallyDefineDataIdentifierWrapper(DiagnosticDynamicallyDefineDataIdentifier diagnosticDynamicallyDefineDataIdentifier) {
        this.diagnosticDynamicallyDefineDataIdentifier = diagnosticDynamicallyDefineDataIdentifier;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getS())) {
            
            return diagnosticDynamicallyDefineDataIdentifier.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getT())) {
            
            return diagnosticDynamicallyDefineDataIdentifier.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getUuid())) {
            
            return diagnosticDynamicallyDefineDataIdentifier.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getShortName())) {
            
            return new IdentifierWrapper(diagnosticDynamicallyDefineDataIdentifier.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticDynamicallyDefineDataIdentifier.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticDynamicallyDefineDataIdentifier.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticDynamicallyDefineDataIdentifier.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticDynamicallyDefineDataIdentifier.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticDynamicallyDefineDataIdentifier.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticDynamicallyDefineDataIdentifier.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticDynamicallyDefineDataIdentifier.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticDynamicallyDefineDataIdentifier.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticDynamicallyDefineDataIdentifier.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifierWrapper getDataIdentifierRef() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getDataIdentifierRef())) {
            
            return new DataIdentifierRef_DiagnosticDynamicallyDefineDataIdentifierWrapper(diagnosticDynamicallyDefineDataIdentifier.getDataIdentifierRef());
            
        } else {
            return null;
        }
        
    }

    public DynamicallyDefineDataIdentifierClassRefWrapper getDynamicallyDefineDataIdentifierClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getDynamicallyDefineDataIdentifierClassRef())) {
            
            return new DynamicallyDefineDataIdentifierClassRefWrapper(diagnosticDynamicallyDefineDataIdentifier.getDynamicallyDefineDataIdentifierClassRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxSourceElement() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifier.getMaxSourceElement())) {
            
            return new PositiveIntegerWrapper(diagnosticDynamicallyDefineDataIdentifier.getMaxSourceElement());
            
        } else {
            return null;
        }
        
    }




    


    
}