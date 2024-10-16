package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.SocketAddress;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class SocketAddressWrapper {

    
    private SocketAddress socketAddress;

    public SocketAddressWrapper(SocketAddress socketAddress) {
        this.socketAddress = socketAddress;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(socketAddress.getS())) {
            
            return socketAddress.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(socketAddress.getT())) {
            
            return socketAddress.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(socketAddress.getUuid())) {
            
            return socketAddress.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(socketAddress.getShortName())) {
            
            return new IdentifierWrapper(socketAddress.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(socketAddress.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = socketAddress.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(socketAddress.getLongName())) {
            
            return new MultilanguageLongNameWrapper(socketAddress.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(socketAddress.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(socketAddress.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(socketAddress.getCategory())) {
            
            return new CategoryStringWrapper(socketAddress.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(socketAddress.getAdminData())) {
            
            return new AdminDataWrapper(socketAddress.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(socketAddress.getIntroduction())) {
            
            return new DocumentationBlockWrapper(socketAddress.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(socketAddress.getAnnotations())) {
            ArrayList<Annotation> originalList = socketAddress.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ApplicationEndpointWrapper getApplicationEndpoint() {
        
        if (CollUtil.isNotEmpty(socketAddress.getApplicationEndpoint())) {
            
            return new ApplicationEndpointWrapper(socketAddress.getApplicationEndpoint());
            
        } else {
            return null;
        }
        
    }

    public ConnectorRef_SocketAddressWrapper getConnectorRef() {
        
        if (CollUtil.isNotEmpty(socketAddress.getConnectorRef())) {
            
            return new ConnectorRef_SocketAddressWrapper(socketAddress.getConnectorRef());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getIpAddress() {
        
        if (CollUtil.isNotEmpty(socketAddress.getIpAddress())) {
            
            return new StringWrapper(socketAddress.getIpAddress());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MulticastConnectorRefWrapper> getMulticastConnectorRefs() {
        
        if (CollUtil.isNotEmpty(socketAddress.getMulticastConnectorRefs())) {
            ArrayList<MulticastConnectorRef> originalList = socketAddress.getMulticastConnectorRefs();
            ArrayList<MulticastConnectorRefWrapper> wrapperList = (ArrayList<MulticastConnectorRefWrapper>)originalList.stream()
                .map(item -> new MulticastConnectorRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPortAddress() {
        
        if (CollUtil.isNotEmpty(socketAddress.getPortAddress())) {
            
            return new IntegerWrapper(socketAddress.getPortAddress());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(socketAddress.getVariationPoint())) {
            
            return new VariationPointWrapper(socketAddress.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}