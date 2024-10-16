package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class FlatMapWrapper {

    
    private FlatMap flatMap;

    public FlatMapWrapper(FlatMap flatMap) {
        this.flatMap = flatMap;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flatMap.getS())) {
            
            return flatMap.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flatMap.getT())) {
            
            return flatMap.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flatMap.getUuid())) {
            
            return flatMap.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flatMap.getShortName())) {
            
            return new IdentifierWrapper(flatMap.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flatMap.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flatMap.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flatMap.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flatMap.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flatMap.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flatMap.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flatMap.getCategory())) {
            
            return new CategoryStringWrapper(flatMap.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flatMap.getAdminData())) {
            
            return new AdminDataWrapper(flatMap.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flatMap.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flatMap.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flatMap.getAnnotations())) {
            ArrayList<Annotation> originalList = flatMap.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flatMap.getVariationPoint())) {
            
            return new VariationPointWrapper(flatMap.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(flatMap.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(flatMap.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(flatMap.getShortNamePattern())) {
            
            return new StringWrapper(flatMap.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FlatInstanceDescriptorWrapper> getInstances() {
        
        if (CollUtil.isNotEmpty(flatMap.getInstances())) {
            ArrayList<FlatInstanceDescriptor> originalList = flatMap.getInstances();
            ArrayList<FlatInstanceDescriptorWrapper> wrapperList = (ArrayList<FlatInstanceDescriptorWrapper>)originalList.stream()
                .map(item -> new FlatInstanceDescriptorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}