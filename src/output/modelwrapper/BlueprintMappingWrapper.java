package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class BlueprintMappingWrapper {

    
    private BlueprintMapping blueprintMapping;

    public BlueprintMappingWrapper(BlueprintMapping blueprintMapping) {
        this.blueprintMapping = blueprintMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(blueprintMapping.getS())) {
            
            return blueprintMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(blueprintMapping.getT())) {
            
            return blueprintMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public BlueprintRefWrapper getBlueprintRef() {
        
        if (CollUtil.isNotEmpty(blueprintMapping.getBlueprintRef())) {
            
            return new BlueprintRefWrapper(blueprintMapping.getBlueprintRef());
            
        } else {
            return null;
        }
        
    }

    public DerivedObjectRefWrapper getDerivedObjectRef() {
        
        if (CollUtil.isNotEmpty(blueprintMapping.getDerivedObjectRef())) {
            
            return new DerivedObjectRefWrapper(blueprintMapping.getDerivedObjectRef());
            
        } else {
            return null;
        }
        
    }




    


    
}