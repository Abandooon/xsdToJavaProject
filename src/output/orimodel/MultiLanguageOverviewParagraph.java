package stdgui.data.model.orimodel;
@XmlRootElement(name = "MULTI-LANGUAGE-OVERVIEW-PARAGRAPH")
public class MultiLanguageOverviewParagraph {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<LOverviewParagraph> l2;
    
    

    
    
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
    
    
    
    @XmlElement(name="L-2")
    public ArrayList<LOverviewParagraph> getL2() {
    return this.l2;
}

    public void setL2(ArrayList<LOverviewParagraph> value) {
        this.l2 = value;
    }
    
    
}