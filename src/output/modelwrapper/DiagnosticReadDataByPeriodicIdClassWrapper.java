package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticReadDataByPeriodicIdClassWrapper {

    
    private DiagnosticReadDataByPeriodicIdClass diagnosticReadDataByPeriodicIdClass;

    public DiagnosticReadDataByPeriodicIdClassWrapper(DiagnosticReadDataByPeriodicIdClass diagnosticReadDataByPeriodicIdClass) {
        this.diagnosticReadDataByPeriodicIdClass = diagnosticReadDataByPeriodicIdClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getS())) {
            
            return diagnosticReadDataByPeriodicIdClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getT())) {
            
            return diagnosticReadDataByPeriodicIdClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getUuid())) {
            
            return diagnosticReadDataByPeriodicIdClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticReadDataByPeriodicIdClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticReadDataByPeriodicIdClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticReadDataByPeriodicIdClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticReadDataByPeriodicIdClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticReadDataByPeriodicIdClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticReadDataByPeriodicIdClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticReadDataByPeriodicIdClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticReadDataByPeriodicIdClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticReadDataByPeriodicIdClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticReadDataByPeriodicIdClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticReadDataByPeriodicIdClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxPeriodicDidToRead() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getMaxPeriodicDidToRead())) {
            
            return new PositiveIntegerWrapper(diagnosticReadDataByPeriodicIdClass.getMaxPeriodicDidToRead());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticPeriodicRateWrapper> getPeriodicRates() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getPeriodicRates())) {
            ArrayList<DiagnosticPeriodicRate> originalList = diagnosticReadDataByPeriodicIdClass.getPeriodicRates();
            ArrayList<DiagnosticPeriodicRateWrapper> wrapperList = (ArrayList<DiagnosticPeriodicRateWrapper>)originalList.stream()
                .map(item -> new DiagnosticPeriodicRateWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSchedulerMaxNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByPeriodicIdClass.getSchedulerMaxNumber())) {
            
            return new PositiveIntegerWrapper(diagnosticReadDataByPeriodicIdClass.getSchedulerMaxNumber());
            
        } else {
            return null;
        }
        
    }




    


    
}