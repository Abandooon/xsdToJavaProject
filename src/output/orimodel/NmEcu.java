package stdgui.data.model.orimodel;
@XmlRootElement(name = "NM-ECU")
public class NmEcu {

    
    
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
    
    
    
    protected BusDependentNmEcus busDependentNmEcus;
    
    
    
    protected BusSpecificNmEcu busSpecificNmEcu;
    
    
    
    protected EcuInstanceRef ecuInstanceRef;
    
    
    
    protected Boolean nmBusSynchronizationEnabled;
    
    
    
    protected Boolean nmComControlEnabled;
    
    
    
    protected NmCoordinator nmCoordinator;
    
    
    
    protected TimeValue nmCycletimeMainFunction;
    
    
    
    protected Boolean nmMultipleChannelsEnabled;
    
    
    
    protected Boolean nmNodeDetectionEnabled;
    
    
    
    protected Boolean nmNodeIdEnabled;
    
    
    
    protected Boolean nmPassiveModeEnabled;
    
    
    
    protected Boolean nmPduRxIndicationEnabled;
    
    
    
    protected Boolean nmRemoteSleepIndEnabled;
    
    
    
    protected Boolean nmRepeatMsgIndEnabled;
    
    
    
    protected Boolean nmStateChangeIndEnabled;
    
    
    
    protected Boolean nmUserDataEnabled;
    
    
    
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
    
    
    
    @XmlElement(name="BUS-DEPENDENT-NM-ECUS")
    public BusDependentNmEcus getBusDependentNmEcus() {
    return this.busDependentNmEcus;
}

    public void setBusDependentNmEcus(BusDependentNmEcus value) {
        this.busDependentNmEcus = value;
    }
    
    
    
    @XmlElement(name="BUS-SPECIFIC-NM-ECU")
    public BusSpecificNmEcu getBusSpecificNmEcu() {
    return this.busSpecificNmEcu;
}

    public void setBusSpecificNmEcu(BusSpecificNmEcu value) {
        this.busSpecificNmEcu = value;
    }
    
    
    
    @XmlElement(name="ECU-INSTANCE-REF")
    public EcuInstanceRef getEcuInstanceRef() {
    return this.ecuInstanceRef;
}

    public void setEcuInstanceRef(EcuInstanceRef value) {
        this.ecuInstanceRef = value;
    }
    
    
    
    @XmlElement(name="NM-BUS-SYNCHRONIZATION-ENABLED")
    public Boolean getNmBusSynchronizationEnabled() {
    return this.nmBusSynchronizationEnabled;
}

    public void setNmBusSynchronizationEnabled(Boolean value) {
        this.nmBusSynchronizationEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-COM-CONTROL-ENABLED")
    public Boolean getNmComControlEnabled() {
    return this.nmComControlEnabled;
}

    public void setNmComControlEnabled(Boolean value) {
        this.nmComControlEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-COORDINATOR")
    public NmCoordinator getNmCoordinator() {
    return this.nmCoordinator;
}

    public void setNmCoordinator(NmCoordinator value) {
        this.nmCoordinator = value;
    }
    
    
    
    @XmlElement(name="NM-CYCLETIME-MAIN-FUNCTION")
    public TimeValue getNmCycletimeMainFunction() {
    return this.nmCycletimeMainFunction;
}

    public void setNmCycletimeMainFunction(TimeValue value) {
        this.nmCycletimeMainFunction = value;
    }
    
    
    
    @XmlElement(name="NM-MULTIPLE-CHANNELS-ENABLED")
    public Boolean getNmMultipleChannelsEnabled() {
    return this.nmMultipleChannelsEnabled;
}

    public void setNmMultipleChannelsEnabled(Boolean value) {
        this.nmMultipleChannelsEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-NODE-DETECTION-ENABLED")
    public Boolean getNmNodeDetectionEnabled() {
    return this.nmNodeDetectionEnabled;
}

    public void setNmNodeDetectionEnabled(Boolean value) {
        this.nmNodeDetectionEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-NODE-ID-ENABLED")
    public Boolean getNmNodeIdEnabled() {
    return this.nmNodeIdEnabled;
}

    public void setNmNodeIdEnabled(Boolean value) {
        this.nmNodeIdEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-PASSIVE-MODE-ENABLED")
    public Boolean getNmPassiveModeEnabled() {
    return this.nmPassiveModeEnabled;
}

    public void setNmPassiveModeEnabled(Boolean value) {
        this.nmPassiveModeEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-PDU-RX-INDICATION-ENABLED")
    public Boolean getNmPduRxIndicationEnabled() {
    return this.nmPduRxIndicationEnabled;
}

    public void setNmPduRxIndicationEnabled(Boolean value) {
        this.nmPduRxIndicationEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-REMOTE-SLEEP-IND-ENABLED")
    public Boolean getNmRemoteSleepIndEnabled() {
    return this.nmRemoteSleepIndEnabled;
}

    public void setNmRemoteSleepIndEnabled(Boolean value) {
        this.nmRemoteSleepIndEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-REPEAT-MSG-IND-ENABLED")
    public Boolean getNmRepeatMsgIndEnabled() {
    return this.nmRepeatMsgIndEnabled;
}

    public void setNmRepeatMsgIndEnabled(Boolean value) {
        this.nmRepeatMsgIndEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-STATE-CHANGE-IND-ENABLED")
    public Boolean getNmStateChangeIndEnabled() {
    return this.nmStateChangeIndEnabled;
}

    public void setNmStateChangeIndEnabled(Boolean value) {
        this.nmStateChangeIndEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-USER-DATA-ENABLED")
    public Boolean getNmUserDataEnabled() {
    return this.nmUserDataEnabled;
}

    public void setNmUserDataEnabled(Boolean value) {
        this.nmUserDataEnabled = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}