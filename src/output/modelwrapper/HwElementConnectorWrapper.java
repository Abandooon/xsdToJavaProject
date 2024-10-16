package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class HwElementConnectorWrapper {

    
    private HwElementConnector hwElementConnector;

    public HwElementConnectorWrapper(HwElementConnector hwElementConnector) {
        this.hwElementConnector = hwElementConnector;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwElementConnector.getS())) {
            
            return hwElementConnector.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwElementConnector.getT())) {
            
            return hwElementConnector.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(hwElementConnector.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(hwElementConnector.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(hwElementConnector.getCategory())) {
            
            return new CategoryStringWrapper(hwElementConnector.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(hwElementConnector.getIntroduction())) {
            
            return new DocumentationBlockWrapper(hwElementConnector.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(hwElementConnector.getAdminData())) {
            
            return new AdminDataWrapper(hwElementConnector.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<HwElementRefWrapper> getHwElementRefs() {
        
        if (CollUtil.isNotEmpty(hwElementConnector.getHwElementRefs())) {
            ArrayList<HwElementRef> originalList = hwElementConnector.getHwElementRefs();
            ArrayList<HwElementRefWrapper> wrapperList = (ArrayList<HwElementRefWrapper>)originalList.stream()
                .map(item -> new HwElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwPinGroupConnectorWrapper> getHwPinGroupConnections() {
        
        if (CollUtil.isNotEmpty(hwElementConnector.getHwPinGroupConnections())) {
            ArrayList<HwPinGroupConnector> originalList = hwElementConnector.getHwPinGroupConnections();
            ArrayList<HwPinGroupConnectorWrapper> wrapperList = (ArrayList<HwPinGroupConnectorWrapper>)originalList.stream()
                .map(item -> new HwPinGroupConnectorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwPinConnectorWrapper> getHwPinConnections() {
        
        if (CollUtil.isNotEmpty(hwElementConnector.getHwPinConnections())) {
            ArrayList<HwPinConnector> originalList = hwElementConnector.getHwPinConnections();
            ArrayList<HwPinConnectorWrapper> wrapperList = (ArrayList<HwPinConnectorWrapper>)originalList.stream()
                .map(item -> new HwPinConnectorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(hwElementConnector.getVariationPoint())) {
            
            return new VariationPointWrapper(hwElementConnector.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}