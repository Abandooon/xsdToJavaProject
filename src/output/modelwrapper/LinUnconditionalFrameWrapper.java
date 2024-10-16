package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class LinUnconditionalFrameWrapper {

    
    private LinUnconditionalFrame linUnconditionalFrame;

    public LinUnconditionalFrameWrapper(LinUnconditionalFrame linUnconditionalFrame) {
        this.linUnconditionalFrame = linUnconditionalFrame;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getS())) {
            
            return linUnconditionalFrame.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getT())) {
            
            return linUnconditionalFrame.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getUuid())) {
            
            return linUnconditionalFrame.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getShortName())) {
            
            return new IdentifierWrapper(linUnconditionalFrame.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linUnconditionalFrame.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getLongName())) {
            
            return new MultilanguageLongNameWrapper(linUnconditionalFrame.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(linUnconditionalFrame.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getCategory())) {
            
            return new CategoryStringWrapper(linUnconditionalFrame.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getAdminData())) {
            
            return new AdminDataWrapper(linUnconditionalFrame.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getIntroduction())) {
            
            return new DocumentationBlockWrapper(linUnconditionalFrame.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getAnnotations())) {
            ArrayList<Annotation> originalList = linUnconditionalFrame.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getVariationPoint())) {
            
            return new VariationPointWrapper(linUnconditionalFrame.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getFrameLength() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getFrameLength())) {
            
            return new IntegerWrapper(linUnconditionalFrame.getFrameLength());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PduToFrameMappingWrapper> getPduToFrameMappings() {
        
        if (CollUtil.isNotEmpty(linUnconditionalFrame.getPduToFrameMappings())) {
            ArrayList<PduToFrameMapping> originalList = linUnconditionalFrame.getPduToFrameMappings();
            ArrayList<PduToFrameMappingWrapper> wrapperList = (ArrayList<PduToFrameMappingWrapper>)originalList.stream()
                .map(item -> new PduToFrameMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}