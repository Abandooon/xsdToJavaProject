package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class BlueprintMappingSetWrapper {

    
    private BlueprintMappingSet blueprintMappingSet;

    public BlueprintMappingSetWrapper(BlueprintMappingSet blueprintMappingSet) {
        this.blueprintMappingSet = blueprintMappingSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(blueprintMappingSet.getS())) {
            
            return blueprintMappingSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(blueprintMappingSet.getT())) {
            
            return blueprintMappingSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(blueprintMappingSet.getUuid())) {
            
            return blueprintMappingSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(blueprintMappingSet.getShortName())) {
            
            return new IdentifierWrapper(blueprintMappingSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(blueprintMappingSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = blueprintMappingSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(blueprintMappingSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(blueprintMappingSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(blueprintMappingSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(blueprintMappingSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(blueprintMappingSet.getCategory())) {
            
            return new CategoryStringWrapper(blueprintMappingSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(blueprintMappingSet.getAdminData())) {
            
            return new AdminDataWrapper(blueprintMappingSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(blueprintMappingSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(blueprintMappingSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(blueprintMappingSet.getAnnotations())) {
            ArrayList<Annotation> originalList = blueprintMappingSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(blueprintMappingSet.getVariationPoint())) {
            
            return new VariationPointWrapper(blueprintMappingSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintMapsWrapper getBlueprintMaps() {
        
        if (CollUtil.isNotEmpty(blueprintMappingSet.getBlueprintMaps())) {
            
            return new BlueprintMapsWrapper(blueprintMappingSet.getBlueprintMaps());
            
        } else {
            return null;
        }
        
    }




    


    
}