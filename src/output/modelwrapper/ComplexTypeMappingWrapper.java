package stdgui.data.model.modelwrapper;


    
    

    
    


public class ComplexTypeMappingWrapper {

    
    private ComplexTypeMapping complexTypeMapping;

    public ComplexTypeMappingWrapper(ComplexTypeMapping complexTypeMapping) {
        this.complexTypeMapping = complexTypeMapping;
    }

   
    public ClientServerArrayTypeMappingWrapper getClientServerArrayTypeMapping() {
        
        if (CollUtil.isNotEmpty(complexTypeMapping.getClientServerArrayTypeMapping())) {
            
            return new ClientServerArrayTypeMappingWrapper(complexTypeMapping.getClientServerArrayTypeMapping());
            
        } else {
            return null;
        }
        
    }

    public ClientServerRecordTypeMappingWrapper getClientServerRecordTypeMapping() {
        
        if (CollUtil.isNotEmpty(complexTypeMapping.getClientServerRecordTypeMapping())) {
            
            return new ClientServerRecordTypeMappingWrapper(complexTypeMapping.getClientServerRecordTypeMapping());
            
        } else {
            return null;
        }
        
    }




    


    
}