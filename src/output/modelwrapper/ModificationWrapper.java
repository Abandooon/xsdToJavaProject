package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ModificationWrapper {

    
    private Modification modification;

    public ModificationWrapper(Modification modification) {
        this.modification = modification;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modification.getS())) {
            
            return modification.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modification.getT())) {
            
            return modification.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getChange() {
        
        if (CollUtil.isNotEmpty(modification.getChange())) {
            
            return new MultiLanguageOverviewParagraphWrapper(modification.getChange());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getReason() {
        
        if (CollUtil.isNotEmpty(modification.getReason())) {
            
            return new MultiLanguageOverviewParagraphWrapper(modification.getReason());
            
        } else {
            return null;
        }
        
    }




    


    
}