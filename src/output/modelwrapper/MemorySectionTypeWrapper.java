package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MemorySectionTypeWrapper {

    
    private MemorySectionType memorySectionType;

    public MemorySectionTypeWrapper(MemorySectionType memorySectionType) {
        this.memorySectionType = memorySectionType;
    }

   
    public MemorySectionTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(memorySectionType.getValue())) {
            
            return memorySectionType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(memorySectionType.getS())) {
            
            return memorySectionType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(memorySectionType.getT())) {
            
            return memorySectionType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}