package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class PduTriggeringWrapper {

    
    private PduTriggering pduTriggering;

    public PduTriggeringWrapper(PduTriggering pduTriggering) {
        this.pduTriggering = pduTriggering;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getS())) {
            
            return pduTriggering.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getT())) {
            
            return pduTriggering.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getUuid())) {
            
            return pduTriggering.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getShortName())) {
            
            return new IdentifierWrapper(pduTriggering.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = pduTriggering.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getLongName())) {
            
            return new MultilanguageLongNameWrapper(pduTriggering.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(pduTriggering.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getCategory())) {
            
            return new CategoryStringWrapper(pduTriggering.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getAdminData())) {
            
            return new AdminDataWrapper(pduTriggering.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getIntroduction())) {
            
            return new DocumentationBlockWrapper(pduTriggering.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getAnnotations())) {
            ArrayList<Annotation> originalList = pduTriggering.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<IPduPortRefWrapper> getIPduPortRefs() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getIPduPortRefs())) {
            ArrayList<IPduPortRef> originalList = pduTriggering.getIPduPortRefs();
            ArrayList<IPduPortRefWrapper> wrapperList = (ArrayList<IPduPortRefWrapper>)originalList.stream()
                .map(item -> new IPduPortRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IPduRef_PduTriggeringWrapper getIPduRef() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getIPduRef())) {
            
            return new IPduRef_PduTriggeringWrapper(pduTriggering.getIPduRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalTriggeringRefConditionalWrapper> getISignalTriggerings() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getISignalTriggerings())) {
            ArrayList<ISignalTriggeringRefConditional> originalList = pduTriggering.getISignalTriggerings();
            ArrayList<ISignalTriggeringRefConditionalWrapper> wrapperList = (ArrayList<ISignalTriggeringRefConditionalWrapper>)originalList.stream()
                .map(item -> new ISignalTriggeringRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerIPduSendConditionWrapper> getTriggerIPduSendConditions() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getTriggerIPduSendConditions())) {
            ArrayList<TriggerIPduSendCondition> originalList = pduTriggering.getTriggerIPduSendConditions();
            ArrayList<TriggerIPduSendConditionWrapper> wrapperList = (ArrayList<TriggerIPduSendConditionWrapper>)originalList.stream()
                .map(item -> new TriggerIPduSendConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(pduTriggering.getVariationPoint())) {
            
            return new VariationPointWrapper(pduTriggering.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}