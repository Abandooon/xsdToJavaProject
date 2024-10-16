package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SingleLanguageLongNameWrapper {

    
    private SingleLanguageLongName singleLanguageLongName;

    public SingleLanguageLongNameWrapper(SingleLanguageLongName singleLanguageLongName) {
        this.singleLanguageLongName = singleLanguageLongName;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(singleLanguageLongName.getS())) {
            
            return singleLanguageLongName.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(singleLanguageLongName.getT())) {
            
            return singleLanguageLongName.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(singleLanguageLongName.getContent())) {
            
            return singleLanguageLongName.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = singleLanguageLongName.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}