package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SwcToEcuMappingConstraintTypeWrapper {

    
    private SwcToEcuMappingConstraintType swcToEcuMappingConstraintType;

    public SwcToEcuMappingConstraintTypeWrapper(SwcToEcuMappingConstraintType swcToEcuMappingConstraintType) {
        this.swcToEcuMappingConstraintType = swcToEcuMappingConstraintType;
    }

   
    public SwcToEcuMappingConstraintTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(swcToEcuMappingConstraintType.getValue())) {
            
            return swcToEcuMappingConstraintType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcToEcuMappingConstraintType.getS())) {
            
            return swcToEcuMappingConstraintType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcToEcuMappingConstraintType.getT())) {
            
            return swcToEcuMappingConstraintType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}