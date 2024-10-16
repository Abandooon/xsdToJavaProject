package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class CanNmClusterCouplingWrapper {

    
    private CanNmClusterCoupling canNmClusterCoupling;

    public CanNmClusterCouplingWrapper(CanNmClusterCoupling canNmClusterCoupling) {
        this.canNmClusterCoupling = canNmClusterCoupling;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canNmClusterCoupling.getS())) {
            
            return canNmClusterCoupling.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canNmClusterCoupling.getT())) {
            
            return canNmClusterCoupling.getT();
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(canNmClusterCoupling.getVariationPoint())) {
            
            return new VariationPointWrapper(canNmClusterCoupling.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CoupledClusterRefWrapper> getCoupledClusterRefs() {
        
        if (CollUtil.isNotEmpty(canNmClusterCoupling.getCoupledClusterRefs())) {
            ArrayList<CoupledClusterRef> originalList = canNmClusterCoupling.getCoupledClusterRefs();
            ArrayList<CoupledClusterRefWrapper> wrapperList = (ArrayList<CoupledClusterRefWrapper>)originalList.stream()
                .map(item -> new CoupledClusterRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmBusloadReductionEnabled() {
        
        if (CollUtil.isNotEmpty(canNmClusterCoupling.getNmBusloadReductionEnabled())) {
            
            return new BooleanWrapper(canNmClusterCoupling.getNmBusloadReductionEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmImmediateRestartEnabled() {
        
        if (CollUtil.isNotEmpty(canNmClusterCoupling.getNmImmediateRestartEnabled())) {
            
            return new BooleanWrapper(canNmClusterCoupling.getNmImmediateRestartEnabled());
            
        } else {
            return null;
        }
        
    }




    


    
}