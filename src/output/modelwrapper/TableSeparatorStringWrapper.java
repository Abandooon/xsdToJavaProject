package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TableSeparatorStringWrapper {

    
    private TableSeparatorString tableSeparatorString;

    public TableSeparatorStringWrapper(TableSeparatorString tableSeparatorString) {
        this.tableSeparatorString = tableSeparatorString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(tableSeparatorString.getValue())) {
            
            return tableSeparatorString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tableSeparatorString.getS())) {
            
            return tableSeparatorString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tableSeparatorString.getT())) {
            
            return tableSeparatorString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}