package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class LimitWrapper {

    
    private Limit limit;

    public LimitWrapper(Limit limit) {
        this.limit = limit;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(limit.getS())) {
            
            return limit.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(limit.getT())) {
            
            return limit.getT();
            
        } else {
            return null;
        }
        
    }

    public BindingTimeEnumSimple getBindingTime() {
        
        if (CollUtil.isNotEmpty(limit.getBindingTime())) {
            
            return limit.getBindingTime();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getBlueprintValue() {
        
        if (CollUtil.isNotEmpty(limit.getBlueprintValue())) {
            
            return limit.getBlueprintValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSd() {
        
        if (CollUtil.isNotEmpty(limit.getSd())) {
            
            return limit.getSd();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getShortLabel() {
        
        if (CollUtil.isNotEmpty(limit.getShortLabel())) {
            
            return limit.getShortLabel();
            
        } else {
            return null;
        }
        
    }

    public IntervalTypeEnumSimple getIntervalType() {
        
        if (CollUtil.isNotEmpty(limit.getIntervalType())) {
            
            return limit.getIntervalType();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(limit.getContent())) {
            
            return limit.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = limit.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}