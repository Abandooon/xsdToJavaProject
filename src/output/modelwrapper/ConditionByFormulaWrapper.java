package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ConditionByFormulaWrapper {

    
    private ConditionByFormula conditionByFormula;

    public ConditionByFormulaWrapper(ConditionByFormula conditionByFormula) {
        this.conditionByFormula = conditionByFormula;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(conditionByFormula.getS())) {
            
            return conditionByFormula.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(conditionByFormula.getT())) {
            
            return conditionByFormula.getT();
            
        } else {
            return null;
        }
        
    }

    public BindingTimeEnumSimple getBindingTime() {
        
        if (CollUtil.isNotEmpty(conditionByFormula.getBindingTime())) {
            
            return conditionByFormula.getBindingTime();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(conditionByFormula.getContent())) {
            
            return conditionByFormula.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = conditionByFormula.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}