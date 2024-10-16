package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    

    
    


public class Ieee1722TpEthernetFrameWrapper {

    
    private Ieee1722TpEthernetFrame ieee1722TpEthernetFrame;

    public Ieee1722TpEthernetFrameWrapper(Ieee1722TpEthernetFrame ieee1722TpEthernetFrame) {
        this.ieee1722TpEthernetFrame = ieee1722TpEthernetFrame;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getS())) {
            
            return ieee1722TpEthernetFrame.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getT())) {
            
            return ieee1722TpEthernetFrame.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getUuid())) {
            
            return ieee1722TpEthernetFrame.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getShortName())) {
            
            return new IdentifierWrapper(ieee1722TpEthernetFrame.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ieee1722TpEthernetFrame.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ieee1722TpEthernetFrame.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ieee1722TpEthernetFrame.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getCategory())) {
            
            return new CategoryStringWrapper(ieee1722TpEthernetFrame.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getAdminData())) {
            
            return new AdminDataWrapper(ieee1722TpEthernetFrame.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ieee1722TpEthernetFrame.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getAnnotations())) {
            ArrayList<Annotation> originalList = ieee1722TpEthernetFrame.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getVariationPoint())) {
            
            return new VariationPointWrapper(ieee1722TpEthernetFrame.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getFrameLength() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getFrameLength())) {
            
            return new IntegerWrapper(ieee1722TpEthernetFrame.getFrameLength());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PduToFrameMappingWrapper> getPduToFrameMappings() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getPduToFrameMappings())) {
            ArrayList<PduToFrameMapping> originalList = ieee1722TpEthernetFrame.getPduToFrameMappings();
            ArrayList<PduToFrameMappingWrapper> wrapperList = (ArrayList<PduToFrameMappingWrapper>)originalList.stream()
                .map(item -> new PduToFrameMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getRelativeRepresentationTime() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getRelativeRepresentationTime())) {
            
            return new TimeValueWrapper(ieee1722TpEthernetFrame.getRelativeRepresentationTime());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getStreamIdentifier() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getStreamIdentifier())) {
            
            return new PositiveIntegerWrapper(ieee1722TpEthernetFrame.getStreamIdentifier());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSubType() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getSubType())) {
            
            return new PositiveIntegerWrapper(ieee1722TpEthernetFrame.getSubType());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getVersion() {
        
        if (CollUtil.isNotEmpty(ieee1722TpEthernetFrame.getVersion())) {
            
            return new PositiveIntegerWrapper(ieee1722TpEthernetFrame.getVersion());
            
        } else {
            return null;
        }
        
    }




    


    
}