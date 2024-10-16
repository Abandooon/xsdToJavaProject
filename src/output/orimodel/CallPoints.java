package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CallPoints {

    
    
    protected ArrayList<BswAsynchronousServerCallPoint> bswAsynchronousServerCallPoint;
    
    
    
    protected ArrayList<BswAsynchronousServerCallResultPoint> bswAsynchronousServerCallResultPoint;
    
    
    
    protected ArrayList<BswDirectCallPoint> bswDirectCallPoint;
    
    
    
    protected ArrayList<BswSynchronousServerCallPoint> bswSynchronousServerCallPoint;
    
    

    
    
    @XmlElement(name="BSW-ASYNCHRONOUS-SERVER-CALL-POINT")
    public ArrayList<BswAsynchronousServerCallPoint> getBswAsynchronousServerCallPoint() {
    return this.bswAsynchronousServerCallPoint;
}

    public void setBswAsynchronousServerCallPoint(ArrayList<BswAsynchronousServerCallPoint> value) {
        this.bswAsynchronousServerCallPoint = value;
    }
    
    
    
    @XmlElement(name="BSW-ASYNCHRONOUS-SERVER-CALL-RESULT-POINT")
    public ArrayList<BswAsynchronousServerCallResultPoint> getBswAsynchronousServerCallResultPoint() {
    return this.bswAsynchronousServerCallResultPoint;
}

    public void setBswAsynchronousServerCallResultPoint(ArrayList<BswAsynchronousServerCallResultPoint> value) {
        this.bswAsynchronousServerCallResultPoint = value;
    }
    
    
    
    @XmlElement(name="BSW-DIRECT-CALL-POINT")
    public ArrayList<BswDirectCallPoint> getBswDirectCallPoint() {
    return this.bswDirectCallPoint;
}

    public void setBswDirectCallPoint(ArrayList<BswDirectCallPoint> value) {
        this.bswDirectCallPoint = value;
    }
    
    
    
    @XmlElement(name="BSW-SYNCHRONOUS-SERVER-CALL-POINT")
    public ArrayList<BswSynchronousServerCallPoint> getBswSynchronousServerCallPoint() {
    return this.bswSynchronousServerCallPoint;
}

    public void setBswSynchronousServerCallPoint(ArrayList<BswSynchronousServerCallPoint> value) {
        this.bswSynchronousServerCallPoint = value;
    }
    
    
}