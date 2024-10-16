package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CanControllerAttributes {

    
    
    protected CanControllerConfiguration canControllerConfiguration;
    
    
    
    protected CanControllerConfigurationRequirements canControllerConfigurationRequirements;
    
    

    
    
    @XmlElement(name="CAN-CONTROLLER-CONFIGURATION")
    public CanControllerConfiguration getCanControllerConfiguration() {
    return this.canControllerConfiguration;
}

    public void setCanControllerConfiguration(CanControllerConfiguration value) {
        this.canControllerConfiguration = value;
    }
    
    
    
    @XmlElement(name="CAN-CONTROLLER-CONFIGURATION-REQUIREMENTS")
    public CanControllerConfigurationRequirements getCanControllerConfigurationRequirements() {
    return this.canControllerConfigurationRequirements;
}

    public void setCanControllerConfigurationRequirements(CanControllerConfigurationRequirements value) {
        this.canControllerConfigurationRequirements = value;
    }
    
    
}