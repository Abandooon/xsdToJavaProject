package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class PhysConstrsWrapper {

    
    private PhysConstrs physConstrs;

    public PhysConstrsWrapper(PhysConstrs physConstrs) {
        this.physConstrs = physConstrs;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(physConstrs.getS())) {
            
            return physConstrs.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(physConstrs.getT())) {
            
            return physConstrs.getT();
            
        } else {
            return null;
        }
        
    }

    public LimitWrapper getLowerLimit() {
        
        if (CollUtil.isNotEmpty(physConstrs.getLowerLimit())) {
            
            return new LimitWrapper(physConstrs.getLowerLimit());
            
        } else {
            return null;
        }
        
    }

    public LimitWrapper getUpperLimit() {
        
        if (CollUtil.isNotEmpty(physConstrs.getUpperLimit())) {
            
            return new LimitWrapper(physConstrs.getUpperLimit());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ScaleConstrWrapper> getScaleConstrs() {
        
        if (CollUtil.isNotEmpty(physConstrs.getScaleConstrs())) {
            ArrayList<ScaleConstr> originalList = physConstrs.getScaleConstrs();
            ArrayList<ScaleConstrWrapper> wrapperList = (ArrayList<ScaleConstrWrapper>)originalList.stream()
                .map(item -> new ScaleConstrWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getMaxGradient() {
        
        if (CollUtil.isNotEmpty(physConstrs.getMaxGradient())) {
            
            return new NumericalValueWrapper(physConstrs.getMaxGradient());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getMaxDiff() {
        
        if (CollUtil.isNotEmpty(physConstrs.getMaxDiff())) {
            
            return new NumericalValueWrapper(physConstrs.getMaxDiff());
            
        } else {
            return null;
        }
        
    }

    public MonotonyEnumWrapper getMonotony() {
        
        if (CollUtil.isNotEmpty(physConstrs.getMonotony())) {
            
            return new MonotonyEnumWrapper(physConstrs.getMonotony());
            
        } else {
            return null;
        }
        
    }

    public UnitRefWrapper getUnitRef() {
        
        if (CollUtil.isNotEmpty(physConstrs.getUnitRef())) {
            
            return new UnitRefWrapper(physConstrs.getUnitRef());
            
        } else {
            return null;
        }
        
    }




    


    
}