package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CompuScaleRationalFormulaWrapper {

    
    private CompuScaleRationalFormula compuScaleRationalFormula;

    public CompuScaleRationalFormulaWrapper(CompuScaleRationalFormula compuScaleRationalFormula) {
        this.compuScaleRationalFormula = compuScaleRationalFormula;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compuScaleRationalFormula.getS())) {
            
            return compuScaleRationalFormula.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compuScaleRationalFormula.getT())) {
            
            return compuScaleRationalFormula.getT();
            
        } else {
            return null;
        }
        
    }

    public CompuRationalCoeffsWrapper getCompuRationalCoeffs() {
        
        if (CollUtil.isNotEmpty(compuScaleRationalFormula.getCompuRationalCoeffs())) {
            
            return new CompuRationalCoeffsWrapper(compuScaleRationalFormula.getCompuRationalCoeffs());
            
        } else {
            return null;
        }
        
    }




    


    
}