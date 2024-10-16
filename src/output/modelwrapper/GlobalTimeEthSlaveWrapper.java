package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class GlobalTimeEthSlaveWrapper {

    
    private GlobalTimeEthSlave globalTimeEthSlave;

    public GlobalTimeEthSlaveWrapper(GlobalTimeEthSlave globalTimeEthSlave) {
        this.globalTimeEthSlave = globalTimeEthSlave;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(globalTimeEthSlave.getS())) {
            
            return globalTimeEthSlave.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(globalTimeEthSlave.getT())) {
            
            return globalTimeEthSlave.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(globalTimeEthSlave.getUuid())) {
            
            return globalTimeEthSlave.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(globalTimeEthSlave.getShortName())) {
            
            return new IdentifierWrapper(globalTimeEthSlave.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(globalTimeEthSlave.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = globalTimeEthSlave.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(globalTimeEthSlave.getLongName())) {
            
            return new MultilanguageLongNameWrapper(globalTimeEthSlave.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(globalTimeEthSlave.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(globalTimeEthSlave.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(globalTimeEthSlave.getCategory())) {
            
            return new CategoryStringWrapper(globalTimeEthSlave.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(globalTimeEthSlave.getAdminData())) {
            
            return new AdminDataWrapper(globalTimeEthSlave.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(globalTimeEthSlave.getIntroduction())) {
            
            return new DocumentationBlockWrapper(globalTimeEthSlave.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(globalTimeEthSlave.getAnnotations())) {
            ArrayList<Annotation> originalList = globalTimeEthSlave.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommunicationConnectorRefWrapper getCommunicationConnectorRef() {
        
        if (CollUtil.isNotEmpty(globalTimeEthSlave.getCommunicationConnectorRef())) {
            
            return new CommunicationConnectorRefWrapper(globalTimeEthSlave.getCommunicationConnectorRef());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeHardwareCorrectionThreshold() {
        
        if (CollUtil.isNotEmpty(globalTimeEthSlave.getTimeHardwareCorrectionThreshold())) {
            
            return new TimeValueWrapper(globalTimeEthSlave.getTimeHardwareCorrectionThreshold());
            
        } else {
            return null;
        }
        
    }




    


    
}