package stdgui.data.model.orimodel;
@XmlRootElement(name = "FLEXRAY-NM-NODE")
public class FlexrayNmNode {

    
    
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
    
    
    
    protected ControllerRef controllerRef;
    
    
    
    protected PositiveInteger nmCoordCluster;
    
    
    
    protected NmCoordinatorRoleEnum nmCoordinatorRole;
    
    
    
    protected NmIfEcuRef nmIfEcuRef;
    
    
    
    protected Integer nmNodeId;
    
    
    
    protected Boolean nmPassiveModeEnabled;
    
    
    
    protected ArrayList<RxNmPduRef> rxNmPduRefs;
    
    
    
    protected ArrayList<TxNmPduRef> txNmPduRefs;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected PositiveInteger nmInstanceId;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTROLLER-REF")
    public ControllerRef getControllerRef() {
    return this.controllerRef;
}

    public void setControllerRef(ControllerRef value) {
        this.controllerRef = value;
    }
    
    
    
    @XmlElement(name="NM-COORD-CLUSTER")
    public PositiveInteger getNmCoordCluster() {
    return this.nmCoordCluster;
}

    public void setNmCoordCluster(PositiveInteger value) {
        this.nmCoordCluster = value;
    }
    
    
    
    @XmlElement(name="NM-COORDINATOR-ROLE")
    public NmCoordinatorRoleEnum getNmCoordinatorRole() {
    return this.nmCoordinatorRole;
}

    public void setNmCoordinatorRole(NmCoordinatorRoleEnum value) {
        this.nmCoordinatorRole = value;
    }
    
    
    
    @XmlElement(name="NM-IF-ECU-REF")
    public NmIfEcuRef getNmIfEcuRef() {
    return this.nmIfEcuRef;
}

    public void setNmIfEcuRef(NmIfEcuRef value) {
        this.nmIfEcuRef = value;
    }
    
    
    
    @XmlElement(name="NM-NODE-ID")
    public Integer getNmNodeId() {
    return this.nmNodeId;
}

    public void setNmNodeId(Integer value) {
        this.nmNodeId = value;
    }
    
    
    
    @XmlElement(name="NM-PASSIVE-MODE-ENABLED")
    public Boolean getNmPassiveModeEnabled() {
    return this.nmPassiveModeEnabled;
}

    public void setNmPassiveModeEnabled(Boolean value) {
        this.nmPassiveModeEnabled = value;
    }
    
    
    
    @XmlElementWrapper(name="RX-NM-PDU-REFS")
@XmlElement(name="RX-NM-PDU-REF")
    public ArrayList<RxNmPduRef> getRxNmPduRefs() {
    return this.rxNmPduRefs;
}

    public void setRxNmPduRefs(ArrayList<RxNmPduRef> value) {
        this.rxNmPduRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="TX-NM-PDU-REFS")
@XmlElement(name="TX-NM-PDU-REF")
    public ArrayList<TxNmPduRef> getTxNmPduRefs() {
    return this.txNmPduRefs;
}

    public void setTxNmPduRefs(ArrayList<TxNmPduRef> value) {
        this.txNmPduRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="NM-INSTANCE-ID")
    public PositiveInteger getNmInstanceId() {
    return this.nmInstanceId;
}

    public void setNmInstanceId(PositiveInteger value) {
        this.nmInstanceId = value;
    }
    
    
}