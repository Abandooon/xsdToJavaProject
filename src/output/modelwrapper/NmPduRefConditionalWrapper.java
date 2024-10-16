package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class NmPduRefConditionalWrapper {

    
    private NmPduRefConditional nmPduRefConditional;

    public NmPduRefConditionalWrapper(NmPduRefConditional nmPduRefConditional) {
        this.nmPduRefConditional = nmPduRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nmPduRefConditional.getS())) {
            
            return nmPduRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nmPduRefConditional.getT())) {
            
            return nmPduRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public NmPduRefWrapper getNmPduRef() {
        
        if (CollUtil.isNotEmpty(nmPduRefConditional.getNmPduRef())) {
            
            return new NmPduRefWrapper(nmPduRefConditional.getNmPduRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(nmPduRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(nmPduRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}