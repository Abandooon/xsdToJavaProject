package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class BswClientPolicyWrapper {

    
    private BswClientPolicy bswClientPolicy;

    public BswClientPolicyWrapper(BswClientPolicy bswClientPolicy) {
        this.bswClientPolicy = bswClientPolicy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswClientPolicy.getS())) {
            
            return bswClientPolicy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswClientPolicy.getT())) {
            
            return bswClientPolicy.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnableTakeAddress() {
        
        if (CollUtil.isNotEmpty(bswClientPolicy.getEnableTakeAddress())) {
            
            return new BooleanWrapper(bswClientPolicy.getEnableTakeAddress());
            
        } else {
            return null;
        }
        
    }

    public RequiredClientServerEntryRefWrapper getRequiredClientServerEntryRef() {
        
        if (CollUtil.isNotEmpty(bswClientPolicy.getRequiredClientServerEntryRef())) {
            
            return new RequiredClientServerEntryRefWrapper(bswClientPolicy.getRequiredClientServerEntryRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswClientPolicy.getVariationPoint())) {
            
            return new VariationPointWrapper(bswClientPolicy.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}