package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class BswQueuedDataReceptionPolicyWrapper {

    
    private BswQueuedDataReceptionPolicy bswQueuedDataReceptionPolicy;

    public BswQueuedDataReceptionPolicyWrapper(BswQueuedDataReceptionPolicy bswQueuedDataReceptionPolicy) {
        this.bswQueuedDataReceptionPolicy = bswQueuedDataReceptionPolicy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswQueuedDataReceptionPolicy.getS())) {
            
            return bswQueuedDataReceptionPolicy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswQueuedDataReceptionPolicy.getT())) {
            
            return bswQueuedDataReceptionPolicy.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnableTakeAddress() {
        
        if (CollUtil.isNotEmpty(bswQueuedDataReceptionPolicy.getEnableTakeAddress())) {
            
            return new BooleanWrapper(bswQueuedDataReceptionPolicy.getEnableTakeAddress());
            
        } else {
            return null;
        }
        
    }

    public ReceivedDataRefWrapper getReceivedDataRef() {
        
        if (CollUtil.isNotEmpty(bswQueuedDataReceptionPolicy.getReceivedDataRef())) {
            
            return new ReceivedDataRefWrapper(bswQueuedDataReceptionPolicy.getReceivedDataRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswQueuedDataReceptionPolicy.getVariationPoint())) {
            
            return new VariationPointWrapper(bswQueuedDataReceptionPolicy.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getQueueLength() {
        
        if (CollUtil.isNotEmpty(bswQueuedDataReceptionPolicy.getQueueLength())) {
            
            return new PositiveIntegerWrapper(bswQueuedDataReceptionPolicy.getQueueLength());
            
        } else {
            return null;
        }
        
    }




    


    
}