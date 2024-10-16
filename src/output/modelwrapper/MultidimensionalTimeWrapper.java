package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class MultidimensionalTimeWrapper {

    
    private MultidimensionalTime multidimensionalTime;

    public MultidimensionalTimeWrapper(MultidimensionalTime multidimensionalTime) {
        this.multidimensionalTime = multidimensionalTime;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(multidimensionalTime.getS())) {
            
            return multidimensionalTime.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(multidimensionalTime.getT())) {
            
            return multidimensionalTime.getT();
            
        } else {
            return null;
        }
        
    }

    public CseCodeTypeStringWrapper getCseCode() {
        
        if (CollUtil.isNotEmpty(multidimensionalTime.getCseCode())) {
            
            return new CseCodeTypeStringWrapper(multidimensionalTime.getCseCode());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getCseCodeFactor() {
        
        if (CollUtil.isNotEmpty(multidimensionalTime.getCseCodeFactor())) {
            
            return new IntegerWrapper(multidimensionalTime.getCseCodeFactor());
            
        } else {
            return null;
        }
        
    }




    


    
}