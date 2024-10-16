package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class DiagnosticDataIdentifierSetWrapper {

    
    private DiagnosticDataIdentifierSet diagnosticDataIdentifierSet;

    public DiagnosticDataIdentifierSetWrapper(DiagnosticDataIdentifierSet diagnosticDataIdentifierSet) {
        this.diagnosticDataIdentifierSet = diagnosticDataIdentifierSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifierSet.getS())) {
            
            return diagnosticDataIdentifierSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifierSet.getT())) {
            
            return diagnosticDataIdentifierSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifierSet.getUuid())) {
            
            return diagnosticDataIdentifierSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifierSet.getShortName())) {
            
            return new IdentifierWrapper(diagnosticDataIdentifierSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifierSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticDataIdentifierSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifierSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticDataIdentifierSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifierSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticDataIdentifierSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifierSet.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticDataIdentifierSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifierSet.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticDataIdentifierSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifierSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticDataIdentifierSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifierSet.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticDataIdentifierSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifierSet.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticDataIdentifierSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DataIdentifierRefWrapper> getDataIdentifierRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticDataIdentifierSet.getDataIdentifierRefs())) {
            ArrayList<DataIdentifierRef> originalList = diagnosticDataIdentifierSet.getDataIdentifierRefs();
            ArrayList<DataIdentifierRefWrapper> wrapperList = (ArrayList<DataIdentifierRefWrapper>)originalList.stream()
                .map(item -> new DataIdentifierRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}