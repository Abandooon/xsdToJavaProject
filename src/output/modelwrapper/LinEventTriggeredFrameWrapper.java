package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    


public class LinEventTriggeredFrameWrapper {

    
    private LinEventTriggeredFrame linEventTriggeredFrame;

    public LinEventTriggeredFrameWrapper(LinEventTriggeredFrame linEventTriggeredFrame) {
        this.linEventTriggeredFrame = linEventTriggeredFrame;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getS())) {
            
            return linEventTriggeredFrame.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getT())) {
            
            return linEventTriggeredFrame.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getUuid())) {
            
            return linEventTriggeredFrame.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getShortName())) {
            
            return new IdentifierWrapper(linEventTriggeredFrame.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linEventTriggeredFrame.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getLongName())) {
            
            return new MultilanguageLongNameWrapper(linEventTriggeredFrame.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(linEventTriggeredFrame.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getCategory())) {
            
            return new CategoryStringWrapper(linEventTriggeredFrame.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getAdminData())) {
            
            return new AdminDataWrapper(linEventTriggeredFrame.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getIntroduction())) {
            
            return new DocumentationBlockWrapper(linEventTriggeredFrame.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getAnnotations())) {
            ArrayList<Annotation> originalList = linEventTriggeredFrame.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getVariationPoint())) {
            
            return new VariationPointWrapper(linEventTriggeredFrame.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getFrameLength() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getFrameLength())) {
            
            return new IntegerWrapper(linEventTriggeredFrame.getFrameLength());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PduToFrameMappingWrapper> getPduToFrameMappings() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getPduToFrameMappings())) {
            ArrayList<PduToFrameMapping> originalList = linEventTriggeredFrame.getPduToFrameMappings();
            ArrayList<PduToFrameMappingWrapper> wrapperList = (ArrayList<PduToFrameMappingWrapper>)originalList.stream()
                .map(item -> new PduToFrameMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CollisionResolvingScheduleRefWrapper getCollisionResolvingScheduleRef() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getCollisionResolvingScheduleRef())) {
            
            return new CollisionResolvingScheduleRefWrapper(linEventTriggeredFrame.getCollisionResolvingScheduleRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LinUnconditionalFrameRefWrapper> getLinUnconditionalFrameRefs() {
        
        if (CollUtil.isNotEmpty(linEventTriggeredFrame.getLinUnconditionalFrameRefs())) {
            ArrayList<LinUnconditionalFrameRef> originalList = linEventTriggeredFrame.getLinUnconditionalFrameRefs();
            ArrayList<LinUnconditionalFrameRefWrapper> wrapperList = (ArrayList<LinUnconditionalFrameRefWrapper>)originalList.stream()
                .map(item -> new LinUnconditionalFrameRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}