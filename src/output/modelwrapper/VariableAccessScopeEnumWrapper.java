package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class VariableAccessScopeEnumWrapper {

    
    private VariableAccessScopeEnum variableAccessScopeEnum;

    public VariableAccessScopeEnumWrapper(VariableAccessScopeEnum variableAccessScopeEnum) {
        this.variableAccessScopeEnum = variableAccessScopeEnum;
    }

   
    public VariableAccessScopeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(variableAccessScopeEnum.getValue())) {
            
            return variableAccessScopeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(variableAccessScopeEnum.getS())) {
            
            return variableAccessScopeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(variableAccessScopeEnum.getT())) {
            
            return variableAccessScopeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}