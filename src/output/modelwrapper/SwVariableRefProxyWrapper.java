package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class SwVariableRefProxyWrapper {

    
    private SwVariableRefProxy swVariableRefProxy;

    public SwVariableRefProxyWrapper(SwVariableRefProxy swVariableRefProxy) {
        this.swVariableRefProxy = swVariableRefProxy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swVariableRefProxy.getS())) {
            
            return swVariableRefProxy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swVariableRefProxy.getT())) {
            
            return swVariableRefProxy.getT();
            
        } else {
            return null;
        }
        
    }

    public AutosarVariableRefWrapper getAutosarVariable() {
        
        if (CollUtil.isNotEmpty(swVariableRefProxy.getAutosarVariable())) {
            
            return new AutosarVariableRefWrapper(swVariableRefProxy.getAutosarVariable());
            
        } else {
            return null;
        }
        
    }

    public McDataInstanceVarRefWrapper getMcDataInstanceVarRef() {
        
        if (CollUtil.isNotEmpty(swVariableRefProxy.getMcDataInstanceVarRef())) {
            
            return new McDataInstanceVarRefWrapper(swVariableRefProxy.getMcDataInstanceVarRef());
            
        } else {
            return null;
        }
        
    }




    


    
}