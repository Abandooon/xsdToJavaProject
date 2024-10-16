package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class UserDefinedPhysicalChannelWrapper {

    
    private UserDefinedPhysicalChannel userDefinedPhysicalChannel;

    public UserDefinedPhysicalChannelWrapper(UserDefinedPhysicalChannel userDefinedPhysicalChannel) {
        this.userDefinedPhysicalChannel = userDefinedPhysicalChannel;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getS())) {
            
            return userDefinedPhysicalChannel.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getT())) {
            
            return userDefinedPhysicalChannel.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getUuid())) {
            
            return userDefinedPhysicalChannel.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getShortName())) {
            
            return new IdentifierWrapper(userDefinedPhysicalChannel.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = userDefinedPhysicalChannel.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getLongName())) {
            
            return new MultilanguageLongNameWrapper(userDefinedPhysicalChannel.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(userDefinedPhysicalChannel.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getCategory())) {
            
            return new CategoryStringWrapper(userDefinedPhysicalChannel.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getAdminData())) {
            
            return new AdminDataWrapper(userDefinedPhysicalChannel.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getIntroduction())) {
            
            return new DocumentationBlockWrapper(userDefinedPhysicalChannel.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getAnnotations())) {
            ArrayList<Annotation> originalList = userDefinedPhysicalChannel.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CommunicationConnectorRefConditionalWrapper> getCommConnectors() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getCommConnectors())) {
            ArrayList<CommunicationConnectorRefConditional> originalList = userDefinedPhysicalChannel.getCommConnectors();
            ArrayList<CommunicationConnectorRefConditionalWrapper> wrapperList = (ArrayList<CommunicationConnectorRefConditionalWrapper>)originalList.stream()
                .map(item -> new CommunicationConnectorRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FrameTriggeringsWrapper getFrameTriggerings() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getFrameTriggerings())) {
            
            return new FrameTriggeringsWrapper(userDefinedPhysicalChannel.getFrameTriggerings());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalTriggeringWrapper> getISignalTriggerings() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getISignalTriggerings())) {
            ArrayList<ISignalTriggering> originalList = userDefinedPhysicalChannel.getISignalTriggerings();
            ArrayList<ISignalTriggeringWrapper> wrapperList = (ArrayList<ISignalTriggeringWrapper>)originalList.stream()
                .map(item -> new ISignalTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PduTriggeringWrapper> getPduTriggerings() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getPduTriggerings())) {
            ArrayList<PduTriggering> originalList = userDefinedPhysicalChannel.getPduTriggerings();
            ArrayList<PduTriggeringWrapper> wrapperList = (ArrayList<PduTriggeringWrapper>)originalList.stream()
                .map(item -> new PduTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(userDefinedPhysicalChannel.getVariationPoint())) {
            
            return new VariationPointWrapper(userDefinedPhysicalChannel.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}