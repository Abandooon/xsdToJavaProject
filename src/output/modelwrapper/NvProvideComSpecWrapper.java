package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class NvProvideComSpecWrapper {

    
    private NvProvideComSpec nvProvideComSpec;

    public NvProvideComSpecWrapper(NvProvideComSpec nvProvideComSpec) {
        this.nvProvideComSpec = nvProvideComSpec;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nvProvideComSpec.getS())) {
            
            return nvProvideComSpec.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nvProvideComSpec.getT())) {
            
            return nvProvideComSpec.getT();
            
        } else {
            return null;
        }
        
    }

    public RamBlockInitValueWrapper getRamBlockInitValue() {
        
        if (CollUtil.isNotEmpty(nvProvideComSpec.getRamBlockInitValue())) {
            
            return new RamBlockInitValueWrapper(nvProvideComSpec.getRamBlockInitValue());
            
        } else {
            return null;
        }
        
    }

    public RomBlockInitValueWrapper getRomBlockInitValue() {
        
        if (CollUtil.isNotEmpty(nvProvideComSpec.getRomBlockInitValue())) {
            
            return new RomBlockInitValueWrapper(nvProvideComSpec.getRomBlockInitValue());
            
        } else {
            return null;
        }
        
    }

    public VariableRefWrapper getVariableRef() {
        
        if (CollUtil.isNotEmpty(nvProvideComSpec.getVariableRef())) {
            
            return new VariableRefWrapper(nvProvideComSpec.getVariableRef());
            
        } else {
            return null;
        }
        
    }




    


    
}