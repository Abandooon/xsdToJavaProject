package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class EcuCommPortInstances {

    
    
    protected ArrayList<FramePort> framePort;
    
    
    
    protected ArrayList<IPduPort> iPduPort;
    
    
    
    protected ArrayList<ISignalPort> iSignalPort;
    
    

    
    
    @XmlElement(name="FRAME-PORT")
    public ArrayList<FramePort> getFramePort() {
    return this.framePort;
}

    public void setFramePort(ArrayList<FramePort> value) {
        this.framePort = value;
    }
    
    
    
    @XmlElement(name="I-PDU-PORT")
    public ArrayList<IPduPort> getIPduPort() {
    return this.iPduPort;
}

    public void setIPduPort(ArrayList<IPduPort> value) {
        this.iPduPort = value;
    }
    
    
    
    @XmlElement(name="I-SIGNAL-PORT")
    public ArrayList<ISignalPort> getISignalPort() {
    return this.iSignalPort;
}

    public void setISignalPort(ArrayList<ISignalPort> value) {
        this.iSignalPort = value;
    }
    
    
}