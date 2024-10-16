package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class PrmCharMinTypMaxWrapper {

    
    private PrmCharMinTypMax prmCharMinTypMax;

    public PrmCharMinTypMaxWrapper(PrmCharMinTypMax prmCharMinTypMax) {
        this.prmCharMinTypMax = prmCharMinTypMax;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(prmCharMinTypMax.getS())) {
            
            return prmCharMinTypMax.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(prmCharMinTypMax.getT())) {
            
            return prmCharMinTypMax.getT();
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getMin() {
        
        if (CollUtil.isNotEmpty(prmCharMinTypMax.getMin())) {
            
            return new NumericalValueWrapper(prmCharMinTypMax.getMin());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getTyp() {
        
        if (CollUtil.isNotEmpty(prmCharMinTypMax.getTyp())) {
            
            return new NumericalValueWrapper(prmCharMinTypMax.getTyp());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getMax() {
        
        if (CollUtil.isNotEmpty(prmCharMinTypMax.getMax())) {
            
            return new NumericalValueWrapper(prmCharMinTypMax.getMax());
            
        } else {
            return null;
        }
        
    }




    


    
}