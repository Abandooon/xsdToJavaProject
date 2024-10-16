package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class FramePortWrapper {

    
    private FramePort framePort;

    public FramePortWrapper(FramePort framePort) {
        this.framePort = framePort;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(framePort.getS())) {
            
            return framePort.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(framePort.getT())) {
            
            return framePort.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(framePort.getUuid())) {
            
            return framePort.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(framePort.getShortName())) {
            
            return new IdentifierWrapper(framePort.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(framePort.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = framePort.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(framePort.getLongName())) {
            
            return new MultilanguageLongNameWrapper(framePort.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(framePort.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(framePort.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(framePort.getCategory())) {
            
            return new CategoryStringWrapper(framePort.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(framePort.getAdminData())) {
            
            return new AdminDataWrapper(framePort.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(framePort.getIntroduction())) {
            
            return new DocumentationBlockWrapper(framePort.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(framePort.getAnnotations())) {
            ArrayList<Annotation> originalList = framePort.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommunicationDirectionTypeWrapper getCommunicationDirection() {
        
        if (CollUtil.isNotEmpty(framePort.getCommunicationDirection())) {
            
            return new CommunicationDirectionTypeWrapper(framePort.getCommunicationDirection());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(framePort.getVariationPoint())) {
            
            return new VariationPointWrapper(framePort.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}