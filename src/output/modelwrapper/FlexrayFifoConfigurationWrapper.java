package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class FlexrayFifoConfigurationWrapper {

    
    private FlexrayFifoConfiguration flexrayFifoConfiguration;

    public FlexrayFifoConfigurationWrapper(FlexrayFifoConfiguration flexrayFifoConfiguration) {
        this.flexrayFifoConfiguration = flexrayFifoConfiguration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayFifoConfiguration.getS())) {
            
            return flexrayFifoConfiguration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayFifoConfiguration.getT())) {
            
            return flexrayFifoConfiguration.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getAdmitWithoutMessageId() {
        
        if (CollUtil.isNotEmpty(flexrayFifoConfiguration.getAdmitWithoutMessageId())) {
            
            return new BooleanWrapper(flexrayFifoConfiguration.getAdmitWithoutMessageId());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getBaseCycle() {
        
        if (CollUtil.isNotEmpty(flexrayFifoConfiguration.getBaseCycle())) {
            
            return new IntegerWrapper(flexrayFifoConfiguration.getBaseCycle());
            
        } else {
            return null;
        }
        
    }

    public ChannelRefWrapper getChannelRef() {
        
        if (CollUtil.isNotEmpty(flexrayFifoConfiguration.getChannelRef())) {
            
            return new ChannelRefWrapper(flexrayFifoConfiguration.getChannelRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getCycleRepetition() {
        
        if (CollUtil.isNotEmpty(flexrayFifoConfiguration.getCycleRepetition())) {
            
            return new IntegerWrapper(flexrayFifoConfiguration.getCycleRepetition());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getFifoDepth() {
        
        if (CollUtil.isNotEmpty(flexrayFifoConfiguration.getFifoDepth())) {
            
            return new IntegerWrapper(flexrayFifoConfiguration.getFifoDepth());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayFifoRangeWrapper> getFifoRanges() {
        
        if (CollUtil.isNotEmpty(flexrayFifoConfiguration.getFifoRanges())) {
            ArrayList<FlexrayFifoRange> originalList = flexrayFifoConfiguration.getFifoRanges();
            ArrayList<FlexrayFifoRangeWrapper> wrapperList = (ArrayList<FlexrayFifoRangeWrapper>)originalList.stream()
                .map(item -> new FlexrayFifoRangeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMsgIdMask() {
        
        if (CollUtil.isNotEmpty(flexrayFifoConfiguration.getMsgIdMask())) {
            
            return new IntegerWrapper(flexrayFifoConfiguration.getMsgIdMask());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMsgIdMatch() {
        
        if (CollUtil.isNotEmpty(flexrayFifoConfiguration.getMsgIdMatch())) {
            
            return new IntegerWrapper(flexrayFifoConfiguration.getMsgIdMatch());
            
        } else {
            return null;
        }
        
    }




    


    
}