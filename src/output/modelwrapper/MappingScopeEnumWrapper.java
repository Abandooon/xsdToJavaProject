package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MappingScopeEnumWrapper {

    
    private MappingScopeEnum mappingScopeEnum;

    public MappingScopeEnumWrapper(MappingScopeEnum mappingScopeEnum) {
        this.mappingScopeEnum = mappingScopeEnum;
    }

   
    public MappingScopeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(mappingScopeEnum.getValue())) {
            
            return mappingScopeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mappingScopeEnum.getS())) {
            
            return mappingScopeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mappingScopeEnum.getT())) {
            
            return mappingScopeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}