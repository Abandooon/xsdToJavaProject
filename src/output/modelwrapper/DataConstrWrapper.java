package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class DataConstrWrapper {

    
    private DataConstr dataConstr;

    public DataConstrWrapper(DataConstr dataConstr) {
        this.dataConstr = dataConstr;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataConstr.getS())) {
            
            return dataConstr.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataConstr.getT())) {
            
            return dataConstr.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(dataConstr.getUuid())) {
            
            return dataConstr.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(dataConstr.getShortName())) {
            
            return new IdentifierWrapper(dataConstr.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(dataConstr.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = dataConstr.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(dataConstr.getLongName())) {
            
            return new MultilanguageLongNameWrapper(dataConstr.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(dataConstr.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(dataConstr.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(dataConstr.getCategory())) {
            
            return new CategoryStringWrapper(dataConstr.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(dataConstr.getAdminData())) {
            
            return new AdminDataWrapper(dataConstr.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dataConstr.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dataConstr.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(dataConstr.getAnnotations())) {
            ArrayList<Annotation> originalList = dataConstr.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(dataConstr.getVariationPoint())) {
            
            return new VariationPointWrapper(dataConstr.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(dataConstr.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(dataConstr.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(dataConstr.getShortNamePattern())) {
            
            return new StringWrapper(dataConstr.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DataConstrRuleWrapper> getDataConstrRules() {
        
        if (CollUtil.isNotEmpty(dataConstr.getDataConstrRules())) {
            ArrayList<DataConstrRule> originalList = dataConstr.getDataConstrRules();
            ArrayList<DataConstrRuleWrapper> wrapperList = (ArrayList<DataConstrRuleWrapper>)originalList.stream()
                .map(item -> new DataConstrRuleWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}