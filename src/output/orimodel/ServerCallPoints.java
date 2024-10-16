package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ServerCallPoints {

    
    
    protected ArrayList<AsynchronousServerCallPoint> asynchronousServerCallPoint;
    
    
    
    protected ArrayList<SynchronousServerCallPoint> synchronousServerCallPoint;
    
    

    
    
    @XmlElement(name="ASYNCHRONOUS-SERVER-CALL-POINT")
    public ArrayList<AsynchronousServerCallPoint> getAsynchronousServerCallPoint() {
    return this.asynchronousServerCallPoint;
}

    public void setAsynchronousServerCallPoint(ArrayList<AsynchronousServerCallPoint> value) {
        this.asynchronousServerCallPoint = value;
    }
    
    
    
    @XmlElement(name="SYNCHRONOUS-SERVER-CALL-POINT")
    public ArrayList<SynchronousServerCallPoint> getSynchronousServerCallPoint() {
    return this.synchronousServerCallPoint;
}

    public void setSynchronousServerCallPoint(ArrayList<SynchronousServerCallPoint> value) {
        this.synchronousServerCallPoint = value;
    }
    
    
}