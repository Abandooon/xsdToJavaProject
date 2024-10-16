package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class UnlimitedIntegerValueVariationPointWrapper {

    
    private UnlimitedIntegerValueVariationPoint unlimitedIntegerValueVariationPoint;

    public UnlimitedIntegerValueVariationPointWrapper(UnlimitedIntegerValueVariationPoint unlimitedIntegerValueVariationPoint) {
        this.unlimitedIntegerValueVariationPoint = unlimitedIntegerValueVariationPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(unlimitedIntegerValueVariationPoint.getS())) {
            
            return unlimitedIntegerValueVariationPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(unlimitedIntegerValueVariationPoint.getT())) {
            
            return unlimitedIntegerValueVariationPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public BindingTimeEnumSimple getBindingTime() {
        
        if (CollUtil.isNotEmpty(unlimitedIntegerValueVariationPoint.getBindingTime())) {
            
            return unlimitedIntegerValueVariationPoint.getBindingTime();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getBlueprintValue() {
        
        if (CollUtil.isNotEmpty(unlimitedIntegerValueVariationPoint.getBlueprintValue())) {
            
            return unlimitedIntegerValueVariationPoint.getBlueprintValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSd() {
        
        if (CollUtil.isNotEmpty(unlimitedIntegerValueVariationPoint.getSd())) {
            
            return unlimitedIntegerValueVariationPoint.getSd();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getShortLabel() {
        
        if (CollUtil.isNotEmpty(unlimitedIntegerValueVariationPoint.getShortLabel())) {
            
            return unlimitedIntegerValueVariationPoint.getShortLabel();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(unlimitedIntegerValueVariationPoint.getContent())) {
            
            return unlimitedIntegerValueVariationPoint.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = unlimitedIntegerValueVariationPoint.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}