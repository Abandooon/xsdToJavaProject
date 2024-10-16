package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SignalFanEnumWrapper {

    
    private SignalFanEnum signalFanEnum;

    public SignalFanEnumWrapper(SignalFanEnum signalFanEnum) {
        this.signalFanEnum = signalFanEnum;
    }

   
    public SignalFanEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(signalFanEnum.getValue())) {
            
            return signalFanEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(signalFanEnum.getS())) {
            
            return signalFanEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(signalFanEnum.getT())) {
            
            return signalFanEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}