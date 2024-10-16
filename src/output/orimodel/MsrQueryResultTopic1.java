package stdgui.data.model.orimodel;
@XmlRootElement(name = "MSR-QUERY-RESULT-TOPIC-1")
public class MsrQueryResultTopic1 {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Topic1> topic1;
    
    

    
    
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
    
    
    
    @XmlElement(name="TOPIC-1")
    public ArrayList<Topic1> getTopic1() {
    return this.topic1;
}

    public void setTopic1(ArrayList<Topic1> value) {
        this.topic1 = value;
    }
    
    
}