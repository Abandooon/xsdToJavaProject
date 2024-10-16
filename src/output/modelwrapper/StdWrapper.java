package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Date;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class StdWrapper {

    
    private Std std;

    public StdWrapper(Std std) {
        this.std = std;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(std.getS())) {
            
            return std.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(std.getT())) {
            
            return std.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(std.getShortName())) {
            
            return new IdentifierWrapper(std.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(std.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = std.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SingleLanguageLongNameWrapper getLongName1() {
        
        if (CollUtil.isNotEmpty(std.getLongName1())) {
            
            return new SingleLanguageLongNameWrapper(std.getLongName1());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getSubtitle() {
        
        if (CollUtil.isNotEmpty(std.getSubtitle())) {
            
            return new StringWrapper(std.getSubtitle());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getState() {
        
        if (CollUtil.isNotEmpty(std.getState())) {
            
            return new StringWrapper(std.getState());
            
        } else {
            return null;
        }
        
    }

    public DateWrapper getDate() {
        
        if (CollUtil.isNotEmpty(std.getDate())) {
            
            return new DateWrapper(std.getDate());
            
        } else {
            return null;
        }
        
    }

    public UrlWrapper getUrl() {
        
        if (CollUtil.isNotEmpty(std.getUrl())) {
            
            return new UrlWrapper(std.getUrl());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getPosition() {
        
        if (CollUtil.isNotEmpty(std.getPosition())) {
            
            return new StringWrapper(std.getPosition());
            
        } else {
            return null;
        }
        
    }




    


    
}