package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class DoIpLogicAddressWrapper {

    
    private DoIpLogicAddress doIpLogicAddress;

    public DoIpLogicAddressWrapper(DoIpLogicAddress doIpLogicAddress) {
        this.doIpLogicAddress = doIpLogicAddress;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(doIpLogicAddress.getS())) {
            
            return doIpLogicAddress.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(doIpLogicAddress.getT())) {
            
            return doIpLogicAddress.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(doIpLogicAddress.getUuid())) {
            
            return doIpLogicAddress.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(doIpLogicAddress.getShortName())) {
            
            return new IdentifierWrapper(doIpLogicAddress.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(doIpLogicAddress.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = doIpLogicAddress.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(doIpLogicAddress.getLongName())) {
            
            return new MultilanguageLongNameWrapper(doIpLogicAddress.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(doIpLogicAddress.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(doIpLogicAddress.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(doIpLogicAddress.getCategory())) {
            
            return new CategoryStringWrapper(doIpLogicAddress.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(doIpLogicAddress.getAdminData())) {
            
            return new AdminDataWrapper(doIpLogicAddress.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(doIpLogicAddress.getIntroduction())) {
            
            return new DocumentationBlockWrapper(doIpLogicAddress.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(doIpLogicAddress.getAnnotations())) {
            ArrayList<Annotation> originalList = doIpLogicAddress.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getAddress() {
        
        if (CollUtil.isNotEmpty(doIpLogicAddress.getAddress())) {
            
            return new IntegerWrapper(doIpLogicAddress.getAddress());
            
        } else {
            return null;
        }
        
    }




    


    
}