package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class PgwideEnumWrapper {

    
    private PgwideEnum pgwideEnum;

    public PgwideEnumWrapper(PgwideEnum pgwideEnum) {
        this.pgwideEnum = pgwideEnum;
    }

   
    public PgwideEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(pgwideEnum.getValue())) {
            
            return pgwideEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pgwideEnum.getS())) {
            
            return pgwideEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pgwideEnum.getT())) {
            
            return pgwideEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}