package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ClientComSpecWrapper {

    
    private ClientComSpec clientComSpec;

    public ClientComSpecWrapper(ClientComSpec clientComSpec) {
        this.clientComSpec = clientComSpec;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientComSpec.getS())) {
            
            return clientComSpec.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientComSpec.getT())) {
            
            return clientComSpec.getT();
            
        } else {
            return null;
        }
        
    }

    public OperationRefWrapper getOperationRef() {
        
        if (CollUtil.isNotEmpty(clientComSpec.getOperationRef())) {
            
            return new OperationRefWrapper(clientComSpec.getOperationRef());
            
        } else {
            return null;
        }
        
    }

    public TransformationComSpecPropssWrapper getTransformationComSpecPropss() {
        
        if (CollUtil.isNotEmpty(clientComSpec.getTransformationComSpecPropss())) {
            
            return new TransformationComSpecPropssWrapper(clientComSpec.getTransformationComSpecPropss());
            
        } else {
            return null;
        }
        
    }




    


    
}