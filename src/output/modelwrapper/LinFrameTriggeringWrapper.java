package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class LinFrameTriggeringWrapper {

    
    private LinFrameTriggering linFrameTriggering;

    public LinFrameTriggeringWrapper(LinFrameTriggering linFrameTriggering) {
        this.linFrameTriggering = linFrameTriggering;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getS())) {
            
            return linFrameTriggering.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getT())) {
            
            return linFrameTriggering.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getUuid())) {
            
            return linFrameTriggering.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getShortName())) {
            
            return new IdentifierWrapper(linFrameTriggering.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linFrameTriggering.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getLongName())) {
            
            return new MultilanguageLongNameWrapper(linFrameTriggering.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(linFrameTriggering.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getCategory())) {
            
            return new CategoryStringWrapper(linFrameTriggering.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getAdminData())) {
            
            return new AdminDataWrapper(linFrameTriggering.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getIntroduction())) {
            
            return new DocumentationBlockWrapper(linFrameTriggering.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getAnnotations())) {
            ArrayList<Annotation> originalList = linFrameTriggering.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FramePortRefWrapper> getFramePortRefs() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getFramePortRefs())) {
            ArrayList<FramePortRef> originalList = linFrameTriggering.getFramePortRefs();
            ArrayList<FramePortRefWrapper> wrapperList = (ArrayList<FramePortRefWrapper>)originalList.stream()
                .map(item -> new FramePortRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FrameRefWrapper getFrameRef() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getFrameRef())) {
            
            return new FrameRefWrapper(linFrameTriggering.getFrameRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PduTriggeringRefConditionalWrapper> getPduTriggerings() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getPduTriggerings())) {
            ArrayList<PduTriggeringRefConditional> originalList = linFrameTriggering.getPduTriggerings();
            ArrayList<PduTriggeringRefConditionalWrapper> wrapperList = (ArrayList<PduTriggeringRefConditionalWrapper>)originalList.stream()
                .map(item -> new PduTriggeringRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getVariationPoint())) {
            
            return new VariationPointWrapper(linFrameTriggering.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getIdentifier() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getIdentifier())) {
            
            return new IntegerWrapper(linFrameTriggering.getIdentifier());
            
        } else {
            return null;
        }
        
    }

    public LinChecksumTypeWrapper getLinChecksum() {
        
        if (CollUtil.isNotEmpty(linFrameTriggering.getLinChecksum())) {
            
            return new LinChecksumTypeWrapper(linFrameTriggering.getLinChecksum());
            
        } else {
            return null;
        }
        
    }




    


    
}