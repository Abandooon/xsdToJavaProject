package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class DiagnosticDynamicallyDefineDataIdentifierClassWrapper {

    
    private DiagnosticDynamicallyDefineDataIdentifierClass diagnosticDynamicallyDefineDataIdentifierClass;

    public DiagnosticDynamicallyDefineDataIdentifierClassWrapper(DiagnosticDynamicallyDefineDataIdentifierClass diagnosticDynamicallyDefineDataIdentifierClass) {
        this.diagnosticDynamicallyDefineDataIdentifierClass = diagnosticDynamicallyDefineDataIdentifierClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getS())) {
            
            return diagnosticDynamicallyDefineDataIdentifierClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getT())) {
            
            return diagnosticDynamicallyDefineDataIdentifierClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getUuid())) {
            
            return diagnosticDynamicallyDefineDataIdentifierClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticDynamicallyDefineDataIdentifierClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticDynamicallyDefineDataIdentifierClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticDynamicallyDefineDataIdentifierClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticDynamicallyDefineDataIdentifierClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticDynamicallyDefineDataIdentifierClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticDynamicallyDefineDataIdentifierClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticDynamicallyDefineDataIdentifierClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticDynamicallyDefineDataIdentifierClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticDynamicallyDefineDataIdentifierClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticDynamicallyDefineDataIdentifierClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticDynamicallyDefineDataIdentifierClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getCheckPerSourceId() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getCheckPerSourceId())) {
            
            return new BooleanWrapper(diagnosticDynamicallyDefineDataIdentifierClass.getCheckPerSourceId());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticHandleDddiConfigurationEnumWrapper getConfigurationHandling() {
        
        if (CollUtil.isNotEmpty(diagnosticDynamicallyDefineDataIdentifierClass.getConfigurationHandling())) {
            
            return new DiagnosticHandleDddiConfigurationEnumWrapper(diagnosticDynamicallyDefineDataIdentifierClass.getConfigurationHandling());
            
        } else {
            return null;
        }
        
    }




    


    
}