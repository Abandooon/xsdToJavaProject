package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticReadDtcInformationWrapper {

    
    private DiagnosticReadDtcInformation diagnosticReadDtcInformation;

    public DiagnosticReadDtcInformationWrapper(DiagnosticReadDtcInformation diagnosticReadDtcInformation) {
        this.diagnosticReadDtcInformation = diagnosticReadDtcInformation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getS())) {
            
            return diagnosticReadDtcInformation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getT())) {
            
            return diagnosticReadDtcInformation.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getUuid())) {
            
            return diagnosticReadDtcInformation.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getShortName())) {
            
            return new IdentifierWrapper(diagnosticReadDtcInformation.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticReadDtcInformation.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticReadDtcInformation.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticReadDtcInformation.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticReadDtcInformation.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticReadDtcInformation.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticReadDtcInformation.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticReadDtcInformation.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticReadDtcInformation.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticReadDtcInformation.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public ReadDtcInformationClassRefWrapper getReadDtcInformationClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDtcInformation.getReadDtcInformationClassRef())) {
            
            return new ReadDtcInformationClassRefWrapper(diagnosticReadDtcInformation.getReadDtcInformationClassRef());
            
        } else {
            return null;
        }
        
    }




    


    
}