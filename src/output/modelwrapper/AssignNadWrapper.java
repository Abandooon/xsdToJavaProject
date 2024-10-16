package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class AssignNadWrapper {

    
    private AssignNad assignNad;

    public AssignNadWrapper(AssignNad assignNad) {
        this.assignNad = assignNad;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(assignNad.getS())) {
            
            return assignNad.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(assignNad.getT())) {
            
            return assignNad.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(assignNad.getIntroduction())) {
            
            return new DocumentationBlockWrapper(assignNad.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getDelay() {
        
        if (CollUtil.isNotEmpty(assignNad.getDelay())) {
            
            return new TimeValueWrapper(assignNad.getDelay());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPositionInTable() {
        
        if (CollUtil.isNotEmpty(assignNad.getPositionInTable())) {
            
            return new IntegerWrapper(assignNad.getPositionInTable());
            
        } else {
            return null;
        }
        
    }

    public AssignedControllerRefWrapper getAssignedControllerRef() {
        
        if (CollUtil.isNotEmpty(assignNad.getAssignedControllerRef())) {
            
            return new AssignedControllerRefWrapper(assignNad.getAssignedControllerRef());
            
        } else {
            return null;
        }
        
    }

    public AssignedLinSlaveConfigRefWrapper getAssignedLinSlaveConfigRef() {
        
        if (CollUtil.isNotEmpty(assignNad.getAssignedLinSlaveConfigRef())) {
            
            return new AssignedLinSlaveConfigRefWrapper(assignNad.getAssignedLinSlaveConfigRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNewNad() {
        
        if (CollUtil.isNotEmpty(assignNad.getNewNad())) {
            
            return new IntegerWrapper(assignNad.getNewNad());
            
        } else {
            return null;
        }
        
    }




    


    
}