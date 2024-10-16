package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ArgumentDirectionEnumWrapper {

    
    private ArgumentDirectionEnum argumentDirectionEnum;

    public ArgumentDirectionEnumWrapper(ArgumentDirectionEnum argumentDirectionEnum) {
        this.argumentDirectionEnum = argumentDirectionEnum;
    }

   
    public ArgumentDirectionEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(argumentDirectionEnum.getValue())) {
            
            return argumentDirectionEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(argumentDirectionEnum.getS())) {
            
            return argumentDirectionEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(argumentDirectionEnum.getT())) {
            
            return argumentDirectionEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}