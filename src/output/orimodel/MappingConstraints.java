package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class MappingConstraints {

    
    
    protected ArrayList<ComponentClustering> componentClustering;
    
    
    
    protected ArrayList<ComponentSeparation> componentSeparation;
    
    
    
    protected ArrayList<SwcToEcuMappingConstraint> swcToEcuMappingConstraint;
    
    

    
    
    @XmlElement(name="COMPONENT-CLUSTERING")
    public ArrayList<ComponentClustering> getComponentClustering() {
    return this.componentClustering;
}

    public void setComponentClustering(ArrayList<ComponentClustering> value) {
        this.componentClustering = value;
    }
    
    
    
    @XmlElement(name="COMPONENT-SEPARATION")
    public ArrayList<ComponentSeparation> getComponentSeparation() {
    return this.componentSeparation;
}

    public void setComponentSeparation(ArrayList<ComponentSeparation> value) {
        this.componentSeparation = value;
    }
    
    
    
    @XmlElement(name="SWC-TO-ECU-MAPPING-CONSTRAINT")
    public ArrayList<SwcToEcuMappingConstraint> getSwcToEcuMappingConstraint() {
    return this.swcToEcuMappingConstraint;
}

    public void setSwcToEcuMappingConstraint(ArrayList<SwcToEcuMappingConstraint> value) {
        this.swcToEcuMappingConstraint = value;
    }
    
    
}