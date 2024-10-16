package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SoAdProtocolTypeWrapper {

    
    private SoAdProtocolType soAdProtocolType;

    public SoAdProtocolTypeWrapper(SoAdProtocolType soAdProtocolType) {
        this.soAdProtocolType = soAdProtocolType;
    }

   
    public SoAdProtocolTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(soAdProtocolType.getValue())) {
            
            return soAdProtocolType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(soAdProtocolType.getS())) {
            
            return soAdProtocolType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(soAdProtocolType.getT())) {
            
            return soAdProtocolType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}