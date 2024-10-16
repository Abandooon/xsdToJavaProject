package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticReadMemoryByAddressWrapper {

    
    private DiagnosticReadMemoryByAddress diagnosticReadMemoryByAddress;

    public DiagnosticReadMemoryByAddressWrapper(DiagnosticReadMemoryByAddress diagnosticReadMemoryByAddress) {
        this.diagnosticReadMemoryByAddress = diagnosticReadMemoryByAddress;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getS())) {
            
            return diagnosticReadMemoryByAddress.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getT())) {
            
            return diagnosticReadMemoryByAddress.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getUuid())) {
            
            return diagnosticReadMemoryByAddress.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getShortName())) {
            
            return new IdentifierWrapper(diagnosticReadMemoryByAddress.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticReadMemoryByAddress.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticReadMemoryByAddress.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticReadMemoryByAddress.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticReadMemoryByAddress.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticReadMemoryByAddress.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticReadMemoryByAddress.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticReadMemoryByAddress.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticReadMemoryByAddress.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticReadMemoryByAddress.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MemoryRangeRefWrapper> getMemoryRangeRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getMemoryRangeRefs())) {
            ArrayList<MemoryRangeRef> originalList = diagnosticReadMemoryByAddress.getMemoryRangeRefs();
            ArrayList<MemoryRangeRefWrapper> wrapperList = (ArrayList<MemoryRangeRefWrapper>)originalList.stream()
                .map(item -> new MemoryRangeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ReadClassRefWrapper getReadClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddress.getReadClassRef())) {
            
            return new ReadClassRefWrapper(diagnosticReadMemoryByAddress.getReadClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}