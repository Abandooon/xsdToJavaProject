package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticCustomServiceClassWrapper {

    
    private DiagnosticCustomServiceClass diagnosticCustomServiceClass;

    public DiagnosticCustomServiceClassWrapper(DiagnosticCustomServiceClass diagnosticCustomServiceClass) {
        this.diagnosticCustomServiceClass = diagnosticCustomServiceClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getS())) {
            
            return diagnosticCustomServiceClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getT())) {
            
            return diagnosticCustomServiceClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getUuid())) {
            
            return diagnosticCustomServiceClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticCustomServiceClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticCustomServiceClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticCustomServiceClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticCustomServiceClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticCustomServiceClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticCustomServiceClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticCustomServiceClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticCustomServiceClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticCustomServiceClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticCustomServiceClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticCustomServiceClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getCustomServiceId() {
        
        if (CollUtil.isNotEmpty(diagnosticCustomServiceClass.getCustomServiceId())) {
            
            return new PositiveIntegerWrapper(diagnosticCustomServiceClass.getCustomServiceId());
            
        } else {
            return null;
        }
        
    }




    


    
}