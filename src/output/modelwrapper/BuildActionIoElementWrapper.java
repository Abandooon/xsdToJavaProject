package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BuildActionIoElementWrapper {

    
    private BuildActionIoElement buildActionIoElement;

    public BuildActionIoElementWrapper(BuildActionIoElement buildActionIoElement) {
        this.buildActionIoElement = buildActionIoElement;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(buildActionIoElement.getS())) {
            
            return buildActionIoElement.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(buildActionIoElement.getT())) {
            
            return buildActionIoElement.getT();
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(buildActionIoElement.getCategory())) {
            
            return new NmtokenStringWrapper(buildActionIoElement.getCategory());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SdgWrapper> getSdgs() {
        
        if (CollUtil.isNotEmpty(buildActionIoElement.getSdgs())) {
            ArrayList<Sdg> originalList = buildActionIoElement.getSdgs();
            ArrayList<SdgWrapper> wrapperList = (ArrayList<SdgWrapper>)originalList.stream()
                .map(item -> new SdgWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucDefinitionRefWrapper getEcucDefinitionRef() {
        
        if (CollUtil.isNotEmpty(buildActionIoElement.getEcucDefinitionRef())) {
            
            return new EcucDefinitionRefWrapper(buildActionIoElement.getEcucDefinitionRef());
            
        } else {
            return null;
        }
        
    }

    public BuildEngineeringObjectWrapper getEngineeringObject() {
        
        if (CollUtil.isNotEmpty(buildActionIoElement.getEngineeringObject())) {
            
            return new BuildEngineeringObjectWrapper(buildActionIoElement.getEngineeringObject());
            
        } else {
            return null;
        }
        
    }

    public ForeignModelReferenceWrapper getForeignModelReference() {
        
        if (CollUtil.isNotEmpty(buildActionIoElement.getForeignModelReference())) {
            
            return new ForeignModelReferenceWrapper(buildActionIoElement.getForeignModelReference());
            
        } else {
            return null;
        }
        
    }

    public GenericModelReferenceWrapper getModelObjectReference() {
        
        if (CollUtil.isNotEmpty(buildActionIoElement.getModelObjectReference())) {
            
            return new GenericModelReferenceWrapper(buildActionIoElement.getModelObjectReference());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getRole() {
        
        if (CollUtil.isNotEmpty(buildActionIoElement.getRole())) {
            
            return new IdentifierWrapper(buildActionIoElement.getRole());
            
        } else {
            return null;
        }
        
    }




    


    
}