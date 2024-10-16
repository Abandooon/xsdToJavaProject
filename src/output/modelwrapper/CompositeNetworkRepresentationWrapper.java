package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class CompositeNetworkRepresentationWrapper {

    
    private CompositeNetworkRepresentation compositeNetworkRepresentation;

    public CompositeNetworkRepresentationWrapper(CompositeNetworkRepresentation compositeNetworkRepresentation) {
        this.compositeNetworkRepresentation = compositeNetworkRepresentation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compositeNetworkRepresentation.getS())) {
            
            return compositeNetworkRepresentation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compositeNetworkRepresentation.getT())) {
            
            return compositeNetworkRepresentation.getT();
            
        } else {
            return null;
        }
        
    }

    public ApplicationCompositeElementInPortInterfaceInstanceRefWrapper getLeafElementIref() {
        
        if (CollUtil.isNotEmpty(compositeNetworkRepresentation.getLeafElementIref())) {
            
            return new ApplicationCompositeElementInPortInterfaceInstanceRefWrapper(compositeNetworkRepresentation.getLeafElementIref());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getNetworkRepresentation() {
        
        if (CollUtil.isNotEmpty(compositeNetworkRepresentation.getNetworkRepresentation())) {
            
            return new SwDataDefPropsWrapper(compositeNetworkRepresentation.getNetworkRepresentation());
            
        } else {
            return null;
        }
        
    }




    


    
}