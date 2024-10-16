package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class TpAddressWrapper {

    
    private TpAddress tpAddress;

    public TpAddressWrapper(TpAddress tpAddress) {
        this.tpAddress = tpAddress;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tpAddress.getS())) {
            
            return tpAddress.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tpAddress.getT())) {
            
            return tpAddress.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tpAddress.getUuid())) {
            
            return tpAddress.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tpAddress.getShortName())) {
            
            return new IdentifierWrapper(tpAddress.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tpAddress.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tpAddress.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tpAddress.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tpAddress.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tpAddress.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tpAddress.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tpAddress.getCategory())) {
            
            return new CategoryStringWrapper(tpAddress.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tpAddress.getAdminData())) {
            
            return new AdminDataWrapper(tpAddress.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tpAddress.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tpAddress.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tpAddress.getAnnotations())) {
            ArrayList<Annotation> originalList = tpAddress.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getTpAddress() {
        
        if (CollUtil.isNotEmpty(tpAddress.getTpAddress())) {
            
            return new IntegerWrapper(tpAddress.getTpAddress());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tpAddress.getVariationPoint())) {
            
            return new VariationPointWrapper(tpAddress.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}