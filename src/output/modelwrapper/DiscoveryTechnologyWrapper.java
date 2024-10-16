package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class DiscoveryTechnologyWrapper {

    
    private DiscoveryTechnology discoveryTechnology;

    public DiscoveryTechnologyWrapper(DiscoveryTechnology discoveryTechnology) {
        this.discoveryTechnology = discoveryTechnology;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(discoveryTechnology.getS())) {
            
            return discoveryTechnology.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(discoveryTechnology.getT())) {
            
            return discoveryTechnology.getT();
            
        } else {
            return null;
        }
        
    }

    public DiscoveryTechnologyEnumWrapper getName() {
        
        if (CollUtil.isNotEmpty(discoveryTechnology.getName())) {
            
            return new DiscoveryTechnologyEnumWrapper(discoveryTechnology.getName());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getVersion() {
        
        if (CollUtil.isNotEmpty(discoveryTechnology.getVersion())) {
            
            return new StringWrapper(discoveryTechnology.getVersion());
            
        } else {
            return null;
        }
        
    }




    


    
}