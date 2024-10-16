package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DiagRequirementIdStringWrapper {

    
    private DiagRequirementIdString diagRequirementIdString;

    public DiagRequirementIdStringWrapper(DiagRequirementIdString diagRequirementIdString) {
        this.diagRequirementIdString = diagRequirementIdString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(diagRequirementIdString.getValue())) {
            
            return diagRequirementIdString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagRequirementIdString.getS())) {
            
            return diagRequirementIdString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagRequirementIdString.getT())) {
            
            return diagRequirementIdString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}