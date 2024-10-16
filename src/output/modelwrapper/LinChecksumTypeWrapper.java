package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class LinChecksumTypeWrapper {

    
    private LinChecksumType linChecksumType;

    public LinChecksumTypeWrapper(LinChecksumType linChecksumType) {
        this.linChecksumType = linChecksumType;
    }

   
    public LinChecksumTypeSimple getValue() {
        
        if (CollUtil.isNotEmpty(linChecksumType.getValue())) {
            
            return linChecksumType.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linChecksumType.getS())) {
            
            return linChecksumType.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linChecksumType.getT())) {
            
            return linChecksumType.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}