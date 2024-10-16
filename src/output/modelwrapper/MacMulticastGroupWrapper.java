package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class MacMulticastGroupWrapper {

    
    private MacMulticastGroup macMulticastGroup;

    public MacMulticastGroupWrapper(MacMulticastGroup macMulticastGroup) {
        this.macMulticastGroup = macMulticastGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(macMulticastGroup.getS())) {
            
            return macMulticastGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(macMulticastGroup.getT())) {
            
            return macMulticastGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(macMulticastGroup.getUuid())) {
            
            return macMulticastGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(macMulticastGroup.getShortName())) {
            
            return new IdentifierWrapper(macMulticastGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(macMulticastGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = macMulticastGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(macMulticastGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(macMulticastGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(macMulticastGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(macMulticastGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(macMulticastGroup.getCategory())) {
            
            return new CategoryStringWrapper(macMulticastGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(macMulticastGroup.getAdminData())) {
            
            return new AdminDataWrapper(macMulticastGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(macMulticastGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(macMulticastGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(macMulticastGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = macMulticastGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MacAddressStringWrapper getMacMulticastAddress() {
        
        if (CollUtil.isNotEmpty(macMulticastGroup.getMacMulticastAddress())) {
            
            return new MacAddressStringWrapper(macMulticastGroup.getMacMulticastAddress());
            
        } else {
            return null;
        }
        
    }




    


    
}