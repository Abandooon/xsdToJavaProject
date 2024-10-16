package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class DataDumpEntryWrapper {

    
    private DataDumpEntry dataDumpEntry;

    public DataDumpEntryWrapper(DataDumpEntry dataDumpEntry) {
        this.dataDumpEntry = dataDumpEntry;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataDumpEntry.getS())) {
            
            return dataDumpEntry.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataDumpEntry.getT())) {
            
            return dataDumpEntry.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dataDumpEntry.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dataDumpEntry.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getDelay() {
        
        if (CollUtil.isNotEmpty(dataDumpEntry.getDelay())) {
            
            return new TimeValueWrapper(dataDumpEntry.getDelay());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPositionInTable() {
        
        if (CollUtil.isNotEmpty(dataDumpEntry.getPositionInTable())) {
            
            return new IntegerWrapper(dataDumpEntry.getPositionInTable());
            
        } else {
            return null;
        }
        
    }

    public AssignedControllerRefWrapper getAssignedControllerRef() {
        
        if (CollUtil.isNotEmpty(dataDumpEntry.getAssignedControllerRef())) {
            
            return new AssignedControllerRefWrapper(dataDumpEntry.getAssignedControllerRef());
            
        } else {
            return null;
        }
        
    }

    public AssignedLinSlaveConfigRefWrapper getAssignedLinSlaveConfigRef() {
        
        if (CollUtil.isNotEmpty(dataDumpEntry.getAssignedLinSlaveConfigRef())) {
            
            return new AssignedLinSlaveConfigRefWrapper(dataDumpEntry.getAssignedLinSlaveConfigRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<IntegerWrapper> getByteValues() {
        
        if (CollUtil.isNotEmpty(dataDumpEntry.getByteValues())) {
            ArrayList<Integer> originalList = dataDumpEntry.getByteValues();
            ArrayList<IntegerWrapper> wrapperList = (ArrayList<IntegerWrapper>)originalList.stream()
                .map(item -> new IntegerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}