package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CompuGenericMathWrapper {

    
    private CompuGenericMath compuGenericMath;

    public CompuGenericMathWrapper(CompuGenericMath compuGenericMath) {
        this.compuGenericMath = compuGenericMath;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compuGenericMath.getS())) {
            
            return compuGenericMath.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compuGenericMath.getT())) {
            
            return compuGenericMath.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getLevel() {
        
        if (CollUtil.isNotEmpty(compuGenericMath.getLevel())) {
            
            return compuGenericMath.getLevel();
            
        } else {
            return null;
        }
        
    }




    


    
}