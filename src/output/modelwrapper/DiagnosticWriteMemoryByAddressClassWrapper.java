package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticWriteMemoryByAddressClassWrapper {

    
    private DiagnosticWriteMemoryByAddressClass diagnosticWriteMemoryByAddressClass;

    public DiagnosticWriteMemoryByAddressClassWrapper(DiagnosticWriteMemoryByAddressClass diagnosticWriteMemoryByAddressClass) {
        this.diagnosticWriteMemoryByAddressClass = diagnosticWriteMemoryByAddressClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getS())) {
            
            return diagnosticWriteMemoryByAddressClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getT())) {
            
            return diagnosticWriteMemoryByAddressClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getUuid())) {
            
            return diagnosticWriteMemoryByAddressClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticWriteMemoryByAddressClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticWriteMemoryByAddressClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticWriteMemoryByAddressClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticWriteMemoryByAddressClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticWriteMemoryByAddressClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticWriteMemoryByAddressClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticWriteMemoryByAddressClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticWriteMemoryByAddressClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticWriteMemoryByAddressClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticWriteMemoryByAddressClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteMemoryByAddressClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticWriteMemoryByAddressClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}