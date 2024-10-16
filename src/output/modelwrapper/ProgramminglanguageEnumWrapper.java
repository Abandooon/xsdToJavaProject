package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ProgramminglanguageEnumWrapper {

    
    private ProgramminglanguageEnum programminglanguageEnum;

    public ProgramminglanguageEnumWrapper(ProgramminglanguageEnum programminglanguageEnum) {
        this.programminglanguageEnum = programminglanguageEnum;
    }

   
    public ProgramminglanguageEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(programminglanguageEnum.getValue())) {
            
            return programminglanguageEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(programminglanguageEnum.getS())) {
            
            return programminglanguageEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(programminglanguageEnum.getT())) {
            
            return programminglanguageEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}