package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class AssignFrameIdRangeWrapper {

    
    private AssignFrameIdRange assignFrameIdRange;

    public AssignFrameIdRangeWrapper(AssignFrameIdRange assignFrameIdRange) {
        this.assignFrameIdRange = assignFrameIdRange;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(assignFrameIdRange.getS())) {
            
            return assignFrameIdRange.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(assignFrameIdRange.getT())) {
            
            return assignFrameIdRange.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(assignFrameIdRange.getIntroduction())) {
            
            return new DocumentationBlockWrapper(assignFrameIdRange.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getDelay() {
        
        if (CollUtil.isNotEmpty(assignFrameIdRange.getDelay())) {
            
            return new TimeValueWrapper(assignFrameIdRange.getDelay());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPositionInTable() {
        
        if (CollUtil.isNotEmpty(assignFrameIdRange.getPositionInTable())) {
            
            return new IntegerWrapper(assignFrameIdRange.getPositionInTable());
            
        } else {
            return null;
        }
        
    }

    public AssignedControllerRefWrapper getAssignedControllerRef() {
        
        if (CollUtil.isNotEmpty(assignFrameIdRange.getAssignedControllerRef())) {
            
            return new AssignedControllerRefWrapper(assignFrameIdRange.getAssignedControllerRef());
            
        } else {
            return null;
        }
        
    }

    public AssignedLinSlaveConfigRefWrapper getAssignedLinSlaveConfigRef() {
        
        if (CollUtil.isNotEmpty(assignFrameIdRange.getAssignedLinSlaveConfigRef())) {
            
            return new AssignedLinSlaveConfigRefWrapper(assignFrameIdRange.getAssignedLinSlaveConfigRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FramePidWrapper> getFramePids() {
        
        if (CollUtil.isNotEmpty(assignFrameIdRange.getFramePids())) {
            ArrayList<FramePid> originalList = assignFrameIdRange.getFramePids();
            ArrayList<FramePidWrapper> wrapperList = (ArrayList<FramePidWrapper>)originalList.stream()
                .map(item -> new FramePidWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getStartIndex() {
        
        if (CollUtil.isNotEmpty(assignFrameIdRange.getStartIndex())) {
            
            return new IntegerWrapper(assignFrameIdRange.getStartIndex());
            
        } else {
            return null;
        }
        
    }




    


    
}