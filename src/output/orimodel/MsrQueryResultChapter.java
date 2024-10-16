package stdgui.data.model.orimodel;
@XmlRootElement(name = "MSR-QUERY-RESULT-CHAPTER")
public class MsrQueryResultChapter {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Chapter> chapter;
    
    

    
    
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
    
    
    
    @XmlElement(name="CHAPTER")
    public ArrayList<Chapter> getChapter() {
    return this.chapter;
}

    public void setChapter(ArrayList<Chapter> value) {
        this.chapter = value;
    }
    
    
}