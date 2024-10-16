package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class XfileWrapper {

    
    private Xfile xfile;

    public XfileWrapper(Xfile xfile) {
        this.xfile = xfile;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(xfile.getS())) {
            
            return xfile.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(xfile.getT())) {
            
            return xfile.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(xfile.getShortName())) {
            
            return new IdentifierWrapper(xfile.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(xfile.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = xfile.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SingleLanguageLongNameWrapper getLongName1() {
        
        if (CollUtil.isNotEmpty(xfile.getLongName1())) {
            
            return new SingleLanguageLongNameWrapper(xfile.getLongName1());
            
        } else {
            return null;
        }
        
    }

    public UrlWrapper getUrl() {
        
        if (CollUtil.isNotEmpty(xfile.getUrl())) {
            
            return new UrlWrapper(xfile.getUrl());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getTool() {
        
        if (CollUtil.isNotEmpty(xfile.getTool())) {
            
            return new StringWrapper(xfile.getTool());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getToolVersion() {
        
        if (CollUtil.isNotEmpty(xfile.getToolVersion())) {
            
            return new StringWrapper(xfile.getToolVersion());
            
        } else {
            return null;
        }
        
    }




    


    
}