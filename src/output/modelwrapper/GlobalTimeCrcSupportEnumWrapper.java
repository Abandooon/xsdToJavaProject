package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class GlobalTimeCrcSupportEnumWrapper {

    
    private GlobalTimeCrcSupportEnum globalTimeCrcSupportEnum;

    public GlobalTimeCrcSupportEnumWrapper(GlobalTimeCrcSupportEnum globalTimeCrcSupportEnum) {
        this.globalTimeCrcSupportEnum = globalTimeCrcSupportEnum;
    }

   
    public GlobalTimeCrcSupportEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(globalTimeCrcSupportEnum.getValue())) {
            
            return globalTimeCrcSupportEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(globalTimeCrcSupportEnum.getS())) {
            
            return globalTimeCrcSupportEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(globalTimeCrcSupportEnum.getT())) {
            
            return globalTimeCrcSupportEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}