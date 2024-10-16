package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EcucAffectionEnumWrapper {

    
    private EcucAffectionEnum ecucAffectionEnum;

    public EcucAffectionEnumWrapper(EcucAffectionEnum ecucAffectionEnum) {
        this.ecucAffectionEnum = ecucAffectionEnum;
    }

   
    public EcucAffectionEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(ecucAffectionEnum.getValue())) {
            
            return ecucAffectionEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucAffectionEnum.getS())) {
            
            return ecucAffectionEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucAffectionEnum.getT())) {
            
            return ecucAffectionEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}