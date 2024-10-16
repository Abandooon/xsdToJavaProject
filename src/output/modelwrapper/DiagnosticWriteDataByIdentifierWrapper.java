package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticWriteDataByIdentifierWrapper {

    
    private DiagnosticWriteDataByIdentifier diagnosticWriteDataByIdentifier;

    public DiagnosticWriteDataByIdentifierWrapper(DiagnosticWriteDataByIdentifier diagnosticWriteDataByIdentifier) {
        this.diagnosticWriteDataByIdentifier = diagnosticWriteDataByIdentifier;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getS())) {
            
            return diagnosticWriteDataByIdentifier.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getT())) {
            
            return diagnosticWriteDataByIdentifier.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getUuid())) {
            
            return diagnosticWriteDataByIdentifier.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getShortName())) {
            
            return new IdentifierWrapper(diagnosticWriteDataByIdentifier.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticWriteDataByIdentifier.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticWriteDataByIdentifier.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticWriteDataByIdentifier.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticWriteDataByIdentifier.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticWriteDataByIdentifier.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticWriteDataByIdentifier.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticWriteDataByIdentifier.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticWriteDataByIdentifier.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticWriteDataByIdentifier.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DataIdentifierRefWrapper getDataIdentifierRef() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getDataIdentifierRef())) {
            
            return new DataIdentifierRefWrapper(diagnosticWriteDataByIdentifier.getDataIdentifierRef());
            
        } else {
            return null;
        }
        
    }

    public WriteClassRefWrapper getWriteClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifier.getWriteClassRef())) {
            
            return new WriteClassRefWrapper(diagnosticWriteDataByIdentifier.getWriteClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}