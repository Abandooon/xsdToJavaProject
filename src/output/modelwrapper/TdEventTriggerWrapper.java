package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    


public class TdEventTriggerWrapper {

    
    private TdEventTrigger tdEventTrigger;

    public TdEventTriggerWrapper(TdEventTrigger tdEventTrigger) {
        this.tdEventTrigger = tdEventTrigger;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getS())) {
            
            return tdEventTrigger.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getT())) {
            
            return tdEventTrigger.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getUuid())) {
            
            return tdEventTrigger.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getShortName())) {
            
            return new IdentifierWrapper(tdEventTrigger.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventTrigger.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventTrigger.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventTrigger.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getCategory())) {
            
            return new CategoryStringWrapper(tdEventTrigger.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getAdminData())) {
            
            return new AdminDataWrapper(tdEventTrigger.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventTrigger.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventTrigger.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventTrigger.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventTrigger.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public ComponentInCompositionInstanceRefWrapper getComponentIref() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getComponentIref())) {
            
            return new ComponentInCompositionInstanceRefWrapper(tdEventTrigger.getComponentIref());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsExternal() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getIsExternal())) {
            
            return new BooleanWrapper(tdEventTrigger.getIsExternal());
            
        } else {
            return null;
        }
        
    }

    public PortPrototypeBlueprintRefWrapper getPortPrototypeBlueprintRef() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getPortPrototypeBlueprintRef())) {
            
            return new PortPrototypeBlueprintRefWrapper(tdEventTrigger.getPortPrototypeBlueprintRef());
            
        } else {
            return null;
        }
        
    }

    public PortRefWrapper getPortRef() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getPortRef())) {
            
            return new PortRefWrapper(tdEventTrigger.getPortRef());
            
        } else {
            return null;
        }
        
    }

    public TdEventTriggerTypeEnumWrapper getTdEventTriggerType() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getTdEventTriggerType())) {
            
            return new TdEventTriggerTypeEnumWrapper(tdEventTrigger.getTdEventTriggerType());
            
        } else {
            return null;
        }
        
    }

    public TriggerRefWrapper getTriggerRef() {
        
        if (CollUtil.isNotEmpty(tdEventTrigger.getTriggerRef())) {
            
            return new TriggerRefWrapper(tdEventTrigger.getTriggerRef());
            
        } else {
            return null;
        }
        
    }




    


    
}