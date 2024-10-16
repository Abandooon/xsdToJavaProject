package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ListEnumWrapper {

    
    private ListEnum listEnum;

    public ListEnumWrapper(ListEnum listEnum) {
        this.listEnum = listEnum;
    }

   
    public ListEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(listEnum.getValue())) {
            
            return listEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(listEnum.getS())) {
            
            return listEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(listEnum.getT())) {
            
            return listEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}