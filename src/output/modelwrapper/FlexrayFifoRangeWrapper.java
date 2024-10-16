package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class FlexrayFifoRangeWrapper {

    
    private FlexrayFifoRange flexrayFifoRange;

    public FlexrayFifoRangeWrapper(FlexrayFifoRange flexrayFifoRange) {
        this.flexrayFifoRange = flexrayFifoRange;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayFifoRange.getS())) {
            
            return flexrayFifoRange.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayFifoRange.getT())) {
            
            return flexrayFifoRange.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getRangeMax() {
        
        if (CollUtil.isNotEmpty(flexrayFifoRange.getRangeMax())) {
            
            return new IntegerWrapper(flexrayFifoRange.getRangeMax());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getRangeMin() {
        
        if (CollUtil.isNotEmpty(flexrayFifoRange.getRangeMin())) {
            
            return new IntegerWrapper(flexrayFifoRange.getRangeMin());
            
        } else {
            return null;
        }
        
    }




    


    
}