package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class InternalConstrsWrapper {

    
    private InternalConstrs internalConstrs;

    public InternalConstrsWrapper(InternalConstrs internalConstrs) {
        this.internalConstrs = internalConstrs;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(internalConstrs.getS())) {
            
            return internalConstrs.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(internalConstrs.getT())) {
            
            return internalConstrs.getT();
            
        } else {
            return null;
        }
        
    }

    public LimitWrapper getLowerLimit() {
        
        if (CollUtil.isNotEmpty(internalConstrs.getLowerLimit())) {
            
            return new LimitWrapper(internalConstrs.getLowerLimit());
            
        } else {
            return null;
        }
        
    }

    public LimitWrapper getUpperLimit() {
        
        if (CollUtil.isNotEmpty(internalConstrs.getUpperLimit())) {
            
            return new LimitWrapper(internalConstrs.getUpperLimit());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ScaleConstrWrapper> getScaleConstrs() {
        
        if (CollUtil.isNotEmpty(internalConstrs.getScaleConstrs())) {
            ArrayList<ScaleConstr> originalList = internalConstrs.getScaleConstrs();
            ArrayList<ScaleConstrWrapper> wrapperList = (ArrayList<ScaleConstrWrapper>)originalList.stream()
                .map(item -> new ScaleConstrWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getMaxGradient() {
        
        if (CollUtil.isNotEmpty(internalConstrs.getMaxGradient())) {
            
            return new NumericalValueWrapper(internalConstrs.getMaxGradient());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getMaxDiff() {
        
        if (CollUtil.isNotEmpty(internalConstrs.getMaxDiff())) {
            
            return new NumericalValueWrapper(internalConstrs.getMaxDiff());
            
        } else {
            return null;
        }
        
    }

    public MonotonyEnumWrapper getMonotony() {
        
        if (CollUtil.isNotEmpty(internalConstrs.getMonotony())) {
            
            return new MonotonyEnumWrapper(internalConstrs.getMonotony());
            
        } else {
            return null;
        }
        
    }




    


    
}