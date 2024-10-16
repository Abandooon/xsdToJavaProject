package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class AlignEnumWrapper {

    
    private AlignEnum alignEnum;

    public AlignEnumWrapper(AlignEnum alignEnum) {
        this.alignEnum = alignEnum;
    }

   
    public AlignEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(alignEnum.getValue())) {
            
            return alignEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(alignEnum.getS())) {
            
            return alignEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(alignEnum.getT())) {
            
            return alignEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}