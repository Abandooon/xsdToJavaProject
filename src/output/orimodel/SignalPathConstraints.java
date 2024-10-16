package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SignalPathConstraints {

    
    
    protected ArrayList<CommonSignalPath> commonSignalPath;
    
    
    
    protected ArrayList<ForbiddenSignalPath> forbiddenSignalPath;
    
    
    
    protected ArrayList<PermissibleSignalPath> permissibleSignalPath;
    
    
    
    protected ArrayList<SeparateSignalPath> separateSignalPath;
    
    

    
    
    @XmlElement(name="COMMON-SIGNAL-PATH")
    public ArrayList<CommonSignalPath> getCommonSignalPath() {
    return this.commonSignalPath;
}

    public void setCommonSignalPath(ArrayList<CommonSignalPath> value) {
        this.commonSignalPath = value;
    }
    
    
    
    @XmlElement(name="FORBIDDEN-SIGNAL-PATH")
    public ArrayList<ForbiddenSignalPath> getForbiddenSignalPath() {
    return this.forbiddenSignalPath;
}

    public void setForbiddenSignalPath(ArrayList<ForbiddenSignalPath> value) {
        this.forbiddenSignalPath = value;
    }
    
    
    
    @XmlElement(name="PERMISSIBLE-SIGNAL-PATH")
    public ArrayList<PermissibleSignalPath> getPermissibleSignalPath() {
    return this.permissibleSignalPath;
}

    public void setPermissibleSignalPath(ArrayList<PermissibleSignalPath> value) {
        this.permissibleSignalPath = value;
    }
    
    
    
    @XmlElement(name="SEPARATE-SIGNAL-PATH")
    public ArrayList<SeparateSignalPath> getSeparateSignalPath() {
    return this.separateSignalPath;
}

    public void setSeparateSignalPath(ArrayList<SeparateSignalPath> value) {
        this.separateSignalPath = value;
    }
    
    
}