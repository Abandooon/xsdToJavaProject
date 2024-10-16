package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticReadDataByPeriodicIdWrapper {

    
    private DiagnosticReadDataByPeriodicId diagnosticReadDataByPeriodicId;

    public DiagnosticReadDataByPeriodicIdWrapper(DiagnosticReadDataByPeriodicId diagnosticReadDataByPeriodicId) {
        this.diagnosticReadDataByPeriodicId = diagnosticReadDataByPeriodicId;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getS())) {
            
            return diagnosticReadDataByPeriodicId.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getT())) {
            
            return diagnosticReadDataByPeriodicId.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getUuid())) {
            
            return diagnosticReadDataByPeriodicId.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getShortName())) {
            
            return new IdentifierWrapper(diagnosticReadDataByPeriodicId.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticReadDataByPeriodicId.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticReadDataByPeriodicId.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticReadDataByPeriodicId.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticReadDataByPeriodicId.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticReadDataByPeriodicId.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticReadDataByPeriodicId.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticReadDataByPeriodicId.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticReadDataByPeriodicId.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticReadDataByPeriodicId.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DataIdentifierRefWrapper getDataIdentifierRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getDataIdentifierRef())) {
            
            return new DataIdentifierRefWrapper(diagnosticReadDataByPeriodicId.getDataIdentifierRef());
            
        } else {
            return null;
        }
        
    }

    public ReadDataClassRefWrapper getReadDataClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicId.getReadDataClassRef())) {
            
            return new ReadDataClassRefWrapper(diagnosticReadDataByPeriodicId.getReadDataClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}