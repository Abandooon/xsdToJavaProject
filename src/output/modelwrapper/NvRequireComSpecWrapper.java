package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class NvRequireComSpecWrapper {

    
    private NvRequireComSpec nvRequireComSpec;

    public NvRequireComSpecWrapper(NvRequireComSpec nvRequireComSpec) {
        this.nvRequireComSpec = nvRequireComSpec;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nvRequireComSpec.getS())) {
            
            return nvRequireComSpec.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nvRequireComSpec.getT())) {
            
            return nvRequireComSpec.getT();
            
        } else {
            return null;
        }
        
    }

    public InitValueWrapper getInitValue() {
        
        if (CollUtil.isNotEmpty(nvRequireComSpec.getInitValue())) {
            
            return new InitValueWrapper(nvRequireComSpec.getInitValue());
            
        } else {
            return null;
        }
        
    }

    public VariableRefWrapper getVariableRef() {
        
        if (CollUtil.isNotEmpty(nvRequireComSpec.getVariableRef())) {
            
            return new VariableRefWrapper(nvRequireComSpec.getVariableRef());
            
        } else {
            return null;
        }
        
    }




    


    
}