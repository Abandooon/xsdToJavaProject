package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiscoveryTechnologyEnumWrapper {

    
    private DiscoveryTechnologyEnum discoveryTechnologyEnum;

    public DiscoveryTechnologyEnumWrapper(DiscoveryTechnologyEnum discoveryTechnologyEnum) {
        this.discoveryTechnologyEnum = discoveryTechnologyEnum;
    }

   
    public DiscoveryTechnologyEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(discoveryTechnologyEnum.getValue())) {
            
            return discoveryTechnologyEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(discoveryTechnologyEnum.getS())) {
            
            return discoveryTechnologyEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(discoveryTechnologyEnum.getT())) {
            
            return discoveryTechnologyEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}