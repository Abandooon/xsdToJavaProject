package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class VlanConfigWrapper {

    
    private VlanConfig vlanConfig;

    public VlanConfigWrapper(VlanConfig vlanConfig) {
        this.vlanConfig = vlanConfig;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(vlanConfig.getS())) {
            
            return vlanConfig.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(vlanConfig.getT())) {
            
            return vlanConfig.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(vlanConfig.getUuid())) {
            
            return vlanConfig.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(vlanConfig.getShortName())) {
            
            return new IdentifierWrapper(vlanConfig.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(vlanConfig.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = vlanConfig.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(vlanConfig.getLongName())) {
            
            return new MultilanguageLongNameWrapper(vlanConfig.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(vlanConfig.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(vlanConfig.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(vlanConfig.getCategory())) {
            
            return new CategoryStringWrapper(vlanConfig.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(vlanConfig.getAdminData())) {
            
            return new AdminDataWrapper(vlanConfig.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(vlanConfig.getIntroduction())) {
            
            return new DocumentationBlockWrapper(vlanConfig.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(vlanConfig.getAnnotations())) {
            ArrayList<Annotation> originalList = vlanConfig.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getVlanIdentifier() {
        
        if (CollUtil.isNotEmpty(vlanConfig.getVlanIdentifier())) {
            
            return new PositiveIntegerWrapper(vlanConfig.getVlanIdentifier());
            
        } else {
            return null;
        }
        
    }




    


    
}