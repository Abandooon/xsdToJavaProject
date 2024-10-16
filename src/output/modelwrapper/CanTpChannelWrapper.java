package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class CanTpChannelWrapper {

    
    private CanTpChannel canTpChannel;

    public CanTpChannelWrapper(CanTpChannel canTpChannel) {
        this.canTpChannel = canTpChannel;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getS())) {
            
            return canTpChannel.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getT())) {
            
            return canTpChannel.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getUuid())) {
            
            return canTpChannel.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getShortName())) {
            
            return new IdentifierWrapper(canTpChannel.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = canTpChannel.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getLongName())) {
            
            return new MultilanguageLongNameWrapper(canTpChannel.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(canTpChannel.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getCategory())) {
            
            return new CategoryStringWrapper(canTpChannel.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getAdminData())) {
            
            return new AdminDataWrapper(canTpChannel.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getIntroduction())) {
            
            return new DocumentationBlockWrapper(canTpChannel.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getAnnotations())) {
            ArrayList<Annotation> originalList = canTpChannel.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getChannelId() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getChannelId())) {
            
            return new PositiveIntegerWrapper(canTpChannel.getChannelId());
            
        } else {
            return null;
        }
        
    }

    public CanTpChannelModeTypeWrapper getChannelMode() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getChannelMode())) {
            
            return new CanTpChannelModeTypeWrapper(canTpChannel.getChannelMode());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(canTpChannel.getVariationPoint())) {
            
            return new VariationPointWrapper(canTpChannel.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}