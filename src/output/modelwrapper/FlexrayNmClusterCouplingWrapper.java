package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class FlexrayNmClusterCouplingWrapper {

    
    private FlexrayNmClusterCoupling flexrayNmClusterCoupling;

    public FlexrayNmClusterCouplingWrapper(FlexrayNmClusterCoupling flexrayNmClusterCoupling) {
        this.flexrayNmClusterCoupling = flexrayNmClusterCoupling;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayNmClusterCoupling.getS())) {
            
            return flexrayNmClusterCoupling.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayNmClusterCoupling.getT())) {
            
            return flexrayNmClusterCoupling.getT();
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayNmClusterCoupling.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayNmClusterCoupling.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CoupledClusterRef_FlexrayNmClusterCouplingWrapper> getCoupledClusterRefs() {
        
        if (CollUtil.isNotEmpty(flexrayNmClusterCoupling.getCoupledClusterRefs())) {
            ArrayList<CoupledClusterRef_FlexrayNmClusterCoupling> originalList = flexrayNmClusterCoupling.getCoupledClusterRefs();
            ArrayList<CoupledClusterRef_FlexrayNmClusterCouplingWrapper> wrapperList = (ArrayList<CoupledClusterRef_FlexrayNmClusterCouplingWrapper>)originalList.stream()
                .map(item -> new CoupledClusterRef_FlexrayNmClusterCouplingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmControlBitVectorEnabled() {
        
        if (CollUtil.isNotEmpty(flexrayNmClusterCoupling.getNmControlBitVectorEnabled())) {
            
            return new BooleanWrapper(flexrayNmClusterCoupling.getNmControlBitVectorEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmDataDisabled() {
        
        if (CollUtil.isNotEmpty(flexrayNmClusterCoupling.getNmDataDisabled())) {
            
            return new BooleanWrapper(flexrayNmClusterCoupling.getNmDataDisabled());
            
        } else {
            return null;
        }
        
    }

    public FlexrayNmScheduleVariantWrapper getNmScheduleVariant() {
        
        if (CollUtil.isNotEmpty(flexrayNmClusterCoupling.getNmScheduleVariant())) {
            
            return new FlexrayNmScheduleVariantWrapper(flexrayNmClusterCoupling.getNmScheduleVariant());
            
        } else {
            return null;
        }
        
    }




    


    
}