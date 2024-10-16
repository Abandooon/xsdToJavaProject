package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class NmCoordinatorWrapper {

    
    private NmCoordinator nmCoordinator;

    public NmCoordinatorWrapper(NmCoordinator nmCoordinator) {
        this.nmCoordinator = nmCoordinator;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nmCoordinator.getS())) {
            
            return nmCoordinator.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nmCoordinator.getT())) {
            
            return nmCoordinator.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getIndex() {
        
        if (CollUtil.isNotEmpty(nmCoordinator.getIndex())) {
            
            return new IntegerWrapper(nmCoordinator.getIndex());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmActiveCoordinator() {
        
        if (CollUtil.isNotEmpty(nmCoordinator.getNmActiveCoordinator())) {
            
            return new BooleanWrapper(nmCoordinator.getNmActiveCoordinator());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmCoordSyncSupport() {
        
        if (CollUtil.isNotEmpty(nmCoordinator.getNmCoordSyncSupport())) {
            
            return new BooleanWrapper(nmCoordinator.getNmCoordSyncSupport());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmGlobalCoordinatorTime() {
        
        if (CollUtil.isNotEmpty(nmCoordinator.getNmGlobalCoordinatorTime())) {
            
            return new TimeValueWrapper(nmCoordinator.getNmGlobalCoordinatorTime());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NmNodeRefWrapper> getNmNodeRefs() {
        
        if (CollUtil.isNotEmpty(nmCoordinator.getNmNodeRefs())) {
            ArrayList<NmNodeRef> originalList = nmCoordinator.getNmNodeRefs();
            ArrayList<NmNodeRefWrapper> wrapperList = (ArrayList<NmNodeRefWrapper>)originalList.stream()
                .map(item -> new NmNodeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmShutdownDelayTimer() {
        
        if (CollUtil.isNotEmpty(nmCoordinator.getNmShutdownDelayTimer())) {
            
            return new TimeValueWrapper(nmCoordinator.getNmShutdownDelayTimer());
            
        } else {
            return null;
        }
        
    }




    


    
}