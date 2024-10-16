package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class FlexrayPhysicalChannelWrapper {

    
    private FlexrayPhysicalChannel flexrayPhysicalChannel;

    public FlexrayPhysicalChannelWrapper(FlexrayPhysicalChannel flexrayPhysicalChannel) {
        this.flexrayPhysicalChannel = flexrayPhysicalChannel;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getS())) {
            
            return flexrayPhysicalChannel.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getT())) {
            
            return flexrayPhysicalChannel.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getUuid())) {
            
            return flexrayPhysicalChannel.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getShortName())) {
            
            return new IdentifierWrapper(flexrayPhysicalChannel.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flexrayPhysicalChannel.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flexrayPhysicalChannel.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flexrayPhysicalChannel.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getCategory())) {
            
            return new CategoryStringWrapper(flexrayPhysicalChannel.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getAdminData())) {
            
            return new AdminDataWrapper(flexrayPhysicalChannel.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flexrayPhysicalChannel.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getAnnotations())) {
            ArrayList<Annotation> originalList = flexrayPhysicalChannel.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CommunicationConnectorRefConditionalWrapper> getCommConnectors() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getCommConnectors())) {
            ArrayList<CommunicationConnectorRefConditional> originalList = flexrayPhysicalChannel.getCommConnectors();
            ArrayList<CommunicationConnectorRefConditionalWrapper> wrapperList = (ArrayList<CommunicationConnectorRefConditionalWrapper>)originalList.stream()
                .map(item -> new CommunicationConnectorRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FrameTriggeringsWrapper getFrameTriggerings() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getFrameTriggerings())) {
            
            return new FrameTriggeringsWrapper(flexrayPhysicalChannel.getFrameTriggerings());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalTriggeringWrapper> getISignalTriggerings() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getISignalTriggerings())) {
            ArrayList<ISignalTriggering> originalList = flexrayPhysicalChannel.getISignalTriggerings();
            ArrayList<ISignalTriggeringWrapper> wrapperList = (ArrayList<ISignalTriggeringWrapper>)originalList.stream()
                .map(item -> new ISignalTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PduTriggeringWrapper> getPduTriggerings() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getPduTriggerings())) {
            ArrayList<PduTriggering> originalList = flexrayPhysicalChannel.getPduTriggerings();
            ArrayList<PduTriggeringWrapper> wrapperList = (ArrayList<PduTriggeringWrapper>)originalList.stream()
                .map(item -> new PduTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayPhysicalChannel.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public FlexrayChannelNameWrapper getChannelName() {
        
        if (CollUtil.isNotEmpty(flexrayPhysicalChannel.getChannelName())) {
            
            return new FlexrayChannelNameWrapper(flexrayPhysicalChannel.getChannelName());
            
        } else {
            return null;
        }
        
    }




    


    
}