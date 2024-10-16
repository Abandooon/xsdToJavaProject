package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EcucScopeEnumWrapper {

    
    private EcucScopeEnum ecucScopeEnum;

    public EcucScopeEnumWrapper(EcucScopeEnum ecucScopeEnum) {
        this.ecucScopeEnum = ecucScopeEnum;
    }

   
    public EcucScopeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(ecucScopeEnum.getValue())) {
            
            return ecucScopeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucScopeEnum.getS())) {
            
            return ecucScopeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucScopeEnum.getT())) {
            
            return ecucScopeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}