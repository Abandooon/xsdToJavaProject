package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class FlexrayTpConnectionWrapper {

    
    private FlexrayTpConnection flexrayTpConnection;

    public FlexrayTpConnectionWrapper(FlexrayTpConnection flexrayTpConnection) {
        this.flexrayTpConnection = flexrayTpConnection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnection.getS())) {
            
            return flexrayTpConnection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnection.getT())) {
            
            return flexrayTpConnection.getT();
            
        } else {
            return null;
        }
        
    }

    public TpConnectionIdentWrapper getIdent() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnection.getIdent())) {
            
            return new TpConnectionIdentWrapper(flexrayTpConnection.getIdent());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getBandwidthLimitation() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnection.getBandwidthLimitation())) {
            
            return new BooleanWrapper(flexrayTpConnection.getBandwidthLimitation());
            
        } else {
            return null;
        }
        
    }

    public DirectTpSduRefWrapper getDirectTpSduRef() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnection.getDirectTpSduRef())) {
            
            return new DirectTpSduRefWrapper(flexrayTpConnection.getDirectTpSduRef());
            
        } else {
            return null;
        }
        
    }

    public MulticastRefWrapper getMulticastRef() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnection.getMulticastRef())) {
            
            return new MulticastRefWrapper(flexrayTpConnection.getMulticastRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ReceiverRef_FlexrayTpConnectionWrapper> getReceiverRefs() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnection.getReceiverRefs())) {
            ArrayList<ReceiverRef_FlexrayTpConnection> originalList = flexrayTpConnection.getReceiverRefs();
            ArrayList<ReceiverRef_FlexrayTpConnectionWrapper> wrapperList = (ArrayList<ReceiverRef_FlexrayTpConnectionWrapper>)originalList.stream()
                .map(item -> new ReceiverRef_FlexrayTpConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ReversedTpSduRefWrapper getReversedTpSduRef() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnection.getReversedTpSduRef())) {
            
            return new ReversedTpSduRefWrapper(flexrayTpConnection.getReversedTpSduRef());
            
        } else {
            return null;
        }
        
    }

    public RxPduPoolRefWrapper getRxPduPoolRef() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnection.getRxPduPoolRef())) {
            
            return new RxPduPoolRefWrapper(flexrayTpConnection.getRxPduPoolRef());
            
        } else {
            return null;
        }
        
    }

    public TpConnectionControlRefWrapper getTpConnectionControlRef() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnection.getTpConnectionControlRef())) {
            
            return new TpConnectionControlRefWrapper(flexrayTpConnection.getTpConnectionControlRef());
            
        } else {
            return null;
        }
        
    }

    public TransmitterRef_FlexrayTpConnectionWrapper getTransmitterRef() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnection.getTransmitterRef())) {
            
            return new TransmitterRef_FlexrayTpConnectionWrapper(flexrayTpConnection.getTransmitterRef());
            
        } else {
            return null;
        }
        
    }

    public TxPduPoolRefWrapper getTxPduPoolRef() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnection.getTxPduPoolRef())) {
            
            return new TxPduPoolRefWrapper(flexrayTpConnection.getTxPduPoolRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnection.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayTpConnection.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}