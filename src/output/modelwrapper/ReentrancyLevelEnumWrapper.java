package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ReentrancyLevelEnumWrapper {

    
    private ReentrancyLevelEnum reentrancyLevelEnum;

    public ReentrancyLevelEnumWrapper(ReentrancyLevelEnum reentrancyLevelEnum) {
        this.reentrancyLevelEnum = reentrancyLevelEnum;
    }

   
    public ReentrancyLevelEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(reentrancyLevelEnum.getValue())) {
            
            return reentrancyLevelEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(reentrancyLevelEnum.getS())) {
            
            return reentrancyLevelEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(reentrancyLevelEnum.getT())) {
            
            return reentrancyLevelEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}