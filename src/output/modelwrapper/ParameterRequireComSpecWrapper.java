package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ParameterRequireComSpecWrapper {

    
    private ParameterRequireComSpec parameterRequireComSpec;

    public ParameterRequireComSpecWrapper(ParameterRequireComSpec parameterRequireComSpec) {
        this.parameterRequireComSpec = parameterRequireComSpec;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(parameterRequireComSpec.getS())) {
            
            return parameterRequireComSpec.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(parameterRequireComSpec.getT())) {
            
            return parameterRequireComSpec.getT();
            
        } else {
            return null;
        }
        
    }

    public InitValueWrapper getInitValue() {
        
        if (CollUtil.isNotEmpty(parameterRequireComSpec.getInitValue())) {
            
            return new InitValueWrapper(parameterRequireComSpec.getInitValue());
            
        } else {
            return null;
        }
        
    }

    public ParameterRefWrapper getParameterRef() {
        
        if (CollUtil.isNotEmpty(parameterRequireComSpec.getParameterRef())) {
            
            return new ParameterRefWrapper(parameterRequireComSpec.getParameterRef());
            
        } else {
            return null;
        }
        
    }




    


    
}