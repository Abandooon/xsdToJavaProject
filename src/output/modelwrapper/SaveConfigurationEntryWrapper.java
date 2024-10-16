package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    


public class SaveConfigurationEntryWrapper {

    
    private SaveConfigurationEntry saveConfigurationEntry;

    public SaveConfigurationEntryWrapper(SaveConfigurationEntry saveConfigurationEntry) {
        this.saveConfigurationEntry = saveConfigurationEntry;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(saveConfigurationEntry.getS())) {
            
            return saveConfigurationEntry.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(saveConfigurationEntry.getT())) {
            
            return saveConfigurationEntry.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(saveConfigurationEntry.getIntroduction())) {
            
            return new DocumentationBlockWrapper(saveConfigurationEntry.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getDelay() {
        
        if (CollUtil.isNotEmpty(saveConfigurationEntry.getDelay())) {
            
            return new TimeValueWrapper(saveConfigurationEntry.getDelay());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPositionInTable() {
        
        if (CollUtil.isNotEmpty(saveConfigurationEntry.getPositionInTable())) {
            
            return new IntegerWrapper(saveConfigurationEntry.getPositionInTable());
            
        } else {
            return null;
        }
        
    }

    public AssignedControllerRefWrapper getAssignedControllerRef() {
        
        if (CollUtil.isNotEmpty(saveConfigurationEntry.getAssignedControllerRef())) {
            
            return new AssignedControllerRefWrapper(saveConfigurationEntry.getAssignedControllerRef());
            
        } else {
            return null;
        }
        
    }

    public AssignedLinSlaveConfigRefWrapper getAssignedLinSlaveConfigRef() {
        
        if (CollUtil.isNotEmpty(saveConfigurationEntry.getAssignedLinSlaveConfigRef())) {
            
            return new AssignedLinSlaveConfigRefWrapper(saveConfigurationEntry.getAssignedLinSlaveConfigRef());
            
        } else {
            return null;
        }
        
    }




    


    
}