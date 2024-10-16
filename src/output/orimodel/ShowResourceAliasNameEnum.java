package stdgui.data.model.orimodel;
@XmlRootElement(name = "SHOW-RESOURCE-ALIAS-NAME-ENUM")
public class ShowResourceAliasNameEnum {

    
    
    protected ShowResourceAliasNameEnumSimple value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    

    
    
    @XmlValue
    public ShowResourceAliasNameEnumSimple getValue() {
    return this.value;
}

    public void setValue(ShowResourceAliasNameEnumSimple value) {
        this.value = value;
    }
    
    
    
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
    
    
}