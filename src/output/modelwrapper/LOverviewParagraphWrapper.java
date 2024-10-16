package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class LOverviewParagraphWrapper {

    
    private LOverviewParagraph lOverviewParagraph;

    public LOverviewParagraphWrapper(LOverviewParagraph lOverviewParagraph) {
        this.lOverviewParagraph = lOverviewParagraph;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(lOverviewParagraph.getS())) {
            
            return lOverviewParagraph.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(lOverviewParagraph.getT())) {
            
            return lOverviewParagraph.getT();
            
        } else {
            return null;
        }
        
    }

    public LEnumSimple getL() {
        
        if (CollUtil.isNotEmpty(lOverviewParagraph.getL())) {
            
            return lOverviewParagraph.getL();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(lOverviewParagraph.getContent())) {
            
            return lOverviewParagraph.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = lOverviewParagraph.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}