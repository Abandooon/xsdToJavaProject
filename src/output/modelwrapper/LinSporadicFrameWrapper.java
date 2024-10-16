package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    


public class LinSporadicFrameWrapper {

    
    private LinSporadicFrame linSporadicFrame;

    public LinSporadicFrameWrapper(LinSporadicFrame linSporadicFrame) {
        this.linSporadicFrame = linSporadicFrame;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getS())) {
            
            return linSporadicFrame.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getT())) {
            
            return linSporadicFrame.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getUuid())) {
            
            return linSporadicFrame.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getShortName())) {
            
            return new IdentifierWrapper(linSporadicFrame.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linSporadicFrame.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getLongName())) {
            
            return new MultilanguageLongNameWrapper(linSporadicFrame.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(linSporadicFrame.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getCategory())) {
            
            return new CategoryStringWrapper(linSporadicFrame.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getAdminData())) {
            
            return new AdminDataWrapper(linSporadicFrame.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getIntroduction())) {
            
            return new DocumentationBlockWrapper(linSporadicFrame.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getAnnotations())) {
            ArrayList<Annotation> originalList = linSporadicFrame.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getVariationPoint())) {
            
            return new VariationPointWrapper(linSporadicFrame.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getFrameLength() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getFrameLength())) {
            
            return new IntegerWrapper(linSporadicFrame.getFrameLength());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PduToFrameMappingWrapper> getPduToFrameMappings() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getPduToFrameMappings())) {
            ArrayList<PduToFrameMapping> originalList = linSporadicFrame.getPduToFrameMappings();
            ArrayList<PduToFrameMappingWrapper> wrapperList = (ArrayList<PduToFrameMappingWrapper>)originalList.stream()
                .map(item -> new PduToFrameMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SubstitutedFrameRefWrapper> getSubstitutedFrameRefs() {
        
        if (CollUtil.isNotEmpty(linSporadicFrame.getSubstitutedFrameRefs())) {
            ArrayList<SubstitutedFrameRef> originalList = linSporadicFrame.getSubstitutedFrameRefs();
            ArrayList<SubstitutedFrameRefWrapper> wrapperList = (ArrayList<SubstitutedFrameRefWrapper>)originalList.stream()
                .map(item -> new SubstitutedFrameRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}