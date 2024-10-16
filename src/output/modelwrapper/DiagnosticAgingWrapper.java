package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticAgingWrapper {

    
    private DiagnosticAging diagnosticAging;

    public DiagnosticAgingWrapper(DiagnosticAging diagnosticAging) {
        this.diagnosticAging = diagnosticAging;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getS())) {
            
            return diagnosticAging.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getT())) {
            
            return diagnosticAging.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getUuid())) {
            
            return diagnosticAging.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getShortName())) {
            
            return new IdentifierWrapper(diagnosticAging.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticAging.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticAging.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticAging.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticAging.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticAging.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticAging.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticAging.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticAging.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticOperationCycleRefConditionalWrapper> getAgingCycles() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getAgingCycles())) {
            ArrayList<DiagnosticOperationCycleRefConditional> originalList = diagnosticAging.getAgingCycles();
            ArrayList<DiagnosticOperationCycleRefConditionalWrapper> wrapperList = (ArrayList<DiagnosticOperationCycleRefConditionalWrapper>)originalList.stream()
                .map(item -> new DiagnosticOperationCycleRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getThreshold() {
        
        if (CollUtil.isNotEmpty(diagnosticAging.getThreshold())) {
            
            return new PositiveIntegerValueVariationPointWrapper(diagnosticAging.getThreshold());
            
        } else {
            return null;
        }
        
    }




    


    
}