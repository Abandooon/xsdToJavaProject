package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BlueprintMaps {

    
    
    protected ArrayList<BlueprintMapping> blueprintMapping;
    
    
    
    protected ArrayList<PortInterfaceBlueprintMapping> portInterfaceBlueprintMapping;
    
    
    
    protected ArrayList<PortPrototypeBlueprintMapping> portPrototypeBlueprintMapping;
    
    

    
    
    @XmlElement(name="BLUEPRINT-MAPPING")
    public ArrayList<BlueprintMapping> getBlueprintMapping() {
    return this.blueprintMapping;
}

    public void setBlueprintMapping(ArrayList<BlueprintMapping> value) {
        this.blueprintMapping = value;
    }
    
    
    
    @XmlElement(name="PORT-INTERFACE-BLUEPRINT-MAPPING")
    public ArrayList<PortInterfaceBlueprintMapping> getPortInterfaceBlueprintMapping() {
    return this.portInterfaceBlueprintMapping;
}

    public void setPortInterfaceBlueprintMapping(ArrayList<PortInterfaceBlueprintMapping> value) {
        this.portInterfaceBlueprintMapping = value;
    }
    
    
    
    @XmlElement(name="PORT-PROTOTYPE-BLUEPRINT-MAPPING")
    public ArrayList<PortPrototypeBlueprintMapping> getPortPrototypeBlueprintMapping() {
    return this.portPrototypeBlueprintMapping;
}

    public void setPortPrototypeBlueprintMapping(ArrayList<PortPrototypeBlueprintMapping> value) {
        this.portPrototypeBlueprintMapping = value;
    }
    
    
}