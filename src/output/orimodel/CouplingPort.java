package stdgui.data.model.orimodel;
@XmlRootElement(name = "COUPLING-PORT")
public class CouplingPort {

    
    
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
    
    
    
    protected EthernetConnectionNegotiationEnum connectionNegotiationBehavior;
    
    
    
    protected CouplingPortDetails couplingPortDetails;
    
    
    
    protected PositiveInteger couplingPortSpeed;
    
    
    
    protected DefaultVlanRef defaultVlanRef;
    
    
    
    protected ArrayList<MacMulticastAddressRef> macMulticastAddressRefs;
    
    
    
    protected EthernetPhysicalLayerTypeEnum physicalLayerType;
    
    
    
    protected ArrayList<VlanMembership> vlanMemberships;
    
    
    
    protected VlanModifierRef vlanModifierRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONNECTION-NEGOTIATION-BEHAVIOR")
    public EthernetConnectionNegotiationEnum getConnectionNegotiationBehavior() {
    return this.connectionNegotiationBehavior;
}

    public void setConnectionNegotiationBehavior(EthernetConnectionNegotiationEnum value) {
        this.connectionNegotiationBehavior = value;
    }
    
    
    
    @XmlElement(name="COUPLING-PORT-DETAILS")
    public CouplingPortDetails getCouplingPortDetails() {
    return this.couplingPortDetails;
}

    public void setCouplingPortDetails(CouplingPortDetails value) {
        this.couplingPortDetails = value;
    }
    
    
    
    @XmlElement(name="COUPLING-PORT-SPEED")
    public PositiveInteger getCouplingPortSpeed() {
    return this.couplingPortSpeed;
}

    public void setCouplingPortSpeed(PositiveInteger value) {
        this.couplingPortSpeed = value;
    }
    
    
    
    @XmlElement(name="DEFAULT-VLAN-REF")
    public DefaultVlanRef getDefaultVlanRef() {
    return this.defaultVlanRef;
}

    public void setDefaultVlanRef(DefaultVlanRef value) {
        this.defaultVlanRef = value;
    }
    
    
    
    @XmlElementWrapper(name="MAC-MULTICAST-ADDRESS-REFS")
@XmlElement(name="MAC-MULTICAST-ADDRESS-REF")
    public ArrayList<MacMulticastAddressRef> getMacMulticastAddressRefs() {
    return this.macMulticastAddressRefs;
}

    public void setMacMulticastAddressRefs(ArrayList<MacMulticastAddressRef> value) {
        this.macMulticastAddressRefs = value;
    }
    
    
    
    @XmlElement(name="PHYSICAL-LAYER-TYPE")
    public EthernetPhysicalLayerTypeEnum getPhysicalLayerType() {
    return this.physicalLayerType;
}

    public void setPhysicalLayerType(EthernetPhysicalLayerTypeEnum value) {
        this.physicalLayerType = value;
    }
    
    
    
    @XmlElementWrapper(name="VLAN-MEMBERSHIPS")
@XmlElement(name="VLAN-MEMBERSHIP")
    public ArrayList<VlanMembership> getVlanMemberships() {
    return this.vlanMemberships;
}

    public void setVlanMemberships(ArrayList<VlanMembership> value) {
        this.vlanMemberships = value;
    }
    
    
    
    @XmlElement(name="VLAN-MODIFIER-REF")
    public VlanModifierRef getVlanModifierRef() {
    return this.vlanModifierRef;
}

    public void setVlanModifierRef(VlanModifierRef value) {
        this.vlanModifierRef = value;
    }
    
    
}