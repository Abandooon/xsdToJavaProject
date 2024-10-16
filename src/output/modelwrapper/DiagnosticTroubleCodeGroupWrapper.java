package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticTroubleCodeGroupWrapper {

    
    private DiagnosticTroubleCodeGroup diagnosticTroubleCodeGroup;

    public DiagnosticTroubleCodeGroupWrapper(DiagnosticTroubleCodeGroup diagnosticTroubleCodeGroup) {
        this.diagnosticTroubleCodeGroup = diagnosticTroubleCodeGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getS())) {
            
            return diagnosticTroubleCodeGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getT())) {
            
            return diagnosticTroubleCodeGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getUuid())) {
            
            return diagnosticTroubleCodeGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getShortName())) {
            
            return new IdentifierWrapper(diagnosticTroubleCodeGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticTroubleCodeGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticTroubleCodeGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticTroubleCodeGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticTroubleCodeGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticTroubleCodeGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticTroubleCodeGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticTroubleCodeGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticTroubleCodeGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticTroubleCodeRefConditionalWrapper> getDtcs() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getDtcs())) {
            ArrayList<DiagnosticTroubleCodeRefConditional> originalList = diagnosticTroubleCodeGroup.getDtcs();
            ArrayList<DiagnosticTroubleCodeRefConditionalWrapper> wrapperList = (ArrayList<DiagnosticTroubleCodeRefConditionalWrapper>)originalList.stream()
                .map(item -> new DiagnosticTroubleCodeRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getGroupNumber() {
        
        if (CollUtil.isNotEmpty(diagnosticTroubleCodeGroup.getGroupNumber())) {
            
            return new PositiveIntegerValueVariationPointWrapper(diagnosticTroubleCodeGroup.getGroupNumber());
            
        } else {
            return null;
        }
        
    }




    


    
}