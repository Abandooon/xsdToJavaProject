package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class CompuRationalCoeffsWrapper {

    
    private CompuRationalCoeffs compuRationalCoeffs;

    public CompuRationalCoeffsWrapper(CompuRationalCoeffs compuRationalCoeffs) {
        this.compuRationalCoeffs = compuRationalCoeffs;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compuRationalCoeffs.getS())) {
            
            return compuRationalCoeffs.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compuRationalCoeffs.getT())) {
            
            return compuRationalCoeffs.getT();
            
        } else {
            return null;
        }
        
    }

    public CompuNominatorDenominatorWrapper getCompuNumerator() {
        
        if (CollUtil.isNotEmpty(compuRationalCoeffs.getCompuNumerator())) {
            
            return new CompuNominatorDenominatorWrapper(compuRationalCoeffs.getCompuNumerator());
            
        } else {
            return null;
        }
        
    }

    public CompuNominatorDenominatorWrapper getCompuDenominator() {
        
        if (CollUtil.isNotEmpty(compuRationalCoeffs.getCompuDenominator())) {
            
            return new CompuNominatorDenominatorWrapper(compuRationalCoeffs.getCompuDenominator());
            
        } else {
            return null;
        }
        
    }




    


    
}