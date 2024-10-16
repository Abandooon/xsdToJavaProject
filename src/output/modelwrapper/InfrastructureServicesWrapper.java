package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class InfrastructureServicesWrapper {

    
    private InfrastructureServices infrastructureServices;

    public InfrastructureServicesWrapper(InfrastructureServices infrastructureServices) {
        this.infrastructureServices = infrastructureServices;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(infrastructureServices.getS())) {
            
            return infrastructureServices.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(infrastructureServices.getT())) {
            
            return infrastructureServices.getT();
            
        } else {
            return null;
        }
        
    }

    public DhcpServerConfigurationWrapper getDhcpServerConfiguration() {
        
        if (CollUtil.isNotEmpty(infrastructureServices.getDhcpServerConfiguration())) {
            
            return new DhcpServerConfigurationWrapper(infrastructureServices.getDhcpServerConfiguration());
            
        } else {
            return null;
        }
        
    }

    public DoIpEntityWrapper getDoIpEntity() {
        
        if (CollUtil.isNotEmpty(infrastructureServices.getDoIpEntity())) {
            
            return new DoIpEntityWrapper(infrastructureServices.getDoIpEntity());
            
        } else {
            return null;
        }
        
    }

    public TimeSynchronizationWrapper getTimeSynchronization() {
        
        if (CollUtil.isNotEmpty(infrastructureServices.getTimeSynchronization())) {
            
            return new TimeSynchronizationWrapper(infrastructureServices.getTimeSynchronization());
            
        } else {
            return null;
        }
        
    }




    


    
}