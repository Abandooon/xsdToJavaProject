package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PortDefinedArgumentValueWrapper {

    
    private PortDefinedArgumentValue portDefinedArgumentValue;

    public PortDefinedArgumentValueWrapper(PortDefinedArgumentValue portDefinedArgumentValue) {
        this.portDefinedArgumentValue = portDefinedArgumentValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(portDefinedArgumentValue.getS())) {
            
            return portDefinedArgumentValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(portDefinedArgumentValue.getT())) {
            
            return portDefinedArgumentValue.getT();
            
        } else {
            return null;
        }
        
    }

    public ValueWrapper getValue() {
        
        if (CollUtil.isNotEmpty(portDefinedArgumentValue.getValue())) {
            
            return new ValueWrapper(portDefinedArgumentValue.getValue());
            
        } else {
            return null;
        }
        
    }

    public ValueTypeTrefWrapper getValueTypeTref() {
        
        if (CollUtil.isNotEmpty(portDefinedArgumentValue.getValueTypeTref())) {
            
            return new ValueTypeTrefWrapper(portDefinedArgumentValue.getValueTypeTref());
            
        } else {
            return null;
        }
        
    }




    


    
}