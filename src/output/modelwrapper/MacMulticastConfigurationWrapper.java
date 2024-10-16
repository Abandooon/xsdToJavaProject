package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MacMulticastConfigurationWrapper {

    
    private MacMulticastConfiguration macMulticastConfiguration;

    public MacMulticastConfigurationWrapper(MacMulticastConfiguration macMulticastConfiguration) {
        this.macMulticastConfiguration = macMulticastConfiguration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(macMulticastConfiguration.getS())) {
            
            return macMulticastConfiguration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(macMulticastConfiguration.getT())) {
            
            return macMulticastConfiguration.getT();
            
        } else {
            return null;
        }
        
    }

    public MacMulticastGroupRefWrapper getMacMulticastGroupRef() {
        
        if (CollUtil.isNotEmpty(macMulticastConfiguration.getMacMulticastGroupRef())) {
            
            return new MacMulticastGroupRefWrapper(macMulticastConfiguration.getMacMulticastGroupRef());
            
        } else {
            return null;
        }
        
    }




    


    
}