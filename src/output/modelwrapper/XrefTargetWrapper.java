package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class XrefTargetWrapper {

    
    private XrefTarget xrefTarget;

    public XrefTargetWrapper(XrefTarget xrefTarget) {
        this.xrefTarget = xrefTarget;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(xrefTarget.getS())) {
            
            return xrefTarget.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(xrefTarget.getT())) {
            
            return xrefTarget.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(xrefTarget.getShortName())) {
            
            return new IdentifierWrapper(xrefTarget.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(xrefTarget.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = xrefTarget.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SingleLanguageLongNameWrapper getLongName1() {
        
        if (CollUtil.isNotEmpty(xrefTarget.getLongName1())) {
            
            return new SingleLanguageLongNameWrapper(xrefTarget.getLongName1());
            
        } else {
            return null;
        }
        
    }




    


    
}