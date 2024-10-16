package stdgui.data.model.orimodel;
@XmlRootElement(name = "BSW-SERVICE-DEPENDENCY")
public class BswServiceDependency {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<RoleBasedDataTypeAssignment> assignedDataTypes;
    
    
    
    protected SymbolicNameProps symbolicNameProps;
    
    
    
    protected BswServiceDependencyIdent ident;
    
    
    
    protected ArrayList<RoleBasedDataAssignment> assignedDatas;
    
    
    
    protected ArrayList<RoleBasedBswModuleEntryAssignment> assignedEntryRoles;
    
    
    
    protected ServiceNeeds serviceNeeds;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="ASSIGNED-DATA-TYPES")
@XmlElement(name="ROLE-BASED-DATA-TYPE-ASSIGNMENT")
    public ArrayList<RoleBasedDataTypeAssignment> getAssignedDataTypes() {
    return this.assignedDataTypes;
}

    public void setAssignedDataTypes(ArrayList<RoleBasedDataTypeAssignment> value) {
        this.assignedDataTypes = value;
    }
    
    
    
    @XmlElement(name="SYMBOLIC-NAME-PROPS")
    public SymbolicNameProps getSymbolicNameProps() {
    return this.symbolicNameProps;
}

    public void setSymbolicNameProps(SymbolicNameProps value) {
        this.symbolicNameProps = value;
    }
    
    
    
    @XmlElement(name="IDENT")
    public BswServiceDependencyIdent getIdent() {
    return this.ident;
}

    public void setIdent(BswServiceDependencyIdent value) {
        this.ident = value;
    }
    
    
    
    @XmlElementWrapper(name="ASSIGNED-DATAS")
@XmlElement(name="ROLE-BASED-DATA-ASSIGNMENT")
    public ArrayList<RoleBasedDataAssignment> getAssignedDatas() {
    return this.assignedDatas;
}

    public void setAssignedDatas(ArrayList<RoleBasedDataAssignment> value) {
        this.assignedDatas = value;
    }
    
    
    
    @XmlElementWrapper(name="ASSIGNED-ENTRY-ROLES")
@XmlElement(name="ROLE-BASED-BSW-MODULE-ENTRY-ASSIGNMENT")
    public ArrayList<RoleBasedBswModuleEntryAssignment> getAssignedEntryRoles() {
    return this.assignedEntryRoles;
}

    public void setAssignedEntryRoles(ArrayList<RoleBasedBswModuleEntryAssignment> value) {
        this.assignedEntryRoles = value;
    }
    
    
    
    @XmlElement(name="SERVICE-NEEDS")
    public ServiceNeeds getServiceNeeds() {
    return this.serviceNeeds;
}

    public void setServiceNeeds(ServiceNeeds value) {
        this.serviceNeeds = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}