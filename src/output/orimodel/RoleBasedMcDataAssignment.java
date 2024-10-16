package stdgui.data.model.orimodel;
@XmlRootElement(name = "ROLE-BASED-MC-DATA-ASSIGNMENT")
public class RoleBasedMcDataAssignment {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<McDataInstanceRef> mcDataInstanceRefs;
    
    
    
    protected Identifier role;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="MC-DATA-INSTANCE-REFS")
@XmlElement(name="MC-DATA-INSTANCE-REF")
    public ArrayList<McDataInstanceRef> getMcDataInstanceRefs() {
    return this.mcDataInstanceRefs;
}

    public void setMcDataInstanceRefs(ArrayList<McDataInstanceRef> value) {
        this.mcDataInstanceRefs = value;
    }
    
    
    
    @XmlElement(name="ROLE")
    public Identifier getRole() {
    return this.role;
}

    public void setRole(Identifier value) {
        this.role = value;
    }
    
    
}