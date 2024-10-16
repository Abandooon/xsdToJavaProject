package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class PulseTestEnumWrapper {

    
    private PulseTestEnum pulseTestEnum;

    public PulseTestEnumWrapper(PulseTestEnum pulseTestEnum) {
        this.pulseTestEnum = pulseTestEnum;
    }

   
    public PulseTestEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(pulseTestEnum.getValue())) {
            
            return pulseTestEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pulseTestEnum.getS())) {
            
            return pulseTestEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pulseTestEnum.getT())) {
            
            return pulseTestEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}