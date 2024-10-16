package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticSecurityAccessWrapper {

    
    private DiagnosticSecurityAccess diagnosticSecurityAccess;

    public DiagnosticSecurityAccessWrapper(DiagnosticSecurityAccess diagnosticSecurityAccess) {
        this.diagnosticSecurityAccess = diagnosticSecurityAccess;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getS())) {
            
            return diagnosticSecurityAccess.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getT())) {
            
            return diagnosticSecurityAccess.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getUuid())) {
            
            return diagnosticSecurityAccess.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getShortName())) {
            
            return new IdentifierWrapper(diagnosticSecurityAccess.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticSecurityAccess.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticSecurityAccess.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticSecurityAccess.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticSecurityAccess.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticSecurityAccess.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticSecurityAccess.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticSecurityAccess.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticSecurityAccess.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticSecurityAccess.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getRequestSeedId() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getRequestSeedId())) {
            
            return new PositiveIntegerWrapper(diagnosticSecurityAccess.getRequestSeedId());
            
        } else {
            return null;
        }
        
    }

    public SecurityAccessClassRefWrapper getSecurityAccessClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getSecurityAccessClassRef())) {
            
            return new SecurityAccessClassRefWrapper(diagnosticSecurityAccess.getSecurityAccessClassRef());
            
        } else {
            return null;
        }
        
    }

    public SecurityLevelRefWrapper getSecurityLevelRef() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityAccess.getSecurityLevelRef())) {
            
            return new SecurityLevelRefWrapper(diagnosticSecurityAccess.getSecurityLevelRef());
            
        } else {
            return null;
        }
        
    }




    


    
}