package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class UdpNmClusterCouplingWrapper {

    
    private UdpNmClusterCoupling udpNmClusterCoupling;

    public UdpNmClusterCouplingWrapper(UdpNmClusterCoupling udpNmClusterCoupling) {
        this.udpNmClusterCoupling = udpNmClusterCoupling;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(udpNmClusterCoupling.getS())) {
            
            return udpNmClusterCoupling.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(udpNmClusterCoupling.getT())) {
            
            return udpNmClusterCoupling.getT();
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(udpNmClusterCoupling.getVariationPoint())) {
            
            return new VariationPointWrapper(udpNmClusterCoupling.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CoupledClusterRef_UdpNmClusterCouplingWrapper> getCoupledClusterRefs() {
        
        if (CollUtil.isNotEmpty(udpNmClusterCoupling.getCoupledClusterRefs())) {
            ArrayList<CoupledClusterRef_UdpNmClusterCoupling> originalList = udpNmClusterCoupling.getCoupledClusterRefs();
            ArrayList<CoupledClusterRef_UdpNmClusterCouplingWrapper> wrapperList = (ArrayList<CoupledClusterRef_UdpNmClusterCouplingWrapper>)originalList.stream()
                .map(item -> new CoupledClusterRef_UdpNmClusterCouplingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmBusLoadReductionEnabled() {
        
        if (CollUtil.isNotEmpty(udpNmClusterCoupling.getNmBusLoadReductionEnabled())) {
            
            return new BooleanWrapper(udpNmClusterCoupling.getNmBusLoadReductionEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmImmediateRestartEnabled() {
        
        if (CollUtil.isNotEmpty(udpNmClusterCoupling.getNmImmediateRestartEnabled())) {
            
            return new BooleanWrapper(udpNmClusterCoupling.getNmImmediateRestartEnabled());
            
        } else {
            return null;
        }
        
    }




    


    
}