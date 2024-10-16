package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class PrmCharWrapper {

    
    private PrmChar prmChar;

    public PrmCharWrapper(PrmChar prmChar) {
        this.prmChar = prmChar;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(prmChar.getS())) {
            
            return prmChar.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(prmChar.getT())) {
            
            return prmChar.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getCond() {
        
        if (CollUtil.isNotEmpty(prmChar.getCond())) {
            
            return new DocumentationBlockWrapper(prmChar.getCond());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getRemark() {
        
        if (CollUtil.isNotEmpty(prmChar.getRemark())) {
            
            return new DocumentationBlockWrapper(prmChar.getRemark());
            
        } else {
            return null;
        }
        
    }

    public SingleLanguageUnitNamesWrapper getPrmUnit() {
        
        if (CollUtil.isNotEmpty(prmChar.getPrmUnit())) {
            
            return new SingleLanguageUnitNamesWrapper(prmChar.getPrmUnit());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getAbs() {
        
        if (CollUtil.isNotEmpty(prmChar.getAbs())) {
            
            return new NumericalValueWrapper(prmChar.getAbs());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getTol() {
        
        if (CollUtil.isNotEmpty(prmChar.getTol())) {
            
            return new NumericalValueWrapper(prmChar.getTol());
            
        } else {
            return null;
        }
        
    }




    


    
}