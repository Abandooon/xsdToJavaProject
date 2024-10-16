package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class FrameTriggeringsWrapper {

    
    private FrameTriggerings frameTriggerings;

    public FrameTriggeringsWrapper(FrameTriggerings frameTriggerings) {
        this.frameTriggerings = frameTriggerings;
    }

   
    public ArrayList<CanFrameTriggeringWrapper> getCanFrameTriggering() {
        
        if (CollUtil.isNotEmpty(frameTriggerings.getCanFrameTriggering())) {
            ArrayList<CanFrameTriggering> originalList = frameTriggerings.getCanFrameTriggering();
            ArrayList<CanFrameTriggeringWrapper> wrapperList = (ArrayList<CanFrameTriggeringWrapper>)originalList.stream()
                .map(item -> new CanFrameTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EthernetFrameTriggeringWrapper> getEthernetFrameTriggering() {
        
        if (CollUtil.isNotEmpty(frameTriggerings.getEthernetFrameTriggering())) {
            ArrayList<EthernetFrameTriggering> originalList = frameTriggerings.getEthernetFrameTriggering();
            ArrayList<EthernetFrameTriggeringWrapper> wrapperList = (ArrayList<EthernetFrameTriggeringWrapper>)originalList.stream()
                .map(item -> new EthernetFrameTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayFrameTriggeringWrapper> getFlexrayFrameTriggering() {
        
        if (CollUtil.isNotEmpty(frameTriggerings.getFlexrayFrameTriggering())) {
            ArrayList<FlexrayFrameTriggering> originalList = frameTriggerings.getFlexrayFrameTriggering();
            ArrayList<FlexrayFrameTriggeringWrapper> wrapperList = (ArrayList<FlexrayFrameTriggeringWrapper>)originalList.stream()
                .map(item -> new FlexrayFrameTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<LinFrameTriggeringWrapper> getLinFrameTriggering() {
        
        if (CollUtil.isNotEmpty(frameTriggerings.getLinFrameTriggering())) {
            ArrayList<LinFrameTriggering> originalList = frameTriggerings.getLinFrameTriggering();
            ArrayList<LinFrameTriggeringWrapper> wrapperList = (ArrayList<LinFrameTriggeringWrapper>)originalList.stream()
                .map(item -> new LinFrameTriggeringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}