package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SwCalprmAxisSetWrapper {

    
    private SwCalprmAxisSet swCalprmAxisSet;

    public SwCalprmAxisSetWrapper(SwCalprmAxisSet swCalprmAxisSet) {
        this.swCalprmAxisSet = swCalprmAxisSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swCalprmAxisSet.getS())) {
            
            return swCalprmAxisSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swCalprmAxisSet.getT())) {
            
            return swCalprmAxisSet.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwCalprmAxisWrapper> getSwCalprmAxis() {
        
        if (CollUtil.isNotEmpty(swCalprmAxisSet.getSwCalprmAxis())) {
            ArrayList<SwCalprmAxis> originalList = swCalprmAxisSet.getSwCalprmAxis();
            ArrayList<SwCalprmAxisWrapper> wrapperList = (ArrayList<SwCalprmAxisWrapper>)originalList.stream()
                .map(item -> new SwCalprmAxisWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}