package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class DiagnosticOperationCycleWrapper {

    
    private DiagnosticOperationCycle diagnosticOperationCycle;

    public DiagnosticOperationCycleWrapper(DiagnosticOperationCycle diagnosticOperationCycle) {
        this.diagnosticOperationCycle = diagnosticOperationCycle;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getS())) {
            
            return diagnosticOperationCycle.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getT())) {
            
            return diagnosticOperationCycle.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getUuid())) {
            
            return diagnosticOperationCycle.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getShortName())) {
            
            return new IdentifierWrapper(diagnosticOperationCycle.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticOperationCycle.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticOperationCycle.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticOperationCycle.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticOperationCycle.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticOperationCycle.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticOperationCycle.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticOperationCycle.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticOperationCycle.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getAutomaticEnd() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getAutomaticEnd())) {
            
            return new BooleanWrapper(diagnosticOperationCycle.getAutomaticEnd());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getCycleAutostart() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getCycleAutostart())) {
            
            return new BooleanWrapper(diagnosticOperationCycle.getCycleAutostart());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getCycleStatusStorage() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getCycleStatusStorage())) {
            
            return new BooleanWrapper(diagnosticOperationCycle.getCycleStatusStorage());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticOperationCycleTypeEnumWrapper getType() {
        
        if (CollUtil.isNotEmpty(diagnosticOperationCycle.getType())) {
            
            return new DiagnosticOperationCycleTypeEnumWrapper(diagnosticOperationCycle.getType());
            
        } else {
            return null;
        }
        
    }




    


    
}