package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class DiagnosticFreezeFrameWrapper {

    
    private DiagnosticFreezeFrame diagnosticFreezeFrame;

    public DiagnosticFreezeFrameWrapper(DiagnosticFreezeFrame diagnosticFreezeFrame) {
        this.diagnosticFreezeFrame = diagnosticFreezeFrame;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getS())) {
            
            return diagnosticFreezeFrame.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getT())) {
            
            return diagnosticFreezeFrame.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getUuid())) {
            
            return diagnosticFreezeFrame.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getShortName())) {
            
            return new IdentifierWrapper(diagnosticFreezeFrame.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticFreezeFrame.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticFreezeFrame.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticFreezeFrame.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticFreezeFrame.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticFreezeFrame.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticFreezeFrame.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticFreezeFrame.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticFreezeFrame.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getRecordNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getRecordNumber())) {
            
            return new PositiveIntegerValueVariationPointWrapper(diagnosticFreezeFrame.getRecordNumber());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticRecordTriggerEnumWrapper getTrigger() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getTrigger())) {
            
            return new DiagnosticRecordTriggerEnumWrapper(diagnosticFreezeFrame.getTrigger());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getUpdate() {
        
        if (CollUtil.isNotEmpty(diagnosticFreezeFrame.getUpdate())) {
            
            return new BooleanWrapper(diagnosticFreezeFrame.getUpdate());
            
        } else {
            return null;
        }
        
    }




    


    
}