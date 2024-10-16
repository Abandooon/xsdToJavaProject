package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    


public class SignalIPduReplicationWrapper {

    
    private SignalIPduReplication signalIPduReplication;

    public SignalIPduReplicationWrapper(SignalIPduReplication signalIPduReplication) {
        this.signalIPduReplication = signalIPduReplication;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(signalIPduReplication.getS())) {
            
            return signalIPduReplication.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(signalIPduReplication.getT())) {
            
            return signalIPduReplication.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPduReplicationVoting() {
        
        if (CollUtil.isNotEmpty(signalIPduReplication.getPduReplicationVoting())) {
            
            return new IntegerWrapper(signalIPduReplication.getPduReplicationVoting());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ReplicaPdusRefWrapper> getReplicaPdusRefs() {
        
        if (CollUtil.isNotEmpty(signalIPduReplication.getReplicaPdusRefs())) {
            ArrayList<ReplicaPdusRef> originalList = signalIPduReplication.getReplicaPdusRefs();
            ArrayList<ReplicaPdusRefWrapper> wrapperList = (ArrayList<ReplicaPdusRefWrapper>)originalList.stream()
                .map(item -> new ReplicaPdusRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(signalIPduReplication.getVariationPoint())) {
            
            return new VariationPointWrapper(signalIPduReplication.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}