package stdgui.data.model.orimodel;
@XmlRootElement(name = "J-1939-NODE-NAME")
public class J1939NodeName {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean arbitraryAddressCapable;
    
    
    
    protected Integer ecuInstance;
    
    
    
    protected Integer function;
    
    
    
    protected Integer functionInstance;
    
    
    
    protected Integer identitiyNumber;
    
    
    
    protected Integer industryGroup;
    
    
    
    protected Integer manufacturerCode;
    
    
    
    protected Integer vehicleSystem;
    
    
    
    protected Integer vehicleSystemInstance;
    
    

    
    
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
    
    
    
    @XmlElement(name="ARBITRARY-ADDRESS-CAPABLE")
    public Boolean getArbitraryAddressCapable() {
    return this.arbitraryAddressCapable;
}

    public void setArbitraryAddressCapable(Boolean value) {
        this.arbitraryAddressCapable = value;
    }
    
    
    
    @XmlElement(name="ECU-INSTANCE")
    public Integer getEcuInstance() {
    return this.ecuInstance;
}

    public void setEcuInstance(Integer value) {
        this.ecuInstance = value;
    }
    
    
    
    @XmlElement(name="FUNCTION")
    public Integer getFunction() {
    return this.function;
}

    public void setFunction(Integer value) {
        this.function = value;
    }
    
    
    
    @XmlElement(name="FUNCTION-INSTANCE")
    public Integer getFunctionInstance() {
    return this.functionInstance;
}

    public void setFunctionInstance(Integer value) {
        this.functionInstance = value;
    }
    
    
    
    @XmlElement(name="IDENTITIY-NUMBER")
    public Integer getIdentitiyNumber() {
    return this.identitiyNumber;
}

    public void setIdentitiyNumber(Integer value) {
        this.identitiyNumber = value;
    }
    
    
    
    @XmlElement(name="INDUSTRY-GROUP")
    public Integer getIndustryGroup() {
    return this.industryGroup;
}

    public void setIndustryGroup(Integer value) {
        this.industryGroup = value;
    }
    
    
    
    @XmlElement(name="MANUFACTURER-CODE")
    public Integer getManufacturerCode() {
    return this.manufacturerCode;
}

    public void setManufacturerCode(Integer value) {
        this.manufacturerCode = value;
    }
    
    
    
    @XmlElement(name="VEHICLE-SYSTEM")
    public Integer getVehicleSystem() {
    return this.vehicleSystem;
}

    public void setVehicleSystem(Integer value) {
        this.vehicleSystem = value;
    }
    
    
    
    @XmlElement(name="VEHICLE-SYSTEM-INSTANCE")
    public Integer getVehicleSystemInstance() {
    return this.vehicleSystemInstance;
}

    public void setVehicleSystemInstance(Integer value) {
        this.vehicleSystemInstance = value;
    }
    
    
}