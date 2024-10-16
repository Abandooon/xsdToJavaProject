package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SdgContentsWrapper {

    
    private SdgContents sdgContents;

    public SdgContentsWrapper(SdgContents sdgContents) {
        this.sdgContents = sdgContents;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(sdgContents.getS())) {
            
            return sdgContents.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(sdgContents.getT())) {
            
            return sdgContents.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SdxRefWrapper> getSdxRef() {
        
        if (CollUtil.isNotEmpty(sdgContents.getSdxRef())) {
            ArrayList<SdxRef> originalList = sdgContents.getSdxRef();
            ArrayList<SdxRefWrapper> wrapperList = (ArrayList<SdxRefWrapper>)originalList.stream()
                .map(item -> new SdxRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ReferrableRefConditionalWrapper> getSdxf() {
        
        if (CollUtil.isNotEmpty(sdgContents.getSdxf())) {
            ArrayList<ReferrableRefConditional> originalList = sdgContents.getSdxf();
            ArrayList<ReferrableRefConditionalWrapper> wrapperList = (ArrayList<ReferrableRefConditionalWrapper>)originalList.stream()
                .map(item -> new ReferrableRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SdWrapper> getSd() {
        
        if (CollUtil.isNotEmpty(sdgContents.getSd())) {
            ArrayList<Sd> originalList = sdgContents.getSd();
            ArrayList<SdWrapper> wrapperList = (ArrayList<SdWrapper>)originalList.stream()
                .map(item -> new SdWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SdgWrapper> getSdg() {
        
        if (CollUtil.isNotEmpty(sdgContents.getSdg())) {
            ArrayList<Sdg> originalList = sdgContents.getSdg();
            ArrayList<SdgWrapper> wrapperList = (ArrayList<SdgWrapper>)originalList.stream()
                .map(item -> new SdgWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SdfWrapper> getSdf() {
        
        if (CollUtil.isNotEmpty(sdgContents.getSdf())) {
            ArrayList<Sdf> originalList = sdgContents.getSdf();
            ArrayList<SdfWrapper> wrapperList = (ArrayList<SdfWrapper>)originalList.stream()
                .map(item -> new SdfWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}