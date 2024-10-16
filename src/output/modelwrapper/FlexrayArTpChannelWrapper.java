package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class FlexrayArTpChannelWrapper {

    
    private FlexrayArTpChannel flexrayArTpChannel;

    public FlexrayArTpChannelWrapper(FlexrayArTpChannel flexrayArTpChannel) {
        this.flexrayArTpChannel = flexrayArTpChannel;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getS())) {
            
            return flexrayArTpChannel.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getT())) {
            
            return flexrayArTpChannel.getT();
            
        } else {
            return null;
        }
        
    }

    public FrArTpAckTypeWrapper getAckType() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getAckType())) {
            
            return new FrArTpAckTypeWrapper(flexrayArTpChannel.getAckType());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getCancellation() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getCancellation())) {
            
            return new BooleanWrapper(flexrayArTpChannel.getCancellation());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getExtendedAddressing() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getExtendedAddressing())) {
            
            return new BooleanWrapper(flexrayArTpChannel.getExtendedAddressing());
            
        } else {
            return null;
        }
        
    }

    public FlowControlPduRefWrapper getFlowControlPduRef() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getFlowControlPduRef())) {
            
            return new FlowControlPduRefWrapper(flexrayArTpChannel.getFlowControlPduRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxAr() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getMaxAr())) {
            
            return new IntegerWrapper(flexrayArTpChannel.getMaxAr());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxAs() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getMaxAs())) {
            
            return new IntegerWrapper(flexrayArTpChannel.getMaxAs());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxBs() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getMaxBs())) {
            
            return new IntegerWrapper(flexrayArTpChannel.getMaxBs());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxBufferRequest() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getMaxBufferRequest())) {
            
            return new IntegerWrapper(flexrayArTpChannel.getMaxBufferRequest());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxFcWait() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getMaxFcWait())) {
            
            return new PositiveIntegerWrapper(flexrayArTpChannel.getMaxFcWait());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxFrIf() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getMaxFrIf())) {
            
            return new IntegerWrapper(flexrayArTpChannel.getMaxFrIf());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxRetries() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getMaxRetries())) {
            
            return new IntegerWrapper(flexrayArTpChannel.getMaxRetries());
            
        } else {
            return null;
        }
        
    }

    public MaximumMessageLengthTypeWrapper getMaximumMessageLength() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getMaximumMessageLength())) {
            
            return new MaximumMessageLengthTypeWrapper(flexrayArTpChannel.getMaximumMessageLength());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMinimumMulticastSeperationTime() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getMinimumMulticastSeperationTime())) {
            
            return new TimeValueWrapper(flexrayArTpChannel.getMinimumMulticastSeperationTime());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMinimumSeparationTime() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getMinimumSeparationTime())) {
            
            return new TimeValueWrapper(flexrayArTpChannel.getMinimumSeparationTime());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getMulticastSegmentation() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getMulticastSegmentation())) {
            
            return new BooleanWrapper(flexrayArTpChannel.getMulticastSegmentation());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NPduRefWrapper> getNPduRefs() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getNPduRefs())) {
            ArrayList<NPduRef> originalList = flexrayArTpChannel.getNPduRefs();
            ArrayList<NPduRefWrapper> wrapperList = (ArrayList<NPduRefWrapper>)originalList.stream()
                .map(item -> new NPduRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NPduWrapper> getPduPools() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getPduPools())) {
            ArrayList<NPdu> originalList = flexrayArTpChannel.getPduPools();
            ArrayList<NPduWrapper> wrapperList = (ArrayList<NPduWrapper>)originalList.stream()
                .map(item -> new NPduWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeBr() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getTimeBr())) {
            
            return new TimeValueWrapper(flexrayArTpChannel.getTimeBr());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeBuffer() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getTimeBuffer())) {
            
            return new TimeValueWrapper(flexrayArTpChannel.getTimeBuffer());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeCs() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getTimeCs())) {
            
            return new TimeValueWrapper(flexrayArTpChannel.getTimeCs());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeFrIf() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getTimeFrIf())) {
            
            return new TimeValueWrapper(flexrayArTpChannel.getTimeFrIf());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutAr() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getTimeoutAr())) {
            
            return new TimeValueWrapper(flexrayArTpChannel.getTimeoutAr());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutAs() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getTimeoutAs())) {
            
            return new TimeValueWrapper(flexrayArTpChannel.getTimeoutAs());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutBs() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getTimeoutBs())) {
            
            return new TimeValueWrapper(flexrayArTpChannel.getTimeoutBs());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutCr() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getTimeoutCr())) {
            
            return new TimeValueWrapper(flexrayArTpChannel.getTimeoutCr());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FlexrayArTpConnectionWrapper> getTpConnections() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getTpConnections())) {
            ArrayList<FlexrayArTpConnection> originalList = flexrayArTpChannel.getTpConnections();
            ArrayList<FlexrayArTpConnectionWrapper> wrapperList = (ArrayList<FlexrayArTpConnectionWrapper>)originalList.stream()
                .map(item -> new FlexrayArTpConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getTransmitCancellation() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getTransmitCancellation())) {
            
            return new BooleanWrapper(flexrayArTpChannel.getTransmitCancellation());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayArTpChannel.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayArTpChannel.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}