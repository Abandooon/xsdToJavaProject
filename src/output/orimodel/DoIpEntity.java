package stdgui.data.model.orimodel;
@XmlRootElement(name = "DO-IP-ENTITY")
public class DoIpEntity {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DoIpEntityRoleEnum doIpEntityRole;
    
    

    
    
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
    
    
    
    @XmlElement(name="DO-IP-ENTITY-ROLE")
    public DoIpEntityRoleEnum getDoIpEntityRole() {
    return this.doIpEntityRole;
}

    public void setDoIpEntityRole(DoIpEntityRoleEnum value) {
        this.doIpEntityRole = value;
    }
    
    
}