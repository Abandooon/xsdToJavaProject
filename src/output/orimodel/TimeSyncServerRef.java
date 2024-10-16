package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TimeSyncServerRef extends Ref {

    
    
    protected TimeSyncServerConfigurationSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public TimeSyncServerConfigurationSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(TimeSyncServerConfigurationSubtypesEnum value) {
        this.dest = value;
    }
    
    
}