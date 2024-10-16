package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class J1939NodeNameWrapper {

    
    private J1939NodeName j1939NodeName;

    public J1939NodeNameWrapper(J1939NodeName j1939NodeName) {
        this.j1939NodeName = j1939NodeName;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(j1939NodeName.getS())) {
            
            return j1939NodeName.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(j1939NodeName.getT())) {
            
            return j1939NodeName.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getArbitraryAddressCapable() {
        
        if (CollUtil.isNotEmpty(j1939NodeName.getArbitraryAddressCapable())) {
            
            return new BooleanWrapper(j1939NodeName.getArbitraryAddressCapable());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getEcuInstance() {
        
        if (CollUtil.isNotEmpty(j1939NodeName.getEcuInstance())) {
            
            return new IntegerWrapper(j1939NodeName.getEcuInstance());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getFunction() {
        
        if (CollUtil.isNotEmpty(j1939NodeName.getFunction())) {
            
            return new IntegerWrapper(j1939NodeName.getFunction());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getFunctionInstance() {
        
        if (CollUtil.isNotEmpty(j1939NodeName.getFunctionInstance())) {
            
            return new IntegerWrapper(j1939NodeName.getFunctionInstance());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getIdentitiyNumber() {
        
        if (CollUtil.isNotEmpty(j1939NodeName.getIdentitiyNumber())) {
            
            return new IntegerWrapper(j1939NodeName.getIdentitiyNumber());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getIndustryGroup() {
        
        if (CollUtil.isNotEmpty(j1939NodeName.getIndustryGroup())) {
            
            return new IntegerWrapper(j1939NodeName.getIndustryGroup());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getManufacturerCode() {
        
        if (CollUtil.isNotEmpty(j1939NodeName.getManufacturerCode())) {
            
            return new IntegerWrapper(j1939NodeName.getManufacturerCode());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getVehicleSystem() {
        
        if (CollUtil.isNotEmpty(j1939NodeName.getVehicleSystem())) {
            
            return new IntegerWrapper(j1939NodeName.getVehicleSystem());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getVehicleSystemInstance() {
        
        if (CollUtil.isNotEmpty(j1939NodeName.getVehicleSystemInstance())) {
            
            return new IntegerWrapper(j1939NodeName.getVehicleSystemInstance());
            
        } else {
            return null;
        }
        
    }




    


    
}