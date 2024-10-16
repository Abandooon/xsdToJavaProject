package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EthernetConnectionNegotiationEnumWrapper {

    
    private EthernetConnectionNegotiationEnum ethernetConnectionNegotiationEnum;

    public EthernetConnectionNegotiationEnumWrapper(EthernetConnectionNegotiationEnum ethernetConnectionNegotiationEnum) {
        this.ethernetConnectionNegotiationEnum = ethernetConnectionNegotiationEnum;
    }

   
    public EthernetConnectionNegotiationEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(ethernetConnectionNegotiationEnum.getValue())) {
            
            return ethernetConnectionNegotiationEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ethernetConnectionNegotiationEnum.getS())) {
            
            return ethernetConnectionNegotiationEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ethernetConnectionNegotiationEnum.getT())) {
            
            return ethernetConnectionNegotiationEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}