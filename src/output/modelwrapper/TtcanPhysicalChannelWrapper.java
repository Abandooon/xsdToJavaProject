package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class TtcanPhysicalChannelWrapper {

    
    private TtcanPhysicalChannel ttcanPhysicalChannel;

    public TtcanPhysicalChannelWrapper(TtcanPhysicalChannel ttcanPhysicalChannel) {
        this.ttcanPhysicalChannel = ttcanPhysicalChannel;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getS())) {
            
            return ttcanPhysicalChannel.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getT())) {
            
            return ttcanPhysicalChannel.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getUuid())) {
            
            return ttcanPhysicalChannel.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getShortName())) {
            
            return new IdentifierWrapper(ttcanPhysicalChannel.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ttcanPhysicalChannel.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ttcanPhysicalChannel.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ttcanPhysicalChannel.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getCategory())) {
            
            return new CategoryStringWrapper(ttcanPhysicalChannel.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getAdminData())) {
            
            return new AdminDataWrapper(ttcanPhysicalChannel.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ttcanPhysicalChannel.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getAnnotations())) {
            ArrayList<Annotation> originalList = ttcanPhysicalChannel.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CommunicationConnectorRefConditionalWrapper> getCommConnectors() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getCommConnectors())) {
            ArrayList<CommunicationConnectorRefConditional> originalList = ttcanPhysicalChannel.getCommConnectors();
            ArrayList<CommunicationConnectorRefConditionalWrapper> wrapperList = (ArrayList<CommunicationConnectorRefConditionalWrapper>)originalList.stream()
                .map(item -> new CommunicationConnectorRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FrameTriggeringsWrapper getFrameTriggerings() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getFrameTriggerings())) {
            
            return new FrameTriggeringsWrapper(ttcanPhysicalChannel.getFrameTriggerings());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalTriggeringWrapper> getISignalTriggerings() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getISignalTriggerings())) {
            ArrayList<ISignalTriggering> originalList = ttcanPhysicalChannel.getISignalTriggerings();
            ArrayList<ISignalTriggeringWrapper> wrapperList = (ArrayList<ISignalTriggeringWrapper>)originalList.stream()
                .map(item -> new ISignalTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PduTriggeringWrapper> getPduTriggerings() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getPduTriggerings())) {
            ArrayList<PduTriggering> originalList = ttcanPhysicalChannel.getPduTriggerings();
            ArrayList<PduTriggeringWrapper> wrapperList = (ArrayList<PduTriggeringWrapper>)originalList.stream()
                .map(item -> new PduTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ttcanPhysicalChannel.getVariationPoint())) {
            
            return new VariationPointWrapper(ttcanPhysicalChannel.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}