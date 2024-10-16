package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class StorageConditionStatusEnumWrapper {

    
    private StorageConditionStatusEnum storageConditionStatusEnum;

    public StorageConditionStatusEnumWrapper(StorageConditionStatusEnum storageConditionStatusEnum) {
        this.storageConditionStatusEnum = storageConditionStatusEnum;
    }

   
    public StorageConditionStatusEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(storageConditionStatusEnum.getValue())) {
            
            return storageConditionStatusEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(storageConditionStatusEnum.getS())) {
            
            return storageConditionStatusEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(storageConditionStatusEnum.getT())) {
            
            return storageConditionStatusEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}