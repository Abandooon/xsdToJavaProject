package stdgui.data.model.orimodel;
@XmlRootElement(name = "RUNNABLE-ENTITY-ARGUMENT")
public class RunnableEntityArgument {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CIdentifier symbol;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
    return this.s;
}

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
    return this.t;
}

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="SYMBOL")
    public CIdentifier getSymbol() {
    return this.symbol;
}

    public void setSymbol(CIdentifier value) {
        this.symbol = value;
    }
    
    
}