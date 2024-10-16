package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class RamBlockStatusControlEnumWrapper {

    
    private RamBlockStatusControlEnum ramBlockStatusControlEnum;

    public RamBlockStatusControlEnumWrapper(RamBlockStatusControlEnum ramBlockStatusControlEnum) {
        this.ramBlockStatusControlEnum = ramBlockStatusControlEnum;
    }

   
    public RamBlockStatusControlEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(ramBlockStatusControlEnum.getValue())) {
            
            return ramBlockStatusControlEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ramBlockStatusControlEnum.getS())) {
            
            return ramBlockStatusControlEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ramBlockStatusControlEnum.getT())) {
            
            return ramBlockStatusControlEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}