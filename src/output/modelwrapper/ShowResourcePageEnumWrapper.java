package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ShowResourcePageEnumWrapper {

    
    private ShowResourcePageEnum showResourcePageEnum;

    public ShowResourcePageEnumWrapper(ShowResourcePageEnum showResourcePageEnum) {
        this.showResourcePageEnum = showResourcePageEnum;
    }

   
    public ShowResourcePageEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(showResourcePageEnum.getValue())) {
            
            return showResourcePageEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(showResourcePageEnum.getS())) {
            
            return showResourcePageEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(showResourcePageEnum.getT())) {
            
            return showResourcePageEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}