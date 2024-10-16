package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ShowResourceAliasNameEnumWrapper {

    
    private ShowResourceAliasNameEnum showResourceAliasNameEnum;

    public ShowResourceAliasNameEnumWrapper(ShowResourceAliasNameEnum showResourceAliasNameEnum) {
        this.showResourceAliasNameEnum = showResourceAliasNameEnum;
    }

   
    public ShowResourceAliasNameEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(showResourceAliasNameEnum.getValue())) {
            
            return showResourceAliasNameEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(showResourceAliasNameEnum.getS())) {
            
            return showResourceAliasNameEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(showResourceAliasNameEnum.getT())) {
            
            return showResourceAliasNameEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}