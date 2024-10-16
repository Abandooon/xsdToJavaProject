package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class Entitys {

    
    
    protected ArrayList<BswCalledEntity> bswCalledEntity;
    
    
    
    protected ArrayList<BswInterruptEntity> bswInterruptEntity;
    
    
    
    protected ArrayList<BswSchedulableEntity> bswSchedulableEntity;
    
    

    
    
    @XmlElement(name="BSW-CALLED-ENTITY")
    public ArrayList<BswCalledEntity> getBswCalledEntity() {
    return this.bswCalledEntity;
}

    public void setBswCalledEntity(ArrayList<BswCalledEntity> value) {
        this.bswCalledEntity = value;
    }
    
    
    
    @XmlElement(name="BSW-INTERRUPT-ENTITY")
    public ArrayList<BswInterruptEntity> getBswInterruptEntity() {
    return this.bswInterruptEntity;
}

    public void setBswInterruptEntity(ArrayList<BswInterruptEntity> value) {
        this.bswInterruptEntity = value;
    }
    
    
    
    @XmlElement(name="BSW-SCHEDULABLE-ENTITY")
    public ArrayList<BswSchedulableEntity> getBswSchedulableEntity() {
    return this.bswSchedulableEntity;
}

    public void setBswSchedulableEntity(ArrayList<BswSchedulableEntity> value) {
        this.bswSchedulableEntity = value;
    }
    
    
}