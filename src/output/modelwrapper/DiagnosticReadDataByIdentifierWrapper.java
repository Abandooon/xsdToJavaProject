package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticReadDataByIdentifierWrapper {

    
    private DiagnosticReadDataByIdentifier diagnosticReadDataByIdentifier;

    public DiagnosticReadDataByIdentifierWrapper(DiagnosticReadDataByIdentifier diagnosticReadDataByIdentifier) {
        this.diagnosticReadDataByIdentifier = diagnosticReadDataByIdentifier;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getS())) {
            
            return diagnosticReadDataByIdentifier.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getT())) {
            
            return diagnosticReadDataByIdentifier.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getUuid())) {
            
            return diagnosticReadDataByIdentifier.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getShortName())) {
            
            return new IdentifierWrapper(diagnosticReadDataByIdentifier.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticReadDataByIdentifier.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticReadDataByIdentifier.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticReadDataByIdentifier.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticReadDataByIdentifier.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticReadDataByIdentifier.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticReadDataByIdentifier.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticReadDataByIdentifier.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticReadDataByIdentifier.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticReadDataByIdentifier.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DataIdentifierRefWrapper getDataIdentifierRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getDataIdentifierRef())) {
            
            return new DataIdentifierRefWrapper(diagnosticReadDataByIdentifier.getDataIdentifierRef());
            
        } else {
            return null;
        }
        
    }

    public ReadClassRef_DiagnosticReadDataByIdentifierWrapper getReadClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifier.getReadClassRef())) {
            
            return new ReadClassRef_DiagnosticReadDataByIdentifierWrapper(diagnosticReadDataByIdentifier.getReadClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}