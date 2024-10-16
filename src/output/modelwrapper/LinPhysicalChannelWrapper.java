package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class LinPhysicalChannelWrapper {

    
    private LinPhysicalChannel linPhysicalChannel;

    public LinPhysicalChannelWrapper(LinPhysicalChannel linPhysicalChannel) {
        this.linPhysicalChannel = linPhysicalChannel;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getS())) {
            
            return linPhysicalChannel.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getT())) {
            
            return linPhysicalChannel.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getUuid())) {
            
            return linPhysicalChannel.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getShortName())) {
            
            return new IdentifierWrapper(linPhysicalChannel.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linPhysicalChannel.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getLongName())) {
            
            return new MultilanguageLongNameWrapper(linPhysicalChannel.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(linPhysicalChannel.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getCategory())) {
            
            return new CategoryStringWrapper(linPhysicalChannel.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getAdminData())) {
            
            return new AdminDataWrapper(linPhysicalChannel.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getIntroduction())) {
            
            return new DocumentationBlockWrapper(linPhysicalChannel.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getAnnotations())) {
            ArrayList<Annotation> originalList = linPhysicalChannel.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CommunicationConnectorRefConditionalWrapper> getCommConnectors() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getCommConnectors())) {
            ArrayList<CommunicationConnectorRefConditional> originalList = linPhysicalChannel.getCommConnectors();
            ArrayList<CommunicationConnectorRefConditionalWrapper> wrapperList = (ArrayList<CommunicationConnectorRefConditionalWrapper>)originalList.stream()
                .map(item -> new CommunicationConnectorRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FrameTriggeringsWrapper getFrameTriggerings() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getFrameTriggerings())) {
            
            return new FrameTriggeringsWrapper(linPhysicalChannel.getFrameTriggerings());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalTriggeringWrapper> getISignalTriggerings() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getISignalTriggerings())) {
            ArrayList<ISignalTriggering> originalList = linPhysicalChannel.getISignalTriggerings();
            ArrayList<ISignalTriggeringWrapper> wrapperList = (ArrayList<ISignalTriggeringWrapper>)originalList.stream()
                .map(item -> new ISignalTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PduTriggeringWrapper> getPduTriggerings() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getPduTriggerings())) {
            ArrayList<PduTriggering> originalList = linPhysicalChannel.getPduTriggerings();
            ArrayList<PduTriggeringWrapper> wrapperList = (ArrayList<PduTriggeringWrapper>)originalList.stream()
                .map(item -> new PduTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getVariationPoint())) {
            
            return new VariationPointWrapper(linPhysicalChannel.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LinScheduleTableWrapper> getScheduleTables() {
        
        if (CollUtil.isNotEmpty(linPhysicalChannel.getScheduleTables())) {
            ArrayList<LinScheduleTable> originalList = linPhysicalChannel.getScheduleTables();
            ArrayList<LinScheduleTableWrapper> wrapperList = (ArrayList<LinScheduleTableWrapper>)originalList.stream()
                .map(item -> new LinScheduleTableWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}