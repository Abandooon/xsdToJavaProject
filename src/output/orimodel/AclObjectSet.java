package stdgui.data.model.orimodel;
@XmlRootElement(name = "ACL-OBJECT-SET")
public class AclObjectSet {

    
    
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
    
    
    
    protected ArrayList<ReferrableSubtypesEnum> aclObjectClasss;
    
    
    
    protected AclScopeEnum aclScope;
    
    
    
    protected CollectionRef collectionRef;
    
    
    
    protected ArrayList<DerivedFromBlueprintRef> derivedFromBlueprintRefs;
    
    
    
    protected ArrayList<AutosarEngineeringObject> engineeringObjects;
    
    
    
    protected ArrayList<ObjectDefinitionRef> objectDefinitionRefs;
    
    
    
    protected ArrayList<ObjectDefintionRef> objectDefintionRefs;
    
    
    
    protected ArrayList<ObjectRef> objectRefs;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="ACL-OBJECT-CLASSS")
@XmlElement(name="ACL-OBJECT-CLASS")
    public ArrayList<ReferrableSubtypesEnum> getAclObjectClasss() {
    return this.aclObjectClasss;
}

    public void setAclObjectClasss(ArrayList<ReferrableSubtypesEnum> value) {
        this.aclObjectClasss = value;
    }
    
    
    
    @XmlElement(name="ACL-SCOPE")
    public AclScopeEnum getAclScope() {
    return this.aclScope;
}

    public void setAclScope(AclScopeEnum value) {
        this.aclScope = value;
    }
    
    
    
    @XmlElement(name="COLLECTION-REF")
    public CollectionRef getCollectionRef() {
    return this.collectionRef;
}

    public void setCollectionRef(CollectionRef value) {
        this.collectionRef = value;
    }
    
    
    
    @XmlElementWrapper(name="DERIVED-FROM-BLUEPRINT-REFS")
@XmlElement(name="DERIVED-FROM-BLUEPRINT-REF")
    public ArrayList<DerivedFromBlueprintRef> getDerivedFromBlueprintRefs() {
    return this.derivedFromBlueprintRefs;
}

    public void setDerivedFromBlueprintRefs(ArrayList<DerivedFromBlueprintRef> value) {
        this.derivedFromBlueprintRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="ENGINEERING-OBJECTS")
@XmlElement(name="AUTOSAR-ENGINEERING-OBJECT")
    public ArrayList<AutosarEngineeringObject> getEngineeringObjects() {
    return this.engineeringObjects;
}

    public void setEngineeringObjects(ArrayList<AutosarEngineeringObject> value) {
        this.engineeringObjects = value;
    }
    
    
    
    @XmlElementWrapper(name="OBJECT-DEFINITION-REFS")
@XmlElement(name="OBJECT-DEFINITION-REF")
    public ArrayList<ObjectDefinitionRef> getObjectDefinitionRefs() {
    return this.objectDefinitionRefs;
}

    public void setObjectDefinitionRefs(ArrayList<ObjectDefinitionRef> value) {
        this.objectDefinitionRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="OBJECT-DEFINTION-REFS")
@XmlElement(name="OBJECT-DEFINTION-REF")
    public ArrayList<ObjectDefintionRef> getObjectDefintionRefs() {
    return this.objectDefintionRefs;
}

    public void setObjectDefintionRefs(ArrayList<ObjectDefintionRef> value) {
        this.objectDefintionRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="OBJECT-REFS")
@XmlElement(name="OBJECT-REF")
    public ArrayList<ObjectRef> getObjectRefs() {
    return this.objectRefs;
}

    public void setObjectRefs(ArrayList<ObjectRef> value) {
        this.objectRefs = value;
    }
    
    
}