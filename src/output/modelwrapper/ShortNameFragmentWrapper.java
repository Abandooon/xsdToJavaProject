package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class ShortNameFragmentWrapper {

    
    private ShortNameFragment shortNameFragment;

    public ShortNameFragmentWrapper(ShortNameFragment shortNameFragment) {
        this.shortNameFragment = shortNameFragment;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(shortNameFragment.getS())) {
            
            return shortNameFragment.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(shortNameFragment.getT())) {
            
            return shortNameFragment.getT();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getRole() {
        
        if (CollUtil.isNotEmpty(shortNameFragment.getRole())) {
            
            return new StringWrapper(shortNameFragment.getRole());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getFragment() {
        
        if (CollUtil.isNotEmpty(shortNameFragment.getFragment())) {
            
            return new IdentifierWrapper(shortNameFragment.getFragment());
            
        } else {
            return null;
        }
        
    }




    


    
}