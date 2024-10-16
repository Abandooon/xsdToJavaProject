package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class FlexrayFrameTriggeringWrapper {

    
    private FlexrayFrameTriggering flexrayFrameTriggering;

    public FlexrayFrameTriggeringWrapper(FlexrayFrameTriggering flexrayFrameTriggering) {
        this.flexrayFrameTriggering = flexrayFrameTriggering;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getS())) {
            
            return flexrayFrameTriggering.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getT())) {
            
            return flexrayFrameTriggering.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getUuid())) {
            
            return flexrayFrameTriggering.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getShortName())) {
            
            return new IdentifierWrapper(flexrayFrameTriggering.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flexrayFrameTriggering.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flexrayFrameTriggering.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flexrayFrameTriggering.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getCategory())) {
            
            return new CategoryStringWrapper(flexrayFrameTriggering.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getAdminData())) {
            
            return new AdminDataWrapper(flexrayFrameTriggering.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flexrayFrameTriggering.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getAnnotations())) {
            ArrayList<Annotation> originalList = flexrayFrameTriggering.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FramePortRefWrapper> getFramePortRefs() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getFramePortRefs())) {
            ArrayList<FramePortRef> originalList = flexrayFrameTriggering.getFramePortRefs();
            ArrayList<FramePortRefWrapper> wrapperList = (ArrayList<FramePortRefWrapper>)originalList.stream()
                .map(item -> new FramePortRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FrameRefWrapper getFrameRef() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getFrameRef())) {
            
            return new FrameRefWrapper(flexrayFrameTriggering.getFrameRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PduTriggeringRefConditionalWrapper> getPduTriggerings() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getPduTriggerings())) {
            ArrayList<PduTriggeringRefConditional> originalList = flexrayFrameTriggering.getPduTriggerings();
            ArrayList<PduTriggeringRefConditionalWrapper> wrapperList = (ArrayList<PduTriggeringRefConditionalWrapper>)originalList.stream()
                .map(item -> new PduTriggeringRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayFrameTriggering.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayAbsolutelyScheduledTimingWrapper> getAbsolutelyScheduledTimings() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getAbsolutelyScheduledTimings())) {
            ArrayList<FlexrayAbsolutelyScheduledTiming> originalList = flexrayFrameTriggering.getAbsolutelyScheduledTimings();
            ArrayList<FlexrayAbsolutelyScheduledTimingWrapper> wrapperList = (ArrayList<FlexrayAbsolutelyScheduledTimingWrapper>)originalList.stream()
                .map(item -> new FlexrayAbsolutelyScheduledTimingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getAllowDynamicLSduLength() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getAllowDynamicLSduLength())) {
            
            return new BooleanWrapper(flexrayFrameTriggering.getAllowDynamicLSduLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMessageId() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getMessageId())) {
            
            return new PositiveIntegerWrapper(flexrayFrameTriggering.getMessageId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPayloadPreambleIndicator() {
        
        if (CollUtil.isNotEmpty(flexrayFrameTriggering.getPayloadPreambleIndicator())) {
            
            return new BooleanWrapper(flexrayFrameTriggering.getPayloadPreambleIndicator());
            
        } else {
            return null;
        }
        
    }




    


    
}