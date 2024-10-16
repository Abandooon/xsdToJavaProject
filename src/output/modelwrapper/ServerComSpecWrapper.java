package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class ServerComSpecWrapper {

    
    private ServerComSpec serverComSpec;

    public ServerComSpecWrapper(ServerComSpec serverComSpec) {
        this.serverComSpec = serverComSpec;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(serverComSpec.getS())) {
            
            return serverComSpec.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(serverComSpec.getT())) {
            
            return serverComSpec.getT();
            
        } else {
            return null;
        }
        
    }

    public OperationRefWrapper getOperationRef() {
        
        if (CollUtil.isNotEmpty(serverComSpec.getOperationRef())) {
            
            return new OperationRefWrapper(serverComSpec.getOperationRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getQueueLength() {
        
        if (CollUtil.isNotEmpty(serverComSpec.getQueueLength())) {
            
            return new PositiveIntegerWrapper(serverComSpec.getQueueLength());
            
        } else {
            return null;
        }
        
    }

    public TransformationComSpecPropssWrapper getTransformationComSpecPropss() {
        
        if (CollUtil.isNotEmpty(serverComSpec.getTransformationComSpecPropss())) {
            
            return new TransformationComSpecPropssWrapper(serverComSpec.getTransformationComSpecPropss());
            
        } else {
            return null;
        }
        
    }




    


    
}