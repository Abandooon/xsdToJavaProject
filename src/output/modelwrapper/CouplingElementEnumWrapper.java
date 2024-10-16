package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CouplingElementEnumWrapper {

    
    private CouplingElementEnum couplingElementEnum;

    public CouplingElementEnumWrapper(CouplingElementEnum couplingElementEnum) {
        this.couplingElementEnum = couplingElementEnum;
    }

   
    public CouplingElementEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(couplingElementEnum.getValue())) {
            
            return couplingElementEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(couplingElementEnum.getS())) {
            
            return couplingElementEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(couplingElementEnum.getT())) {
            
            return couplingElementEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}