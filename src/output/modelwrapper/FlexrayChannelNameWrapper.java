package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class FlexrayChannelNameWrapper {

    
    private FlexrayChannelName flexrayChannelName;

    public FlexrayChannelNameWrapper(FlexrayChannelName flexrayChannelName) {
        this.flexrayChannelName = flexrayChannelName;
    }

   
    public FlexrayChannelNameSimple getValue() {
        
        if (CollUtil.isNotEmpty(flexrayChannelName.getValue())) {
            
            return flexrayChannelName.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayChannelName.getS())) {
            
            return flexrayChannelName.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayChannelName.getT())) {
            
            return flexrayChannelName.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}