package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    


public class ConsistencyNeedsWrapper {

    
    private ConsistencyNeeds consistencyNeeds;

    public ConsistencyNeedsWrapper(ConsistencyNeeds consistencyNeeds) {
        this.consistencyNeeds = consistencyNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getS())) {
            
            return consistencyNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getT())) {
            
            return consistencyNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getUuid())) {
            
            return consistencyNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getShortName())) {
            
            return new IdentifierWrapper(consistencyNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = consistencyNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(consistencyNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(consistencyNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getCategory())) {
            
            return new CategoryStringWrapper(consistencyNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getAdminData())) {
            
            return new AdminDataWrapper(consistencyNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(consistencyNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = consistencyNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(consistencyNeeds.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getShortNamePattern())) {
            
            return new StringWrapper(consistencyNeeds.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DataPrototypeGroupWrapper> getDpgDoesNotRequireCoherencys() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getDpgDoesNotRequireCoherencys())) {
            ArrayList<DataPrototypeGroup> originalList = consistencyNeeds.getDpgDoesNotRequireCoherencys();
            ArrayList<DataPrototypeGroupWrapper> wrapperList = (ArrayList<DataPrototypeGroupWrapper>)originalList.stream()
                .map(item -> new DataPrototypeGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataPrototypeGroupWrapper> getDpgRequiresCoherencys() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getDpgRequiresCoherencys())) {
            ArrayList<DataPrototypeGroup> originalList = consistencyNeeds.getDpgRequiresCoherencys();
            ArrayList<DataPrototypeGroupWrapper> wrapperList = (ArrayList<DataPrototypeGroupWrapper>)originalList.stream()
                .map(item -> new DataPrototypeGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RunnableEntityGroupWrapper> getRegDoesNotRequireStabilitys() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getRegDoesNotRequireStabilitys())) {
            ArrayList<RunnableEntityGroup> originalList = consistencyNeeds.getRegDoesNotRequireStabilitys();
            ArrayList<RunnableEntityGroupWrapper> wrapperList = (ArrayList<RunnableEntityGroupWrapper>)originalList.stream()
                .map(item -> new RunnableEntityGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RunnableEntityGroupWrapper> getRegRequiresStabilitys() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getRegRequiresStabilitys())) {
            ArrayList<RunnableEntityGroup> originalList = consistencyNeeds.getRegRequiresStabilitys();
            ArrayList<RunnableEntityGroupWrapper> wrapperList = (ArrayList<RunnableEntityGroupWrapper>)originalList.stream()
                .map(item -> new RunnableEntityGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(consistencyNeeds.getVariationPoint())) {
            
            return new VariationPointWrapper(consistencyNeeds.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}