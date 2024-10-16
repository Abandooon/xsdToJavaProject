package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class LinTpConnectionWrapper {

    
    private LinTpConnection linTpConnection;

    public LinTpConnectionWrapper(LinTpConnection linTpConnection) {
        this.linTpConnection = linTpConnection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getS())) {
            
            return linTpConnection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getT())) {
            
            return linTpConnection.getT();
            
        } else {
            return null;
        }
        
    }

    public TpConnectionIdentWrapper getIdent() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getIdent())) {
            
            return new TpConnectionIdentWrapper(linTpConnection.getIdent());
            
        } else {
            return null;
        }
        
    }

    public DataPduRefWrapper getDataPduRef() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getDataPduRef())) {
            
            return new DataPduRefWrapper(linTpConnection.getDataPduRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getDropNotRequestedNad() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getDropNotRequestedNad())) {
            
            return new BooleanWrapper(linTpConnection.getDropNotRequestedNad());
            
        } else {
            return null;
        }
        
    }

    public FlowControlRefWrapper getFlowControlRef() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getFlowControlRef())) {
            
            return new FlowControlRefWrapper(linTpConnection.getFlowControlRef());
            
        } else {
            return null;
        }
        
    }

    public LinTpNSduRefWrapper getLinTpNSduRef() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getLinTpNSduRef())) {
            
            return new LinTpNSduRefWrapper(linTpConnection.getLinTpNSduRef());
            
        } else {
            return null;
        }
        
    }

    public MulticastRefWrapper getMulticastRef() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getMulticastRef())) {
            
            return new MulticastRefWrapper(linTpConnection.getMulticastRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ReceiverRef_LinTpConnectionWrapper> getReceiverRefs() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getReceiverRefs())) {
            ArrayList<ReceiverRef_LinTpConnection> originalList = linTpConnection.getReceiverRefs();
            ArrayList<ReceiverRef_LinTpConnectionWrapper> wrapperList = (ArrayList<ReceiverRef_LinTpConnectionWrapper>)originalList.stream()
                .map(item -> new ReceiverRef_LinTpConnectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutAs() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getTimeoutAs())) {
            
            return new TimeValueWrapper(linTpConnection.getTimeoutAs());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutCr() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getTimeoutCr())) {
            
            return new TimeValueWrapper(linTpConnection.getTimeoutCr());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutCs() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getTimeoutCs())) {
            
            return new TimeValueWrapper(linTpConnection.getTimeoutCs());
            
        } else {
            return null;
        }
        
    }

    public TransmitterRef_LinTpConnectionWrapper getTransmitterRef() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getTransmitterRef())) {
            
            return new TransmitterRef_LinTpConnectionWrapper(linTpConnection.getTransmitterRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(linTpConnection.getVariationPoint())) {
            
            return new VariationPointWrapper(linTpConnection.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}