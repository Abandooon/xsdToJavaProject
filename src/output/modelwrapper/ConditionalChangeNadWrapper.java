package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class ConditionalChangeNadWrapper {

    
    private ConditionalChangeNad conditionalChangeNad;

    public ConditionalChangeNadWrapper(ConditionalChangeNad conditionalChangeNad) {
        this.conditionalChangeNad = conditionalChangeNad;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(conditionalChangeNad.getS())) {
            
            return conditionalChangeNad.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(conditionalChangeNad.getT())) {
            
            return conditionalChangeNad.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(conditionalChangeNad.getIntroduction())) {
            
            return new DocumentationBlockWrapper(conditionalChangeNad.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getDelay() {
        
        if (CollUtil.isNotEmpty(conditionalChangeNad.getDelay())) {
            
            return new TimeValueWrapper(conditionalChangeNad.getDelay());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPositionInTable() {
        
        if (CollUtil.isNotEmpty(conditionalChangeNad.getPositionInTable())) {
            
            return new IntegerWrapper(conditionalChangeNad.getPositionInTable());
            
        } else {
            return null;
        }
        
    }

    public AssignedControllerRefWrapper getAssignedControllerRef() {
        
        if (CollUtil.isNotEmpty(conditionalChangeNad.getAssignedControllerRef())) {
            
            return new AssignedControllerRefWrapper(conditionalChangeNad.getAssignedControllerRef());
            
        } else {
            return null;
        }
        
    }

    public AssignedLinSlaveConfigRefWrapper getAssignedLinSlaveConfigRef() {
        
        if (CollUtil.isNotEmpty(conditionalChangeNad.getAssignedLinSlaveConfigRef())) {
            
            return new AssignedLinSlaveConfigRefWrapper(conditionalChangeNad.getAssignedLinSlaveConfigRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getByte() {
        
        if (CollUtil.isNotEmpty(conditionalChangeNad.getByte())) {
            
            return new IntegerWrapper(conditionalChangeNad.getByte());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getId() {
        
        if (CollUtil.isNotEmpty(conditionalChangeNad.getId())) {
            
            return new PositiveIntegerWrapper(conditionalChangeNad.getId());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getInvert() {
        
        if (CollUtil.isNotEmpty(conditionalChangeNad.getInvert())) {
            
            return new IntegerWrapper(conditionalChangeNad.getInvert());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMask() {
        
        if (CollUtil.isNotEmpty(conditionalChangeNad.getMask())) {
            
            return new IntegerWrapper(conditionalChangeNad.getMask());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNewNad() {
        
        if (CollUtil.isNotEmpty(conditionalChangeNad.getNewNad())) {
            
            return new IntegerWrapper(conditionalChangeNad.getNewNad());
            
        } else {
            return null;
        }
        
    }




    


    
}