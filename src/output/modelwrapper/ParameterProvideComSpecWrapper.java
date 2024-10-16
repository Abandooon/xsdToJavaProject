package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ParameterProvideComSpecWrapper {

    
    private ParameterProvideComSpec parameterProvideComSpec;

    public ParameterProvideComSpecWrapper(ParameterProvideComSpec parameterProvideComSpec) {
        this.parameterProvideComSpec = parameterProvideComSpec;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(parameterProvideComSpec.getS())) {
            
            return parameterProvideComSpec.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(parameterProvideComSpec.getT())) {
            
            return parameterProvideComSpec.getT();
            
        } else {
            return null;
        }
        
    }

    public InitValueWrapper getInitValue() {
        
        if (CollUtil.isNotEmpty(parameterProvideComSpec.getInitValue())) {
            
            return new InitValueWrapper(parameterProvideComSpec.getInitValue());
            
        } else {
            return null;
        }
        
    }

    public ParameterRefWrapper getParameterRef() {
        
        if (CollUtil.isNotEmpty(parameterProvideComSpec.getParameterRef())) {
            
            return new ParameterRefWrapper(parameterProvideComSpec.getParameterRef());
            
        } else {
            return null;
        }
        
    }




    


    
}