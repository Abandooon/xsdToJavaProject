package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class OrderedElements {

    
    
    protected ArrayList<EocEventRef> eocEventRef;
    
    
    
    protected ArrayList<EocExecutableEntityRef> eocExecutableEntityRef;
    
    
    
    protected ArrayList<EocExecutableEntityRefGroup> eocExecutableEntityRefGroup;
    
    

    
    
    @XmlElement(name="EOC-EVENT-REF")
    public ArrayList<EocEventRef> getEocEventRef() {
    return this.eocEventRef;
}

    public void setEocEventRef(ArrayList<EocEventRef> value) {
        this.eocEventRef = value;
    }
    
    
    
    @XmlElement(name="EOC-EXECUTABLE-ENTITY-REF")
    public ArrayList<EocExecutableEntityRef> getEocExecutableEntityRef() {
    return this.eocExecutableEntityRef;
}

    public void setEocExecutableEntityRef(ArrayList<EocExecutableEntityRef> value) {
        this.eocExecutableEntityRef = value;
    }
    
    
    
    @XmlElement(name="EOC-EXECUTABLE-ENTITY-REF-GROUP")
    public ArrayList<EocExecutableEntityRefGroup> getEocExecutableEntityRefGroup() {
    return this.eocExecutableEntityRefGroup;
}

    public void setEocExecutableEntityRefGroup(ArrayList<EocExecutableEntityRefGroup> value) {
        this.eocExecutableEntityRefGroup = value;
    }
    
    
}