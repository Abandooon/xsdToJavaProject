package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TableEntrysWrapper {

    
    private TableEntrys tableEntrys;

    public TableEntrysWrapper(TableEntrys tableEntrys) {
        this.tableEntrys = tableEntrys;
    }

   
    public ArrayList<ApplicationEntryWrapper> getApplicationEntry() {
        
        if (CollUtil.isNotEmpty(tableEntrys.getApplicationEntry())) {
            ArrayList<ApplicationEntry> originalList = tableEntrys.getApplicationEntry();
            ArrayList<ApplicationEntryWrapper> wrapperList = (ArrayList<ApplicationEntryWrapper>)originalList.stream()
                .map(item -> new ApplicationEntryWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AssignFrameIdWrapper> getAssignFrameId() {
        
        if (CollUtil.isNotEmpty(tableEntrys.getAssignFrameId())) {
            ArrayList<AssignFrameId> originalList = tableEntrys.getAssignFrameId();
            ArrayList<AssignFrameIdWrapper> wrapperList = (ArrayList<AssignFrameIdWrapper>)originalList.stream()
                .map(item -> new AssignFrameIdWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AssignFrameIdRangeWrapper> getAssignFrameIdRange() {
        
        if (CollUtil.isNotEmpty(tableEntrys.getAssignFrameIdRange())) {
            ArrayList<AssignFrameIdRange> originalList = tableEntrys.getAssignFrameIdRange();
            ArrayList<AssignFrameIdRangeWrapper> wrapperList = (ArrayList<AssignFrameIdRangeWrapper>)originalList.stream()
                .map(item -> new AssignFrameIdRangeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AssignNadWrapper> getAssignNad() {
        
        if (CollUtil.isNotEmpty(tableEntrys.getAssignNad())) {
            ArrayList<AssignNad> originalList = tableEntrys.getAssignNad();
            ArrayList<AssignNadWrapper> wrapperList = (ArrayList<AssignNadWrapper>)originalList.stream()
                .map(item -> new AssignNadWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConditionalChangeNadWrapper> getConditionalChangeNad() {
        
        if (CollUtil.isNotEmpty(tableEntrys.getConditionalChangeNad())) {
            ArrayList<ConditionalChangeNad> originalList = tableEntrys.getConditionalChangeNad();
            ArrayList<ConditionalChangeNadWrapper> wrapperList = (ArrayList<ConditionalChangeNadWrapper>)originalList.stream()
                .map(item -> new ConditionalChangeNadWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DataDumpEntryWrapper> getDataDumpEntry() {
        
        if (CollUtil.isNotEmpty(tableEntrys.getDataDumpEntry())) {
            ArrayList<DataDumpEntry> originalList = tableEntrys.getDataDumpEntry();
            ArrayList<DataDumpEntryWrapper> wrapperList = (ArrayList<DataDumpEntryWrapper>)originalList.stream()
                .map(item -> new DataDumpEntryWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FreeFormatWrapper> getFreeFormat() {
        
        if (CollUtil.isNotEmpty(tableEntrys.getFreeFormat())) {
            ArrayList<FreeFormat> originalList = tableEntrys.getFreeFormat();
            ArrayList<FreeFormatWrapper> wrapperList = (ArrayList<FreeFormatWrapper>)originalList.stream()
                .map(item -> new FreeFormatWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SaveConfigurationEntryWrapper> getSaveConfigurationEntry() {
        
        if (CollUtil.isNotEmpty(tableEntrys.getSaveConfigurationEntry())) {
            ArrayList<SaveConfigurationEntry> originalList = tableEntrys.getSaveConfigurationEntry();
            ArrayList<SaveConfigurationEntryWrapper> wrapperList = (ArrayList<SaveConfigurationEntryWrapper>)originalList.stream()
                .map(item -> new SaveConfigurationEntryWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UnassignFrameIdWrapper> getUnassignFrameId() {
        
        if (CollUtil.isNotEmpty(tableEntrys.getUnassignFrameId())) {
            ArrayList<UnassignFrameId> originalList = tableEntrys.getUnassignFrameId();
            ArrayList<UnassignFrameIdWrapper> wrapperList = (ArrayList<UnassignFrameIdWrapper>)originalList.stream()
                .map(item -> new UnassignFrameIdWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}