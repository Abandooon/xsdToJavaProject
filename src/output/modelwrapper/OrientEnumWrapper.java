package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class OrientEnumWrapper {

    
    private OrientEnum orientEnum;

    public OrientEnumWrapper(OrientEnum orientEnum) {
        this.orientEnum = orientEnum;
    }

   
    public OrientEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(orientEnum.getValue())) {
            
            return orientEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(orientEnum.getS())) {
            
            return orientEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(orientEnum.getT())) {
            
            return orientEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}