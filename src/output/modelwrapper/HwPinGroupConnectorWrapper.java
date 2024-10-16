package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class HwPinGroupConnectorWrapper {

    
    private HwPinGroupConnector hwPinGroupConnector;

    public HwPinGroupConnectorWrapper(HwPinGroupConnector hwPinGroupConnector) {
        this.hwPinGroupConnector = hwPinGroupConnector;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(hwPinGroupConnector.getS())) {
            
            return hwPinGroupConnector.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(hwPinGroupConnector.getT())) {
            
            return hwPinGroupConnector.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(hwPinGroupConnector.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(hwPinGroupConnector.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(hwPinGroupConnector.getCategory())) {
            
            return new CategoryStringWrapper(hwPinGroupConnector.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(hwPinGroupConnector.getIntroduction())) {
            
            return new DocumentationBlockWrapper(hwPinGroupConnector.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(hwPinGroupConnector.getAdminData())) {
            
            return new AdminDataWrapper(hwPinGroupConnector.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<HwPinConnectorWrapper> getHwPinConnections() {
        
        if (CollUtil.isNotEmpty(hwPinGroupConnector.getHwPinConnections())) {
            ArrayList<HwPinConnector> originalList = hwPinGroupConnector.getHwPinConnections();
            ArrayList<HwPinConnectorWrapper> wrapperList = (ArrayList<HwPinConnectorWrapper>)originalList.stream()
                .map(item -> new HwPinConnectorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<HwPinGroupRefWrapper> getHwPinGroupRefs() {
        
        if (CollUtil.isNotEmpty(hwPinGroupConnector.getHwPinGroupRefs())) {
            ArrayList<HwPinGroupRef> originalList = hwPinGroupConnector.getHwPinGroupRefs();
            ArrayList<HwPinGroupRefWrapper> wrapperList = (ArrayList<HwPinGroupRefWrapper>)originalList.stream()
                .map(item -> new HwPinGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(hwPinGroupConnector.getVariationPoint())) {
            
            return new VariationPointWrapper(hwPinGroupConnector.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}