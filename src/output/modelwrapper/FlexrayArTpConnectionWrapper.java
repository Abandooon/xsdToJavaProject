package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class FlexrayArTpConnectionWrapper {

    
    private FlexrayArTpConnection flexrayArTpConnection;

    public FlexrayArTpConnectionWrapper(FlexrayArTpConnection flexrayArTpConnection) {
        this.flexrayArTpConnection = flexrayArTpConnection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConnection.getS())) {
            
            return flexrayArTpConnection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConnection.getT())) {
            
            return flexrayArTpConnection.getT();
            
        } else {
            return null;
        }
        
    }

    public TpConnectionIdentWrapper getIdent() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConnection.getIdent())) {
            
            return new TpConnectionIdentWrapper(flexrayArTpConnection.getIdent());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getConnectionPrioPdus() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConnection.getConnectionPrioPdus())) {
            
            return new IntegerWrapper(flexrayArTpConnection.getConnectionPrioPdus());
            
        } else {
            return null;
        }
        
    }

    public DirectTpSduRefWrapper getDirectTpSduRef() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConnection.getDirectTpSduRef())) {
            
            return new DirectTpSduRefWrapper(flexrayArTpConnection.getDirectTpSduRef());
            
        } else {
            return null;
        }
        
    }

    public FlowControlPduRefWrapper getFlowControlPduRef() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConnection.getFlowControlPduRef())) {
            
            return new FlowControlPduRefWrapper(flexrayArTpConnection.getFlowControlPduRef());
            
        } else {
            return null;
        }
        
    }

    public MulticastRefWrapper getMulticastRef() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConnection.getMulticastRef())) {
            
            return new MulticastRefWrapper(flexrayArTpConnection.getMulticastRef());
            
        } else {
            return null;
        }
        
    }

    public ReversedTpSduRefWrapper getReversedTpSduRef() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConnection.getReversedTpSduRef())) {
            
            return new ReversedTpSduRefWrapper(flexrayArTpConnection.getReversedTpSduRef());
            
        } else {
            return null;
        }
        
    }

    public SourceRefWrapper getSourceRef() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConnection.getSourceRef())) {
            
            return new SourceRefWrapper(flexrayArTpConnection.getSourceRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TargetRef_FlexrayArTpConnectionWrapper> getTargetRefs() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConnection.getTargetRefs())) {
            ArrayList<TargetRef_FlexrayArTpConnection> originalList = flexrayArTpConnection.getTargetRefs();
            ArrayList<TargetRef_FlexrayArTpConnectionWrapper> wrapperList = (ArrayList<TargetRef_FlexrayArTpConnectionWrapper>)originalList.stream()
                .map(item -> new TargetRef_FlexrayArTpConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TransmitPduRefWrapper> getTransmitPduRefs() {
        
        if (CollUtil.isNotEmpty(flexrayArTpConnection.getTransmitPduRefs())) {
            ArrayList<TransmitPduRef> originalList = flexrayArTpConnection.getTransmitPduRefs();
            ArrayList<TransmitPduRefWrapper> wrapperList = (ArrayList<TransmitPduRefWrapper>)originalList.stream()
                .map(item -> new TransmitPduRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}