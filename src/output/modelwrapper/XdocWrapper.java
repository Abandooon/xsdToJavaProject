package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Date;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class XdocWrapper {

    
    private Xdoc xdoc;

    public XdocWrapper(Xdoc xdoc) {
        this.xdoc = xdoc;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(xdoc.getS())) {
            
            return xdoc.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(xdoc.getT())) {
            
            return xdoc.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(xdoc.getShortName())) {
            
            return new IdentifierWrapper(xdoc.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(xdoc.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = xdoc.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SingleLanguageLongNameWrapper getLongName1() {
        
        if (CollUtil.isNotEmpty(xdoc.getLongName1())) {
            
            return new SingleLanguageLongNameWrapper(xdoc.getLongName1());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getNumber() {
        
        if (CollUtil.isNotEmpty(xdoc.getNumber())) {
            
            return new StringWrapper(xdoc.getNumber());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getState() {
        
        if (CollUtil.isNotEmpty(xdoc.getState())) {
            
            return new StringWrapper(xdoc.getState());
            
        } else {
            return null;
        }
        
    }

    public DateWrapper getDate() {
        
        if (CollUtil.isNotEmpty(xdoc.getDate())) {
            
            return new DateWrapper(xdoc.getDate());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getPublisher() {
        
        if (CollUtil.isNotEmpty(xdoc.getPublisher())) {
            
            return new StringWrapper(xdoc.getPublisher());
            
        } else {
            return null;
        }
        
    }

    public UrlWrapper getUrl() {
        
        if (CollUtil.isNotEmpty(xdoc.getUrl())) {
            
            return new UrlWrapper(xdoc.getUrl());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getPosition() {
        
        if (CollUtil.isNotEmpty(xdoc.getPosition())) {
            
            return new StringWrapper(xdoc.getPosition());
            
        } else {
            return null;
        }
        
    }




    


    
}