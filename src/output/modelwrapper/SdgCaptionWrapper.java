package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class SdgCaptionWrapper {

    
    private SdgCaption sdgCaption;

    public SdgCaptionWrapper(SdgCaption sdgCaption) {
        this.sdgCaption = sdgCaption;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(sdgCaption.getS())) {
            
            return sdgCaption.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(sdgCaption.getT())) {
            
            return sdgCaption.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(sdgCaption.getShortName())) {
            
            return new IdentifierWrapper(sdgCaption.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(sdgCaption.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = sdgCaption.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(sdgCaption.getLongName())) {
            
            return new MultilanguageLongNameWrapper(sdgCaption.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(sdgCaption.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(sdgCaption.getDesc());
            
        } else {
            return null;
        }
        
    }




    


    
}