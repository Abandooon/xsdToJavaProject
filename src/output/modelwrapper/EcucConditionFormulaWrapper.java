package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EcucConditionFormulaWrapper {

    
    private EcucConditionFormula ecucConditionFormula;

    public EcucConditionFormulaWrapper(EcucConditionFormula ecucConditionFormula) {
        this.ecucConditionFormula = ecucConditionFormula;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucConditionFormula.getS())) {
            
            return ecucConditionFormula.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucConditionFormula.getT())) {
            
            return ecucConditionFormula.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(ecucConditionFormula.getContent())) {
            
            return ecucConditionFormula.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = ecucConditionFormula.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}