package stdgui.data.model.orimodel;
@XmlRootElement(name = "CHAPTER-MODEL")
public class ChapterModel {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Prms> prms;
    
    
    
    protected ArrayList<MsrQueryP1> msrQueryP1;
    
    
    
    protected ArrayList<Topic1> topic1;
    
    
    
    protected ArrayList<MsrQueryTopic1> msrQueryTopic1;
    
    
    
    protected ArrayList<Chapter> chapter;
    
    
    
    protected ArrayList<MsrQueryChapter> msrQueryChapter;
    
    

    
    
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
    
    
    
    @XmlElement(name="PRMS")
    public ArrayList<Prms> getPrms() {
    return this.prms;
}

    public void setPrms(ArrayList<Prms> value) {
        this.prms = value;
    }
    
    
    
    @XmlElement(name="MSR-QUERY-P-1")
    public ArrayList<MsrQueryP1> getMsrQueryP1() {
    return this.msrQueryP1;
}

    public void setMsrQueryP1(ArrayList<MsrQueryP1> value) {
        this.msrQueryP1 = value;
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
    
    
    
    @XmlElement(name="CHAPTER")
    public ArrayList<Chapter> getChapter() {
    return this.chapter;
}

    public void setChapter(ArrayList<Chapter> value) {
        this.chapter = value;
    }
    
    
    
    @XmlElement(name="MSR-QUERY-CHAPTER")
    public ArrayList<MsrQueryChapter> getMsrQueryChapter() {
    return this.msrQueryChapter;
}

    public void setMsrQueryChapter(ArrayList<MsrQueryChapter> value) {
        this.msrQueryChapter = value;
    }
    
    
}