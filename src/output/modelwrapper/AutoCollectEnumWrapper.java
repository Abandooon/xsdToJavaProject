package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class AutoCollectEnumWrapper {

    
    private AutoCollectEnum autoCollectEnum;

    public AutoCollectEnumWrapper(AutoCollectEnum autoCollectEnum) {
        this.autoCollectEnum = autoCollectEnum;
    }

   
    public AutoCollectEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(autoCollectEnum.getValue())) {
            
            return autoCollectEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(autoCollectEnum.getS())) {
            
            return autoCollectEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(autoCollectEnum.getT())) {
            
            return autoCollectEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}