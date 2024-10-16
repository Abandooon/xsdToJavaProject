package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    


public class ClientServerAnnotationWrapper {

    
    private ClientServerAnnotation clientServerAnnotation;

    public ClientServerAnnotationWrapper(ClientServerAnnotation clientServerAnnotation) {
        this.clientServerAnnotation = clientServerAnnotation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientServerAnnotation.getS())) {
            
            return clientServerAnnotation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientServerAnnotation.getT())) {
            
            return clientServerAnnotation.getT();
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(clientServerAnnotation.getLabel())) {
            
            return new MultilanguageLongNameWrapper(clientServerAnnotation.getLabel());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getAnnotationOrigin() {
        
        if (CollUtil.isNotEmpty(clientServerAnnotation.getAnnotationOrigin())) {
            
            return new StringWrapper(clientServerAnnotation.getAnnotationOrigin());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getAnnotationText() {
        
        if (CollUtil.isNotEmpty(clientServerAnnotation.getAnnotationText())) {
            
            return new DocumentationBlockWrapper(clientServerAnnotation.getAnnotationText());
            
        } else {
            return null;
        }
        
    }

    public OperationRefWrapper getOperationRef() {
        
        if (CollUtil.isNotEmpty(clientServerAnnotation.getOperationRef())) {
            
            return new OperationRefWrapper(clientServerAnnotation.getOperationRef());
            
        } else {
            return null;
        }
        
    }




    


    
}