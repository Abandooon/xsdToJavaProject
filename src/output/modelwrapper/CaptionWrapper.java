package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class CaptionWrapper {

    
    private Caption caption;

    public CaptionWrapper(Caption caption) {
        this.caption = caption;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(caption.getS())) {
            
            return caption.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(caption.getT())) {
            
            return caption.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(caption.getShortName())) {
            
            return new IdentifierWrapper(caption.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(caption.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = caption.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(caption.getLongName())) {
            
            return new MultilanguageLongNameWrapper(caption.getLongName());
            
        } else {
            return null;
        }
        
    }




    


    
}