package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ClientServerApplicationErrorMappingWrapper {

    
    private ClientServerApplicationErrorMapping clientServerApplicationErrorMapping;

    public ClientServerApplicationErrorMappingWrapper(ClientServerApplicationErrorMapping clientServerApplicationErrorMapping) {
        this.clientServerApplicationErrorMapping = clientServerApplicationErrorMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientServerApplicationErrorMapping.getS())) {
            
            return clientServerApplicationErrorMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientServerApplicationErrorMapping.getT())) {
            
            return clientServerApplicationErrorMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public FirstApplicationErrorRefWrapper getFirstApplicationErrorRef() {
        
        if (CollUtil.isNotEmpty(clientServerApplicationErrorMapping.getFirstApplicationErrorRef())) {
            
            return new FirstApplicationErrorRefWrapper(clientServerApplicationErrorMapping.getFirstApplicationErrorRef());
            
        } else {
            return null;
        }
        
    }

    public SecondApplicationErrorRefWrapper getSecondApplicationErrorRef() {
        
        if (CollUtil.isNotEmpty(clientServerApplicationErrorMapping.getSecondApplicationErrorRef())) {
            
            return new SecondApplicationErrorRefWrapper(clientServerApplicationErrorMapping.getSecondApplicationErrorRef());
            
        } else {
            return null;
        }
        
    }




    


    
}