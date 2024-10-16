package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class LVerbatimWrapper {

    
    private LVerbatim lVerbatim;

    public LVerbatimWrapper(LVerbatim lVerbatim) {
        this.lVerbatim = lVerbatim;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(lVerbatim.getS())) {
            
            return lVerbatim.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(lVerbatim.getT())) {
            
            return lVerbatim.getT();
            
        } else {
            return null;
        }
        
    }

    public LEnumSimple getL() {
        
        if (CollUtil.isNotEmpty(lVerbatim.getL())) {
            
            return lVerbatim.getL();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(lVerbatim.getContent())) {
            
            return lVerbatim.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = lVerbatim.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}