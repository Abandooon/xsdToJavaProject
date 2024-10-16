package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticSecurityLevelWrapper {

    
    private DiagnosticSecurityLevel diagnosticSecurityLevel;

    public DiagnosticSecurityLevelWrapper(DiagnosticSecurityLevel diagnosticSecurityLevel) {
        this.diagnosticSecurityLevel = diagnosticSecurityLevel;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getS())) {
            
            return diagnosticSecurityLevel.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getT())) {
            
            return diagnosticSecurityLevel.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getUuid())) {
            
            return diagnosticSecurityLevel.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getShortName())) {
            
            return new IdentifierWrapper(diagnosticSecurityLevel.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticSecurityLevel.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticSecurityLevel.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticSecurityLevel.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticSecurityLevel.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticSecurityLevel.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticSecurityLevel.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticSecurityLevel.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticSecurityLevel.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getAccessDataRecordSize() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getAccessDataRecordSize())) {
            
            return new PositiveIntegerWrapper(diagnosticSecurityLevel.getAccessDataRecordSize());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getKeySize() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getKeySize())) {
            
            return new PositiveIntegerWrapper(diagnosticSecurityLevel.getKeySize());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNumFailedSecurityAccess() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getNumFailedSecurityAccess())) {
            
            return new PositiveIntegerWrapper(diagnosticSecurityLevel.getNumFailedSecurityAccess());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getSecurityDelayTime() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getSecurityDelayTime())) {
            
            return new TimeValueWrapper(diagnosticSecurityLevel.getSecurityDelayTime());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSeedSize() {
        
        if (CollUtil.isNotEmpty(diagnosticSecurityLevel.getSeedSize())) {
            
            return new PositiveIntegerWrapper(diagnosticSecurityLevel.getSeedSize());
            
        } else {
            return null;
        }
        
    }




    


    
}