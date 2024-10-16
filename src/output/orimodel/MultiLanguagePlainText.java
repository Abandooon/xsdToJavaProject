package stdgui.data.model.orimodel;
@XmlRootElement(name = "MULTI-LANGUAGE-PLAIN-TEXT")
public class MultiLanguagePlainText {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<LPlainText> l10;
    
    

    
    
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
    
    
    
    @XmlElement(name="L-10")
    public ArrayList<LPlainText> getL10() {
    return this.l10;
}

    public void setL10(ArrayList<LPlainText> value) {
        this.l10 = value;
    }
    
    
}