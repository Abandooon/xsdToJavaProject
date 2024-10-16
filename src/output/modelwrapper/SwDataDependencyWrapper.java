package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class SwDataDependencyWrapper {

    
    private SwDataDependency swDataDependency;

    public SwDataDependencyWrapper(SwDataDependency swDataDependency) {
        this.swDataDependency = swDataDependency;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swDataDependency.getS())) {
            
            return swDataDependency.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swDataDependency.getT())) {
            
            return swDataDependency.getT();
            
        } else {
            return null;
        }
        
    }

    public CompuGenericMathWrapper getSwDataDependencyFormula() {
        
        if (CollUtil.isNotEmpty(swDataDependency.getSwDataDependencyFormula())) {
            
            return new CompuGenericMathWrapper(swDataDependency.getSwDataDependencyFormula());
            
        } else {
            return null;
        }
        
    }

    public SwDataDependencyArgsWrapper getSwDataDependencyArgs() {
        
        if (CollUtil.isNotEmpty(swDataDependency.getSwDataDependencyArgs())) {
            
            return new SwDataDependencyArgsWrapper(swDataDependency.getSwDataDependencyArgs());
            
        } else {
            return null;
        }
        
    }




    


    
}