package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class EthernetFrameTriggeringWrapper {

    
    private EthernetFrameTriggering ethernetFrameTriggering;

    public EthernetFrameTriggeringWrapper(EthernetFrameTriggering ethernetFrameTriggering) {
        this.ethernetFrameTriggering = ethernetFrameTriggering;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getS())) {
            
            return ethernetFrameTriggering.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getT())) {
            
            return ethernetFrameTriggering.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getUuid())) {
            
            return ethernetFrameTriggering.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getShortName())) {
            
            return new IdentifierWrapper(ethernetFrameTriggering.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ethernetFrameTriggering.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ethernetFrameTriggering.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ethernetFrameTriggering.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getCategory())) {
            
            return new CategoryStringWrapper(ethernetFrameTriggering.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getAdminData())) {
            
            return new AdminDataWrapper(ethernetFrameTriggering.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ethernetFrameTriggering.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getAnnotations())) {
            ArrayList<Annotation> originalList = ethernetFrameTriggering.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<FramePortRefWrapper> getFramePortRefs() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getFramePortRefs())) {
            ArrayList<FramePortRef> originalList = ethernetFrameTriggering.getFramePortRefs();
            ArrayList<FramePortRefWrapper> wrapperList = (ArrayList<FramePortRefWrapper>)originalList.stream()
                .map(item -> new FramePortRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public FrameRefWrapper getFrameRef() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getFrameRef())) {
            
            return new FrameRefWrapper(ethernetFrameTriggering.getFrameRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PduTriggeringRefConditionalWrapper> getPduTriggerings() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getPduTriggerings())) {
            ArrayList<PduTriggeringRefConditional> originalList = ethernetFrameTriggering.getPduTriggerings();
            ArrayList<PduTriggeringRefConditionalWrapper> wrapperList = (ArrayList<PduTriggeringRefConditionalWrapper>)originalList.stream()
                .map(item -> new PduTriggeringRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ethernetFrameTriggering.getVariationPoint())) {
            
            return new VariationPointWrapper(ethernetFrameTriggering.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}