package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class CryptoServiceNeedsWrapper {

    
    private CryptoServiceNeeds cryptoServiceNeeds;

    public CryptoServiceNeedsWrapper(CryptoServiceNeeds cryptoServiceNeeds) {
        this.cryptoServiceNeeds = cryptoServiceNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(cryptoServiceNeeds.getS())) {
            
            return cryptoServiceNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(cryptoServiceNeeds.getT())) {
            
            return cryptoServiceNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(cryptoServiceNeeds.getUuid())) {
            
            return cryptoServiceNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(cryptoServiceNeeds.getShortName())) {
            
            return new IdentifierWrapper(cryptoServiceNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(cryptoServiceNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = cryptoServiceNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(cryptoServiceNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(cryptoServiceNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(cryptoServiceNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(cryptoServiceNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(cryptoServiceNeeds.getCategory())) {
            
            return new CategoryStringWrapper(cryptoServiceNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(cryptoServiceNeeds.getAdminData())) {
            
            return new AdminDataWrapper(cryptoServiceNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(cryptoServiceNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(cryptoServiceNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(cryptoServiceNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = cryptoServiceNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaximumKeyLength() {
        
        if (CollUtil.isNotEmpty(cryptoServiceNeeds.getMaximumKeyLength())) {
            
            return new PositiveIntegerWrapper(cryptoServiceNeeds.getMaximumKeyLength());
            
        } else {
            return null;
        }
        
    }




    


    
}