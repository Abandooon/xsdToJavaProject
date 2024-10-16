package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticReadDtcInformationClassWrapper {

    
    private DiagnosticReadDtcInformationClass diagnosticReadDtcInformationClass;

    public DiagnosticReadDtcInformationClassWrapper(DiagnosticReadDtcInformationClass diagnosticReadDtcInformationClass) {
        this.diagnosticReadDtcInformationClass = diagnosticReadDtcInformationClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getS())) {
            
            return diagnosticReadDtcInformationClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getT())) {
            
            return diagnosticReadDtcInformationClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getUuid())) {
            
            return diagnosticReadDtcInformationClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticReadDtcInformationClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticReadDtcInformationClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticReadDtcInformationClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticReadDtcInformationClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticReadDtcInformationClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticReadDtcInformationClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticReadDtcInformationClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticReadDtcInformationClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticReadDtcInformationClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticReadDtcInformationClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformationClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticReadDtcInformationClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}