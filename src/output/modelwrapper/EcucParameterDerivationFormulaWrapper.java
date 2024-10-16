package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EcucParameterDerivationFormulaWrapper {

    
    private EcucParameterDerivationFormula ecucParameterDerivationFormula;

    public EcucParameterDerivationFormulaWrapper(EcucParameterDerivationFormula ecucParameterDerivationFormula) {
        this.ecucParameterDerivationFormula = ecucParameterDerivationFormula;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucParameterDerivationFormula.getS())) {
            
            return ecucParameterDerivationFormula.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucParameterDerivationFormula.getT())) {
            
            return ecucParameterDerivationFormula.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(ecucParameterDerivationFormula.getContent())) {
            
            return ecucParameterDerivationFormula.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = ecucParameterDerivationFormula.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}