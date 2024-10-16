package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class SignalIPduCounterWrapper {

    
    private SignalIPduCounter signalIPduCounter;

    public SignalIPduCounterWrapper(SignalIPduCounter signalIPduCounter) {
        this.signalIPduCounter = signalIPduCounter;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(signalIPduCounter.getS())) {
            
            return signalIPduCounter.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(signalIPduCounter.getT())) {
            
            return signalIPduCounter.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPduCounterSize() {
        
        if (CollUtil.isNotEmpty(signalIPduCounter.getPduCounterSize())) {
            
            return new IntegerWrapper(signalIPduCounter.getPduCounterSize());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPduCounterStartPosition() {
        
        if (CollUtil.isNotEmpty(signalIPduCounter.getPduCounterStartPosition())) {
            
            return new IntegerWrapper(signalIPduCounter.getPduCounterStartPosition());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPduCounterThreshold() {
        
        if (CollUtil.isNotEmpty(signalIPduCounter.getPduCounterThreshold())) {
            
            return new IntegerWrapper(signalIPduCounter.getPduCounterThreshold());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(signalIPduCounter.getVariationPoint())) {
            
            return new VariationPointWrapper(signalIPduCounter.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}