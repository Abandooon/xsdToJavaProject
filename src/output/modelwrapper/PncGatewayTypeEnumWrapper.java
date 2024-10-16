package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class PncGatewayTypeEnumWrapper {

    
    private PncGatewayTypeEnum pncGatewayTypeEnum;

    public PncGatewayTypeEnumWrapper(PncGatewayTypeEnum pncGatewayTypeEnum) {
        this.pncGatewayTypeEnum = pncGatewayTypeEnum;
    }

   
    public PncGatewayTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(pncGatewayTypeEnum.getValue())) {
            
            return pncGatewayTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pncGatewayTypeEnum.getS())) {
            
            return pncGatewayTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pncGatewayTypeEnum.getT())) {
            
            return pncGatewayTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}