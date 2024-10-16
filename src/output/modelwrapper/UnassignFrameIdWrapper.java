package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    


public class UnassignFrameIdWrapper {

    
    private UnassignFrameId unassignFrameId;

    public UnassignFrameIdWrapper(UnassignFrameId unassignFrameId) {
        this.unassignFrameId = unassignFrameId;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(unassignFrameId.getS())) {
            
            return unassignFrameId.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(unassignFrameId.getT())) {
            
            return unassignFrameId.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(unassignFrameId.getIntroduction())) {
            
            return new DocumentationBlockWrapper(unassignFrameId.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getDelay() {
        
        if (CollUtil.isNotEmpty(unassignFrameId.getDelay())) {
            
            return new TimeValueWrapper(unassignFrameId.getDelay());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPositionInTable() {
        
        if (CollUtil.isNotEmpty(unassignFrameId.getPositionInTable())) {
            
            return new IntegerWrapper(unassignFrameId.getPositionInTable());
            
        } else {
            return null;
        }
        
    }

    public AssignedControllerRefWrapper getAssignedControllerRef() {
        
        if (CollUtil.isNotEmpty(unassignFrameId.getAssignedControllerRef())) {
            
            return new AssignedControllerRefWrapper(unassignFrameId.getAssignedControllerRef());
            
        } else {
            return null;
        }
        
    }

    public AssignedLinSlaveConfigRefWrapper getAssignedLinSlaveConfigRef() {
        
        if (CollUtil.isNotEmpty(unassignFrameId.getAssignedLinSlaveConfigRef())) {
            
            return new AssignedLinSlaveConfigRefWrapper(unassignFrameId.getAssignedLinSlaveConfigRef());
            
        } else {
            return null;
        }
        
    }

    public UnassignedFrameTriggeringRefWrapper getUnassignedFrameTriggeringRef() {
        
        if (CollUtil.isNotEmpty(unassignFrameId.getUnassignedFrameTriggeringRef())) {
            
            return new UnassignedFrameTriggeringRefWrapper(unassignFrameId.getUnassignedFrameTriggeringRef());
            
        } else {
            return null;
        }
        
    }




    


    
}