package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class KeyUsageRestrictionEnumWrapper {

    
    private KeyUsageRestrictionEnum keyUsageRestrictionEnum;

    public KeyUsageRestrictionEnumWrapper(KeyUsageRestrictionEnum keyUsageRestrictionEnum) {
        this.keyUsageRestrictionEnum = keyUsageRestrictionEnum;
    }

   
    public KeyUsageRestrictionEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(keyUsageRestrictionEnum.getValue())) {
            
            return keyUsageRestrictionEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(keyUsageRestrictionEnum.getS())) {
            
            return keyUsageRestrictionEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(keyUsageRestrictionEnum.getT())) {
            
            return keyUsageRestrictionEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}