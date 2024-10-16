package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class GenericEthernetFrameWrapper {

    
    private GenericEthernetFrame genericEthernetFrame;

    public GenericEthernetFrameWrapper(GenericEthernetFrame genericEthernetFrame) {
        this.genericEthernetFrame = genericEthernetFrame;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getS())) {
            
            return genericEthernetFrame.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getT())) {
            
            return genericEthernetFrame.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getUuid())) {
            
            return genericEthernetFrame.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getShortName())) {
            
            return new IdentifierWrapper(genericEthernetFrame.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = genericEthernetFrame.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getLongName())) {
            
            return new MultilanguageLongNameWrapper(genericEthernetFrame.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(genericEthernetFrame.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getCategory())) {
            
            return new CategoryStringWrapper(genericEthernetFrame.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getAdminData())) {
            
            return new AdminDataWrapper(genericEthernetFrame.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getIntroduction())) {
            
            return new DocumentationBlockWrapper(genericEthernetFrame.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getAnnotations())) {
            ArrayList<Annotation> originalList = genericEthernetFrame.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getVariationPoint())) {
            
            return new VariationPointWrapper(genericEthernetFrame.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getFrameLength() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getFrameLength())) {
            
            return new IntegerWrapper(genericEthernetFrame.getFrameLength());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PduToFrameMappingWrapper> getPduToFrameMappings() {
        
        if (CollUtil.isNotEmpty(genericEthernetFrame.getPduToFrameMappings())) {
            ArrayList<PduToFrameMapping> originalList = genericEthernetFrame.getPduToFrameMappings();
            ArrayList<PduToFrameMappingWrapper> wrapperList = (ArrayList<PduToFrameMappingWrapper>)originalList.stream()
                .map(item -> new PduToFrameMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}