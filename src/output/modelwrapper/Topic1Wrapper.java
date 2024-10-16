package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class Topic1Wrapper {

    
    private Topic1 topic1;

    public Topic1Wrapper(Topic1 topic1) {
        this.topic1 = topic1;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(topic1.getS())) {
            
            return topic1.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(topic1.getT())) {
            
            return topic1.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(topic1.getUuid())) {
            
            return topic1.getUuid();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(topic1.getSi())) {
            
            return topic1.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(topic1.getView())) {
            
            return topic1.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(topic1.getBreak())) {
            
            return topic1.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(topic1.getKeepWithPrevious())) {
            
            return topic1.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getHelpEntry() {
        
        if (CollUtil.isNotEmpty(topic1.getHelpEntry())) {
            
            return topic1.getHelpEntry();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(topic1.getShortName())) {
            
            return new IdentifierWrapper(topic1.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(topic1.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = topic1.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(topic1.getLongName())) {
            
            return new MultilanguageLongNameWrapper(topic1.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(topic1.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(topic1.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(topic1.getCategory())) {
            
            return new CategoryStringWrapper(topic1.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(topic1.getAdminData())) {
            
            return new AdminDataWrapper(topic1.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(topic1.getIntroduction())) {
            
            return new DocumentationBlockWrapper(topic1.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(topic1.getAnnotations())) {
            ArrayList<Annotation> originalList = topic1.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(topic1.getVariationPoint())) {
            
            return new VariationPointWrapper(topic1.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<MsrQueryP1Wrapper> getMsrQueryP1() {
        
        if (CollUtil.isNotEmpty(topic1.getMsrQueryP1())) {
            ArrayList<MsrQueryP1> originalList = topic1.getMsrQueryP1();
            ArrayList<MsrQueryP1Wrapper> wrapperList = (ArrayList<MsrQueryP1Wrapper>)originalList.stream()
                .map(item -> new MsrQueryP1Wrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}