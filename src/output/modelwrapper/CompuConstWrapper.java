package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CompuConstWrapper {

    
    private CompuConst compuConst;

    public CompuConstWrapper(CompuConst compuConst) {
        this.compuConst = compuConst;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compuConst.getS())) {
            
            return compuConst.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compuConst.getT())) {
            
            return compuConst.getT();
            
        } else {
            return null;
        }
        
    }

    public NumericalValueVariationPointWrapper getVf() {
        
        if (CollUtil.isNotEmpty(compuConst.getVf())) {
            
            return new NumericalValueVariationPointWrapper(compuConst.getVf());
            
        } else {
            return null;
        }
        
    }




    


    
}