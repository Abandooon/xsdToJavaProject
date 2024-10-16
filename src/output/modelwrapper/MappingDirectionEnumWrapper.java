package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MappingDirectionEnumWrapper {

    
    private MappingDirectionEnum mappingDirectionEnum;

    public MappingDirectionEnumWrapper(MappingDirectionEnum mappingDirectionEnum) {
        this.mappingDirectionEnum = mappingDirectionEnum;
    }

   
    public MappingDirectionEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(mappingDirectionEnum.getValue())) {
            
            return mappingDirectionEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mappingDirectionEnum.getS())) {
            
            return mappingDirectionEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mappingDirectionEnum.getT())) {
            
            return mappingDirectionEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}