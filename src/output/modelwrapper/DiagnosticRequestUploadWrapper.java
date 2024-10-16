package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticRequestUploadWrapper {

    
    private DiagnosticRequestUpload diagnosticRequestUpload;

    public DiagnosticRequestUploadWrapper(DiagnosticRequestUpload diagnosticRequestUpload) {
        this.diagnosticRequestUpload = diagnosticRequestUpload;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getS())) {
            
            return diagnosticRequestUpload.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getT())) {
            
            return diagnosticRequestUpload.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getUuid())) {
            
            return diagnosticRequestUpload.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getShortName())) {
            
            return new IdentifierWrapper(diagnosticRequestUpload.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticRequestUpload.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticRequestUpload.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticRequestUpload.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticRequestUpload.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticRequestUpload.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticRequestUpload.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticRequestUpload.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticRequestUpload.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticRequestUpload.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MemoryRangeRefWrapper> getMemoryRangeRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getMemoryRangeRefs())) {
            ArrayList<MemoryRangeRef> originalList = diagnosticRequestUpload.getMemoryRangeRefs();
            ArrayList<MemoryRangeRefWrapper> wrapperList = (ArrayList<MemoryRangeRefWrapper>)originalList.stream()
                .map(item -> new MemoryRangeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RequestUploadClassRefWrapper getRequestUploadClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestUpload.getRequestUploadClassRef())) {
            
            return new RequestUploadClassRefWrapper(diagnosticRequestUpload.getRequestUploadClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}