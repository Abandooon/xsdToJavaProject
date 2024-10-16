package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ScaleConstrValidityEnumWrapper {

    
    private ScaleConstrValidityEnum scaleConstrValidityEnum;

    public ScaleConstrValidityEnumWrapper(ScaleConstrValidityEnum scaleConstrValidityEnum) {
        this.scaleConstrValidityEnum = scaleConstrValidityEnum;
    }

   
    public ScaleConstrValidityEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(scaleConstrValidityEnum.getValue())) {
            
            return scaleConstrValidityEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(scaleConstrValidityEnum.getS())) {
            
            return scaleConstrValidityEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(scaleConstrValidityEnum.getT())) {
            
            return scaleConstrValidityEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}