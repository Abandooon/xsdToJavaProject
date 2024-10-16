package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MaximumMessageLengthTypeWrapper {

    
    private MaximumMessageLengthType maximumMessageLengthType;

    public MaximumMessageLengthTypeWrapper(MaximumMessageLengthType maximumMessageLengthType) {
        this.maximumMessageLengthType = maximumMessageLengthType;
    }

   
    public MaximumMessageLengthTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(maximumMessageLengthType.getValue())) {
            
            return maximumMessageLengthType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(maximumMessageLengthType.getS())) {
            
            return maximumMessageLengthType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(maximumMessageLengthType.getT())) {
            
            return maximumMessageLengthType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}