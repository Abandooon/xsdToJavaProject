package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SwcToSwcSignalWrapper {

    
    private SwcToSwcSignal swcToSwcSignal;

    public SwcToSwcSignalWrapper(SwcToSwcSignal swcToSwcSignal) {
        this.swcToSwcSignal = swcToSwcSignal;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcToSwcSignal.getS())) {
            
            return swcToSwcSignal.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcToSwcSignal.getT())) {
            
            return swcToSwcSignal.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableDataPrototypeInSystemInstanceRefWrapper> getDataElementIrefs() {
        
        if (CollUtil.isNotEmpty(swcToSwcSignal.getDataElementIrefs())) {
            ArrayList<VariableDataPrototypeInSystemInstanceRef> originalList = swcToSwcSignal.getDataElementIrefs();
            ArrayList<VariableDataPrototypeInSystemInstanceRefWrapper> wrapperList = (ArrayList<VariableDataPrototypeInSystemInstanceRefWrapper>)originalList.stream()
                .map(item -> new VariableDataPrototypeInSystemInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}