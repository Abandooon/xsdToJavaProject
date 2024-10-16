package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class PduCollectionTriggerEnumWrapper {

    
    private PduCollectionTriggerEnum pduCollectionTriggerEnum;

    public PduCollectionTriggerEnumWrapper(PduCollectionTriggerEnum pduCollectionTriggerEnum) {
        this.pduCollectionTriggerEnum = pduCollectionTriggerEnum;
    }

   
    public PduCollectionTriggerEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(pduCollectionTriggerEnum.getValue())) {
            
            return pduCollectionTriggerEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pduCollectionTriggerEnum.getS())) {
            
            return pduCollectionTriggerEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pduCollectionTriggerEnum.getT())) {
            
            return pduCollectionTriggerEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}