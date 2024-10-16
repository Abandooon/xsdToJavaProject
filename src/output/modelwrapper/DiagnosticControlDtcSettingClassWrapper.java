package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class DiagnosticControlDtcSettingClassWrapper {

    
    private DiagnosticControlDtcSettingClass diagnosticControlDtcSettingClass;

    public DiagnosticControlDtcSettingClassWrapper(DiagnosticControlDtcSettingClass diagnosticControlDtcSettingClass) {
        this.diagnosticControlDtcSettingClass = diagnosticControlDtcSettingClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getS())) {
            
            return diagnosticControlDtcSettingClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getT())) {
            
            return diagnosticControlDtcSettingClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getUuid())) {
            
            return diagnosticControlDtcSettingClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticControlDtcSettingClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticControlDtcSettingClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticControlDtcSettingClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticControlDtcSettingClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticControlDtcSettingClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticControlDtcSettingClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticControlDtcSettingClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticControlDtcSettingClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticControlDtcSettingClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticControlDtcSettingClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticControlDtcSettingClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getControlOptionRecordPresent() {
        
        if (CollUtil.isNotEmpty(diagnosticControlDtcSettingClass.getControlOptionRecordPresent())) {
            
            return new BooleanWrapper(diagnosticControlDtcSettingClass.getControlOptionRecordPresent());
            
        } else {
            return null;
        }
        
    }




    


    
}