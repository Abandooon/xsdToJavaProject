package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class RxIdentifierRangeWrapper {

    
    private RxIdentifierRange rxIdentifierRange;

    public RxIdentifierRangeWrapper(RxIdentifierRange rxIdentifierRange) {
        this.rxIdentifierRange = rxIdentifierRange;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rxIdentifierRange.getS())) {
            
            return rxIdentifierRange.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rxIdentifierRange.getT())) {
            
            return rxIdentifierRange.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getLowerCanId() {
        
        if (CollUtil.isNotEmpty(rxIdentifierRange.getLowerCanId())) {
            
            return new PositiveIntegerWrapper(rxIdentifierRange.getLowerCanId());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getUpperCanId() {
        
        if (CollUtil.isNotEmpty(rxIdentifierRange.getUpperCanId())) {
            
            return new PositiveIntegerWrapper(rxIdentifierRange.getUpperCanId());
            
        } else {
            return null;
        }
        
    }




    


    
}