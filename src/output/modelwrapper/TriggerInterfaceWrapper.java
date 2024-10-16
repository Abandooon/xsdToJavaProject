package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class TriggerInterfaceWrapper {

    
    private TriggerInterface triggerInterface;

    public TriggerInterfaceWrapper(TriggerInterface triggerInterface) {
        this.triggerInterface = triggerInterface;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getS())) {
            
            return triggerInterface.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getT())) {
            
            return triggerInterface.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getUuid())) {
            
            return triggerInterface.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getShortName())) {
            
            return new IdentifierWrapper(triggerInterface.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = triggerInterface.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getLongName())) {
            
            return new MultilanguageLongNameWrapper(triggerInterface.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(triggerInterface.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getCategory())) {
            
            return new CategoryStringWrapper(triggerInterface.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getAdminData())) {
            
            return new AdminDataWrapper(triggerInterface.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getIntroduction())) {
            
            return new DocumentationBlockWrapper(triggerInterface.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getAnnotations())) {
            ArrayList<Annotation> originalList = triggerInterface.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getVariationPoint())) {
            
            return new VariationPointWrapper(triggerInterface.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(triggerInterface.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getShortNamePattern())) {
            
            return new StringWrapper(triggerInterface.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsService() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getIsService())) {
            
            return new BooleanWrapper(triggerInterface.getIsService());
            
        } else {
            return null;
        }
        
    }

    public ServiceProviderEnumWrapper getServiceKind() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getServiceKind())) {
            
            return new ServiceProviderEnumWrapper(triggerInterface.getServiceKind());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerWrapper> getTriggers() {
        
        if (CollUtil.isNotEmpty(triggerInterface.getTriggers())) {
            ArrayList<Trigger> originalList = triggerInterface.getTriggers();
            ArrayList<TriggerWrapper> wrapperList = (ArrayList<TriggerWrapper>)originalList.stream()
                .map(item -> new TriggerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}