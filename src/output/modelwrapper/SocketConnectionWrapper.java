package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SocketConnectionWrapper {

    
    private SocketConnection socketConnection;

    public SocketConnectionWrapper(SocketConnection socketConnection) {
        this.socketConnection = socketConnection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(socketConnection.getS())) {
            
            return socketConnection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(socketConnection.getT())) {
            
            return socketConnection.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(socketConnection.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(socketConnection.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(socketConnection.getCategory())) {
            
            return new CategoryStringWrapper(socketConnection.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(socketConnection.getIntroduction())) {
            
            return new DocumentationBlockWrapper(socketConnection.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(socketConnection.getAdminData())) {
            
            return new AdminDataWrapper(socketConnection.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public SoAdConnectorTypeWrapper getAutosarConnector() {
        
        if (CollUtil.isNotEmpty(socketConnection.getAutosarConnector())) {
            
            return new SoAdConnectorTypeWrapper(socketConnection.getAutosarConnector());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getClientIpAddrFromConnectionRequest() {
        
        if (CollUtil.isNotEmpty(socketConnection.getClientIpAddrFromConnectionRequest())) {
            
            return new BooleanWrapper(socketConnection.getClientIpAddrFromConnectionRequest());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getClientPortFromConnectionRequest() {
        
        if (CollUtil.isNotEmpty(socketConnection.getClientPortFromConnectionRequest())) {
            
            return new BooleanWrapper(socketConnection.getClientPortFromConnectionRequest());
            
        } else {
            return null;
        }
        
    }

    public ClientPortRefWrapper getClientPortRef() {
        
        if (CollUtil.isNotEmpty(socketConnection.getClientPortRef())) {
            
            return new ClientPortRefWrapper(socketConnection.getClientPortRef());
            
        } else {
            return null;
        }
        
    }

    public DoIpSourceAddressRef_SocketConnectionWrapper getDoIpSourceAddressRef() {
        
        if (CollUtil.isNotEmpty(socketConnection.getDoIpSourceAddressRef())) {
            
            return new DoIpSourceAddressRef_SocketConnectionWrapper(socketConnection.getDoIpSourceAddressRef());
            
        } else {
            return null;
        }
        
    }

    public DoIpTargetAddressRef_SocketConnectionWrapper getDoIpTargetAddressRef() {
        
        if (CollUtil.isNotEmpty(socketConnection.getDoIpTargetAddressRef())) {
            
            return new DoIpTargetAddressRef_SocketConnectionWrapper(socketConnection.getDoIpTargetAddressRef());
            
        } else {
            return null;
        }
        
    }

    public TpConnectionIdentWrapper getIdent() {
        
        if (CollUtil.isNotEmpty(socketConnection.getIdent())) {
            
            return new TpConnectionIdentWrapper(socketConnection.getIdent());
            
        } else {
            return null;
        }
        
    }

    public LocalPortRefWrapper getLocalPortRef() {
        
        if (CollUtil.isNotEmpty(socketConnection.getLocalPortRef())) {
            
            return new LocalPortRefWrapper(socketConnection.getLocalPortRef());
            
        } else {
            return null;
        }
        
    }

    public NPduRefWrapper getNPduRef() {
        
        if (CollUtil.isNotEmpty(socketConnection.getNPduRef())) {
            
            return new NPduRefWrapper(socketConnection.getNPduRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SocketConnectionIpduIdentifierWrapper> getPdus() {
        
        if (CollUtil.isNotEmpty(socketConnection.getPdus())) {
            ArrayList<SocketConnectionIpduIdentifier> originalList = socketConnection.getPdus();
            ArrayList<SocketConnectionIpduIdentifierWrapper> wrapperList = (ArrayList<SocketConnectionIpduIdentifierWrapper>)originalList.stream()
                .map(item -> new SocketConnectionIpduIdentifierWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPduCollectionMaxBufferSize() {
        
        if (CollUtil.isNotEmpty(socketConnection.getPduCollectionMaxBufferSize())) {
            
            return new PositiveIntegerWrapper(socketConnection.getPduCollectionMaxBufferSize());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getPduCollectionTimeout() {
        
        if (CollUtil.isNotEmpty(socketConnection.getPduCollectionTimeout())) {
            
            return new TimeValueWrapper(socketConnection.getPduCollectionTimeout());
            
        } else {
            return null;
        }
        
    }

    public RemotePortRefWrapper getRemotePortRef() {
        
        if (CollUtil.isNotEmpty(socketConnection.getRemotePortRef())) {
            
            return new RemotePortRefWrapper(socketConnection.getRemotePortRef());
            
        } else {
            return null;
        }
        
    }

    public RuntimeAddressConfigurationEnumWrapper getRuntimeIpAddressConfiguration() {
        
        if (CollUtil.isNotEmpty(socketConnection.getRuntimeIpAddressConfiguration())) {
            
            return new RuntimeAddressConfigurationEnumWrapper(socketConnection.getRuntimeIpAddressConfiguration());
            
        } else {
            return null;
        }
        
    }

    public RuntimeAddressConfigurationEnumWrapper getRuntimePortConfiguration() {
        
        if (CollUtil.isNotEmpty(socketConnection.getRuntimePortConfiguration())) {
            
            return new RuntimeAddressConfigurationEnumWrapper(socketConnection.getRuntimePortConfiguration());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(socketConnection.getShortLabel())) {
            
            return new IdentifierWrapper(socketConnection.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public SoAdProtocolTypeWrapper getSocketProtocol() {
        
        if (CollUtil.isNotEmpty(socketConnection.getSocketProtocol())) {
            
            return new SoAdProtocolTypeWrapper(socketConnection.getSocketProtocol());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(socketConnection.getVariationPoint())) {
            
            return new VariationPointWrapper(socketConnection.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}