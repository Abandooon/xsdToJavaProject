package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    


public class TriggerInterfaceMappingWrapper {

    
    private TriggerInterfaceMapping triggerInterfaceMapping;

    public TriggerInterfaceMappingWrapper(TriggerInterfaceMapping triggerInterfaceMapping) {
        this.triggerInterfaceMapping = triggerInterfaceMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getS())) {
            
            return triggerInterfaceMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getT())) {
            
            return triggerInterfaceMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getUuid())) {
            
            return triggerInterfaceMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getShortName())) {
            
            return new IdentifierWrapper(triggerInterfaceMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = triggerInterfaceMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(triggerInterfaceMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(triggerInterfaceMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getCategory())) {
            
            return new CategoryStringWrapper(triggerInterfaceMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getAdminData())) {
            
            return new AdminDataWrapper(triggerInterfaceMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(triggerInterfaceMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = triggerInterfaceMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(triggerInterfaceMapping.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getShortNamePattern())) {
            
            return new StringWrapper(triggerInterfaceMapping.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(triggerInterfaceMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerMappingWrapper> getTriggerMappings() {
        
        if (CollUtil.isNotEmpty(triggerInterfaceMapping.getTriggerMappings())) {
            ArrayList<TriggerMapping> originalList = triggerInterfaceMapping.getTriggerMappings();
            ArrayList<TriggerMappingWrapper> wrapperList = (ArrayList<TriggerMappingWrapper>)originalList.stream()
                .map(item -> new TriggerMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}