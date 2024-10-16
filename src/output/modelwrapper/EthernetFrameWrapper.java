package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class EthernetFrameWrapper {

    
    private EthernetFrame ethernetFrame;

    public EthernetFrameWrapper(EthernetFrame ethernetFrame) {
        this.ethernetFrame = ethernetFrame;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getS())) {
            
            return ethernetFrame.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getT())) {
            
            return ethernetFrame.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getUuid())) {
            
            return ethernetFrame.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getShortName())) {
            
            return new IdentifierWrapper(ethernetFrame.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ethernetFrame.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ethernetFrame.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ethernetFrame.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getCategory())) {
            
            return new CategoryStringWrapper(ethernetFrame.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getAdminData())) {
            
            return new AdminDataWrapper(ethernetFrame.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ethernetFrame.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getAnnotations())) {
            ArrayList<Annotation> originalList = ethernetFrame.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getVariationPoint())) {
            
            return new VariationPointWrapper(ethernetFrame.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getFrameLength() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getFrameLength())) {
            
            return new IntegerWrapper(ethernetFrame.getFrameLength());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PduToFrameMappingWrapper> getPduToFrameMappings() {
        
        if (CollUtil.isNotEmpty(ethernetFrame.getPduToFrameMappings())) {
            ArrayList<PduToFrameMapping> originalList = ethernetFrame.getPduToFrameMappings();
            ArrayList<PduToFrameMappingWrapper> wrapperList = (ArrayList<PduToFrameMappingWrapper>)originalList.stream()
                .map(item -> new PduToFrameMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}