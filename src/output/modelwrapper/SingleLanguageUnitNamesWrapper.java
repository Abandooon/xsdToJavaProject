package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SingleLanguageUnitNamesWrapper {

    
    private SingleLanguageUnitNames singleLanguageUnitNames;

    public SingleLanguageUnitNamesWrapper(SingleLanguageUnitNames singleLanguageUnitNames) {
        this.singleLanguageUnitNames = singleLanguageUnitNames;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(singleLanguageUnitNames.getS())) {
            
            return singleLanguageUnitNames.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(singleLanguageUnitNames.getT())) {
            
            return singleLanguageUnitNames.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(singleLanguageUnitNames.getContent())) {
            
            return singleLanguageUnitNames.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = singleLanguageUnitNames.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}