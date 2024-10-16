package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class CompuWrapper {

    
    private Compu compu;

    public CompuWrapper(Compu compu) {
        this.compu = compu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compu.getS())) {
            
            return compu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compu.getT())) {
            
            return compu.getT();
            
        } else {
            return null;
        }
        
    }

    public CompuConstWrapper getCompuDefaultValue() {
        
        if (CollUtil.isNotEmpty(compu.getCompuDefaultValue())) {
            
            return new CompuConstWrapper(compu.getCompuDefaultValue());
            
        } else {
            return null;
        }
        
    }

    public CompuScales_CompuWrapper getCompuScales() {
        
        if (CollUtil.isNotEmpty(compu.getCompuScales())) {
            
            return new CompuScales_CompuWrapper(compu.getCompuScales());
            
        } else {
            return null;
        }
        
    }




    


    
}