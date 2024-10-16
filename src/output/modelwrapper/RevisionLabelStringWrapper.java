package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class RevisionLabelStringWrapper {

    
    private RevisionLabelString revisionLabelString;

    public RevisionLabelStringWrapper(RevisionLabelString revisionLabelString) {
        this.revisionLabelString = revisionLabelString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(revisionLabelString.getValue())) {
            
            return revisionLabelString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(revisionLabelString.getS())) {
            
            return revisionLabelString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(revisionLabelString.getT())) {
            
            return revisionLabelString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}