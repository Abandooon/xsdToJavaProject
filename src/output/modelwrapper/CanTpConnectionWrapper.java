package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class CanTpConnectionWrapper {

    
    private CanTpConnection canTpConnection;

    public CanTpConnectionWrapper(CanTpConnection canTpConnection) {
        this.canTpConnection = canTpConnection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getS())) {
            
            return canTpConnection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getT())) {
            
            return canTpConnection.getT();
            
        } else {
            return null;
        }
        
    }

    public TpConnectionIdentWrapper getIdent() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getIdent())) {
            
            return new TpConnectionIdentWrapper(canTpConnection.getIdent());
            
        } else {
            return null;
        }
        
    }

    public CanTpAddressingFormatTypeWrapper getAddressingFormat() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getAddressingFormat())) {
            
            return new CanTpAddressingFormatTypeWrapper(canTpConnection.getAddressingFormat());
            
        } else {
            return null;
        }
        
    }

    public CanTpChannelRefWrapper getCanTpChannelRef() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getCanTpChannelRef())) {
            
            return new CanTpChannelRefWrapper(canTpConnection.getCanTpChannelRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getCancellation() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getCancellation())) {
            
            return new BooleanWrapper(canTpConnection.getCancellation());
            
        } else {
            return null;
        }
        
    }

    public DataPduRefWrapper getDataPduRef() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getDataPduRef())) {
            
            return new DataPduRefWrapper(canTpConnection.getDataPduRef());
            
        } else {
            return null;
        }
        
    }

    public FlowControlPduRefWrapper getFlowControlPduRef() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getFlowControlPduRef())) {
            
            return new FlowControlPduRefWrapper(canTpConnection.getFlowControlPduRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxBlockSize() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getMaxBlockSize())) {
            
            return new IntegerWrapper(canTpConnection.getMaxBlockSize());
            
        } else {
            return null;
        }
        
    }

    public MulticastRef_CanTpConnectionWrapper getMulticastRef() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getMulticastRef())) {
            
            return new MulticastRef_CanTpConnectionWrapper(canTpConnection.getMulticastRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPaddingActivation() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getPaddingActivation())) {
            
            return new BooleanWrapper(canTpConnection.getPaddingActivation());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ReceiverRefWrapper> getReceiverRefs() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getReceiverRefs())) {
            ArrayList<ReceiverRef> originalList = canTpConnection.getReceiverRefs();
            ArrayList<ReceiverRefWrapper> wrapperList = (ArrayList<ReceiverRefWrapper>)originalList.stream()
                .map(item -> new ReceiverRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public NetworkTargetAddressTypeWrapper getTaType() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getTaType())) {
            
            return new NetworkTargetAddressTypeWrapper(canTpConnection.getTaType());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutBr() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getTimeoutBr())) {
            
            return new TimeValueWrapper(canTpConnection.getTimeoutBr());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutBs() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getTimeoutBs())) {
            
            return new TimeValueWrapper(canTpConnection.getTimeoutBs());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutCr() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getTimeoutCr())) {
            
            return new TimeValueWrapper(canTpConnection.getTimeoutCr());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutCs() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getTimeoutCs())) {
            
            return new TimeValueWrapper(canTpConnection.getTimeoutCs());
            
        } else {
            return null;
        }
        
    }

    public TpSduRef_CanTpConnectionWrapper getTpSduRef() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getTpSduRef())) {
            
            return new TpSduRef_CanTpConnectionWrapper(canTpConnection.getTpSduRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getTransmitCancellation() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getTransmitCancellation())) {
            
            return new BooleanWrapper(canTpConnection.getTransmitCancellation());
            
        } else {
            return null;
        }
        
    }

    public TransmitterRefWrapper getTransmitterRef() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getTransmitterRef())) {
            
            return new TransmitterRefWrapper(canTpConnection.getTransmitterRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(canTpConnection.getVariationPoint())) {
            
            return new VariationPointWrapper(canTpConnection.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}