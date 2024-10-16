package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ResumePositionWrapper {

    
    private ResumePosition resumePosition;

    public ResumePositionWrapper(ResumePosition resumePosition) {
        this.resumePosition = resumePosition;
    }

   
    public ResumePositionSimple getValue() {
        
        if (CollUtil.isNotEmpty(resumePosition.getValue())) {
            
            return resumePosition.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(resumePosition.getS())) {
            
            return resumePosition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(resumePosition.getT())) {
            
            return resumePosition.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}