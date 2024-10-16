package stdgui.data.model.modelwrapper;


    
    

    
    


public class CanControllerAttributesWrapper {

    
    private CanControllerAttributes canControllerAttributes;

    public CanControllerAttributesWrapper(CanControllerAttributes canControllerAttributes) {
        this.canControllerAttributes = canControllerAttributes;
    }

   
    public CanControllerConfigurationWrapper getCanControllerConfiguration() {
        
        if (CollUtil.isNotEmpty(canControllerAttributes.getCanControllerConfiguration())) {
            
            return new CanControllerConfigurationWrapper(canControllerAttributes.getCanControllerConfiguration());
            
        } else {
            return null;
        }
        
    }

    public CanControllerConfigurationRequirementsWrapper getCanControllerConfigurationRequirements() {
        
        if (CollUtil.isNotEmpty(canControllerAttributes.getCanControllerConfigurationRequirements())) {
            
            return new CanControllerConfigurationRequirementsWrapper(canControllerAttributes.getCanControllerConfigurationRequirements());
            
        } else {
            return null;
        }
        
    }




    


    
}