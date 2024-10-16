package stdgui.data.model.orimodel;
@XmlRootElement(name = "PRM-CHAR-TEXTUAL-CONTENTS")
public class PrmCharTextualContents {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected String text;
    
    

    
    
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
    
    
    
    @XmlElement(name="TEXT")
    public String getText() {
    return this.text;
}

    public void setText(String value) {
        this.text = value;
    }
    
    
}