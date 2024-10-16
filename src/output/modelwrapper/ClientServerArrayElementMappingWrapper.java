package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class ClientServerArrayElementMappingWrapper {

    
    private ClientServerArrayElementMapping clientServerArrayElementMapping;

    public ClientServerArrayElementMappingWrapper(ClientServerArrayElementMapping clientServerArrayElementMapping) {
        this.clientServerArrayElementMapping = clientServerArrayElementMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientServerArrayElementMapping.getS())) {
            
            return clientServerArrayElementMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientServerArrayElementMapping.getT())) {
            
            return clientServerArrayElementMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public ComplexTypeMappingWrapper getComplexTypeMapping() {
        
        if (CollUtil.isNotEmpty(clientServerArrayElementMapping.getComplexTypeMapping())) {
            
            return new ComplexTypeMappingWrapper(clientServerArrayElementMapping.getComplexTypeMapping());
            
        } else {
            return null;
        }
        
    }

    public IndexedArrayElementWrapper getIndexedArrayElement() {
        
        if (CollUtil.isNotEmpty(clientServerArrayElementMapping.getIndexedArrayElement())) {
            
            return new IndexedArrayElementWrapper(clientServerArrayElementMapping.getIndexedArrayElement());
            
        } else {
            return null;
        }
        
    }

    public SystemSignalRefWrapper getSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(clientServerArrayElementMapping.getSystemSignalRef())) {
            
            return new SystemSignalRefWrapper(clientServerArrayElementMapping.getSystemSignalRef());
            
        } else {
            return null;
        }
        
    }




    


    
}