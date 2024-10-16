package stdgui.data.model.orimodel;
@XmlRootElement(name = "ACL-PERMISSION")
public class AclPermission {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ArrayList<Annotation> annotations;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected BlueprintPolicys blueprintPolicys;
    
    
    
    protected String shortNamePattern;
    
    
    
    protected ArrayList<NmtokenString> aclContexts;
    
    
    
    protected ArrayList<AclObjectRef> aclObjectRefs;
    
    
    
    protected ArrayList<AclOperationRef> aclOperationRefs;
    
    
    
    protected ArrayList<AclRoleRef> aclRoleRefs;
    
    
    
    protected AclScopeEnum aclScope;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="UUID")
    public java.lang.String getUuid() {
    return this.uuid;
}

    public void setUuid(java.lang.String value) {
        this.uuid = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
    return this.shortName;
}

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElementWrapper(name="SHORT-NAME-FRAGMENTS")
@XmlElement(name="SHORT-NAME-FRAGMENT")
    public ArrayList<ShortNameFragment> getShortNameFragments() {
    return this.shortNameFragments;
}

    public void setShortNameFragments(ArrayList<ShortNameFragment> value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElement(name="LONG-NAME")
    public MultilanguageLongName getLongName() {
    return this.longName;
}

    public void setLongName(MultilanguageLongName value) {
        this.longName = value;
    }
    
    
    
    @XmlElement(name="DESC")
    public MultiLanguageOverviewParagraph getDesc() {
    return this.desc;
}

    public void setDesc(MultiLanguageOverviewParagraph value) {
        this.desc = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public CategoryString getCategory() {
    return this.category;
}

    public void setCategory(CategoryString value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="ADMIN-DATA")
    public AdminData getAdminData() {
    return this.adminData;
}

    public void setAdminData(AdminData value) {
        this.adminData = value;
    }
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
    return this.introduction;
}

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElementWrapper(name="ANNOTATIONS")
@XmlElement(name="ANNOTATION")
    public ArrayList<Annotation> getAnnotations() {
    return this.annotations;
}

    public void setAnnotations(ArrayList<Annotation> value) {
        this.annotations = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="BLUEPRINT-POLICYS")
    public BlueprintPolicys getBlueprintPolicys() {
    return this.blueprintPolicys;
}

    public void setBlueprintPolicys(BlueprintPolicys value) {
        this.blueprintPolicys = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME-PATTERN")
    public String getShortNamePattern() {
    return this.shortNamePattern;
}

    public void setShortNamePattern(String value) {
        this.shortNamePattern = value;
    }
    
    
    
    @XmlElementWrapper(name="ACL-CONTEXTS")
@XmlElement(name="ACL-CONTEXT")
    public ArrayList<NmtokenString> getAclContexts() {
    return this.aclContexts;
}

    public void setAclContexts(ArrayList<NmtokenString> value) {
        this.aclContexts = value;
    }
    
    
    
    @XmlElementWrapper(name="ACL-OBJECT-REFS")
@XmlElement(name="ACL-OBJECT-REF")
    public ArrayList<AclObjectRef> getAclObjectRefs() {
    return this.aclObjectRefs;
}

    public void setAclObjectRefs(ArrayList<AclObjectRef> value) {
        this.aclObjectRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="ACL-OPERATION-REFS")
@XmlElement(name="ACL-OPERATION-REF")
    public ArrayList<AclOperationRef> getAclOperationRefs() {
    return this.aclOperationRefs;
}

    public void setAclOperationRefs(ArrayList<AclOperationRef> value) {
        this.aclOperationRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="ACL-ROLE-REFS")
@XmlElement(name="ACL-ROLE-REF")
    public ArrayList<AclRoleRef> getAclRoleRefs() {
    return this.aclRoleRefs;
}

    public void setAclRoleRefs(ArrayList<AclRoleRef> value) {
        this.aclRoleRefs = value;
    }
    
    
    
    @XmlElement(name="ACL-SCOPE")
    public AclScopeEnum getAclScope() {
    return this.aclScope;
}

    public void setAclScope(AclScopeEnum value) {
        this.aclScope = value;
    }
    
    
}