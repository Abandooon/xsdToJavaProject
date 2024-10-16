package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class HwPinGroupContentWrapper {

    
    private HwPinGroupContent hwPinGroupContent;

    public HwPinGroupContentWrapper(HwPinGroupContent hwPinGroupContent) {
        this.hwPinGroupContent = hwPinGroupContent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwPinGroupContent.getS())) {
            
            return hwPinGroupContent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwPinGroupContent.getT())) {
            
            return hwPinGroupContent.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<HwPinWrapper> getHwPin() {
        
        if (CollUtil.isNotEmpty(hwPinGroupContent.getHwPin())) {
            ArrayList<HwPin> originalList = hwPinGroupContent.getHwPin();
            ArrayList<HwPinWrapper> wrapperList = (ArrayList<HwPinWrapper>)originalList.stream()
                .map(item -> new HwPinWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwPinGroupWrapper> getHwPinGroup() {
        
        if (CollUtil.isNotEmpty(hwPinGroupContent.getHwPinGroup())) {
            ArrayList<HwPinGroup> originalList = hwPinGroupContent.getHwPinGroup();
            ArrayList<HwPinGroupWrapper> wrapperList = (ArrayList<HwPinGroupWrapper>)originalList.stream()
                .map(item -> new HwPinGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}