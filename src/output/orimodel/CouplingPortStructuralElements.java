package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CouplingPortStructuralElements {

    
    
    protected ArrayList<CouplingPortFifo> couplingPortFifo;
    
    
    
    protected ArrayList<CouplingPortScheduler> couplingPortScheduler;
    
    
    
    protected ArrayList<CouplingPortShaper> couplingPortShaper;
    
    

    
    
    @XmlElement(name="COUPLING-PORT-FIFO")
    public ArrayList<CouplingPortFifo> getCouplingPortFifo() {
    return this.couplingPortFifo;
}

    public void setCouplingPortFifo(ArrayList<CouplingPortFifo> value) {
        this.couplingPortFifo = value;
    }
    
    
    
    @XmlElement(name="COUPLING-PORT-SCHEDULER")
    public ArrayList<CouplingPortScheduler> getCouplingPortScheduler() {
    return this.couplingPortScheduler;
}

    public void setCouplingPortScheduler(ArrayList<CouplingPortScheduler> value) {
        this.couplingPortScheduler = value;
    }
    
    
    
    @XmlElement(name="COUPLING-PORT-SHAPER")
    public ArrayList<CouplingPortShaper> getCouplingPortShaper() {
    return this.couplingPortShaper;
}

    public void setCouplingPortShaper(ArrayList<CouplingPortShaper> value) {
        this.couplingPortShaper = value;
    }
    
    
}