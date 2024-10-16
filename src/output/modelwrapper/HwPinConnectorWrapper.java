package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class HwPinConnectorWrapper {

    
    private HwPinConnector hwPinConnector;

    public HwPinConnectorWrapper(HwPinConnector hwPinConnector) {
        this.hwPinConnector = hwPinConnector;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwPinConnector.getS())) {
            
            return hwPinConnector.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwPinConnector.getT())) {
            
            return hwPinConnector.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(hwPinConnector.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(hwPinConnector.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(hwPinConnector.getCategory())) {
            
            return new CategoryStringWrapper(hwPinConnector.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(hwPinConnector.getIntroduction())) {
            
            return new DocumentationBlockWrapper(hwPinConnector.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(hwPinConnector.getAdminData())) {
            
            return new AdminDataWrapper(hwPinConnector.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<HwPinRefWrapper> getHwPinRefs() {
        
        if (CollUtil.isNotEmpty(hwPinConnector.getHwPinRefs())) {
            ArrayList<HwPinRef> originalList = hwPinConnector.getHwPinRefs();
            ArrayList<HwPinRefWrapper> wrapperList = (ArrayList<HwPinRefWrapper>)originalList.stream()
                .map(item -> new HwPinRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(hwPinConnector.getVariationPoint())) {
            
            return new VariationPointWrapper(hwPinConnector.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}