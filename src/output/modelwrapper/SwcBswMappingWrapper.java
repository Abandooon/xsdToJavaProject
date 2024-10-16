package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SwcBswMappingWrapper {

    
    private SwcBswMapping swcBswMapping;

    public SwcBswMappingWrapper(SwcBswMapping swcBswMapping) {
        this.swcBswMapping = swcBswMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getS())) {
            
            return swcBswMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getT())) {
            
            return swcBswMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getUuid())) {
            
            return swcBswMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getShortName())) {
            
            return new IdentifierWrapper(swcBswMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swcBswMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swcBswMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swcBswMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getCategory())) {
            
            return new CategoryStringWrapper(swcBswMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getAdminData())) {
            
            return new AdminDataWrapper(swcBswMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swcBswMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = swcBswMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(swcBswMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BswBehaviorRefWrapper getBswBehaviorRef() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getBswBehaviorRef())) {
            
            return new BswBehaviorRefWrapper(swcBswMapping.getBswBehaviorRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcBswRunnableMappingWrapper> getRunnableMappings() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getRunnableMappings())) {
            ArrayList<SwcBswRunnableMapping> originalList = swcBswMapping.getRunnableMappings();
            ArrayList<SwcBswRunnableMappingWrapper> wrapperList = (ArrayList<SwcBswRunnableMappingWrapper>)originalList.stream()
                .map(item -> new SwcBswRunnableMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwcBehaviorRefWrapper getSwcBehaviorRef() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getSwcBehaviorRef())) {
            
            return new SwcBehaviorRefWrapper(swcBswMapping.getSwcBehaviorRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcBswSynchronizedModeGroupPrototypeWrapper> getSynchronizedModeGroups() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getSynchronizedModeGroups())) {
            ArrayList<SwcBswSynchronizedModeGroupPrototype> originalList = swcBswMapping.getSynchronizedModeGroups();
            ArrayList<SwcBswSynchronizedModeGroupPrototypeWrapper> wrapperList = (ArrayList<SwcBswSynchronizedModeGroupPrototypeWrapper>)originalList.stream()
                .map(item -> new SwcBswSynchronizedModeGroupPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcBswSynchronizedTriggerWrapper> getSynchronizedTriggers() {
        
        if (CollUtil.isNotEmpty(swcBswMapping.getSynchronizedTriggers())) {
            ArrayList<SwcBswSynchronizedTrigger> originalList = swcBswMapping.getSynchronizedTriggers();
            ArrayList<SwcBswSynchronizedTriggerWrapper> wrapperList = (ArrayList<SwcBswSynchronizedTriggerWrapper>)originalList.stream()
                .map(item -> new SwcBswSynchronizedTriggerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}