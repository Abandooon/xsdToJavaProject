package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TransferPropertyEnumWrapper {

    
    private TransferPropertyEnum transferPropertyEnum;

    public TransferPropertyEnumWrapper(TransferPropertyEnum transferPropertyEnum) {
        this.transferPropertyEnum = transferPropertyEnum;
    }

   
    public TransferPropertyEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(transferPropertyEnum.getValue())) {
            
            return transferPropertyEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(transferPropertyEnum.getS())) {
            
            return transferPropertyEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(transferPropertyEnum.getT())) {
            
            return transferPropertyEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}