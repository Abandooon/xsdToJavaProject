package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SdgWrapper {

    
    private Sdg sdg;

    public SdgWrapper(Sdg sdg) {
        this.sdg = sdg;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(sdg.getS())) {
            
            return sdg.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(sdg.getT())) {
            
            return sdg.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getGid() {
        
        if (CollUtil.isNotEmpty(sdg.getGid())) {
            
            return sdg.getGid();
            
        } else {
            return null;
        }
        
    }

    public SdgCaptionWrapper getSdgCaption() {
        
        if (CollUtil.isNotEmpty(sdg.getSdgCaption())) {
            
            return new SdgCaptionWrapper(sdg.getSdgCaption());
            
        } else {
            return null;
        }
        
    }

    public SdgCaptionRefWrapper getSdgCaptionRef() {
        
        if (CollUtil.isNotEmpty(sdg.getSdgCaptionRef())) {
            
            return new SdgCaptionRefWrapper(sdg.getSdgCaptionRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(sdg.getVariationPoint())) {
            
            return new VariationPointWrapper(sdg.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SdxRefWrapper> getSdxRef() {
        
        if (CollUtil.isNotEmpty(sdg.getSdxRef())) {
            ArrayList<SdxRef> originalList = sdg.getSdxRef();
            ArrayList<SdxRefWrapper> wrapperList = (ArrayList<SdxRefWrapper>)originalList.stream()
                .map(item -> new SdxRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ReferrableRefConditionalWrapper> getSdxf() {
        
        if (CollUtil.isNotEmpty(sdg.getSdxf())) {
            ArrayList<ReferrableRefConditional> originalList = sdg.getSdxf();
            ArrayList<ReferrableRefConditionalWrapper> wrapperList = (ArrayList<ReferrableRefConditionalWrapper>)originalList.stream()
                .map(item -> new ReferrableRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SdWrapper> getSd() {
        
        if (CollUtil.isNotEmpty(sdg.getSd())) {
            ArrayList<Sd> originalList = sdg.getSd();
            ArrayList<SdWrapper> wrapperList = (ArrayList<SdWrapper>)originalList.stream()
                .map(item -> new SdWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SdgWrapper> getSdg() {
        
        if (CollUtil.isNotEmpty(sdg.getSdg())) {
            ArrayList<Sdg> originalList = sdg.getSdg();
            ArrayList<SdgWrapper> wrapperList = (ArrayList<SdgWrapper>)originalList.stream()
                .map(item -> new SdgWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SdfWrapper> getSdf() {
        
        if (CollUtil.isNotEmpty(sdg.getSdf())) {
            ArrayList<Sdf> originalList = sdg.getSdf();
            ArrayList<SdfWrapper> wrapperList = (ArrayList<SdfWrapper>)originalList.stream()
                .map(item -> new SdfWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}