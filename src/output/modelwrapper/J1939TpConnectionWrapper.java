package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    


public class J1939TpConnectionWrapper {

    
    private J1939TpConnection j1939TpConnection;

    public J1939TpConnectionWrapper(J1939TpConnection j1939TpConnection) {
        this.j1939TpConnection = j1939TpConnection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getS())) {
            
            return j1939TpConnection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getT())) {
            
            return j1939TpConnection.getT();
            
        } else {
            return null;
        }
        
    }

    public TpConnectionIdentWrapper getIdent() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getIdent())) {
            
            return new TpConnectionIdentWrapper(j1939TpConnection.getIdent());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getBroadcast() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getBroadcast())) {
            
            return new BooleanWrapper(j1939TpConnection.getBroadcast());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getBufferRatio() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getBufferRatio())) {
            
            return new PositiveIntegerWrapper(j1939TpConnection.getBufferRatio());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getCancellation() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getCancellation())) {
            
            return new BooleanWrapper(j1939TpConnection.getCancellation());
            
        } else {
            return null;
        }
        
    }

    public DataPduRefWrapper getDataPduRef() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getDataPduRef())) {
            
            return new DataPduRefWrapper(j1939TpConnection.getDataPduRef());
            
        } else {
            return null;
        }
        
    }

    public DirectPduRefWrapper getDirectPduRef() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getDirectPduRef())) {
            
            return new DirectPduRefWrapper(j1939TpConnection.getDirectPduRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getDynamicBs() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getDynamicBs())) {
            
            return new BooleanWrapper(j1939TpConnection.getDynamicBs());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FlowControlPduRefWrapper> getFlowControlPduRefs() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getFlowControlPduRefs())) {
            ArrayList<FlowControlPduRef> originalList = j1939TpConnection.getFlowControlPduRefs();
            ArrayList<FlowControlPduRefWrapper> wrapperList = (ArrayList<FlowControlPduRefWrapper>)originalList.stream()
                .map(item -> new FlowControlPduRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxBs() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getMaxBs())) {
            
            return new PositiveIntegerWrapper(j1939TpConnection.getMaxBs());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxExpBs() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getMaxExpBs())) {
            
            return new PositiveIntegerWrapper(j1939TpConnection.getMaxExpBs());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ReceiverRef_J1939TpConnectionWrapper> getReceiverRefs() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getReceiverRefs())) {
            ArrayList<ReceiverRef_J1939TpConnection> originalList = j1939TpConnection.getReceiverRefs();
            ArrayList<ReceiverRef_J1939TpConnectionWrapper> wrapperList = (ArrayList<ReceiverRef_J1939TpConnectionWrapper>)originalList.stream()
                .map(item -> new ReceiverRef_J1939TpConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRetry() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getRetry())) {
            
            return new BooleanWrapper(j1939TpConnection.getRetry());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<J1939TpPgWrapper> getTpPgs() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getTpPgs())) {
            ArrayList<J1939TpPg> originalList = j1939TpConnection.getTpPgs();
            ArrayList<J1939TpPgWrapper> wrapperList = (ArrayList<J1939TpPgWrapper>)originalList.stream()
                .map(item -> new J1939TpPgWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TpSduRef_CanTpConnectionWrapper> getTpSduRefs() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getTpSduRefs())) {
            ArrayList<TpSduRef_CanTpConnection> originalList = j1939TpConnection.getTpSduRefs();
            ArrayList<TpSduRef_CanTpConnectionWrapper> wrapperList = (ArrayList<TpSduRef_CanTpConnectionWrapper>)originalList.stream()
                .map(item -> new TpSduRef_CanTpConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TransmitterRef_J1939TpConnectionWrapper getTransmitterRef() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getTransmitterRef())) {
            
            return new TransmitterRef_J1939TpConnectionWrapper(j1939TpConnection.getTransmitterRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(j1939TpConnection.getVariationPoint())) {
            
            return new VariationPointWrapper(j1939TpConnection.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}