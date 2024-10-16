package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class FmConditionByFeaturesAndSwSystemconstsWrapper {

    
    private FmConditionByFeaturesAndSwSystemconsts fmConditionByFeaturesAndSwSystemconsts;

    public FmConditionByFeaturesAndSwSystemconstsWrapper(FmConditionByFeaturesAndSwSystemconsts fmConditionByFeaturesAndSwSystemconsts) {
        this.fmConditionByFeaturesAndSwSystemconsts = fmConditionByFeaturesAndSwSystemconsts;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmConditionByFeaturesAndSwSystemconsts.getS())) {
            
            return fmConditionByFeaturesAndSwSystemconsts.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmConditionByFeaturesAndSwSystemconsts.getT())) {
            
            return fmConditionByFeaturesAndSwSystemconsts.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(fmConditionByFeaturesAndSwSystemconsts.getContent())) {
            
            return fmConditionByFeaturesAndSwSystemconsts.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = fmConditionByFeaturesAndSwSystemconsts.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}