package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ISignalIPduRefConditionalWrapper {

    
    private ISignalIPduRefConditional iSignalIPduRefConditional;

    public ISignalIPduRefConditionalWrapper(ISignalIPduRefConditional iSignalIPduRefConditional) {
        this.iSignalIPduRefConditional = iSignalIPduRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iSignalIPduRefConditional.getS())) {
            
            return iSignalIPduRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iSignalIPduRefConditional.getT())) {
            
            return iSignalIPduRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public ISignalIPduRefWrapper getISignalIPduRef() {
        
        if (CollUtil.isNotEmpty(iSignalIPduRefConditional.getISignalIPduRef())) {
            
            return new ISignalIPduRefWrapper(iSignalIPduRefConditional.getISignalIPduRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(iSignalIPduRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(iSignalIPduRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}