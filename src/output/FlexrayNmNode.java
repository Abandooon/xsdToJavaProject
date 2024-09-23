package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class FlexrayNmNode {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected Annotations annotations;
    
    
    
    protected ControllerRef controllerRef;
    
    
    
    protected PositiveInteger nmCoordCluster;
    
    
    
    protected NmCoordinatorRoleEnum nmCoordinatorRole;
    
    
    
    protected NmIfEcuRef nmIfEcuRef;
    
    
    
    protected Integer nmNodeId;
    
    
    
    protected Boolean nmPassiveModeEnabled;
    
    
    
    protected RxNmPduRefs rxNmPduRefs;
    
    
    
    protected TxNmPduRefs txNmPduRefs;
    
    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME-FRAGMENTS")
    public ShortNameFragments getShortNameFragments() {
        return this.shortNameFragments;
    }

    public void setShortNameFragments(ShortNameFragments value) {
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
    
    
    
    @XmlElement(name="ANNOTATIONS")
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Annotations value) {
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
    
    
    
    @XmlElement(name="RX-NM-PDU-REFS")
    public RxNmPduRefs getRxNmPduRefs() {
        return this.rxNmPduRefs;
    }

    public void setRxNmPduRefs(RxNmPduRefs value) {
        this.rxNmPduRefs = value;
    }
    
    
    
    @XmlElement(name="TX-NM-PDU-REFS")
    public TxNmPduRefs getTxNmPduRefs() {
        return this.txNmPduRefs;
    }

    public void setTxNmPduRefs(TxNmPduRefs value) {
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