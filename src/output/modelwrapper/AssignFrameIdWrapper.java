package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    


public class AssignFrameIdWrapper {

    
    private AssignFrameId assignFrameId;

    public AssignFrameIdWrapper(AssignFrameId assignFrameId) {
        this.assignFrameId = assignFrameId;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(assignFrameId.getS())) {
            
            return assignFrameId.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(assignFrameId.getT())) {
            
            return assignFrameId.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(assignFrameId.getIntroduction())) {
            
            return new DocumentationBlockWrapper(assignFrameId.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getDelay() {
        
        if (CollUtil.isNotEmpty(assignFrameId.getDelay())) {
            
            return new TimeValueWrapper(assignFrameId.getDelay());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPositionInTable() {
        
        if (CollUtil.isNotEmpty(assignFrameId.getPositionInTable())) {
            
            return new IntegerWrapper(assignFrameId.getPositionInTable());
            
        } else {
            return null;
        }
        
    }

    public AssignedControllerRefWrapper getAssignedControllerRef() {
        
        if (CollUtil.isNotEmpty(assignFrameId.getAssignedControllerRef())) {
            
            return new AssignedControllerRefWrapper(assignFrameId.getAssignedControllerRef());
            
        } else {
            return null;
        }
        
    }

    public AssignedLinSlaveConfigRefWrapper getAssignedLinSlaveConfigRef() {
        
        if (CollUtil.isNotEmpty(assignFrameId.getAssignedLinSlaveConfigRef())) {
            
            return new AssignedLinSlaveConfigRefWrapper(assignFrameId.getAssignedLinSlaveConfigRef());
            
        } else {
            return null;
        }
        
    }

    public AssignedFrameTriggeringRefWrapper getAssignedFrameTriggeringRef() {
        
        if (CollUtil.isNotEmpty(assignFrameId.getAssignedFrameTriggeringRef())) {
            
            return new AssignedFrameTriggeringRefWrapper(assignFrameId.getAssignedFrameTriggeringRef());
            
        } else {
            return null;
        }
        
    }




    


    
}