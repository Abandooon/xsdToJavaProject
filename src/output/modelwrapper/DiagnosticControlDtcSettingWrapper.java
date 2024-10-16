package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticControlDtcSettingWrapper {

    
    private DiagnosticControlDtcSetting diagnosticControlDtcSetting;

    public DiagnosticControlDtcSettingWrapper(DiagnosticControlDtcSetting diagnosticControlDtcSetting) {
        this.diagnosticControlDtcSetting = diagnosticControlDtcSetting;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getS())) {
            
            return diagnosticControlDtcSetting.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getT())) {
            
            return diagnosticControlDtcSetting.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getUuid())) {
            
            return diagnosticControlDtcSetting.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getShortName())) {
            
            return new IdentifierWrapper(diagnosticControlDtcSetting.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticControlDtcSetting.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticControlDtcSetting.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticControlDtcSetting.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticControlDtcSetting.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticControlDtcSetting.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticControlDtcSetting.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticControlDtcSetting.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticControlDtcSetting.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticControlDtcSetting.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DtcSettingClassRefWrapper getDtcSettingClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getDtcSettingClassRef())) {
            
            return new DtcSettingClassRefWrapper(diagnosticControlDtcSetting.getDtcSettingClassRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDtcSettingParameter() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSetting.getDtcSettingParameter())) {
            
            return new PositiveIntegerWrapper(diagnosticControlDtcSetting.getDtcSettingParameter());
            
        } else {
            return null;
        }
        
    }




    


    
}