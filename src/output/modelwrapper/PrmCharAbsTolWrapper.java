package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PrmCharAbsTolWrapper {

    
    private PrmCharAbsTol prmCharAbsTol;

    public PrmCharAbsTolWrapper(PrmCharAbsTol prmCharAbsTol) {
        this.prmCharAbsTol = prmCharAbsTol;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(prmCharAbsTol.getS())) {
            
            return prmCharAbsTol.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(prmCharAbsTol.getT())) {
            
            return prmCharAbsTol.getT();
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getAbs() {
        
        if (CollUtil.isNotEmpty(prmCharAbsTol.getAbs())) {
            
            return new NumericalValueWrapper(prmCharAbsTol.getAbs());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getTol() {
        
        if (CollUtil.isNotEmpty(prmCharAbsTol.getTol())) {
            
            return new NumericalValueWrapper(prmCharAbsTol.getTol());
            
        } else {
            return null;
        }
        
    }




    


    
}