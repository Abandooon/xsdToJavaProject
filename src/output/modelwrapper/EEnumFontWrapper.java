package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EEnumFontWrapper {

    
    private EEnumFont eEnumFont;

    public EEnumFontWrapper(EEnumFont eEnumFont) {
        this.eEnumFont = eEnumFont;
    }

   
    public EEnumFontSimple getValue() {
        
        if (CollUtil.isNotEmpty(eEnumFont.getValue())) {
            
            return eEnumFont.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(eEnumFont.getS())) {
            
            return eEnumFont.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(eEnumFont.getT())) {
            
            return eEnumFont.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}