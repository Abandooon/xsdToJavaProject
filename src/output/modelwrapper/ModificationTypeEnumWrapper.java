package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ModificationTypeEnumWrapper {

    
    private ModificationTypeEnum modificationTypeEnum;

    public ModificationTypeEnumWrapper(ModificationTypeEnum modificationTypeEnum) {
        this.modificationTypeEnum = modificationTypeEnum;
    }

   
    public ModificationTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(modificationTypeEnum.getValue())) {
            
            return modificationTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modificationTypeEnum.getS())) {
            
            return modificationTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modificationTypeEnum.getT())) {
            
            return modificationTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}