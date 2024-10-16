package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SynchronizationTypeEnumWrapper {

    
    private SynchronizationTypeEnum synchronizationTypeEnum;

    public SynchronizationTypeEnumWrapper(SynchronizationTypeEnum synchronizationTypeEnum) {
        this.synchronizationTypeEnum = synchronizationTypeEnum;
    }

   
    public SynchronizationTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(synchronizationTypeEnum.getValue())) {
            
            return synchronizationTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(synchronizationTypeEnum.getS())) {
            
            return synchronizationTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(synchronizationTypeEnum.getT())) {
            
            return synchronizationTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}