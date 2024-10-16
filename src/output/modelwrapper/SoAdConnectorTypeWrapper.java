package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SoAdConnectorTypeWrapper {

    
    private SoAdConnectorType soAdConnectorType;

    public SoAdConnectorTypeWrapper(SoAdConnectorType soAdConnectorType) {
        this.soAdConnectorType = soAdConnectorType;
    }

   
    public SoAdConnectorTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(soAdConnectorType.getValue())) {
            
            return soAdConnectorType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(soAdConnectorType.getS())) {
            
            return soAdConnectorType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(soAdConnectorType.getT())) {
            
            return soAdConnectorType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}