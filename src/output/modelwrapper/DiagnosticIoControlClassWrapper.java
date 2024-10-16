package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticIoControlClassWrapper {

    
    private DiagnosticIoControlClass diagnosticIoControlClass;

    public DiagnosticIoControlClassWrapper(DiagnosticIoControlClass diagnosticIoControlClass) {
        this.diagnosticIoControlClass = diagnosticIoControlClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getS())) {
            
            return diagnosticIoControlClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getT())) {
            
            return diagnosticIoControlClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getUuid())) {
            
            return diagnosticIoControlClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticIoControlClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticIoControlClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticIoControlClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticIoControlClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticIoControlClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticIoControlClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticIoControlClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticIoControlClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticIoControlClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticIoControlClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControlClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticIoControlClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}