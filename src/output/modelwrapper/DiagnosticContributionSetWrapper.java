package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticContributionSetWrapper {

    
    private DiagnosticContributionSet diagnosticContributionSet;

    public DiagnosticContributionSetWrapper(DiagnosticContributionSet diagnosticContributionSet) {
        this.diagnosticContributionSet = diagnosticContributionSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getS())) {
            
            return diagnosticContributionSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getT())) {
            
            return diagnosticContributionSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getUuid())) {
            
            return diagnosticContributionSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getShortName())) {
            
            return new IdentifierWrapper(diagnosticContributionSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticContributionSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticContributionSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticContributionSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticContributionSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticContributionSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticContributionSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticContributionSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticContributionSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticCommonPropsWrapper getCommonProperties() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getCommonProperties())) {
            
            return new DiagnosticCommonPropsWrapper(diagnosticContributionSet.getCommonProperties());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcuInstanceRefWrapper> getEcuInstanceRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getEcuInstanceRefs())) {
            ArrayList<EcuInstanceRef> originalList = diagnosticContributionSet.getEcuInstanceRefs();
            ArrayList<EcuInstanceRefWrapper> wrapperList = (ArrayList<EcuInstanceRefWrapper>)originalList.stream()
                .map(item -> new EcuInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticCommonElementRefConditionalWrapper> getElements() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getElements())) {
            ArrayList<DiagnosticCommonElementRefConditional> originalList = diagnosticContributionSet.getElements();
            ArrayList<DiagnosticCommonElementRefConditionalWrapper> wrapperList = (ArrayList<DiagnosticCommonElementRefConditionalWrapper>)originalList.stream()
                .map(item -> new DiagnosticCommonElementRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticServiceTableRefConditionalWrapper> getServiceTables() {
        
        if (CollUtil.isNotEmpty(diagnosticContributionSet.getServiceTables())) {
            ArrayList<DiagnosticServiceTableRefConditional> originalList = diagnosticContributionSet.getServiceTables();
            ArrayList<DiagnosticServiceTableRefConditionalWrapper> wrapperList = (ArrayList<DiagnosticServiceTableRefConditionalWrapper>)originalList.stream()
                .map(item -> new DiagnosticServiceTableRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}