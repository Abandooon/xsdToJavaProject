package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ShowResourceShortNameEnumWrapper {

    
    private ShowResourceShortNameEnum showResourceShortNameEnum;

    public ShowResourceShortNameEnumWrapper(ShowResourceShortNameEnum showResourceShortNameEnum) {
        this.showResourceShortNameEnum = showResourceShortNameEnum;
    }

   
    public ShowResourceShortNameEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(showResourceShortNameEnum.getValue())) {
            
            return showResourceShortNameEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(showResourceShortNameEnum.getS())) {
            
            return showResourceShortNameEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(showResourceShortNameEnum.getT())) {
            
            return showResourceShortNameEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}