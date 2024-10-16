package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EthernetPhysicalLayerTypeEnumWrapper {

    
    private EthernetPhysicalLayerTypeEnum ethernetPhysicalLayerTypeEnum;

    public EthernetPhysicalLayerTypeEnumWrapper(EthernetPhysicalLayerTypeEnum ethernetPhysicalLayerTypeEnum) {
        this.ethernetPhysicalLayerTypeEnum = ethernetPhysicalLayerTypeEnum;
    }

   
    public EthernetPhysicalLayerTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalLayerTypeEnum.getValue())) {
            
            return ethernetPhysicalLayerTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalLayerTypeEnum.getS())) {
            
            return ethernetPhysicalLayerTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ethernetPhysicalLayerTypeEnum.getT())) {
            
            return ethernetPhysicalLayerTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}