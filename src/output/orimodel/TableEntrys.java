package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TableEntrys {

    
    
    protected ArrayList<ApplicationEntry> applicationEntry;
    
    
    
    protected ArrayList<AssignFrameId> assignFrameId;
    
    
    
    protected ArrayList<AssignFrameIdRange> assignFrameIdRange;
    
    
    
    protected ArrayList<AssignNad> assignNad;
    
    
    
    protected ArrayList<ConditionalChangeNad> conditionalChangeNad;
    
    
    
    protected ArrayList<DataDumpEntry> dataDumpEntry;
    
    
    
    protected ArrayList<FreeFormat> freeFormat;
    
    
    
    protected ArrayList<SaveConfigurationEntry> saveConfigurationEntry;
    
    
    
    protected ArrayList<UnassignFrameId> unassignFrameId;
    
    

    
    
    @XmlElement(name="APPLICATION-ENTRY")
    public ArrayList<ApplicationEntry> getApplicationEntry() {
    return this.applicationEntry;
}

    public void setApplicationEntry(ArrayList<ApplicationEntry> value) {
        this.applicationEntry = value;
    }
    
    
    
    @XmlElement(name="ASSIGN-FRAME-ID")
    public ArrayList<AssignFrameId> getAssignFrameId() {
    return this.assignFrameId;
}

    public void setAssignFrameId(ArrayList<AssignFrameId> value) {
        this.assignFrameId = value;
    }
    
    
    
    @XmlElement(name="ASSIGN-FRAME-ID-RANGE")
    public ArrayList<AssignFrameIdRange> getAssignFrameIdRange() {
    return this.assignFrameIdRange;
}

    public void setAssignFrameIdRange(ArrayList<AssignFrameIdRange> value) {
        this.assignFrameIdRange = value;
    }
    
    
    
    @XmlElement(name="ASSIGN-NAD")
    public ArrayList<AssignNad> getAssignNad() {
    return this.assignNad;
}

    public void setAssignNad(ArrayList<AssignNad> value) {
        this.assignNad = value;
    }
    
    
    
    @XmlElement(name="CONDITIONAL-CHANGE-NAD")
    public ArrayList<ConditionalChangeNad> getConditionalChangeNad() {
    return this.conditionalChangeNad;
}

    public void setConditionalChangeNad(ArrayList<ConditionalChangeNad> value) {
        this.conditionalChangeNad = value;
    }
    
    
    
    @XmlElement(name="DATA-DUMP-ENTRY")
    public ArrayList<DataDumpEntry> getDataDumpEntry() {
    return this.dataDumpEntry;
}

    public void setDataDumpEntry(ArrayList<DataDumpEntry> value) {
        this.dataDumpEntry = value;
    }
    
    
    
    @XmlElement(name="FREE-FORMAT")
    public ArrayList<FreeFormat> getFreeFormat() {
    return this.freeFormat;
}

    public void setFreeFormat(ArrayList<FreeFormat> value) {
        this.freeFormat = value;
    }
    
    
    
    @XmlElement(name="SAVE-CONFIGURATION-ENTRY")
    public ArrayList<SaveConfigurationEntry> getSaveConfigurationEntry() {
    return this.saveConfigurationEntry;
}

    public void setSaveConfigurationEntry(ArrayList<SaveConfigurationEntry> value) {
        this.saveConfigurationEntry = value;
    }
    
    
    
    @XmlElement(name="UNASSIGN-FRAME-ID")
    public ArrayList<UnassignFrameId> getUnassignFrameId() {
    return this.unassignFrameId;
}

    public void setUnassignFrameId(ArrayList<UnassignFrameId> value) {
        this.unassignFrameId = value;
    }
    
    
}