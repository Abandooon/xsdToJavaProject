package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class RptHookWrapper {

    
    private RptHook rptHook;

    public RptHookWrapper(RptHook rptHook) {
        this.rptHook = rptHook;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rptHook.getS())) {
            
            return rptHook.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rptHook.getT())) {
            
            return rptHook.getT();
            
        } else {
            return null;
        }
        
    }

    public CIdentifierWrapper getCodeLabel() {
        
        if (CollUtil.isNotEmpty(rptHook.getCodeLabel())) {
            
            return new CIdentifierWrapper(rptHook.getCodeLabel());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getMcdIdentifier() {
        
        if (CollUtil.isNotEmpty(rptHook.getMcdIdentifier())) {
            
            return new NmtokenStringWrapper(rptHook.getMcdIdentifier());
            
        } else {
            return null;
        }
        
    }

    public AnyInstanceRefWrapper getRptArHookIref() {
        
        if (CollUtil.isNotEmpty(rptHook.getRptArHookIref())) {
            
            return new AnyInstanceRefWrapper(rptHook.getRptArHookIref());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SdgWrapper> getSdgs() {
        
        if (CollUtil.isNotEmpty(rptHook.getSdgs())) {
            ArrayList<Sdg> originalList = rptHook.getSdgs();
            ArrayList<SdgWrapper> wrapperList = (ArrayList<SdgWrapper>)originalList.stream()
                .map(item -> new SdgWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(rptHook.getVariationPoint())) {
            
            return new VariationPointWrapper(rptHook.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}