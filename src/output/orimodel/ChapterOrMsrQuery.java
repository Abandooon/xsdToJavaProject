package stdgui.data.model.orimodel;
@XmlRootElement(name = "CHAPTER-OR-MSR-QUERY")
public class ChapterOrMsrQuery {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
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