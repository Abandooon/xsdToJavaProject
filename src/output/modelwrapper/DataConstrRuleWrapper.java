package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    


public class DataConstrRuleWrapper {

    
    private DataConstrRule dataConstrRule;

    public DataConstrRuleWrapper(DataConstrRule dataConstrRule) {
        this.dataConstrRule = dataConstrRule;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataConstrRule.getS())) {
            
            return dataConstrRule.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataConstrRule.getT())) {
            
            return dataConstrRule.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getConstrLevel() {
        
        if (CollUtil.isNotEmpty(dataConstrRule.getConstrLevel())) {
            
            return new IntegerWrapper(dataConstrRule.getConstrLevel());
            
        } else {
            return null;
        }
        
    }

    public PhysConstrsWrapper getPhysConstrs() {
        
        if (CollUtil.isNotEmpty(dataConstrRule.getPhysConstrs())) {
            
            return new PhysConstrsWrapper(dataConstrRule.getPhysConstrs());
            
        } else {
            return null;
        }
        
    }

    public InternalConstrsWrapper getInternalConstrs() {
        
        if (CollUtil.isNotEmpty(dataConstrRule.getInternalConstrs())) {
            
            return new InternalConstrsWrapper(dataConstrRule.getInternalConstrs());
            
        } else {
            return null;
        }
        
    }




    


    
}