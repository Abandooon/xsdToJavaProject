package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class FlexrayTpConnectionControlWrapper {

    
    private FlexrayTpConnectionControl flexrayTpConnectionControl;

    public FlexrayTpConnectionControlWrapper(FlexrayTpConnectionControl flexrayTpConnectionControl) {
        this.flexrayTpConnectionControl = flexrayTpConnectionControl;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getS())) {
            
            return flexrayTpConnectionControl.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getT())) {
            
            return flexrayTpConnectionControl.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getUuid())) {
            
            return flexrayTpConnectionControl.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getShortName())) {
            
            return new IdentifierWrapper(flexrayTpConnectionControl.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flexrayTpConnectionControl.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flexrayTpConnectionControl.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flexrayTpConnectionControl.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getCategory())) {
            
            return new CategoryStringWrapper(flexrayTpConnectionControl.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getAdminData())) {
            
            return new AdminDataWrapper(flexrayTpConnectionControl.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flexrayTpConnectionControl.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getAnnotations())) {
            ArrayList<Annotation> originalList = flexrayTpConnectionControl.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TpAckTypeWrapper getAckType() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getAckType())) {
            
            return new TpAckTypeWrapper(flexrayTpConnectionControl.getAckType());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxAr() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getMaxAr())) {
            
            return new IntegerWrapper(flexrayTpConnectionControl.getMaxAr());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxAs() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getMaxAs())) {
            
            return new IntegerWrapper(flexrayTpConnectionControl.getMaxAs());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxBufferSize() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getMaxBufferSize())) {
            
            return new IntegerWrapper(flexrayTpConnectionControl.getMaxBufferSize());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxFcWait() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getMaxFcWait())) {
            
            return new IntegerWrapper(flexrayTpConnectionControl.getMaxFcWait());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxFrIf() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getMaxFrIf())) {
            
            return new IntegerWrapper(flexrayTpConnectionControl.getMaxFrIf());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxNumberOfNpduPerCycle() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getMaxNumberOfNpduPerCycle())) {
            
            return new IntegerWrapper(flexrayTpConnectionControl.getMaxNumberOfNpduPerCycle());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxRetries() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getMaxRetries())) {
            
            return new IntegerWrapper(flexrayTpConnectionControl.getMaxRetries());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSeparationCycleExponent() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getSeparationCycleExponent())) {
            
            return new IntegerWrapper(flexrayTpConnectionControl.getSeparationCycleExponent());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeBr() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getTimeBr())) {
            
            return new TimeValueWrapper(flexrayTpConnectionControl.getTimeBr());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeBuffer() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getTimeBuffer())) {
            
            return new TimeValueWrapper(flexrayTpConnectionControl.getTimeBuffer());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeCs() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getTimeCs())) {
            
            return new TimeValueWrapper(flexrayTpConnectionControl.getTimeCs());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeFrIf() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getTimeFrIf())) {
            
            return new TimeValueWrapper(flexrayTpConnectionControl.getTimeFrIf());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutAr() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getTimeoutAr())) {
            
            return new TimeValueWrapper(flexrayTpConnectionControl.getTimeoutAr());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutAs() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getTimeoutAs())) {
            
            return new TimeValueWrapper(flexrayTpConnectionControl.getTimeoutAs());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutBr() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getTimeoutBr())) {
            
            return new TimeValueWrapper(flexrayTpConnectionControl.getTimeoutBr());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutBs() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getTimeoutBs())) {
            
            return new TimeValueWrapper(flexrayTpConnectionControl.getTimeoutBs());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutCr() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getTimeoutCr())) {
            
            return new TimeValueWrapper(flexrayTpConnectionControl.getTimeoutCr());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutCs() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getTimeoutCs())) {
            
            return new TimeValueWrapper(flexrayTpConnectionControl.getTimeoutCs());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayTpConnectionControl.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayTpConnectionControl.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}