package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class CanTpAddressWrapper {

    
    private CanTpAddress canTpAddress;

    public CanTpAddressWrapper(CanTpAddress canTpAddress) {
        this.canTpAddress = canTpAddress;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getS())) {
            
            return canTpAddress.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getT())) {
            
            return canTpAddress.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getUuid())) {
            
            return canTpAddress.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getShortName())) {
            
            return new IdentifierWrapper(canTpAddress.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = canTpAddress.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getLongName())) {
            
            return new MultilanguageLongNameWrapper(canTpAddress.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(canTpAddress.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getCategory())) {
            
            return new CategoryStringWrapper(canTpAddress.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getAdminData())) {
            
            return new AdminDataWrapper(canTpAddress.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getIntroduction())) {
            
            return new DocumentationBlockWrapper(canTpAddress.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getAnnotations())) {
            ArrayList<Annotation> originalList = canTpAddress.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getTpAddress() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getTpAddress())) {
            
            return new IntegerWrapper(canTpAddress.getTpAddress());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getTpAddressExtensionValue() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getTpAddressExtensionValue())) {
            
            return new IntegerWrapper(canTpAddress.getTpAddressExtensionValue());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(canTpAddress.getVariationPoint())) {
            
            return new VariationPointWrapper(canTpAddress.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}