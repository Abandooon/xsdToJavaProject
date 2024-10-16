package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class RxAcceptContainedIPduEnumWrapper {

    
    private RxAcceptContainedIPduEnum rxAcceptContainedIPduEnum;

    public RxAcceptContainedIPduEnumWrapper(RxAcceptContainedIPduEnum rxAcceptContainedIPduEnum) {
        this.rxAcceptContainedIPduEnum = rxAcceptContainedIPduEnum;
    }

   
    public RxAcceptContainedIPduEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(rxAcceptContainedIPduEnum.getValue())) {
            
            return rxAcceptContainedIPduEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rxAcceptContainedIPduEnum.getS())) {
            
            return rxAcceptContainedIPduEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rxAcceptContainedIPduEnum.getT())) {
            
            return rxAcceptContainedIPduEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}