package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class BswDataSendPolicyWrapper {

    
    private BswDataSendPolicy bswDataSendPolicy;

    public BswDataSendPolicyWrapper(BswDataSendPolicy bswDataSendPolicy) {
        this.bswDataSendPolicy = bswDataSendPolicy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswDataSendPolicy.getS())) {
            
            return bswDataSendPolicy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswDataSendPolicy.getT())) {
            
            return bswDataSendPolicy.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnableTakeAddress() {
        
        if (CollUtil.isNotEmpty(bswDataSendPolicy.getEnableTakeAddress())) {
            
            return new BooleanWrapper(bswDataSendPolicy.getEnableTakeAddress());
            
        } else {
            return null;
        }
        
    }

    public ProviedeDataRefWrapper getProviedeDataRef() {
        
        if (CollUtil.isNotEmpty(bswDataSendPolicy.getProviedeDataRef())) {
            
            return new ProviedeDataRefWrapper(bswDataSendPolicy.getProviedeDataRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswDataSendPolicy.getVariationPoint())) {
            
            return new VariationPointWrapper(bswDataSendPolicy.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}