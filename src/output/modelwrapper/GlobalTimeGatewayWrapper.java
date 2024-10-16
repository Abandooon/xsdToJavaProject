package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class GlobalTimeGatewayWrapper {

    
    private GlobalTimeGateway globalTimeGateway;

    public GlobalTimeGatewayWrapper(GlobalTimeGateway globalTimeGateway) {
        this.globalTimeGateway = globalTimeGateway;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getS())) {
            
            return globalTimeGateway.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getT())) {
            
            return globalTimeGateway.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getUuid())) {
            
            return globalTimeGateway.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getShortName())) {
            
            return new IdentifierWrapper(globalTimeGateway.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = globalTimeGateway.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getLongName())) {
            
            return new MultilanguageLongNameWrapper(globalTimeGateway.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(globalTimeGateway.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getCategory())) {
            
            return new CategoryStringWrapper(globalTimeGateway.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getAdminData())) {
            
            return new AdminDataWrapper(globalTimeGateway.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getIntroduction())) {
            
            return new DocumentationBlockWrapper(globalTimeGateway.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getAnnotations())) {
            ArrayList<Annotation> originalList = globalTimeGateway.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public HostRefWrapper getHostRef() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getHostRef())) {
            
            return new HostRefWrapper(globalTimeGateway.getHostRef());
            
        } else {
            return null;
        }
        
    }

    public MasterRefWrapper getMasterRef() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getMasterRef())) {
            
            return new MasterRefWrapper(globalTimeGateway.getMasterRef());
            
        } else {
            return null;
        }
        
    }

    public SlaveRefWrapper getSlaveRef() {
        
        if (CollUtil.isNotEmpty(globalTimeGateway.getSlaveRef())) {
            
            return new SlaveRefWrapper(globalTimeGateway.getSlaveRef());
            
        } else {
            return null;
        }
        
    }




    


    
}