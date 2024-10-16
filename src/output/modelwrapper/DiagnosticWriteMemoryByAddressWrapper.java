package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticWriteMemoryByAddressWrapper {

    
    private DiagnosticWriteMemoryByAddress diagnosticWriteMemoryByAddress;

    public DiagnosticWriteMemoryByAddressWrapper(DiagnosticWriteMemoryByAddress diagnosticWriteMemoryByAddress) {
        this.diagnosticWriteMemoryByAddress = diagnosticWriteMemoryByAddress;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getS())) {
            
            return diagnosticWriteMemoryByAddress.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getT())) {
            
            return diagnosticWriteMemoryByAddress.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getUuid())) {
            
            return diagnosticWriteMemoryByAddress.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getShortName())) {
            
            return new IdentifierWrapper(diagnosticWriteMemoryByAddress.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticWriteMemoryByAddress.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticWriteMemoryByAddress.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticWriteMemoryByAddress.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticWriteMemoryByAddress.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticWriteMemoryByAddress.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticWriteMemoryByAddress.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticWriteMemoryByAddress.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticWriteMemoryByAddress.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticWriteMemoryByAddress.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MemoryRangeRefWrapper> getMemoryRangeRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getMemoryRangeRefs())) {
            ArrayList<MemoryRangeRef> originalList = diagnosticWriteMemoryByAddress.getMemoryRangeRefs();
            ArrayList<MemoryRangeRefWrapper> wrapperList = (ArrayList<MemoryRangeRefWrapper>)originalList.stream()
                .map(item -> new MemoryRangeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public WriteClassRef_DiagnosticWriteMemoryByAddressWrapper getWriteClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddress.getWriteClassRef())) {
            
            return new WriteClassRef_DiagnosticWriteMemoryByAddressWrapper(diagnosticWriteMemoryByAddress.getWriteClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}