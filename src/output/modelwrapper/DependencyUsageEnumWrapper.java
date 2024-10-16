package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DependencyUsageEnumWrapper {

    
    private DependencyUsageEnum dependencyUsageEnum;

    public DependencyUsageEnumWrapper(DependencyUsageEnum dependencyUsageEnum) {
        this.dependencyUsageEnum = dependencyUsageEnum;
    }

   
    public DependencyUsageEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(dependencyUsageEnum.getValue())) {
            
            return dependencyUsageEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dependencyUsageEnum.getS())) {
            
            return dependencyUsageEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dependencyUsageEnum.getT())) {
            
            return dependencyUsageEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}