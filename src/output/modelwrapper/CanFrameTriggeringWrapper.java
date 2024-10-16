package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class CanFrameTriggeringWrapper {

    
    private CanFrameTriggering canFrameTriggering;

    public CanFrameTriggeringWrapper(CanFrameTriggering canFrameTriggering) {
        this.canFrameTriggering = canFrameTriggering;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getS())) {
            
            return canFrameTriggering.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getT())) {
            
            return canFrameTriggering.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getUuid())) {
            
            return canFrameTriggering.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getShortName())) {
            
            return new IdentifierWrapper(canFrameTriggering.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = canFrameTriggering.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getLongName())) {
            
            return new MultilanguageLongNameWrapper(canFrameTriggering.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(canFrameTriggering.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getCategory())) {
            
            return new CategoryStringWrapper(canFrameTriggering.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getAdminData())) {
            
            return new AdminDataWrapper(canFrameTriggering.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getIntroduction())) {
            
            return new DocumentationBlockWrapper(canFrameTriggering.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getAnnotations())) {
            ArrayList<Annotation> originalList = canFrameTriggering.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FramePortRefWrapper> getFramePortRefs() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getFramePortRefs())) {
            ArrayList<FramePortRef> originalList = canFrameTriggering.getFramePortRefs();
            ArrayList<FramePortRefWrapper> wrapperList = (ArrayList<FramePortRefWrapper>)originalList.stream()
                .map(item -> new FramePortRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FrameRefWrapper getFrameRef() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getFrameRef())) {
            
            return new FrameRefWrapper(canFrameTriggering.getFrameRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PduTriggeringRefConditionalWrapper> getPduTriggerings() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getPduTriggerings())) {
            ArrayList<PduTriggeringRefConditional> originalList = canFrameTriggering.getPduTriggerings();
            ArrayList<PduTriggeringRefConditionalWrapper> wrapperList = (ArrayList<PduTriggeringRefConditionalWrapper>)originalList.stream()
                .map(item -> new PduTriggeringRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getVariationPoint())) {
            
            return new VariationPointWrapper(canFrameTriggering.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TtcanAbsolutelyScheduledTimingWrapper> getAbsolutelyScheduledTimings() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getAbsolutelyScheduledTimings())) {
            ArrayList<TtcanAbsolutelyScheduledTiming> originalList = canFrameTriggering.getAbsolutelyScheduledTimings();
            ArrayList<TtcanAbsolutelyScheduledTimingWrapper> wrapperList = (ArrayList<TtcanAbsolutelyScheduledTimingWrapper>)originalList.stream()
                .map(item -> new TtcanAbsolutelyScheduledTimingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CanAddressingModeTypeWrapper getCanAddressingMode() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getCanAddressingMode())) {
            
            return new CanAddressingModeTypeWrapper(canFrameTriggering.getCanAddressingMode());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getCanFdFrameSupport() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getCanFdFrameSupport())) {
            
            return new BooleanWrapper(canFrameTriggering.getCanFdFrameSupport());
            
        } else {
            return null;
        }
        
    }

    public CanFrameRxBehaviorEnumWrapper getCanFrameRxBehavior() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getCanFrameRxBehavior())) {
            
            return new CanFrameRxBehaviorEnumWrapper(canFrameTriggering.getCanFrameRxBehavior());
            
        } else {
            return null;
        }
        
    }

    public CanFrameTxBehaviorEnumWrapper getCanFrameTxBehavior() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getCanFrameTxBehavior())) {
            
            return new CanFrameTxBehaviorEnumWrapper(canFrameTriggering.getCanFrameTxBehavior());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getIdentifier() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getIdentifier())) {
            
            return new IntegerWrapper(canFrameTriggering.getIdentifier());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getJ1939Requestable() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getJ1939Requestable())) {
            
            return new BooleanWrapper(canFrameTriggering.getJ1939Requestable());
            
        } else {
            return null;
        }
        
    }

    public RxIdentifierRangeWrapper getRxIdentifierRange() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getRxIdentifierRange())) {
            
            return new RxIdentifierRangeWrapper(canFrameTriggering.getRxIdentifierRange());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getRxMask() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getRxMask())) {
            
            return new PositiveIntegerWrapper(canFrameTriggering.getRxMask());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getTxMask() {
        
        if (CollUtil.isNotEmpty(canFrameTriggering.getTxMask())) {
            
            return new PositiveIntegerWrapper(canFrameTriggering.getTxMask());
            
        } else {
            return null;
        }
        
    }




    


    
}