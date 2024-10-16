package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticRequestDownloadWrapper {

    
    private DiagnosticRequestDownload diagnosticRequestDownload;

    public DiagnosticRequestDownloadWrapper(DiagnosticRequestDownload diagnosticRequestDownload) {
        this.diagnosticRequestDownload = diagnosticRequestDownload;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getS())) {
            
            return diagnosticRequestDownload.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getT())) {
            
            return diagnosticRequestDownload.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getUuid())) {
            
            return diagnosticRequestDownload.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getShortName())) {
            
            return new IdentifierWrapper(diagnosticRequestDownload.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticRequestDownload.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticRequestDownload.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticRequestDownload.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticRequestDownload.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticRequestDownload.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticRequestDownload.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticRequestDownload.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticRequestDownload.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticRequestDownload.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MemoryRangeRefWrapper> getMemoryRangeRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getMemoryRangeRefs())) {
            ArrayList<MemoryRangeRef> originalList = diagnosticRequestDownload.getMemoryRangeRefs();
            ArrayList<MemoryRangeRefWrapper> wrapperList = (ArrayList<MemoryRangeRefWrapper>)originalList.stream()
                .map(item -> new MemoryRangeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RequestDownloadClassRefWrapper getRequestDownloadClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticRequestDownload.getRequestDownloadClassRef())) {
            
            return new RequestDownloadClassRefWrapper(diagnosticRequestDownload.getRequestDownloadClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}