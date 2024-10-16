package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class KeepWithPreviousEnumWrapper {

    
    private KeepWithPreviousEnum keepWithPreviousEnum;

    public KeepWithPreviousEnumWrapper(KeepWithPreviousEnum keepWithPreviousEnum) {
        this.keepWithPreviousEnum = keepWithPreviousEnum;
    }

   
    public KeepWithPreviousEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(keepWithPreviousEnum.getValue())) {
            
            return keepWithPreviousEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(keepWithPreviousEnum.getS())) {
            
            return keepWithPreviousEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(keepWithPreviousEnum.getT())) {
            
            return keepWithPreviousEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}