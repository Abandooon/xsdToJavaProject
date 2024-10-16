package stdgui.data.model.orimodel;
@XmlRootElement(name = "MSR-QUERY-P-2")
public class MsrQueryP2 {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MsrQueryProps msrQueryProps;
    
    
    
    protected DocumentationBlock msrQueryResultP2;
    
    

    
    
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
    
    
    
    @XmlElement(name="MSR-QUERY-PROPS")
    public MsrQueryProps getMsrQueryProps() {
    return this.msrQueryProps;
}

    public void setMsrQueryProps(MsrQueryProps value) {
        this.msrQueryProps = value;
    }
    
    
    
    @XmlElement(name="MSR-QUERY-RESULT-P-2")
    public DocumentationBlock getMsrQueryResultP2() {
    return this.msrQueryResultP2;
}

    public void setMsrQueryResultP2(DocumentationBlock value) {
        this.msrQueryResultP2 = value;
    }
    
    
}