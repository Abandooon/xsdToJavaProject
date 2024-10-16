package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class Connectors_CompositionSwComponentType {

    
    
    protected ArrayList<AssemblySwConnector> assemblySwConnector;
    
    
    
    protected ArrayList<DelegationSwConnector> delegationSwConnector;
    
    
    
    protected ArrayList<PassThroughSwConnector> passThroughSwConnector;
    
    

    
    
    @XmlElement(name="ASSEMBLY-SW-CONNECTOR")
    public ArrayList<AssemblySwConnector> getAssemblySwConnector() {
    return this.assemblySwConnector;
}

    public void setAssemblySwConnector(ArrayList<AssemblySwConnector> value) {
        this.assemblySwConnector = value;
    }
    
    
    
    @XmlElement(name="DELEGATION-SW-CONNECTOR")
    public ArrayList<DelegationSwConnector> getDelegationSwConnector() {
    return this.delegationSwConnector;
}

    public void setDelegationSwConnector(ArrayList<DelegationSwConnector> value) {
        this.delegationSwConnector = value;
    }
    
    
    
    @XmlElement(name="PASS-THROUGH-SW-CONNECTOR")
    public ArrayList<PassThroughSwConnector> getPassThroughSwConnector() {
    return this.passThroughSwConnector;
}

    public void setPassThroughSwConnector(ArrayList<PassThroughSwConnector> value) {
        this.passThroughSwConnector = value;
    }
    
    
}