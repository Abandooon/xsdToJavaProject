package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class FrameEnumWrapper {

    
    private FrameEnum frameEnum;

    public FrameEnumWrapper(FrameEnum frameEnum) {
        this.frameEnum = frameEnum;
    }

   
    public FrameEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(frameEnum.getValue())) {
            
            return frameEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(frameEnum.getS())) {
            
            return frameEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(frameEnum.getT())) {
            
            return frameEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}