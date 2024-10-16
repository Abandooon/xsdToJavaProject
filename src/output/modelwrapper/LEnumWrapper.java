package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class LEnumWrapper {

    
    private LEnum lEnum;

    public LEnumWrapper(LEnum lEnum) {
        this.lEnum = lEnum;
    }

   
    public LEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(lEnum.getValue())) {
            
            return lEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(lEnum.getS())) {
            
            return lEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(lEnum.getT())) {
            
            return lEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}