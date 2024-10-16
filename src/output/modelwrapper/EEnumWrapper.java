package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EEnumWrapper {

    
    private EEnum eEnum;

    public EEnumWrapper(EEnum eEnum) {
        this.eEnum = eEnum;
    }

   
    public EEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(eEnum.getValue())) {
            
            return eEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(eEnum.getS())) {
            
            return eEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(eEnum.getT())) {
            
            return eEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}