package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticReadMemoryByAddressClassWrapper {

    
    private DiagnosticReadMemoryByAddressClass diagnosticReadMemoryByAddressClass;

    public DiagnosticReadMemoryByAddressClassWrapper(DiagnosticReadMemoryByAddressClass diagnosticReadMemoryByAddressClass) {
        this.diagnosticReadMemoryByAddressClass = diagnosticReadMemoryByAddressClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getS())) {
            
            return diagnosticReadMemoryByAddressClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getT())) {
            
            return diagnosticReadMemoryByAddressClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getUuid())) {
            
            return diagnosticReadMemoryByAddressClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticReadMemoryByAddressClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticReadMemoryByAddressClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticReadMemoryByAddressClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticReadMemoryByAddressClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticReadMemoryByAddressClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticReadMemoryByAddressClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticReadMemoryByAddressClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticReadMemoryByAddressClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticReadMemoryByAddressClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticReadMemoryByAddressClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticReadMemoryByAddressClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticReadMemoryByAddressClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}