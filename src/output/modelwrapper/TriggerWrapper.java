package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class TriggerWrapper {

    
    private Trigger trigger;

    public TriggerWrapper(Trigger trigger) {
        this.trigger = trigger;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(trigger.getS())) {
            
            return trigger.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(trigger.getT())) {
            
            return trigger.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(trigger.getUuid())) {
            
            return trigger.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(trigger.getShortName())) {
            
            return new IdentifierWrapper(trigger.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(trigger.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = trigger.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(trigger.getLongName())) {
            
            return new MultilanguageLongNameWrapper(trigger.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(trigger.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(trigger.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(trigger.getCategory())) {
            
            return new CategoryStringWrapper(trigger.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(trigger.getAdminData())) {
            
            return new AdminDataWrapper(trigger.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(trigger.getIntroduction())) {
            
            return new DocumentationBlockWrapper(trigger.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(trigger.getAnnotations())) {
            ArrayList<Annotation> originalList = trigger.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwImplPolicyEnumWrapper getSwImplPolicy() {
        
        if (CollUtil.isNotEmpty(trigger.getSwImplPolicy())) {
            
            return new SwImplPolicyEnumWrapper(trigger.getSwImplPolicy());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getTriggerPeriod() {
        
        if (CollUtil.isNotEmpty(trigger.getTriggerPeriod())) {
            
            return new MultidimensionalTimeWrapper(trigger.getTriggerPeriod());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(trigger.getVariationPoint())) {
            
            return new VariationPointWrapper(trigger.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}