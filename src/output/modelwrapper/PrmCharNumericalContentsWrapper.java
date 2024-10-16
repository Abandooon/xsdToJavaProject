package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class PrmCharNumericalContentsWrapper {

    
    private PrmCharNumericalContents prmCharNumericalContents;

    public PrmCharNumericalContentsWrapper(PrmCharNumericalContents prmCharNumericalContents) {
        this.prmCharNumericalContents = prmCharNumericalContents;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(prmCharNumericalContents.getS())) {
            
            return prmCharNumericalContents.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(prmCharNumericalContents.getT())) {
            
            return prmCharNumericalContents.getT();
            
        } else {
            return null;
        }
        
    }

    public SingleLanguageUnitNamesWrapper getPrmUnit() {
        
        if (CollUtil.isNotEmpty(prmCharNumericalContents.getPrmUnit())) {
            
            return new SingleLanguageUnitNamesWrapper(prmCharNumericalContents.getPrmUnit());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getAbs() {
        
        if (CollUtil.isNotEmpty(prmCharNumericalContents.getAbs())) {
            
            return new NumericalValueWrapper(prmCharNumericalContents.getAbs());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getTol() {
        
        if (CollUtil.isNotEmpty(prmCharNumericalContents.getTol())) {
            
            return new NumericalValueWrapper(prmCharNumericalContents.getTol());
            
        } else {
            return null;
        }
        
    }




    


    
}