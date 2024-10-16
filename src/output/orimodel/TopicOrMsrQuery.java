package stdgui.data.model.orimodel;
@XmlRootElement(name = "TOPIC-OR-MSR-QUERY")
public class TopicOrMsrQuery {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Topic1> topic1;
    
    
    
    protected ArrayList<MsrQueryTopic1> msrQueryTopic1;
    
    

    
    
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
    
    
    
    @XmlElement(name="MSR-QUERY-TOPIC-1")
    public ArrayList<MsrQueryTopic1> getMsrQueryTopic1() {
    return this.msrQueryTopic1;
}

    public void setMsrQueryTopic1(ArrayList<MsrQueryTopic1> value) {
        this.msrQueryTopic1 = value;
    }
    
    
}