package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tableentrys {

    
    
    protected ArrayList<ApplicationEntry> applicationEntrys;
    
    
    
    protected ArrayList<AssignFrameId> assignFrameIds;
    
    
    
    protected ArrayList<AssignFrameIdRange> assignFrameIdRanges;
    
    
    
    protected ArrayList<AssignNad> assignNads;
    
    
    
    protected ArrayList<ConditionalChangeNad> conditionalChangeNads;
    
    
    
    protected ArrayList<DataDumpEntry> dataDumpEntrys;
    
    
    
    protected ArrayList<FreeFormat> freeFormats;
    
    
    
    protected ArrayList<SaveConfigurationEntry> saveConfigurationEntrys;
    
    
    
    protected ArrayList<UnassignFrameId> unassignFrameIds;
    
    

    
    
    @XmlElement(name="APPLICATION-ENTRY")
    public ArrayList<ApplicationEntry> getApplicationEntrys() {
        return this.applicationEntrys;
    }

    public void setApplicationEntrys(ArrayList<ApplicationEntry> value) {
        this.applicationEntrys = value;
    }
    
    
    
    @XmlElement(name="ASSIGN-FRAME-ID")
    public ArrayList<AssignFrameId> getAssignFrameIds() {
        return this.assignFrameIds;
    }

    public void setAssignFrameIds(ArrayList<AssignFrameId> value) {
        this.assignFrameIds = value;
    }
    
    
    
    @XmlElement(name="ASSIGN-FRAME-ID-RANGE")
    public ArrayList<AssignFrameIdRange> getAssignFrameIdRanges() {
        return this.assignFrameIdRanges;
    }

    public void setAssignFrameIdRanges(ArrayList<AssignFrameIdRange> value) {
        this.assignFrameIdRanges = value;
    }
    
    
    
    @XmlElement(name="ASSIGN-NAD")
    public ArrayList<AssignNad> getAssignNads() {
        return this.assignNads;
    }

    public void setAssignNads(ArrayList<AssignNad> value) {
        this.assignNads = value;
    }
    
    
    
    @XmlElement(name="CONDITIONAL-CHANGE-NAD")
    public ArrayList<ConditionalChangeNad> getConditionalChangeNads() {
        return this.conditionalChangeNads;
    }

    public void setConditionalChangeNads(ArrayList<ConditionalChangeNad> value) {
        this.conditionalChangeNads = value;
    }
    
    
    
    @XmlElement(name="DATA-DUMP-ENTRY")
    public ArrayList<DataDumpEntry> getDataDumpEntrys() {
        return this.dataDumpEntrys;
    }

    public void setDataDumpEntrys(ArrayList<DataDumpEntry> value) {
        this.dataDumpEntrys = value;
    }
    
    
    
    @XmlElement(name="FREE-FORMAT")
    public ArrayList<FreeFormat> getFreeFormats() {
        return this.freeFormats;
    }

    public void setFreeFormats(ArrayList<FreeFormat> value) {
        this.freeFormats = value;
    }
    
    
    
    @XmlElement(name="SAVE-CONFIGURATION-ENTRY")
    public ArrayList<SaveConfigurationEntry> getSaveConfigurationEntrys() {
        return this.saveConfigurationEntrys;
    }

    public void setSaveConfigurationEntrys(ArrayList<SaveConfigurationEntry> value) {
        this.saveConfigurationEntrys = value;
    }
    
    
    
    @XmlElement(name="UNASSIGN-FRAME-ID")
    public ArrayList<UnassignFrameId> getUnassignFrameIds() {
        return this.unassignFrameIds;
    }

    public void setUnassignFrameIds(ArrayList<UnassignFrameId> value) {
        this.unassignFrameIds = value;
    }
    
    
}