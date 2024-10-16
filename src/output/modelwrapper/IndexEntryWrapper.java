package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class IndexEntryWrapper {

    
    private IndexEntry indexEntry;

    public IndexEntryWrapper(IndexEntry indexEntry) {
        this.indexEntry = indexEntry;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(indexEntry.getS())) {
            
            return indexEntry.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(indexEntry.getT())) {
            
            return indexEntry.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(indexEntry.getContent())) {
            
            return indexEntry.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = indexEntry.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}