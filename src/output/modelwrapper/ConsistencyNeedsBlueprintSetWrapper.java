package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class ConsistencyNeedsBlueprintSetWrapper {

    
    private ConsistencyNeedsBlueprintSet consistencyNeedsBlueprintSet;

    public ConsistencyNeedsBlueprintSetWrapper(ConsistencyNeedsBlueprintSet consistencyNeedsBlueprintSet) {
        this.consistencyNeedsBlueprintSet = consistencyNeedsBlueprintSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(consistencyNeedsBlueprintSet.getS())) {
            
            return consistencyNeedsBlueprintSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(consistencyNeedsBlueprintSet.getT())) {
            
            return consistencyNeedsBlueprintSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(consistencyNeedsBlueprintSet.getUuid())) {
            
            return consistencyNeedsBlueprintSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(consistencyNeedsBlueprintSet.getShortName())) {
            
            return new IdentifierWrapper(consistencyNeedsBlueprintSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(consistencyNeedsBlueprintSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = consistencyNeedsBlueprintSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(consistencyNeedsBlueprintSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(consistencyNeedsBlueprintSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(consistencyNeedsBlueprintSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(consistencyNeedsBlueprintSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(consistencyNeedsBlueprintSet.getCategory())) {
            
            return new CategoryStringWrapper(consistencyNeedsBlueprintSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(consistencyNeedsBlueprintSet.getAdminData())) {
            
            return new AdminDataWrapper(consistencyNeedsBlueprintSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(consistencyNeedsBlueprintSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(consistencyNeedsBlueprintSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(consistencyNeedsBlueprintSet.getAnnotations())) {
            ArrayList<Annotation> originalList = consistencyNeedsBlueprintSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(consistencyNeedsBlueprintSet.getVariationPoint())) {
            
            return new VariationPointWrapper(consistencyNeedsBlueprintSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ConsistencyNeedsWrapper> getConsistencyNeedss() {
        
        if (CollUtil.isNotEmpty(consistencyNeedsBlueprintSet.getConsistencyNeedss())) {
            ArrayList<ConsistencyNeeds> originalList = consistencyNeedsBlueprintSet.getConsistencyNeedss();
            ArrayList<ConsistencyNeedsWrapper> wrapperList = (ArrayList<ConsistencyNeedsWrapper>)originalList.stream()
                .map(item -> new ConsistencyNeedsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}